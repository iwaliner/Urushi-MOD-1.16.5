package com.iwaliner.urushi.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

public class WideNorenBlock extends NorenBlock{
    public static final BooleanProperty VARIANT = BooleanProperty.create("variant");
    public WideNorenBlock(Properties p_i48377_1_) {
        super(p_i48377_1_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(VARIANT, Boolean.valueOf(false)));

    }
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(FACING,VARIANT);
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        Direction direction = context.getHorizontalDirection().getOpposite();
        BlockPos blockpos = context.getClickedPos();
        BlockPos blockpos1 = blockpos.relative(direction.getCounterClockWise());
        if(context.getLevel().getBlockState(blockpos1).canBeReplaced(context) ){
            context.getLevel().setBlockAndUpdate(blockpos1,this.defaultBlockState().setValue(FACING,direction).setValue(VARIANT,Boolean.valueOf(true)));
            //context.getLevel().setBlockAndUpdate(blockpos,this.defaultBlockState().setValue(FACING,direction).setValue(VARIANT,Boolean.valueOf(false)));
            return this.defaultBlockState().setValue(FACING,direction).setValue(VARIANT,Boolean.valueOf(false));
        }else{
            return  null;
        }
    }
    public BlockState updateShape(BlockState state, Direction direction, BlockState state2, IWorld world, BlockPos pos, BlockPos pos2) {
       if(state.getBlock() instanceof WideNorenBlock) {
           Direction facing=state.getValue(FACING);
           if(direction!=facing.UP&&direction!=facing.DOWN) {
               if (state.getValue(VARIANT) == Boolean.valueOf(true)) {
                   BlockState nextBlockState = world.getBlockState(pos.relative(facing.getClockWise()));
                   if (nextBlockState.getBlock() instanceof WideNorenBlock) {
                       return super.updateShape(state, direction, state2, world, pos, pos2);
                   } else {
                       return Blocks.AIR.defaultBlockState();
                   }
               } else {
                   BlockState nextBlockState = world.getBlockState(pos.relative(facing.getCounterClockWise()));
                   if (nextBlockState.getBlock() instanceof WideNorenBlock) {
                       return super.updateShape(state, direction, state2, world, pos, pos2);
                   } else {
                       return Blocks.AIR.defaultBlockState();
                   }
               }
           }
       }
       return super.updateShape(state, direction, state2, world, pos, pos2);
    }
}

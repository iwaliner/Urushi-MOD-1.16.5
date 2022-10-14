package com.iwaliner.urushi.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class MusouRenjiMadoBlock extends HorizonalRotateBlock{
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;
    protected static final VoxelShape SHAPEAA = Block.box(6.0D, 0.0D, 0D, 10.0D, 16.0D, 16.0D);
    protected static final VoxelShape SHAPEBB = Block.box(0D, 0.0D, 6D, 16D, 16.0D, 10.0D);

    public MusouRenjiMadoBlock(Properties p_i48377_1_) {
        super(p_i48377_1_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(OPEN, Boolean.valueOf(true)));

    }
    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        if(state.getValue(FACING)== Direction.NORTH||state.getValue(FACING)==Direction.SOUTH){
            return SHAPEBB;
        }else{
            return SHAPEAA;
        }
    }
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(FACING,OPEN);
    }

    @Override
    public ActionResultType use(BlockState state, World level, BlockPos pos, PlayerEntity p_225533_4_, Hand p_225533_5_, BlockRayTraceResult p_225533_6_) {
        if(state.getValue(OPEN)){
            level.setBlockAndUpdate(pos,state.setValue(OPEN,Boolean.valueOf(false)));
            level.playSound((PlayerEntity) null,pos, SoundEvents.BARREL_CLOSE, SoundCategory.BLOCKS,1F,1F);

        }else{
            level.setBlockAndUpdate(pos,state.setValue(OPEN,Boolean.valueOf(true)));
            level.playSound((PlayerEntity) null,pos, SoundEvents.BARREL_OPEN, SoundCategory.BLOCKS,1F,1F);
        }
        return ActionResultType.SUCCESS;
    }

}

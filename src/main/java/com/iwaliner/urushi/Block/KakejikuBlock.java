package com.iwaliner.urushi.Block;

import com.iwaliner.urushi.ItemAndBlockRegister;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class KakejikuBlock extends HorizonalRotateBlock{
    public static final BooleanProperty BOTTOM = BooleanProperty.create("bottom");
    protected static final VoxelShape SHAPEA = Block.box(15D, 2.0D, 0D, 16D, 16.0D, 16.0D);
    protected static final VoxelShape SHAPEB = Block.box(0D, 2.0D, 15D, 16D, 16.0D, 16D);
    protected static final VoxelShape SHAPEC = Block.box(0D, 2.0D, 0D, 1D, 16.0D, 16.0D);
    protected static final VoxelShape SHAPED = Block.box(0D, 2.0D, 0D, 16D, 16.0D, 1D);

    private Block nextBlock;
    public KakejikuBlock(Block b, Properties p_i48377_1_) {
        super(p_i48377_1_);
            nextBlock = b;

        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(BOTTOM, Boolean.valueOf(false)));

    }
    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        if(state.getValue(FACING)== Direction.NORTH){
            return SHAPEB;
        }else if(state.getValue(FACING)== Direction.SOUTH){
            return SHAPED;
        }else if(state.getValue(FACING)== Direction.EAST){
            return SHAPEC;
        }else{
            return SHAPEA;
        }
    }
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        Direction direction = context.getHorizontalDirection().getOpposite();
        BlockPos blockpos = context.getClickedPos();
        BlockPos blockpos1 = blockpos.below();
        if(context.getLevel().getBlockState(blockpos1).canBeReplaced(context) ){
            context.getLevel().setBlockAndUpdate(blockpos1,this.defaultBlockState().setValue(FACING,direction).setValue(BOTTOM,Boolean.valueOf(true)));
             return this.defaultBlockState().setValue(FACING,direction).setValue(BOTTOM,Boolean.valueOf(false));
        }else{
            return  null;
        }
    }
    public BlockState updateShape(BlockState state, Direction direction, BlockState state2, IWorld world, BlockPos pos, BlockPos pos2) {
        if(state.getBlock() instanceof KakejikuBlock) {
            Direction facing=state.getValue(FACING);
          //  if(direction!=facing.UP&&direction!=facing.DOWN) {
                if (state.getValue(BOTTOM) == Boolean.valueOf(true)) {
                    BlockState nextBlockState = world.getBlockState(pos.above());
                    if (nextBlockState.getBlock() instanceof KakejikuBlock) {
                        return super.updateShape(state, direction, state2, world, pos, pos2);
                    } else {
                        return Blocks.AIR.defaultBlockState();
                    }
                } else {
                    BlockState nextBlockState = world.getBlockState(pos.below());
                    if (nextBlockState.getBlock() instanceof KakejikuBlock) {
                        return super.updateShape(state, direction, state2, world, pos, pos2);
                    } else {
                        return Blocks.AIR.defaultBlockState();
            //        }
                }
            }
        }
        return super.updateShape(state, direction, state2, world, pos, pos2);
    }
    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {
        if(nextBlock==null){
            nextBlock=ItemAndBlockRegister.kakejiku_1.get();
        }
        Direction direction=state.getValue(FACING);
       if(nextBlock instanceof KakejikuBlock) {

           if (state.getValue(BOTTOM)) {
               world.setBlock(pos.above(), nextBlock.defaultBlockState().setValue(FACING, direction).setValue(BOTTOM, Boolean.valueOf(false)),2);
               world.setBlock(pos, nextBlock.defaultBlockState().setValue(FACING, direction).setValue(BOTTOM, Boolean.valueOf(true)),2);
               world.playSound((PlayerEntity) null, pos, SoundEvents.ENDER_DRAGON_FLAP, SoundCategory.BLOCKS, 1F, 1F);
               return ActionResultType.SUCCESS;
           } else {
               world.setBlock(pos.below(), nextBlock.defaultBlockState().setValue(FACING, direction).setValue(BOTTOM, Boolean.valueOf(true)),2);
               world.setBlock(pos, nextBlock.defaultBlockState().setValue(FACING, direction).setValue(BOTTOM, Boolean.valueOf(false)),2);
               world.playSound((PlayerEntity) null, pos, SoundEvents.ENDER_DRAGON_FLAP, SoundCategory.BLOCKS, 1F, 1F);
               return ActionResultType.SUCCESS;
           }
       }
       return ActionResultType.FAIL;
    }
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(FACING,BOTTOM);
    }
    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable IBlockReader reader, List<ITextComponent> list, ITooltipFlag flag) {
        list.add((new TranslationTextComponent("info.urushi.kakejiku" )).withStyle(TextFormatting.GRAY));
    }
}

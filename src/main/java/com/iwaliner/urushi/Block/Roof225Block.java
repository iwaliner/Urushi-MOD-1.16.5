package com.iwaliner.urushi.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class Roof225Block extends HorizonalRotateSlabBlock {
    private static final VoxelShape UNDER = Block.box(0D, 0D, 0D, 16D, 8D, 16D);
    private static final VoxelShape UPPER = Block.box(0D, -8D, 0D, 16D, 0D, 16D);
    private static final VoxelShape EXTEND_UPPER = Block.box(0D, -8D, 0D, 16D, 8D, 16D);

    public Roof225Block(Properties p_i48331_1_) {
        super(p_i48331_1_);
    }
    @Override
    public VoxelShape getCollisionShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        if (state.getValue(TYPE) == SlabType.TOP) {
            return UPPER;
        }  else {
            return UNDER;
        }
    }
    public boolean useShapeForLightOcclusion(BlockState p_220074_1_) {
        return true;
    }
    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        SlabType slabtype = p_220053_1_.getValue(TYPE);
        return slabtype==SlabType.BOTTOM?BOTTOM_AABB:EXTEND_UPPER;
    }
    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockPos blockpos = context.getClickedPos();
        World world = context.getLevel();
        BlockState blockstate = context.getLevel().getBlockState(blockpos);
        Direction direction = context.getHorizontalDirection();
        Direction.Axis direction$axis = direction.getAxis();
        boolean flag1 = direction$axis == Direction.Axis.Z && (world.getBlockState(blockpos.west()).getBlock() instanceof Roof225Block || world.getBlockState(blockpos.east()).getBlock() instanceof Roof225Block) || direction$axis == Direction.Axis.X && (world.getBlockState(blockpos.north()).getBlock() instanceof Roof225Block || world.getBlockState(blockpos.south()).getBlock() instanceof Roof225Block);
        BlockState blockstateClicked=null;

    } if(direction$axis == Direction.Axis.Z){
        if(world.getBlockState(blockpos.west()).getBlock() instanceof Roof225Block ){
            blockstateClicked=world.getBlockState(blockpos.west());
        }else if(world.getBlockState(blockpos.east()).getBlock() instanceof Roof225Block ){
            blockstateClicked=world.getBlockState(blockpos.east());
        }
    }else if(direction$axis == Direction.Axis.X){
        if(world.getBlockState(blockpos.north()).getBlock() instanceof Roof225Block ){
            blockstateClicked=world.getBlockState(blockpos.north());
        }else if(world.getBlockState(blockpos.south()).getBlock() instanceof Roof225Block ){
            blockstateClicked=world.getBlockState(blockpos.south());
        }
    }

        if(flag1&&blockstateClicked!=null){
        return this.defaultBlockState().setValue(FACING, blockstateClicked.getValue(FACING)).setValue(TYPE, blockstateClicked.getValue(TYPE)).setValue(WATERLOGGED, Boolean.valueOf(false));

    }else if(world.getBlockState(blockpos.below()).getBlock() instanceof SlabBlock&&world.getBlockState(blockpos.below()).getValue(TYPE)!=SlabType.DOUBLE){
        if(world.getBlockState(blockpos.below()).getValue(TYPE)==SlabType.TOP){
            return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, Boolean.valueOf(false));
        }else if(world.getBlockState(blockpos.below()).getValue(TYPE)==SlabType.BOTTOM){
            return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(TYPE, SlabType.TOP).setValue(WATERLOGGED, Boolean.valueOf(false));
        }else{
            return this.defaultBlockState();
        }
    }
        else{
        BlockState blockstate1 = this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, Boolean.valueOf(false));
        Direction direction2 = context.getClickedFace();
        return direction2 != Direction.DOWN && (direction2 == Direction.UP || !(context.getClickLocation().y - (double)blockpos.getY() > 0.5D)) ? blockstate1 : blockstate1.setValue(TYPE, SlabType.TOP);

    }
    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable IBlockReader reader, List<ITextComponent> list, ITooltipFlag flag) {
        list.add((new TranslationTextComponent("info.urushi.roof_225" )).withStyle(TextFormatting.GRAY));
    }
}

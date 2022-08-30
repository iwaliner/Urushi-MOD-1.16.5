package com.iwaliner.urushi.Block;

import net.minecraft.block.BedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.item.DyeColor;
import net.minecraft.state.properties.BedPart;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;


public class FutonBlock extends BedBlock {
    protected static final VoxelShape BOX = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2D, 16.0D);
    protected static final VoxelShape HEAD_BASE = Block.box(1D, 0.0D, 1D, 15.0D, 2D, 15.0D);
    public FutonBlock(DyeColor p_i48442_1_, Properties p_i48442_2_) {
        super(p_i48442_1_, p_i48442_2_);
    }

    public VoxelShape getShape(BlockState state, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        if(state.getValue(PART)==BedPart.HEAD){
            return HEAD_BASE;
        }else{
            return BOX;
        }
    }
    public BlockRenderType getRenderShape(BlockState p_149645_1_) {
        return BlockRenderType.MODEL;
    }

}

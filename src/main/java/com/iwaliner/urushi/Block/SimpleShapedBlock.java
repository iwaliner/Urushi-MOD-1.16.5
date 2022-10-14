package com.iwaliner.urushi.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class SimpleShapedBlock extends Block {
    private static VoxelShape SHAPE;
    public SimpleShapedBlock(VoxelShape voxelShape,Properties p_i48440_1_) {
        super(p_i48440_1_);
        SHAPE=voxelShape;
    }

    @Override
    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return SHAPE;
    }
}

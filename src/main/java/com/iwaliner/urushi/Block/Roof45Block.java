package com.iwaliner.urushi.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class Roof45Block extends HorizonalRotateBlock{
   // private static final VoxelShape ROOT = Block.box(0D, 0.0D, 0D, 16D, 8D, 16D);
   private static final VoxelShape EXTEND = Block.box(0D, -8D, 0D, 16D, 16D, 16D);

    private static final VoxelShape BASE = Block.box(0D, -16D, 0D, 16D, -8D, 16D);
    private static final VoxelShape UPPER_A = Block.box(0D, -8D, 0D, 8D, 0D, 16D);
    private static final VoxelShape UPPER_B = Block.box(0D, -8D, 0D, 16D, 0D, 8D);
    private static final VoxelShape UPPER_C = Block.box(8D, -8D, 0D, 16D, 0D, 16D);
    private static final VoxelShape UPPER_D = Block.box(0D, -8D, 8D, 16D, 0D, 16D);
    private static final VoxelShape A_AXIS_AABB = VoxelShapes.or(BASE, UPPER_A);
    private static final VoxelShape B_AXIS_AABB = VoxelShapes.or(BASE, UPPER_B);
    private static final VoxelShape C_AXIS_AABB = VoxelShapes.or(BASE, UPPER_C);
    private static final VoxelShape D_AXIS_AABB = VoxelShapes.or(BASE, UPPER_D);

    public Roof45Block(Properties p_i48377_1_) {
        super(p_i48377_1_);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        if (state.getValue(FACING) == Direction.NORTH) {
            return D_AXIS_AABB;
        } else if (state.getValue(FACING) == Direction.SOUTH) {
            return B_AXIS_AABB;
        } else if (state.getValue(FACING) == Direction.WEST) {
            return C_AXIS_AABB;
        } else {
            return A_AXIS_AABB;
        }
    }
    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {

        return EXTEND;
    }
    /*    public VoxelShape getBlockSupportShape(BlockState p_230335_1_, IBlockReader p_230335_2_, BlockPos p_230335_3_) {
            return ROOT;

    }
    public VoxelShape getOcclusionShape(BlockState p_196247_1_, IBlockReader p_196247_2_, BlockPos p_196247_3_) {
        return ROOT;
    }*/
    public boolean useShapeForLightOcclusion(BlockState p_220074_1_) {
        return true;
    }
}

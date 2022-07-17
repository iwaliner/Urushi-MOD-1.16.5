package com.iwaliner.urushi.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class GrooveBlock extends HorizonalRotateBlock implements IWaterLoggable {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    private boolean haslid;
    private static final VoxelShape BASE = Block.box(0D, 0.0D, 0D, 16D, 2D, 16D);
    private static final VoxelShape SIDE_A1 = Block.box(0D, 2D, 0D, 2D, 16D, 16D);
    private static final VoxelShape SIDE_A2 = Block.box(14D, 2D, 0D, 16D, 16D, 16D);
    private static final VoxelShape SIDE_B1 = Block.box(0D, 2D, 0D, 16D, 16D, 2D);
    private static final VoxelShape SIDE_B2 = Block.box(0D, 2D, 14D, 16D, 16D, 16D);
    private static final VoxelShape LID = Block.box(0D, 14D, 0D, 16D, 16D, 16D);
    private static final VoxelShape A_AXIS_AABB = VoxelShapes.or(BASE, SIDE_A1, SIDE_A2, LID);
    private static final VoxelShape B_AXIS_AABB = VoxelShapes.or(BASE, SIDE_B1, SIDE_B2, LID);
    private static final VoxelShape A_AXIS_AABB_LIDLESS = VoxelShapes.or(BASE, SIDE_A1, SIDE_A2);
    private static final VoxelShape B_AXIS_AABB_LIDLESS = VoxelShapes.or(BASE, SIDE_B1, SIDE_B2);
    public GrooveBlock(boolean hasLid, Properties p_i48377_1_) {
        super(p_i48377_1_);
        haslid=hasLid;
        this.registerDefaultState(this.defaultBlockState().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED,false));
    }
    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        if(state.getValue(FACING)== Direction.NORTH||state.getValue(FACING)==Direction.SOUTH){
            return haslid?A_AXIS_AABB:A_AXIS_AABB_LIDLESS;
        }else{
            return haslid?B_AXIS_AABB:B_AXIS_AABB_LIDLESS;
        }
    }
    public boolean propagatesSkylightDown(BlockState p_200123_1_, IBlockReader p_200123_2_, BlockPos p_200123_3_) {
        return !p_200123_1_.getValue(WATERLOGGED);
    }
    public FluidState getFluidState(BlockState p_204507_1_) {
        return p_204507_1_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(p_204507_1_);
    }
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(FACING,WATERLOGGED);
    }
    public boolean isPathfindable(BlockState p_196266_1_, IBlockReader p_196266_2_, BlockPos p_196266_3_, PathType p_196266_4_) {
        return true;
    }
}

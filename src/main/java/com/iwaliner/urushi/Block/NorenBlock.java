package com.iwaliner.urushi.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class NorenBlock extends HorizonalRotateBlock{
    protected static final VoxelShape SHAPEA = Block.box(15D, 2.0D, 0D, 16D, 16.0D, 16.0D);
    protected static final VoxelShape SHAPEB = Block.box(0D, 2.0D, 15D, 16D, 16.0D, 16D);
    protected static final VoxelShape SHAPEC = Block.box(0D, 2.0D, 0D, 1D, 16.0D, 16.0D);
    protected static final VoxelShape SHAPED = Block.box(0D, 2.0D, 0D, 16D, 16.0D, 1D);

    public NorenBlock(Properties p_i48377_1_) {
        super(p_i48377_1_);
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
}

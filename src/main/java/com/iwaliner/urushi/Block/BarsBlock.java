package com.iwaliner.urushi.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class BarsBlock extends HorizonalRotateBlock{
    protected static final VoxelShape SHAPEA = Block.box(7.0D, 0.0D, 0D, 9.0D, 16.0D, 16.0D);
    protected static final VoxelShape SHAPEB = Block.box(0D, 0.0D, 7D, 16D, 16.0D, 9.0D);

    public BarsBlock(Properties p_i48377_1_) {
        super(p_i48377_1_);
    }
    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        if(state.getValue(FACING)== Direction.NORTH||state.getValue(FACING)==Direction.SOUTH){
            return SHAPEB;
        }else{
            return SHAPEA;
        }
    }
}

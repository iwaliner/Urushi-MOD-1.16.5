package com.iwaliner.urushi.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class TwoDirectionShapedBlock extends HorizonalRotateBlock{
    private static VoxelShape SHAPEA;
    private static  VoxelShape SHAPEB;
    public TwoDirectionShapedBlock(double d1,double d2,double d3,double d4,double d5,double d6,Properties p_i48377_1_) {
        super(p_i48377_1_);
        SHAPEA= Block.box(d1, d2, d3, d4, d5, d6);
        SHAPEB= Block.box(d3, d2, d1, d6, d5, d4);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        if(state.getValue(FACING)== Direction.NORTH||state.getValue(FACING)==Direction.SOUTH){
            return SHAPEB;
        }else{
            return SHAPEA;
        }
    }
}

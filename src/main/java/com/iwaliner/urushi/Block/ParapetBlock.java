package com.iwaliner.urushi.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class ParapetBlock extends HorizonalRotateBlock{
    protected static final VoxelShape SHAPEA = Block.box(5.0D, 0.0D, 0D, 11.0D, 24.0D, 16.0D);
    protected static final VoxelShape SHAPEB = Block.box(0D, 0.0D, 5D, 16D, 24.0D, 11.0D);
    protected static final VoxelShape SHAPEAA = Block.box(5.0D, 0.0D, 0D, 11.0D, 16.0D, 16.0D);
    protected static final VoxelShape SHAPEBB = Block.box(0D, 0.0D, 5D, 16D, 16.0D, 11.0D);
    public ParapetBlock(Properties p_i48377_1_) {
        super(p_i48377_1_);
    }
    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        if(state.getValue(FACING)== Direction.NORTH||state.getValue(FACING)==Direction.SOUTH){
            return SHAPEBB;
        }else{
            return SHAPEAA;
        }
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, IBlockReader p_220071_2_, BlockPos p_220071_3_, ISelectionContext p_220071_4_) {
        if(state.getValue(FACING)== Direction.NORTH||state.getValue(FACING)==Direction.SOUTH){
            return SHAPEB;
        }else{
            return SHAPEA;
        }
    }
}

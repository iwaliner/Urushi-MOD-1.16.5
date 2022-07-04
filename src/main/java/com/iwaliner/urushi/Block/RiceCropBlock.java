package com.iwaliner.urushi.Block;

import com.iwaliner.urushi.BlocksRegister;
import com.iwaliner.urushi.ItemsRegister;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class RiceCropBlock extends CropsBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_5;
    public RiceCropBlock(Properties p_i48421_1_) {
        super(p_i48421_1_);
    }
    public int getMaxAge() {
        return 4;
    }
    protected boolean mayPlaceOn(BlockState p_200014_1_, IBlockReader p_200014_2_, BlockPos p_200014_3_) {
        return p_200014_1_.is(BlocksRegister.PaddyField.get());
    }
    protected IItemProvider getBaseSeedId() {
        return ItemsRegister.RiceCrop.get();
    }

    @Override
    public void onPlace(BlockState state, World world, BlockPos pos, BlockState state2, boolean boo) {
        if(world.getBlockState(pos.below()).getBlock()== net.minecraft.block.Blocks.FARMLAND){
            world.setBlockAndUpdate(pos.below(), BlocksRegister.PaddyField.get().defaultBlockState());
        }
    }
}

package com.iwaliner.urushi.Block;

import com.iwaliner.urushi.ItemAndBlockRegister;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class AzukiCropBlock extends CropsBlock {
    //public static final IntegerProperty AGE5 = BlockStateProperties.AGE_5;
    public AzukiCropBlock(Properties p_i48421_1_) {
        super(p_i48421_1_);
    }
    public int getMaxAge() {
        return 4;
    }

    protected IItemProvider getBaseSeedId() {
        return ItemAndBlockRegister.AzukiCrop.get();
    }
    protected boolean mayPlaceOn(BlockState p_200014_1_, IBlockReader p_200014_2_, BlockPos p_200014_3_) {
        return p_200014_1_.getBlock() instanceof FarmlandBlock;
    }
    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {
        if(state.getBlock() instanceof CropsBlock){
            if(world.getBlockState(pos).getValue(AGE)==Integer.valueOf(4)) {
                world.destroyBlock(pos, true);
                world.setBlockAndUpdate(pos,this.defaultBlockState());
                return ActionResultType.SUCCESS;
            }
        }
        return ActionResultType.FAIL;
    }
}

package com.iwaliner.urushi.Block;

import com.iwaliner.urushi.ItemsRegister;
import net.minecraft.block.CropsBlock;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.IItemProvider;

public class SoyCropBlock extends CropsBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_5;
    public SoyCropBlock(Properties p_i48421_1_) {
        super(p_i48421_1_);
    }
    public int getMaxAge() {
        return 4;
    }

    protected IItemProvider getBaseSeedId() {
        return ItemsRegister.SoyCrop.get();
    }


}

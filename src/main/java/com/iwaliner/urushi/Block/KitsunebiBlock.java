package com.iwaliner.urushi.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.PushReaction;


public class KitsunebiBlock extends Block {
    public KitsunebiBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }

    public PushReaction getPistonPushReaction(BlockState p_149656_1_) {
        return PushReaction.DESTROY;
    }
}

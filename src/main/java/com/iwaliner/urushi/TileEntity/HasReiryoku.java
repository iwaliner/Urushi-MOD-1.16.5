package com.iwaliner.urushi.TileEntity;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public interface HasReiryoku {
    int getStoredReiryoku();
    int getMaxReiryoku();
    default void changeStoredReiryoku(int i) {
    }
    default void setStoredReiryokuEmpty(){

    }
}

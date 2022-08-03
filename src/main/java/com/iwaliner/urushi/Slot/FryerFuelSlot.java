package com.iwaliner.urushi.Slot;

import com.iwaliner.urushi.Container.AbstractFryerContainer;
import com.iwaliner.urushi.ItemsRegister;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class FryerFuelSlot extends Slot {
    private final AbstractFryerContainer menu;

    public FryerFuelSlot(AbstractFryerContainer p_i50084_1_, IInventory p_i50084_2_, int p_i50084_3_, int p_i50084_4_, int p_i50084_5_) {
        super(p_i50084_2_, p_i50084_3_, p_i50084_4_, p_i50084_5_);
        this.menu = p_i50084_1_;
    }

    public boolean mayPlace(ItemStack itemStack) {
        return itemStack.getItem()== ItemsRegister.VegetableOil.get();
    }

    public int getMaxStackSize(ItemStack p_178170_1_) {
        return isBucket(p_178170_1_) ? 1 : super.getMaxStackSize(p_178170_1_);
    }

    public static boolean isBucket(ItemStack p_178173_0_) {
        return p_178173_0_.getItem() == Items.BUCKET;
    }
}
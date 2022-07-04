package com.iwaliner.urushi;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TabUrushi extends ItemGroup {
    public TabUrushi(String label) {
        super(label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(BlocksRegister.SakuraBigSapling.get());
    }
}

package com.iwaliner.urushi.Entity;

import com.iwaliner.urushi.EntityRegister;
import com.iwaliner.urushi.ItemsRegister;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.fish.SalmonEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class CarpEntity extends SalmonEntity {
    public CarpEntity(EntityType<? extends SalmonEntity> p_i50246_1_, World p_i50246_2_) {
        super(EntityRegister.CarpEntity.get(), p_i50246_2_);
    }
    protected ItemStack getBucketItemStack() {
        return new ItemStack(ItemsRegister.CarpBucket.get());
    }

}

package com.iwaliner.urushi.Entity;

import com.iwaliner.urushi.EntityRegister;
import com.iwaliner.urushi.ItemsRegister;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.fish.AbstractGroupFishEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class GoldfishEntity extends AbstractGroupFishEntity {
    public GoldfishEntity(EntityType<? extends GoldfishEntity> p_i50246_1_, World p_i50246_2_) {
        super(EntityRegister.GoldfishEntity.get(), p_i50246_2_);
    }
    protected ItemStack getBucketItemStack() {
        return new ItemStack(ItemsRegister.GoldfishBucket.get());
    }
    public int getMaxSchoolSize() {
        return 5;
    }


    protected SoundEvent getAmbientSound() {
        return SoundEvents.TROPICAL_FISH_AMBIENT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.TROPICAL_FISH_DEATH;
    }

    protected SoundEvent getHurtSound(DamageSource p_184601_1_) {
        return SoundEvents.TROPICAL_FISH_HURT;
    }

    protected SoundEvent getFlopSound() {
        return SoundEvents.TROPICAL_FISH_FLOP;
    }
}

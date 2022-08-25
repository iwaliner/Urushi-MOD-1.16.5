package com.iwaliner.urushi.Entity;

import com.iwaliner.urushi.EntityRegister;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.world.World;

public class YokoEntity extends VillagerEntity {
    public YokoEntity(EntityType<? extends VillagerEntity> p_i50246_1_, World p_i50246_2_) {
        super(EntityRegister.YokoEntity.get(), p_i50246_2_);
    }

}

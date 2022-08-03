package com.iwaliner.urushi.Entity;

import com.iwaliner.urushi.EntityRegister;
import com.iwaliner.urushi.ItemsRegister;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.passive.fish.SalmonEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GhostEntity extends ZombieEntity {
    public GhostEntity(EntityType<? extends ZombieEntity> p_i50246_1_, World p_i50246_2_) {
        super(EntityRegister.GhostEntity.get(), p_i50246_2_);
    }

}

package com.iwaliner.urushi.Entity;

import com.iwaliner.urushi.EntityRegister;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.HuskEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.world.World;

public class RedOniEntity extends HuskEntity {
    public RedOniEntity(EntityType<? extends HuskEntity> p_i50246_1_, World p_i50246_2_) {
        super(EntityRegister.RedOniEntity.get(), p_i50246_2_);
    }

}

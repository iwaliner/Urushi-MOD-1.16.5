package com.iwaliner.urushi.Entity.FoodEntity;

import com.iwaliner.urushi.EntityRegister;
import com.iwaliner.urushi.ItemsRegister;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class GyudonFoodEntity extends FoodEntity {

    public GyudonFoodEntity(EntityType<?> p_i48580_1_, World p_i48580_2_) {
        super(ItemsRegister.Gyudon.get(),EntityRegister.GyudonFoodEntity.get(), p_i48580_2_);
    }


}

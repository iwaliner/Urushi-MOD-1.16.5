package com.iwaliner.urushi.Entity.FoodEntity;

import com.iwaliner.urushi.Entity.FoodEntity.FoodEntity;
import com.iwaliner.urushi.EntityRegister;
import com.iwaliner.urushi.ItemAndBlockRegister;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class RiceFoodEntity extends FoodEntity {

    public RiceFoodEntity(EntityType<?> p_i48580_1_, World p_i48580_2_) {
        super(ItemAndBlockRegister.Rice.get(),EntityRegister.RiceFoodEntity.get(), p_i48580_2_);
    }


}

package com.iwaliner.urushi.Entity.FoodEntity;

import com.iwaliner.urushi.EntityRegister;
import com.iwaliner.urushi.ItemAndBlockRegister;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class SekihanFoodEntity extends FoodEntity {

    public SekihanFoodEntity(EntityType<?> p_i48580_1_, World p_i48580_2_) {
        super(ItemAndBlockRegister.sekihan.get(),EntityRegister.SekihanFoodEntity.get(), p_i48580_2_);
    }


}

package com.iwaliner.urushi.Model.FoodModel;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


@OnlyIn(Dist.CLIENT)
public abstract class AbstractFoodModel<T extends Entity> extends SegmentedModel<T> {

    public AbstractFoodModel() {
  }
    public void setupAnim(T p_225597_1_, float f1, float f2, float f3, float f4, float f5) {

    }


}

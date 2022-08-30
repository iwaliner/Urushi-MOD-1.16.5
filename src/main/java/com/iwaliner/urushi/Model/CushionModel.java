package com.iwaliner.urushi.Model;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


@OnlyIn(Dist.CLIENT)
public class CushionModel<T extends Entity> extends SegmentedModel<T> {

    private final ModelRenderer box;

    public CushionModel() {
        texWidth = 64;
        texHeight = 32;
        box = new ModelRenderer(this);
        box.setPos(0.0F, 21.0F, 0.0F);
       box.addBox(-6F, 0F, -6F, 12, 3, 12, 0.0F);

    }
    public void setupAnim(T p_225597_1_, float f1, float f2, float f3, float f4, float f5) {

    }
    public Iterable<ModelRenderer> parts() {
        return ImmutableList.of(this.box);
    }

}

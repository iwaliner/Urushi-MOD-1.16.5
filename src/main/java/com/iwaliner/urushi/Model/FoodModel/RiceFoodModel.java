package com.iwaliner.urushi.Model.FoodModel;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;



@OnlyIn(Dist.CLIENT)
public class RiceFoodModel <T extends Entity> extends AbstractFoodModel<T> {

    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    public RiceFoodModel() {
        texWidth = 32;
        texHeight = 32;

        bone = new ModelRenderer(this);
        bone.setPos(0.0F, 24.0F, 0.0F);
        bone.texOffs(0, 9).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

        bone2 = new ModelRenderer(this);
        bone2.setPos(0.0F, 24.0F, 0.0F);
        bone2.texOffs(0, 0).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);

        bone3 = new ModelRenderer(this);
        bone3.setPos(0.0F, 24.0F, 0.0F);
        bone3.texOffs(7, 17).addBox(-2.0F, -5.0F, 2.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

        bone4 = new ModelRenderer(this);
        bone4.setPos(0.0F, 24.0F, 0.0F);
        bone4.texOffs(0, 14).addBox(2.0F, -5.0F, -3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

        bone5 = new ModelRenderer(this);
        bone5.setPos(0.0F, 24.0F, 0.0F);
        bone5.texOffs(7, 15).addBox(-3.0F, -5.0F, -3.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

        bone6 = new ModelRenderer(this);
        bone6.setPos(0.0F, 24.0F, 0.0F);
        bone6.texOffs(11, 9).addBox(-3.0F, -5.0F, -2.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
    }
    public void setupAnim(T p_225597_1_, float f1, float f2, float f3, float f4, float f5) {

    }

    public Iterable<ModelRenderer> parts() {
        return ImmutableList.of(this.bone,  this.bone2,this.bone3,this.bone4,this.bone5,this.bone6);
    }

}

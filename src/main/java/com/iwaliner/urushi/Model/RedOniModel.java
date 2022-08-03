package com.iwaliner.urushi.Model;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Function;

@OnlyIn(Dist.CLIENT)
public class RedOniModel<T extends MonsterEntity> extends BipedModel<T> {
    public ModelRenderer OniHorn1;
    public ModelRenderer OniHorn2;
    public RedOniModel(float p_i1148_1_) {
        this(RenderType::entityCutoutNoCull, p_i1148_1_, 0.0F, 64, 64);
    }
    protected RedOniModel(float p_i1149_1_, float p_i1149_2_, int p_i1149_3_, int p_i1149_4_) {
        this(RenderType::entityCutoutNoCull, p_i1149_1_, p_i1149_2_, p_i1149_3_, p_i1149_4_);
    }
    public RedOniModel(Function<ResourceLocation, RenderType> p_i225946_1_, float p_i225946_2_, float p_i225946_3_, int p_i225946_4_, int p_i225946_5_) {
        super(p_i225946_1_, p_i225946_2_, p_i225946_3_, p_i225946_4_, p_i225946_5_);
        this.OniHorn1 = new ModelRenderer(this, 25, 0);
        this.OniHorn1.addBox(2.0F, -10.0F, -2.0F, 1.0F, 4.0F, 1.0F, p_i225946_2_);
        this.OniHorn1.setPos(0.0F, 0.0F + p_i225946_3_, 0.0F);
        this.OniHorn2 = new ModelRenderer(this, 25, 0);
        this.OniHorn2.addBox(-3.0F, -10.0F, -2.0F, 1.0F, 4.0F, 1.0F, p_i225946_2_);
        this.OniHorn2.setPos(0.0F, 0.0F + p_i225946_3_, 0.0F);
    }
    public void setAllVisible(boolean p_178719_1_) {
        super.setAllVisible(p_178719_1_);
        this.OniHorn1.visible = p_178719_1_;
        this.OniHorn2.visible = p_178719_1_;
    }
    public void copyPropertiesTo(RedOniModel<T> p_217148_1_) {
        super.copyPropertiesTo(p_217148_1_);
        p_217148_1_.OniHorn1.copyFrom(this.OniHorn1);
        p_217148_1_.OniHorn2.copyFrom(this.OniHorn2);
    }

    @Override
    public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {
        super.setupAnim(p_225597_1_, p_225597_2_, p_225597_3_, p_225597_4_, p_225597_5_, p_225597_6_);
        this.OniHorn1.copyFrom(this.head);
        this.OniHorn2.copyFrom(this.head);
    }
    protected Iterable<ModelRenderer> headParts() {
        return ImmutableList.of(this.head,this.OniHorn1,this.OniHorn2);
    }


}

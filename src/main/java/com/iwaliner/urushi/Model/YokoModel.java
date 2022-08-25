package com.iwaliner.urushi.Model;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Function;


@OnlyIn(Dist.CLIENT)
    public class YokoModel<T extends CreatureEntity> extends BipedModel<T> {

        public ModelRenderer RightEarLower;
        public ModelRenderer LeftEarLower;
        public ModelRenderer tail1;
        public ModelRenderer tail2;
        public ModelRenderer tail3;
        public ModelRenderer tail4;
        public ModelRenderer RightEarUpper;
        public ModelRenderer LeftEarUpper;
        public YokoModel(float p_i1148_1_) {
            this(RenderType::entityCutoutNoCull, p_i1148_1_, 0.0F, 64, 64);
        }

    public YokoModel(Function<ResourceLocation, RenderType> p_i225946_1_, float p_i225946_2_, float p_i225946_3_, int p_i225946_4_, int p_i225946_5_) {
        super(p_i225946_1_, p_i225946_2_, p_i225946_3_, p_i225946_4_, p_i225946_5_);
        this.tail4 = new ModelRenderer(this, 17,50);
        this.tail4.addBox(-1.5F, -4.0F, 7.0F, 3.0F, 2.0F, 4.0F, 0.5F, 0.5F, 0.5F);
        this.tail4.setPos(0.0F, 0.0F, 0.0F);
        this.tail3 = new ModelRenderer(this, 45,37);
        this.tail3.addBox(-2.5F, -1.0F, 6.0F, 5.0F, 5.0F, 4.0F, 0.5F, 0.5F, 0.5F);
        this.tail3.setPos(0.0F, 0F, 0F);
        this.tail2 = new ModelRenderer(this, 20,35);
        this.tail2.addBox(-3.5F, 4.0F, 5.5F, 7.0F, 7.0F, 5.0F, 0.5F, 0.5F, 0.5F);
        this.tail2.setPos(0.0F, 0F, 0F);
        this.tail1 = new ModelRenderer(this, 0,40);
        this.tail1.addBox(-3.0F, 6.0F, 2.5F, 6.0F, 6.0F, 3.0F, 0.5F, 0.5F, 0.5F);
        this.tail1.setPos(0.0F, 0F, 0F);
        this.LeftEarLower = new ModelRenderer(this, 2,52);
        this.LeftEarLower.addBox(1.0F, -9.5F, -2.0F, 3.0F, 2.0F, 2.0F, 0.5F, 0.5F, 0.5F);
        this.LeftEarLower.setPos(0.0F, 0F, 0F);
        this.LeftEarUpper = new ModelRenderer(this, 0,35);
        this.LeftEarUpper.addBox(2.0F, -11.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.5F, 0.5F, 0.5F);
        this.LeftEarUpper.setPos(0.0F, 0F, 0F);
        this.RightEarLower = new ModelRenderer(this, 25,0);
        this.RightEarLower.addBox(-4.0F, -9.5F, -2.0F, 3.0F, 2.0F, 2.0F, 0.5F, 0.5F, 0.5F);
        this.RightEarLower.setPos(0.0F, 0F, 0F);
        this.RightEarUpper = new ModelRenderer(this, 8,35);
        this.RightEarUpper.addBox(-3.0F, -11.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.5F, 0.5F, 0.5F);
        this.RightEarUpper.setPos(0.0F, 0F, 0F);
        }

    public void setAllVisible(boolean p_178719_1_) {
        super.setAllVisible(p_178719_1_);
        this.LeftEarUpper.visible = p_178719_1_;
        this.LeftEarLower.visible = p_178719_1_;
        this.RightEarUpper.visible = p_178719_1_;
        this.RightEarLower.visible = p_178719_1_;
        this.tail1.visible = p_178719_1_;
        this.tail2.visible = p_178719_1_;
        this.tail3.visible = p_178719_1_;
        this.tail4.visible = p_178719_1_;
    }
    @Override
    public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {
        super.setupAnim(p_225597_1_, p_225597_2_, p_225597_3_, p_225597_4_, p_225597_5_, p_225597_6_);
        this.LeftEarLower.copyFrom(this.head);
        this.LeftEarUpper.copyFrom(this.head);
        this.RightEarLower.copyFrom(this.head);
        this.RightEarUpper.copyFrom(this.head);
        this.tail1.copyFrom(this.body);
        this.tail2.copyFrom(this.body);
        this.tail3.copyFrom(this.body);
        this.tail4.copyFrom(this.body);
    }
    protected Iterable<ModelRenderer> headParts() {
        return ImmutableList.of(this.head,this.RightEarLower,this.RightEarUpper,this.LeftEarLower,this.LeftEarUpper);
    }

    @Override
    protected Iterable<ModelRenderer> bodyParts() {
        return ImmutableList.of(this.body,this.tail1,this.tail2,this.tail3,this.tail4, this.rightArm, this.leftArm, this.rightLeg, this.leftLeg, this.hat);

    }
}


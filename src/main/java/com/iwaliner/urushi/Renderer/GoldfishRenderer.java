package com.iwaliner.urushi.Renderer;

import com.iwaliner.urushi.Entity.GoldfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.TropicalFishAModel;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class GoldfishRenderer extends MobRenderer<GoldfishEntity, TropicalFishAModel<GoldfishEntity>> {
    private static final ResourceLocation FISH_LOCATION = new ResourceLocation("urushi:textures/entity/fish/goldfish.png");

    public GoldfishRenderer(EntityRendererManager p_i48862_1_) {
        super(p_i48862_1_, new TropicalFishAModel<>(0.0F), 0.15F);
    }

    public ResourceLocation getTextureLocation(GoldfishEntity p_110775_1_) {
        return FISH_LOCATION;
    }

    protected void setupRotations(GoldfishEntity p_225621_1_, MatrixStack p_225621_2_, float p_225621_3_, float p_225621_4_, float p_225621_5_) {
        super.setupRotations(p_225621_1_, p_225621_2_, p_225621_3_, p_225621_4_, p_225621_5_);
        float f = 4.3F * MathHelper.sin(0.6F * p_225621_3_);
        p_225621_2_.mulPose(Vector3f.YP.rotationDegrees(f));
        if (!p_225621_1_.isInWater()) {
            p_225621_2_.translate((double)0.2F, (double)0.1F, 0.0D);
            p_225621_2_.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
        }

    }
}

package com.iwaliner.urushi.Renderer;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.SalmonRenderer;
import net.minecraft.entity.passive.fish.SalmonEntity;
import net.minecraft.util.ResourceLocation;

public class CarpRenderer extends SalmonRenderer {
    public CarpRenderer(EntityRendererManager p_i48862_1_) {
        super(p_i48862_1_);
    }
    private static final ResourceLocation CARP_LOCATION = new ResourceLocation("urushi:textures/entity/fish/carp.png");

    public ResourceLocation getTextureLocation(SalmonEntity p_110775_1_) {
        return CARP_LOCATION;
    }

}

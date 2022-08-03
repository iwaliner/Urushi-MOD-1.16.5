package com.iwaliner.urushi.Renderer;

import com.iwaliner.urushi.Entity.RedOniEntity;
import com.iwaliner.urushi.Model.RedOniModel;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.layers.BipedArmorLayer;
import net.minecraft.client.renderer.entity.model.ZombieModel;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class AbstractRedOniRenderer<T extends ZombieEntity, M extends RedOniModel<T>> extends BipedRenderer<T, M> {
    private static final ResourceLocation ZOMBIE_LOCATION = new ResourceLocation("urushi:textures/entity/oni_red.png");

    protected AbstractRedOniRenderer(EntityRendererManager p_i50974_1_, M p_i50974_2_, M p_i50974_3_, M p_i50974_4_) {
        super(p_i50974_1_, p_i50974_2_, 0.5F);
        this.addLayer(new BipedArmorLayer<>(this, p_i50974_3_, p_i50974_4_));
    }

    public ResourceLocation getTextureLocation(ZombieEntity p_110775_1_) {
        return ZOMBIE_LOCATION;
    }

    protected boolean isShaking(T p_230495_1_) {
        return p_230495_1_.isUnderWaterConverting();
    }
}
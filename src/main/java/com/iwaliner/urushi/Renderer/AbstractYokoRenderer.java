package com.iwaliner.urushi.Renderer;

import com.iwaliner.urushi.Entity.YokoEntity;
import com.iwaliner.urushi.Model.RedOniModel;
import com.iwaliner.urushi.Model.YokoModel;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.layers.BipedArmorLayer;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class AbstractYokoRenderer<T extends YokoEntity, M extends YokoModel<T>> extends BipedRenderer<T, M> {
    private static final ResourceLocation ZOMBIE_LOCATION = new ResourceLocation("urushi:textures/entity/yoko.png");

    protected AbstractYokoRenderer(EntityRendererManager p_i50974_1_, M p_i50974_2_, M p_i50974_3_, M p_i50974_4_) {
        super(p_i50974_1_, p_i50974_2_, 0.5F);
        this.addLayer(new BipedArmorLayer<>(this, p_i50974_3_, p_i50974_4_));
    }

    public ResourceLocation getTextureLocation(YokoEntity p_110775_1_) {
        return ZOMBIE_LOCATION;
    }


}
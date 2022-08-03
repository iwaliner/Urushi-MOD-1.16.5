package com.iwaliner.urushi.Renderer;

import com.iwaliner.urushi.Entity.GhostEntity;
import com.iwaliner.urushi.Entity.RedOniEntity;
import com.iwaliner.urushi.Model.GhostModel;
import com.iwaliner.urushi.Model.RedOniModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.SalmonRenderer;
import net.minecraft.client.renderer.entity.ZombieRenderer;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.passive.fish.SalmonEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GhostRenderer extends AbstractGhostRenderer<GhostEntity, GhostModel<GhostEntity>> {
    public GhostRenderer(EntityRendererManager p_i46127_1_) {
        super(p_i46127_1_, new GhostModel<>(0.0f), new GhostModel<>(0.5F), new GhostModel<>(1.0F));
    }
}

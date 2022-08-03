package com.iwaliner.urushi.Renderer;

import com.iwaliner.urushi.Entity.RedOniEntity;
import com.iwaliner.urushi.Model.RedOniModel;
import net.minecraft.client.renderer.entity.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class RedOniRenderer extends AbstractRedOniRenderer<RedOniEntity, RedOniModel<RedOniEntity>> {
    public RedOniRenderer(EntityRendererManager p_i46127_1_) {
        super(p_i46127_1_, new RedOniModel<>(0.0f), new RedOniModel<>(0.5F), new RedOniModel<>(1.0F));
    }
}

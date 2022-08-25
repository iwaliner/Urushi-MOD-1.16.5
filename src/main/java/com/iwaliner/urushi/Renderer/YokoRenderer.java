package com.iwaliner.urushi.Renderer;

import com.iwaliner.urushi.Entity.RedOniEntity;
import com.iwaliner.urushi.Entity.YokoEntity;
import com.iwaliner.urushi.Model.RedOniModel;
import com.iwaliner.urushi.Model.YokoModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class YokoRenderer extends AbstractYokoRenderer<YokoEntity, YokoModel<YokoEntity>> {
    public YokoRenderer(EntityRendererManager p_i46127_1_) {
        super(p_i46127_1_, new YokoModel<>(0.0f), new YokoModel<>(0.5F), new YokoModel<>(1.0F));
    }
}

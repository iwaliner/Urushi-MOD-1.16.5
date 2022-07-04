package com.iwaliner.urushi;

import com.iwaliner.urushi.Entity.CarpEntity;
import com.iwaliner.urushi.Renderer.CarpRenderer;
import com.iwaliner.urushi.Renderer.GoldfishRenderer;
import com.iwaliner.urushi.Renderer.SweetfishRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ModCore_Urushi.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {

    /**エンティティの見た目を登録*/
    @SubscribeEvent
    public static void RegisterRendererEvent(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityRegister.KitsunebiEntity.get(),
                renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
        RenderingRegistry.registerEntityRenderingHandler(EntityRegister.CarpEntity.get(),
                renderManager -> new CarpRenderer(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(EntityRegister.SweetfishEntity.get(),
                renderManager -> new SweetfishRenderer(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(EntityRegister.GoldfishEntity.get(),
                renderManager -> new GoldfishRenderer(renderManager));
    }

    /**モブの挙動・性質を設定*/
    @SubscribeEvent
    public static void MobAttributesEvent(EntityAttributeCreationEvent entityRegisterEvent) {

        entityRegisterEvent.put(EntityRegister.CarpEntity.get(),
                CarpEntity.createAttributes()
                        .add(Attributes.MAX_HEALTH, 3.0D)
                        .add(Attributes.ATTACK_DAMAGE, 0.0D)
                        .add(Attributes.ATTACK_SPEED, 1.0D)
                        .add(Attributes.FLYING_SPEED, 0.5D)
                        .add(Attributes.MOVEMENT_SPEED, 0.5D)
                        .build());
        entityRegisterEvent.put(EntityRegister.SweetfishEntity.get(),
                CarpEntity.createAttributes()
                        .add(Attributes.MAX_HEALTH, 3.0D)
                        .add(Attributes.ATTACK_DAMAGE, 0.0D)
                        .add(Attributes.ATTACK_SPEED, 1.0D)
                        .add(Attributes.FLYING_SPEED, 0.5D)
                        .add(Attributes.MOVEMENT_SPEED, 0.5D)
                        .build());
        entityRegisterEvent.put(EntityRegister.GoldfishEntity.get(),
                CarpEntity.createAttributes()
                        .add(Attributes.MAX_HEALTH, 3.0D)
                        .add(Attributes.ATTACK_DAMAGE, 0.0D)
                        .add(Attributes.ATTACK_SPEED, 1.0D)
                        .add(Attributes.FLYING_SPEED, 0.5D)
                        .add(Attributes.MOVEMENT_SPEED, 0.5D)
                        .build());
    }
}

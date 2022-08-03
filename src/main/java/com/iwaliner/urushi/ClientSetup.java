package com.iwaliner.urushi;

import com.iwaliner.urushi.Entity.*;
import com.iwaliner.urushi.Renderer.*;
import com.iwaliner.urushi.Screen.FryerScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
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


    @SubscribeEvent
    public static void RegisterRendererEvent(FMLClientSetupEvent event) {
/**コンテナにGUIを登録*/
        ScreenManager.register(ContainerRegister.FryerContainer.get(), FryerScreen::new);

/**エンティティの見た目を登録*/
        RenderingRegistry.registerEntityRenderingHandler(EntityRegister.KitsunebiEntity.get(),
                renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
        RenderingRegistry.registerEntityRenderingHandler(EntityRegister.CarpEntity.get(),
                renderManager -> new CarpRenderer(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(EntityRegister.SweetfishEntity.get(),
                renderManager -> new SweetfishRenderer(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(EntityRegister.GoldfishEntity.get(),
                renderManager -> new GoldfishRenderer(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(EntityRegister.GhostEntity.get(),
                renderManager -> new GhostRenderer(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(EntityRegister.RedOniEntity.get(),
                renderManager -> new RedOniRenderer(renderManager));
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
                SweetfishEntity.createAttributes()
                        .add(Attributes.MAX_HEALTH, 3.0D)
                        .add(Attributes.ATTACK_DAMAGE, 0.0D)
                        .add(Attributes.ATTACK_SPEED, 1.0D)
                        .add(Attributes.FLYING_SPEED, 0.5D)
                        .add(Attributes.MOVEMENT_SPEED, 0.5D)
                        .build());
        entityRegisterEvent.put(EntityRegister.GoldfishEntity.get(),
                GoldfishEntity.createAttributes()
                        .add(Attributes.MAX_HEALTH, 3.0D)
                        .add(Attributes.ATTACK_DAMAGE, 0.0D)
                        .add(Attributes.ATTACK_SPEED, 1.0D)
                        .add(Attributes.FLYING_SPEED, 0.5D)
                        .add(Attributes.MOVEMENT_SPEED, 0.5D)
                        .build());
        entityRegisterEvent.put(EntityRegister.GhostEntity.get(),
                GhostEntity.createAttributes()
                        .add(Attributes.MAX_HEALTH, 20.0D)
                        .add(Attributes.ATTACK_DAMAGE, 6.0D)
                        .add(Attributes.ATTACK_SPEED, 0.5D)
                        .add(Attributes.FLYING_SPEED, 0.5D)
                        .add(Attributes.MOVEMENT_SPEED, 0.2D)
                        .build());
        entityRegisterEvent.put(EntityRegister.RedOniEntity.get(),
                RedOniEntity.createAttributes()
                        .add(Attributes.MAX_HEALTH, 60.0D)
                        .add(Attributes.ATTACK_DAMAGE, 10.0D)
                        .add(Attributes.ATTACK_SPEED, 0.5D)
                        .add(Attributes.FLYING_SPEED, 0.5D)
                        .add(Attributes.MOVEMENT_SPEED, 0.3D)
                        .build());
    }
}

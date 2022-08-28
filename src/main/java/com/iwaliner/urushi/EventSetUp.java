package com.iwaliner.urushi;

import com.iwaliner.urushi.Entity.*;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ModCore_Urushi.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventSetUp {
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
        entityRegisterEvent.put(EntityRegister.YokoEntity.get(),
                RedOniEntity.createAttributes()
                        .add(Attributes.MAX_HEALTH, 30.0D)
                        // .add(Attributes.ATTACK_DAMAGE, 5.0D)
                        // .add(Attributes.ATTACK_SPEED, 0.5D)
                        .add(Attributes.FLYING_SPEED, 0.2D)
                        .add(Attributes.MOVEMENT_SPEED, 0.2D)
                        .build());
    }

}

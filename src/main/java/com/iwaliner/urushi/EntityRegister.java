package com.iwaliner.urushi;


import com.iwaliner.urushi.Entity.CarpEntity;
import com.iwaliner.urushi.Entity.GoldfishEntity;
import com.iwaliner.urushi.Entity.KitsunebiEntity;
import com.iwaliner.urushi.Entity.SweetfishEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityRegister {

    public static final DeferredRegister<EntityType<?>> Entities = DeferredRegister.create(ForgeRegistries.ENTITIES, ModCore_Urushi.MOD_ID);
    public static final RegistryObject<EntityType<KitsunebiEntity>> KitsunebiEntity=Entities.register("kitsunebi", () -> EntityType.Builder.<KitsunebiEntity>of(KitsunebiEntity::new, EntityClassification.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(ModCore_Urushi.MOD_ID,"kitsunebi").toString()));
    public static final RegistryObject<EntityType<com.iwaliner.urushi.Entity.CarpEntity>> CarpEntity=Entities.register("carp", () -> EntityType.Builder.<CarpEntity>of(CarpEntity::new, EntityClassification.WATER_AMBIENT).sized(0.7F, 0.4F).clientTrackingRange(4).build(new ResourceLocation(ModCore_Urushi.MOD_ID,"carp").toString()));
    public static final RegistryObject<EntityType<com.iwaliner.urushi.Entity.SweetfishEntity>> SweetfishEntity=Entities.register("sweetfish", () -> EntityType.Builder.<com.iwaliner.urushi.Entity.SweetfishEntity>of(SweetfishEntity::new, EntityClassification.WATER_AMBIENT).sized(0.7F, 0.4F).clientTrackingRange(4).build(new ResourceLocation(ModCore_Urushi.MOD_ID,"sweetfish").toString()));
    public static final RegistryObject<EntityType<GoldfishEntity>> GoldfishEntity=Entities.register("goldfish", () -> EntityType.Builder.<GoldfishEntity>of(GoldfishEntity::new, EntityClassification.WATER_AMBIENT).sized(0.5F, 0.4F).clientTrackingRange(4).build(new ResourceLocation(ModCore_Urushi.MOD_ID,"goldfish").toString()));

    public static void register(IEventBus eventBus) {
        Entities.register(eventBus);
    }

}

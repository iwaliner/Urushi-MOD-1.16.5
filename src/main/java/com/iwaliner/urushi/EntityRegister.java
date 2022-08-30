package com.iwaliner.urushi;


import com.iwaliner.urushi.Entity.*;
import com.iwaliner.urushi.Entity.FoodEntity.*;
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
    public static final RegistryObject<EntityType<GhostEntity>> GhostEntity=Entities.register("ghost", () -> EntityType.Builder.<GhostEntity>of(GhostEntity::new, EntityClassification.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(new ResourceLocation(ModCore_Urushi.MOD_ID,"ghost").toString()));
    public static final RegistryObject<EntityType<RedOniEntity>> RedOniEntity=Entities.register("red_oni", () -> EntityType.Builder.<RedOniEntity>of(RedOniEntity::new, EntityClassification.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(new ResourceLocation(ModCore_Urushi.MOD_ID,"red_oni").toString()));
    public static final RegistryObject<EntityType<YokoEntity>> YokoEntity=Entities.register("yoko", () -> EntityType.Builder.<YokoEntity>of(YokoEntity::new, EntityClassification.CREATURE).sized(0.6F, 1.95F).clientTrackingRange(8).build(new ResourceLocation(ModCore_Urushi.MOD_ID,"yoko").toString()));
    public static final RegistryObject<EntityType<CushionEntity>> CushionEntity=Entities.register("cushion", () -> EntityType.Builder.<CushionEntity>of(CushionEntity::new, EntityClassification.MISC).sized(0.7F, 0.2F).clientTrackingRange(8).build(new ResourceLocation(ModCore_Urushi.MOD_ID,"butadon_food").toString()));
    public static final RegistryObject<EntityType<com.iwaliner.urushi.Entity.FoodEntity.RiceFoodEntity>> RiceFoodEntity=Entities.register("rice_food", () -> EntityType.Builder.<RiceFoodEntity>of(RiceFoodEntity::new, EntityClassification.MISC).sized(0.4F, 0.4F).clientTrackingRange(8).build(new ResourceLocation(ModCore_Urushi.MOD_ID,"rice_food").toString()));
    public static final RegistryObject<EntityType<SekihanFoodEntity>> SekihanFoodEntity=Entities.register("sekihan_food", () -> EntityType.Builder.<SekihanFoodEntity>of(SekihanFoodEntity::new, EntityClassification.MISC).sized(0.4F, 0.4F).clientTrackingRange(8).build(new ResourceLocation(ModCore_Urushi.MOD_ID,"sekihan_food").toString()));
    public static final RegistryObject<EntityType<TKGFoodEntity>> TKGFoodEntity=Entities.register("tkg_food", () -> EntityType.Builder.<TKGFoodEntity>of(com.iwaliner.urushi.Entity.FoodEntity.TKGFoodEntity::new, EntityClassification.MISC).sized(0.4F, 0.4F).clientTrackingRange(8).build(new ResourceLocation(ModCore_Urushi.MOD_ID,"tkg_food").toString()));
    public static final RegistryObject<EntityType<com.iwaliner.urushi.Entity.FoodEntity.GyudonFoodEntity>> GyudonFoodEntity=Entities.register("gyudon_food", () -> EntityType.Builder.<GyudonFoodEntity>of(GyudonFoodEntity::new, EntityClassification.MISC).sized(0.4F, 0.4F).clientTrackingRange(8).build(new ResourceLocation(ModCore_Urushi.MOD_ID,"gyudon_food").toString()));
    public static final RegistryObject<EntityType<com.iwaliner.urushi.Entity.FoodEntity.ButadonFoodEntity>> ButadonFoodEntity=Entities.register("butadon_food", () -> EntityType.Builder.<ButadonFoodEntity>of(ButadonFoodEntity::new, EntityClassification.MISC).sized(0.4F, 0.4F).clientTrackingRange(8).build(new ResourceLocation(ModCore_Urushi.MOD_ID,"butadon_food").toString()));
    public static void register(IEventBus eventBus) {
        Entities.register(eventBus);
    }

}

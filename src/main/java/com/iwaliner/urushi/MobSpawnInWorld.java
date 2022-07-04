package com.iwaliner.urushi;

import net.minecraft.entity.EntityType;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import java.util.List;


/**mobを特定のバイオームにスポーンさせる*/
public class MobSpawnInWorld {
    public static void spawnMobsEvent(final BiomeLoadingEvent event){
        addToSpecificBiomeCategory(event,EntityRegister.GoldfishEntity.get(),4,5,10,Biome.Category.RIVER);
        addToSpecificBiomeCategory(event,EntityRegister.CarpEntity.get(),4,5,10,Biome.Category.RIVER);
        addToSpecificBiomeCategory(event,EntityRegister.SweetfishEntity.get(),13,1,5,Biome.Category.RIVER);
    }
    private static void addToSpecificBiomes(BiomeLoadingEvent event, EntityType<?> entityType, int weight, int min, int max, RegistryKey<Biome> biome){
        if(biome.getRegistryName().equals(event.getName())){
            List<MobSpawnInfo.Spawners> list=event.getSpawns().getSpawner(entityType.getCategory());
            list.add(new MobSpawnInfo.Spawners(entityType,weight,min,max));

        }
    }
    private static void addToSpecificBiomeCategory(BiomeLoadingEvent event, EntityType<?> entityType, int weight, int min, int max, Biome.Category biome){
        if(biome.equals(event.getCategory())){
            List<MobSpawnInfo.Spawners> list=event.getSpawns().getSpawner(entityType.getCategory());
            list.add(new MobSpawnInfo.Spawners(entityType,weight,min,max));
        }
    }
}

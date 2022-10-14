package com.iwaliner.urushi;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = ModCore_Urushi.MOD_ID ,value = Dist.CLIENT)
public class RenderUrushiRegister {
    @SubscribeEvent
    public static void onRenderTypeSetup(FMLClientSetupEvent event) {


        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.JapaneseTimberBamboo.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.GoldfishBowl.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.JapaneseApricotSapling.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.JapaneseApricotGlowingSapling.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.SakuraSapling.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.SakuraBigSapling.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.SakuraGlowingSapling.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.SakuraGlowingBigSapling.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.CypressSapling.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.LacquerSapling.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.Andon.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.AriakeAndon.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.RiceCrop.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.AzukiCrop.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.OakShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.SpruceShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.OakShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.SpruceShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.BirchShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.JungleShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.AcaciaShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.DarkOakShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.JapaneseApricotShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.SakuraShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.CypressShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.RedUrushiShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.BlackUrushiShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.SlidingGlassDoor.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.BirchShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.JungleShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.AcaciaShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.DarkOakShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.JapaneseApricotShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.SakuraShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.CypressShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.RedUrushiShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.BlackUrushiShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.SoyCrop.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.Kitsunebi.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.MeshGroove.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.ConnectableGlass.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.ConnectableGlassPane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.MetalFramedGlass.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.MetalFramedGlassPane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.Fryer.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.DeepBlueNoren.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.MenOnsenNoren.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.WomenOnsenNoren.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.RedNoren.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.CyanNoren.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.MagentaNoren.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.SushiNoren.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.dirt_furnace.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.reiryoku_tank_tier1.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.kakejiku_1.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.kakejiku_2.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.kakejiku_3.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.kakejiku_4.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.kakejiku_5.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.kakejiku_6.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.kakejiku_7.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.kakejiku_8.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.kakejiku_9.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.kakejiku_10.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.kakejiku_11.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.kakejiku_12.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.kakejiku_13.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.kakejiku_14.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.JapaneseApricotLeaves.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.JapaneseApricotGlowingLeaves.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.SakuraLeaves.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.SakuraGlowingLeaves.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.red_leaves.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.red_sapling.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.orange_leaves.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.orange_sapling.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.yellow_leaves.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.yellow_sapling.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.japanese_cedar_sapling.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.JapaneseCedarShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ItemAndBlockRegister.JapaneseCedarShojiPane.get(), RenderType.translucent());
    }

}

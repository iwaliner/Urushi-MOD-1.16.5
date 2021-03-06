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


        RenderTypeLookup.setRenderLayer(BlocksRegister.JapaneseTimberBamboo.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksRegister.GoldfishBowl.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksRegister.JapaneseApricotSapling.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksRegister.JapaneseApricotGlowingSapling.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksRegister.SakuraSapling.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksRegister.SakuraBigSapling.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksRegister.SakuraGlowingSapling.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksRegister.SakuraGlowingBigSapling.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksRegister.CypressSapling.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksRegister.LacquerSapling.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksRegister.Andon.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.AriakeAndon.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.RiceCrop.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksRegister.AzukiCrop.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksRegister.OakShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.SpruceShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.OakShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.SpruceShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.BirchShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.JungleShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.AcaciaShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.DarkOakShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.JapaneseApricotShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.SakuraShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.CypressShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.RedUrushiShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.BlackUrushiShoji.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.SlidingGlassDoor.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksRegister.BirchShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.JungleShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.AcaciaShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.DarkOakShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.JapaneseApricotShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.SakuraShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.CypressShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.RedUrushiShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.BlackUrushiShojiPane.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlocksRegister.SoyCrop.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksRegister.Kitsunebi.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksRegister.MeshGroove.get(), RenderType.cutout());
    }

}

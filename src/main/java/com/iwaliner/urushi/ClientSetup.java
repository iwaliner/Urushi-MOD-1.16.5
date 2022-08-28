package com.iwaliner.urushi;

import com.iwaliner.urushi.Json.CubeAllBlockJsonMaker;
import com.iwaliner.urushi.Json.GeneratedItemJsonMaker;
import com.iwaliner.urushi.Json.NormalBlockItemJsonMaker;
import com.iwaliner.urushi.Renderer.*;
import com.iwaliner.urushi.Screen.DoubledWoodenCabinetryScreen;
import com.iwaliner.urushi.Screen.FryerScreen;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.loading.FMLPaths;
import javax.annotation.Nullable;
import java.io.File;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = ModCore_Urushi.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {

    @Nullable

    @SubscribeEvent
    public static void RegisterRendererEvent(FMLClientSetupEvent event) {

        /**霊力で変化させるレシピを登録*/
        UrushiUtils.setItemBewitchRecipe(Items.SUGAR,Items.GLOWSTONE_DUST);
        //UrushiUtils.setItemBewitchRecipe(Items.PAPER,ItemsRegister.blank_charm.get());
        UrushiUtils.setItemBewitchRecipe(ItemsRegister.NormalKatanaTier10.get(),Items.DIAMOND);
        UrushiUtils.setItemBewitchRecipe(Item.byBlock(Blocks.GOLD_BLOCK),Item.byBlock(Blocks.DIAMOND_BLOCK));

        UrushiUtils.setBewitchingTime(Items.SUGAR,60);
        UrushiUtils.setBewitchingTime(Items.PAPER,100);
        UrushiUtils.setBewitchingTime(ItemsRegister.NormalKatanaTier10.get(),10);
        UrushiUtils.setBewitchingTime(Item.byBlock(Blocks.GOLD_BLOCK),200);

        UrushiUtils.setAltarVariant(Items.SUGAR,1);
        UrushiUtils.setAltarVariant(Items.GLOWSTONE_DUST,2);
        UrushiUtils.setAltarVariant(Items.PAPER,3);
       // UrushiUtils.setAltarVariant(ItemsRegister.blank_charm.get(),4);
        UrushiUtils.setAltarVariant(ItemsRegister.NormalKatanaTier10.get(),5);
        UrushiUtils.setAltarVariant(Items.DIAMOND,6);
        UrushiUtils.setAltarVariant(Items.GOLD_BLOCK,7);
        UrushiUtils.setAltarVariant(Items.DIAMOND_BLOCK,8);



/**コンテナにGUIを登録*/
        ScreenManager.register(ContainerRegister.FryerContainer.get(), FryerScreen::new);
        ScreenManager.register(ContainerRegister.DoubledWoodenCabinetryContainer.get(), DoubledWoodenCabinetryScreen::new);

/**アイテムの状態を登録*/
        event.enqueueWork(() -> {
            ItemModelsProperties.register(ItemsRegister.NormalKatanaTier1.get(), new ResourceLocation(ModCore_Urushi.MOD_ID, "ishurting"), (itemStack, clientWorld, livingEntity) -> (livingEntity instanceof PlayerEntity &&livingEntity.swinging&&livingEntity.getMainHandItem()==itemStack)?1:0);
            ItemModelsProperties.register(ItemsRegister.NormalKatanaTier2.get(), new ResourceLocation(ModCore_Urushi.MOD_ID, "ishurting"), (itemStack, clientWorld, livingEntity) -> (livingEntity instanceof PlayerEntity &&livingEntity.swinging&&livingEntity.getMainHandItem()==itemStack)?1:0);
            ItemModelsProperties.register(ItemsRegister.NormalKatanaTier3.get(), new ResourceLocation(ModCore_Urushi.MOD_ID, "ishurting"), (itemStack, clientWorld, livingEntity) -> (livingEntity instanceof PlayerEntity &&livingEntity.swinging&&livingEntity.getMainHandItem()==itemStack)?1:0);
            ItemModelsProperties.register(ItemsRegister.NormalKatanaTier4.get(), new ResourceLocation(ModCore_Urushi.MOD_ID, "ishurting"), (itemStack, clientWorld, livingEntity) -> (livingEntity instanceof PlayerEntity &&livingEntity.swinging&&livingEntity.getMainHandItem()==itemStack)?1:0);
            ItemModelsProperties.register(ItemsRegister.NormalKatanaTier5.get(), new ResourceLocation(ModCore_Urushi.MOD_ID, "ishurting"), (itemStack, clientWorld, livingEntity) -> (livingEntity instanceof PlayerEntity &&livingEntity.swinging&&livingEntity.getMainHandItem()==itemStack)?1:0);
            ItemModelsProperties.register(ItemsRegister.NormalKatanaTier6.get(), new ResourceLocation(ModCore_Urushi.MOD_ID, "ishurting"), (itemStack, clientWorld, livingEntity) -> (livingEntity instanceof PlayerEntity &&livingEntity.swinging&&livingEntity.getMainHandItem()==itemStack)?1:0);
            ItemModelsProperties.register(ItemsRegister.NormalKatanaTier7.get(), new ResourceLocation(ModCore_Urushi.MOD_ID, "ishurting"), (itemStack, clientWorld, livingEntity) -> (livingEntity instanceof PlayerEntity &&livingEntity.swinging&&livingEntity.getMainHandItem()==itemStack)?1:0);
            ItemModelsProperties.register(ItemsRegister.NormalKatanaTier8.get(), new ResourceLocation(ModCore_Urushi.MOD_ID, "ishurting"), (itemStack, clientWorld, livingEntity) -> (livingEntity instanceof PlayerEntity &&livingEntity.swinging&&livingEntity.getMainHandItem()==itemStack)?1:0);
            ItemModelsProperties.register(ItemsRegister.NormalKatanaTier9.get(), new ResourceLocation(ModCore_Urushi.MOD_ID, "ishurting"), (itemStack, clientWorld, livingEntity) -> (livingEntity instanceof PlayerEntity &&livingEntity.swinging&&livingEntity.getMainHandItem()==itemStack)?1:0);
            ItemModelsProperties.register(ItemsRegister.NormalKatanaTier10.get(), new ResourceLocation(ModCore_Urushi.MOD_ID, "ishurting"), (itemStack, clientWorld, livingEntity) -> (livingEntity instanceof PlayerEntity &&livingEntity.swinging&&livingEntity.getMainHandItem()==itemStack)?1:0);

        });



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
        RenderingRegistry.registerEntityRenderingHandler(EntityRegister.YokoEntity.get(),
                renderManager -> new YokoRenderer(renderManager));



/**jsonファイルを自動生成するために開発環境のパスを登録*/
        if (ConfigUrushi.SecretPassword.get()==88659) {
           // File parent = Minecraft.getInstance().getResourcePackDirectory().getAbsoluteFile();
          //  if (parent.getAbsolutePath().contains("run")) {
                FMLPaths.GAMEDIR.get();
                ModCore_Urushi.assetsDirectory = new File( FMLPaths.GAMEDIR.get().getParent().toString()+ "/src/main/resources/assets/urushi/");
                ModCore_Urushi.assetsInBuildDirectory = new File( FMLPaths.GAMEDIR.get().getParent().toString()+ "/build/resources/main/assets/urushi/");
                ModCore_Urushi.dataDirectory = new File( FMLPaths.GAMEDIR.get().getParent().toString()+ "/src/main/resources/data/");
                ModCore_Urushi.dataInBuildDirectory = new File( FMLPaths.GAMEDIR.get().getParent().toString()+ "/build/resources/main/data/");
         //   }
            if (ModCore_Urushi.assetsDirectory != null) {
                ModCore_Urushi.logger.info("Directory for json model loaded");
            }



            /**jsonファイルを自動生成*/
            GeneratedItemJsonMaker.INSTANCE.registerItemModel(ItemsRegister.yokan.get());
            GeneratedItemJsonMaker.INSTANCE.registerItemModel(ItemsRegister.sekihan.get());
            GeneratedItemJsonMaker.INSTANCE.registerItemModel(ItemsRegister.kitsune_udon.get());
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(ItemsRegister.RoughStone.get());
            CubeAllBlockJsonMaker.INSTANCE.registerBlockModel(BlocksRegister.RoughStone.get(),"rough_stone");
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(ItemsRegister.salt_and_sand.get());
            CubeAllBlockJsonMaker.INSTANCE.registerBlockModel(BlocksRegister.salt_and_sand.get(),"salt_sand");
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(ItemsRegister.udon.get());
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(ItemsRegister.dough.get());
        }


    }





}

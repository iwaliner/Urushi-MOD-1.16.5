package com.iwaliner.urushi;

import com.iwaliner.urushi.Json.*;
import com.iwaliner.urushi.Renderer.*;
import com.iwaliner.urushi.Renderer.FoodRenderer.*;
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
        //UrushiUtils.setItemBewitchRecipe(Items.PAPER,ItemAndBlockRegister.blank_charm.get());
        UrushiUtils.setItemBewitchRecipe(ItemAndBlockRegister.NormalKatanaTier10.get(),Items.DIAMOND);
        UrushiUtils.setItemBewitchRecipe(Item.byBlock(Blocks.GOLD_BLOCK),Item.byBlock(Blocks.DIAMOND_BLOCK));

        UrushiUtils.setBewitchingTime(Items.SUGAR,60);
        UrushiUtils.setBewitchingTime(Items.PAPER,100);
        UrushiUtils.setBewitchingTime(ItemAndBlockRegister.NormalKatanaTier10.get(),10);
        UrushiUtils.setBewitchingTime(Item.byBlock(Blocks.GOLD_BLOCK),200);

        UrushiUtils.setAltarVariant(Items.SUGAR,1);
        UrushiUtils.setAltarVariant(Items.GLOWSTONE_DUST,2);
        UrushiUtils.setAltarVariant(Items.PAPER,3);
       // UrushiUtils.setAltarVariant(ItemAndBlockRegister.blank_charm.get(),4);
        UrushiUtils.setAltarVariant(ItemAndBlockRegister.NormalKatanaTier10.get(),5);
        UrushiUtils.setAltarVariant(Items.DIAMOND,6);
        UrushiUtils.setAltarVariant(Items.GOLD_BLOCK,7);
        UrushiUtils.setAltarVariant(Items.DIAMOND_BLOCK,8);



/**コンテナにGUIを登録*/
        ScreenManager.register(ContainerRegister.FryerContainer.get(), FryerScreen::new);
        ScreenManager.register(ContainerRegister.DoubledWoodenCabinetryContainer.get(), DoubledWoodenCabinetryScreen::new);

/**アイテムの状態を登録*/
        event.enqueueWork(() -> {
            ItemModelsProperties.register(ItemAndBlockRegister.NormalKatanaTier1.get(), new ResourceLocation(ModCore_Urushi.MOD_ID, "ishurting"), (itemStack, clientWorld, livingEntity) -> (livingEntity instanceof PlayerEntity &&livingEntity.swinging&&livingEntity.getMainHandItem()==itemStack)?1:0);
            ItemModelsProperties.register(ItemAndBlockRegister.NormalKatanaTier2.get(), new ResourceLocation(ModCore_Urushi.MOD_ID, "ishurting"), (itemStack, clientWorld, livingEntity) -> (livingEntity instanceof PlayerEntity &&livingEntity.swinging&&livingEntity.getMainHandItem()==itemStack)?1:0);
            ItemModelsProperties.register(ItemAndBlockRegister.NormalKatanaTier3.get(), new ResourceLocation(ModCore_Urushi.MOD_ID, "ishurting"), (itemStack, clientWorld, livingEntity) -> (livingEntity instanceof PlayerEntity &&livingEntity.swinging&&livingEntity.getMainHandItem()==itemStack)?1:0);
            ItemModelsProperties.register(ItemAndBlockRegister.NormalKatanaTier4.get(), new ResourceLocation(ModCore_Urushi.MOD_ID, "ishurting"), (itemStack, clientWorld, livingEntity) -> (livingEntity instanceof PlayerEntity &&livingEntity.swinging&&livingEntity.getMainHandItem()==itemStack)?1:0);
            ItemModelsProperties.register(ItemAndBlockRegister.NormalKatanaTier5.get(), new ResourceLocation(ModCore_Urushi.MOD_ID, "ishurting"), (itemStack, clientWorld, livingEntity) -> (livingEntity instanceof PlayerEntity &&livingEntity.swinging&&livingEntity.getMainHandItem()==itemStack)?1:0);
            ItemModelsProperties.register(ItemAndBlockRegister.NormalKatanaTier6.get(), new ResourceLocation(ModCore_Urushi.MOD_ID, "ishurting"), (itemStack, clientWorld, livingEntity) -> (livingEntity instanceof PlayerEntity &&livingEntity.swinging&&livingEntity.getMainHandItem()==itemStack)?1:0);
            ItemModelsProperties.register(ItemAndBlockRegister.NormalKatanaTier7.get(), new ResourceLocation(ModCore_Urushi.MOD_ID, "ishurting"), (itemStack, clientWorld, livingEntity) -> (livingEntity instanceof PlayerEntity &&livingEntity.swinging&&livingEntity.getMainHandItem()==itemStack)?1:0);
            ItemModelsProperties.register(ItemAndBlockRegister.NormalKatanaTier8.get(), new ResourceLocation(ModCore_Urushi.MOD_ID, "ishurting"), (itemStack, clientWorld, livingEntity) -> (livingEntity instanceof PlayerEntity &&livingEntity.swinging&&livingEntity.getMainHandItem()==itemStack)?1:0);
            ItemModelsProperties.register(ItemAndBlockRegister.NormalKatanaTier9.get(), new ResourceLocation(ModCore_Urushi.MOD_ID, "ishurting"), (itemStack, clientWorld, livingEntity) -> (livingEntity instanceof PlayerEntity &&livingEntity.swinging&&livingEntity.getMainHandItem()==itemStack)?1:0);
            ItemModelsProperties.register(ItemAndBlockRegister.NormalKatanaTier10.get(), new ResourceLocation(ModCore_Urushi.MOD_ID, "ishurting"), (itemStack, clientWorld, livingEntity) -> (livingEntity instanceof PlayerEntity &&livingEntity.swinging&&livingEntity.getMainHandItem()==itemStack)?1:0);

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
        RenderingRegistry.registerEntityRenderingHandler(EntityRegister.RiceFoodEntity.get(),
                renderManager -> new RiceFoodRenderer(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(EntityRegister.SekihanFoodEntity.get(),
                renderManager -> new SekihanFoodRenderer(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(EntityRegister.TKGFoodEntity.get(),
                renderManager -> new TKGFoodRenderer(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(EntityRegister.GyudonFoodEntity.get(),
                renderManager -> new GyudonFoodRenderer(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(EntityRegister.ButadonFoodEntity.get(),
                renderManager -> new ButadonFoodRenderer(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(EntityRegister.CushionEntity.get(),
                renderManager -> new CushionRenderer(renderManager));



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
            GeneratedItemJsonMaker.INSTANCE.registerItemModel(ItemAndBlockRegister.yokan.get(),"yokan");
            GeneratedItemJsonMaker.INSTANCE.registerItemModel(ItemAndBlockRegister.white_cushion.get(),"cushion_white");
            GeneratedItemJsonMaker.INSTANCE.registerItemModel(ItemAndBlockRegister.orange_cushion.get(),"cushion_orange");
            GeneratedItemJsonMaker.INSTANCE.registerItemModel(ItemAndBlockRegister.magenta_cushion.get(),"cushion_magenta");
            GeneratedItemJsonMaker.INSTANCE.registerItemModel(ItemAndBlockRegister.light_blue_cushion.get(),"cushion_light_blue");
            GeneratedItemJsonMaker.INSTANCE.registerItemModel(ItemAndBlockRegister.yellow_cushion.get(),"cushion_yellow");
            GeneratedItemJsonMaker.INSTANCE.registerItemModel(ItemAndBlockRegister.lime_cushion.get(),"cushion_lime");
            GeneratedItemJsonMaker.INSTANCE.registerItemModel(ItemAndBlockRegister.pink_cushion.get(),"cushion_pink");
            GeneratedItemJsonMaker.INSTANCE.registerItemModel(ItemAndBlockRegister.gray_cushion.get(),"cushion_gray");
            GeneratedItemJsonMaker.INSTANCE.registerItemModel(ItemAndBlockRegister.cyan_cushion.get(),"cushion_cyan");
            GeneratedItemJsonMaker.INSTANCE.registerItemModel(ItemAndBlockRegister.purple_cushion.get(),"cushion_purple");
            GeneratedItemJsonMaker.INSTANCE.registerItemModel(ItemAndBlockRegister.blue_cushion.get(),"cushion_blue");
            GeneratedItemJsonMaker.INSTANCE.registerItemModel(ItemAndBlockRegister.brown_cushion.get(),"cushion_brown");
            GeneratedItemJsonMaker.INSTANCE.registerItemModel(ItemAndBlockRegister.green_cushion.get(),"cushion_green");
            GeneratedItemJsonMaker.INSTANCE.registerItemModel(ItemAndBlockRegister.red_cushion.get(),"cushion_red");
            GeneratedItemJsonMaker.INSTANCE.registerItemModel(ItemAndBlockRegister.black_cushion.get(),"cushion_black");
            GeneratedItemJsonMaker.INSTANCE.registerItemModel(ItemAndBlockRegister.light_gray_cushion.get(),"cushion_silver");
            GeneratedItemJsonMaker.INSTANCE.registerItemModel(ItemAndBlockRegister.japanese_cedar_bark.get(),"japanese_cedar_bark");

            CubeAllBlockJsonMaker.INSTANCE.registerBlockModel(ItemAndBlockRegister.RoughStone.get(),"rough_stone");
            CubeAllBlockJsonMaker.INSTANCE.registerBlockModel(ItemAndBlockRegister.salt_and_sand.get(),"salt_sand");
            CubeAllBlockJsonMaker.INSTANCE.registerBlockModel(ItemAndBlockRegister.smooth_japanese_cedar_planks.get(),"planks_smooth_japanese_cedar");
            CubeAllBlockJsonMaker.INSTANCE.registerBlockModel(ItemAndBlockRegister.japanese_cedar_planks.get(),"japanese_cedar_planks");
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(Item.byBlock(ItemAndBlockRegister.japanese_cedar_planks.get()));
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(Item.byBlock(ItemAndBlockRegister.smooth_japanese_cedar_planks.get()));
            SlabBlockJsonMaker.INSTANCE.registerSlabBlockModel(ItemAndBlockRegister.japanese_cedar_slab.get(),"half_slab_japanese_cedar",ItemAndBlockRegister.japanese_cedar_planks.get(),"upper_slab_japanese_cedar","japanese_cedar_planks");
            SlabBlockJsonMaker.INSTANCE.registerSlabBlockModel(ItemAndBlockRegister.smooth_japanese_cedar_slab.get(),"half_slab_smooth_japanese_cedar",ItemAndBlockRegister.smooth_japanese_cedar_planks.get(),"upper_slab_smooth_japanese_cedar","planks_smooth_japanese_cedar");
            StairBlockJsonMaker.INSTANCE.registerStairsBlockModel("japanese_cedar","japanese_cedar_planks");
            StairBlockJsonMaker.INSTANCE.registerStairsBlockModel("smooth_japanese_cedar","planks_smooth_japanese_cedar");
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(Item.byBlock(ItemAndBlockRegister.japanese_cedar_log.get()));
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(Item.byBlock(ItemAndBlockRegister.japanese_cedar_wood.get()));
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(Item.byBlock(ItemAndBlockRegister.stripped_japanese_cedar_log.get()));
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(Item.byBlock(ItemAndBlockRegister.stripped_japanese_cedar_wood.get()));
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(Item.byBlock(ItemAndBlockRegister.red_leaves.get()));
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(Item.byBlock(ItemAndBlockRegister.orange_leaves.get()));
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(Item.byBlock(ItemAndBlockRegister.yellow_leaves.get()));
            CubeAllBlockJsonMaker.INSTANCE.registerBlockModel(ItemAndBlockRegister.red_leaves.get(),"red_leaves");
            CubeAllBlockJsonMaker.INSTANCE.registerBlockModel(ItemAndBlockRegister.orange_leaves.get(),"orange_leaves");
            CubeAllBlockJsonMaker.INSTANCE.registerBlockModel(ItemAndBlockRegister.yellow_leaves.get(),"yellow_leaves");
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(Item.byBlock(ItemAndBlockRegister.spruce_board_window.get()));
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(Item.byBlock(ItemAndBlockRegister.birch_board_window.get()));
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(Item.byBlock(ItemAndBlockRegister.jungle_board_window.get()));
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(Item.byBlock(ItemAndBlockRegister.acacia_board_window.get()));
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(Item.byBlock(ItemAndBlockRegister.dark_oak_board_window.get()));
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(Item.byBlock(ItemAndBlockRegister.japanese_apricot_board_window.get()));
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(Item.byBlock(ItemAndBlockRegister.sakura_board_window.get()));
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(Item.byBlock(ItemAndBlockRegister.cypress_board_window.get()));
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(Item.byBlock(ItemAndBlockRegister.japanese_cedar_board_window.get()));
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(Item.byBlock(ItemAndBlockRegister.red_urushi_board_window.get()));
            NormalBlockItemJsonMaker.INSTANCE.registerBlockModel(Item.byBlock(ItemAndBlockRegister.black_urushi_board_window.get()));









        }


    }





}

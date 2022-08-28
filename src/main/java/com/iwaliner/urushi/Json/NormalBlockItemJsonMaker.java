package com.iwaliner.urushi.Json;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import com.iwaliner.urushi.ConfigUrushi;
import com.iwaliner.urushi.ModCore_Urushi;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.model.ModelLoader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Map;

public class NormalBlockItemJsonMaker {
    public static final NormalBlockItemJsonMaker INSTANCE = new NormalBlockItemJsonMaker();
    public static String itemName;

    public void registerBlockModel(Item item) {
        if (item == null)
            return;
            String registoryName = item.getRegistryName().getPath();
            this.BuildItemJsonModel(item, registoryName);
           ModelLoader.addSpecialModel( new ModelResourceLocation(ModCore_Urushi.MOD_ID , registoryName));
    }

    private static void BuildItemJsonModel(Item item, String fileName) {
        // デバッグ環境でなければ実行しない
        if (ConfigUrushi.SecretPassword.get()!=88659)
            return;

        // models/item/フォルダに生成する
        File dir = new File(ModCore_Urushi.assetsDirectory, "models/item/");
        if (dir != null && item != null) {
            ItemModel model = INSTANCE.new ItemModel("urushi:block/"+fileName);

            File f = new File(dir + "/" + fileName + ".json");

            if (f.exists())
                return;

            // ファイルを生成
            if (!f.getParentFile().exists()) {
                f.getParentFile().mkdirs();
            }

            try {
                f.createNewFile();
            } catch (IOException e1) {
                e1.printStackTrace();
            }



            // JSONファイルを生成
            try {
                if (f.canWrite()) {
                    FileOutputStream fos = new FileOutputStream(f.getPath());
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    JsonWriter jsw = new JsonWriter(osw);

                    jsw.setIndent("  ");
                    Gson gson = new Gson();
                    gson.toJson(model, model.getClass(), jsw);

                    osw.close();
                    fos.close();
                    jsw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




        // models/itemフォルダに生成する
        File dir2 = new File(ModCore_Urushi.assetsInBuildDirectory, "models/item/");

        if (dir2 != null && item != null ) {
            ItemModel model = INSTANCE.new ItemModel("urushi:block/"+fileName);

            File f = new File(dir2 + "/" + fileName + ".json");

            if (f.exists())
                return;

            // ファイルを生成
            if (!f.getParentFile().exists()) {
                f.getParentFile().mkdirs();
            }

            try {
                f.createNewFile();
            } catch (IOException e1) {
                e1.printStackTrace();
            }



            // JSONファイルを生成
            try {
                if (f.canWrite()) {
                    FileOutputStream fos = new FileOutputStream(f.getPath());
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    JsonWriter jsw = new JsonWriter(osw);

                    jsw.setIndent("  ");
                    Gson gson = new Gson();
                    gson.toJson(model, model.getClass(), jsw);

                    osw.close();
                    fos.close();
                    jsw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



        // data/urushi/loot_tables/block/フォルダに生成する
        File dir3 = new File(ModCore_Urushi.dataDirectory, "urushi/loot_tables/blocks/");
        if (dir3 != null && item != null) {
            itemName=fileName;
            BlockLootTable model = INSTANCE.new BlockLootTable();

            File f = new File(dir3 + "/" + fileName + ".json");

            if (f.exists())
                return;

            // ファイルを生成
            if (!f.getParentFile().exists()) {
                f.getParentFile().mkdirs();
            }

            try {
                f.createNewFile();
            } catch (IOException e1) {
                e1.printStackTrace();
            }

            // JSONファイルを生成
            try {
                if (f.canWrite()) {
                    FileOutputStream fos = new FileOutputStream(f.getPath());
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    JsonWriter jsw = new JsonWriter(osw);

                    jsw.setIndent("  ");
                    Gson gson = new Gson();
                    gson.toJson(model, model.getClass(), jsw);

                    osw.close();
                    fos.close();
                    jsw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        // data/urushi/loot_tables/block/フォルダに生成する
        File dir4 = new File(ModCore_Urushi.dataInBuildDirectory, "urushi/loot_tables/blocks/");
        if (dir4 != null && item != null) {
            itemName=fileName;
            BlockLootTable model = INSTANCE.new BlockLootTable();

            File f = new File(dir4 + "/" + fileName + ".json");

            if (f.exists())
                return;

            // ファイルを生成
            if (!f.getParentFile().exists()) {
                f.getParentFile().mkdirs();
            }

            try {
                f.createNewFile();
            } catch (IOException e1) {
                e1.printStackTrace();
            }

            // JSONファイルを生成
            try {
                if (f.canWrite()) {
                    FileOutputStream fos = new FileOutputStream(f.getPath());
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    JsonWriter jsw = new JsonWriter(osw);

                    jsw.setIndent("  ");
                    Gson gson = new Gson();
                    gson.toJson(model, model.getClass(), jsw);

                    osw.close();
                    fos.close();
                    jsw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        ModCore_Urushi.logger.info("Output JSON model: " + fileName);
    }

    public class ItemModel {
        final String parent;

        private ItemModel(String p) {
            parent = p;
        }
    }
    public class BlockLootTable {
         String type="minecraft:block";

        List<BlockLootTablePools> pools= Lists.newArrayList(new BlockLootTablePools());


        private class BlockLootTablePools{
            int rolls=1;
            List<BlockLootTableEntries> entries= Lists.newArrayList(new BlockLootTableEntries());
            List<BlockLootTableConditions> conditions= Lists.newArrayList(new BlockLootTableConditions());

            private class BlockLootTableEntries{
                String type="minecraft:item";
                String name="urushi:"+itemName;

            }
            private class BlockLootTableConditions{
                String condition="minecraft:survives_explosion";

            }
        }
    }


}

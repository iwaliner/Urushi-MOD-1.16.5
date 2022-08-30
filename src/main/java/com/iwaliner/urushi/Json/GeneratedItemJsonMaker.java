package com.iwaliner.urushi.Json;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import com.iwaliner.urushi.ConfigUrushi;
import com.iwaliner.urushi.ItemsRegister;
import com.iwaliner.urushi.ModCore_Urushi;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.model.ModelLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;

public class GeneratedItemJsonMaker {
    public static final GeneratedItemJsonMaker INSTANCE = new GeneratedItemJsonMaker();

    /**
     * ItemのJSONモデル生成と登録をまとめて行うメソッド。
     */
    public void registerItemModel(Item item,String tex) {
        if (item == null)
            return;
            String fileName = item.getRegistryName().getPath();
            // JSONの生成
            this.BuildJsonModel(item, fileName,tex);
            // Model登録
           ModelLoader.addSpecialModel( new ModelResourceLocation(ModCore_Urushi.MOD_ID , fileName));

    }

    private static void BuildJsonModel(Item item, String fileName,String textureName) {
        // デバッグ環境でなければ実行しない
        if (ConfigUrushi.SecretPassword.get()!=88659)
            return;

        // models/itemフォルダに生成する
        File dir = new File(ModCore_Urushi.assetsDirectory, "models/item/");

        if (dir != null && item != null ) {
            Map<String, String> map = Maps.newLinkedHashMap();
            map.put("layer0", "urushi:item/"+textureName);
            ItemModel model = INSTANCE.new ItemModel("item/generated", map);
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
            Map<String, String> map = Maps.newLinkedHashMap();
            map.put("layer0", "urushi:item/"+textureName);
            ItemModel model = INSTANCE.new ItemModel("item/generated",map);
            File f = new File(dir2 + "/" + fileName + ".json");
            if (f.exists())
                return;
            // ファイルを生成。
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
        final Map<String, String> textures;

        private ItemModel(String p, Map<String, String> tex) {
            parent = p;
            textures = tex;
        }
    }
}

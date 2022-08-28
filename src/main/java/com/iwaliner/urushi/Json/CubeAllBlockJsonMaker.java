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

public class CubeAllBlockJsonMaker {
    public static final CubeAllBlockJsonMaker INSTANCE = new CubeAllBlockJsonMaker();


    public void registerBlockModel(Block block,String texture) {
        if (block == null)
            return;
            String blockName = block.getRegistryName().getPath();
            this.BuildBlockJsonModel(block, blockName,texture);
           ModelLoader.addSpecialModel( new ModelResourceLocation(ModCore_Urushi.MOD_ID , blockName));
    }

    private static void BuildBlockJsonModel(Block block, String fileName,String textureName) {
        // デバッグ環境でなければ実行しない
        if (ConfigUrushi.SecretPassword.get()!=88659)
            return;

        // models/block/フォルダに生成する
        File dir = new File(ModCore_Urushi.assetsDirectory, "models/block/");
        if (dir != null && block != null) {
            Map<String, String> map = Maps.newLinkedHashMap();
            map.put("all", "urushi:block/"+textureName);
            CubeAllBlockModel model = INSTANCE.new CubeAllBlockModel(map);
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




        // models/block/フォルダに生成する
        File dir2 = new File(ModCore_Urushi.assetsInBuildDirectory, "models/block/");
        if (dir2 != null && block != null) {
            Map<String, String> map = Maps.newLinkedHashMap();
            map.put("all", "urushi:block/"+textureName);
            CubeAllBlockModel model = INSTANCE.new CubeAllBlockModel(map);
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


        // blockstates/フォルダに生成する
        File dir3 = new File(ModCore_Urushi.assetsDirectory, "blockstates/");
        if (dir3 != null && block != null) {
            Map<String, Map> map = Maps.newLinkedHashMap();
            Map<String, String> childMap = Maps.newLinkedHashMap();
            childMap.put("model", "urushi:block/"+fileName);
            map.put("", childMap);
            CubeAllBlockState model = INSTANCE.new CubeAllBlockState(map);

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


        // blockstates/フォルダに生成する
        File dir4 = new File(ModCore_Urushi.assetsInBuildDirectory, "blockstates/");
        if (dir4 != null && block != null) {
            Map<String, Map> map = Maps.newLinkedHashMap();
            Map<String, String> childMap = Maps.newLinkedHashMap();
            childMap.put("model", "urushi:block/"+fileName);
            map.put("", childMap);
            CubeAllBlockState model = INSTANCE.new CubeAllBlockState(map);

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

    public class CubeAllBlockModel {
        final String parent="block/cube_all";
        final Map<String, String> textures;
        private CubeAllBlockModel(Map<String, String> tex) {
            textures=tex;
        }
    }
    public class CubeAllBlockState {
        final Map<String, Map> variants;
        private CubeAllBlockState(Map<String, Map> tex) {
            variants=tex;
        }
    }


}

package com.iwaliner.urushi.World;

import com.google.common.collect.ImmutableSet;
import com.iwaliner.urushi.ItemAndBlockRegister;

import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FancyFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.MegaPineFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.SpruceFoliagePlacer;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidWithNoiseConfig;
import net.minecraft.world.gen.trunkplacer.FancyTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.GiantTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

import java.util.*;

public class TreeGenerator {
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> JapaneseApricot = register("japanese_apricot", Feature.TREE.configured((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(ItemAndBlockRegister.JapaneseApricotLog.get().defaultBlockState()), new SimpleBlockStateProvider(ItemAndBlockRegister.JapaneseApricotLeaves.get().defaultBlockState()), new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 3), new StraightTrunkPlacer(5, 2, 0), new TwoLayerFeature(1, 0, 1))).ignoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> GlowingJapaneseApricot = register("glowing_japanese_apricot", Feature.TREE.configured((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(ItemAndBlockRegister.JapaneseApricotLog.get().defaultBlockState()), new SimpleBlockStateProvider(ItemAndBlockRegister.JapaneseApricotGlowingLeaves.get().defaultBlockState()), new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 3), new StraightTrunkPlacer(5, 2, 0), new TwoLayerFeature(1, 0, 1))).ignoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> Sakura = register("sakura", Feature.TREE.configured((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(ItemAndBlockRegister.SakuraLog.get().defaultBlockState()), new SimpleBlockStateProvider(ItemAndBlockRegister.SakuraLeaves.get().defaultBlockState()), new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 3), new StraightTrunkPlacer(5, 2, 0), new TwoLayerFeature(1, 0, 1))).ignoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> GlowingSakura = register("glowing_sakura", Feature.TREE.configured((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(ItemAndBlockRegister.SakuraLog.get().defaultBlockState()), new SimpleBlockStateProvider(ItemAndBlockRegister.SakuraGlowingLeaves.get().defaultBlockState()), new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 3), new StraightTrunkPlacer(5, 2, 0), new TwoLayerFeature(1, 0, 1))).ignoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BIGSakura = register("big_sakura", Feature.TREE.configured((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(ItemAndBlockRegister.SakuraLog.get().defaultBlockState()), new SimpleBlockStateProvider(ItemAndBlockRegister.SakuraLeaves.get().defaultBlockState()), new FancyFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(4), 4), new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0, OptionalInt.of(4)))).ignoreVines().heightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> GlowingBIGSakura = register("glowing_big_sakura", Feature.TREE.configured((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(ItemAndBlockRegister.SakuraLog.get().defaultBlockState()), new SimpleBlockStateProvider(ItemAndBlockRegister.SakuraGlowingLeaves.get().defaultBlockState()), new FancyFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(4), 4), new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0, OptionalInt.of(4)))).ignoreVines().heightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> Cypress = register("cypress", Feature.TREE.configured((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(ItemAndBlockRegister.CypressLog.get().defaultBlockState()), new SimpleBlockStateProvider(ItemAndBlockRegister.CypressLeaves.get().defaultBlockState()), new SpruceFoliagePlacer(FeatureSpread.of(2, 1), FeatureSpread.of(0, 2), FeatureSpread.of(1, 1)), new StraightTrunkPlacer(5, 2, 1), new TwoLayerFeature(2, 0, 2))).ignoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> MegaCypress = register("mega_cypress", Feature.TREE.configured((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(ItemAndBlockRegister.CypressLog.get().defaultBlockState()), new SimpleBlockStateProvider(ItemAndBlockRegister.CypressLeaves.get().defaultBlockState()), new MegaPineFoliagePlacer(FeatureSpread.fixed(0), FeatureSpread.fixed(0), FeatureSpread.of(13, 4)), new GiantTrunkPlacer(13, 2, 14), new TwoLayerFeature(1, 1, 2))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> Lacquer = register("lacquer", Feature.TREE.configured((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(ItemAndBlockRegister.LacquerLog.get().defaultBlockState()), new SimpleBlockStateProvider(ItemAndBlockRegister.LacquerLeaves.get().defaultBlockState()), new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 3), new StraightTrunkPlacer(5, 2, 0), new TwoLayerFeature(1, 0, 1))).ignoreVines().build()));
    //public static final ConfiguredFeature<?, ?> PATCH_BAMBOO = register("patch_bamboo", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ItemAndBlockRegister.JapaneseTimberBamboo.get().defaultBlockState()), SimpleBlockPlacer.INSTANCE)).tries(64).whitelist(ImmutableSet.of(Blocks.GRASS.defaultBlockState().getBlock())).noProjection().build()).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).chance(32));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> Bamboo = register("bamboo", Feature.TREE.configured((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(ItemAndBlockRegister.JapaneseTimberBamboo.get().defaultBlockState()), new SimpleBlockStateProvider(Blocks.AIR.defaultBlockState()), new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 3), new StraightTrunkPlacer(5, 2, 0), new TwoLayerFeature(1, 0, 1))).ignoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> Red = register("red", Feature.TREE.configured((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.defaultBlockState()), new SimpleBlockStateProvider(ItemAndBlockRegister.red_leaves.get().defaultBlockState()), new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 3), new StraightTrunkPlacer(5, 2, 0), new TwoLayerFeature(1, 0, 1))).ignoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> Orange = register("orange", Feature.TREE.configured((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.defaultBlockState()), new SimpleBlockStateProvider(ItemAndBlockRegister.orange_leaves.get().defaultBlockState()), new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 3), new StraightTrunkPlacer(5, 2, 0), new TwoLayerFeature(1, 0, 1))).ignoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> Yellow = register("yellow", Feature.TREE.configured((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.defaultBlockState()), new SimpleBlockStateProvider(ItemAndBlockRegister.yellow_leaves.get().defaultBlockState()), new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 3), new StraightTrunkPlacer(5, 2, 0), new TwoLayerFeature(1, 0, 1))).ignoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> JapaneseCedar = register("japanese_cedar", Feature.TREE.configured((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(ItemAndBlockRegister.japanese_cedar_log.get().defaultBlockState()), new SimpleBlockStateProvider(ItemAndBlockRegister.japanese_cedar_leaves.get().defaultBlockState()), new SpruceFoliagePlacer(FeatureSpread.of(2, 1), FeatureSpread.of(0, 2), FeatureSpread.of(1, 1)), new StraightTrunkPlacer(5, 2, 1), new TwoLayerFeature(2, 0, 2))).ignoreVines().build()));




    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String p_243968_0_, ConfiguredFeature<FC, ?> p_243968_1_) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, p_243968_0_, p_243968_1_);
    }


}
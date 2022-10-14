package com.iwaliner.urushi.World;

import com.iwaliner.urushi.ItemAndBlockRegister;
import com.iwaliner.urushi.ConfigUrushi;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.feature.template.TagMatchRuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGen {
    public static final RuleTest NATURAL_SAND = new TagMatchRuleTest(Tags.Blocks.SAND);
    public OreGen() {
    }

    public static void addOres(BiomeLoadingEvent event) {
        if (ConfigUrushi.genCopperOre.get()) {
            addOre(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ((Block) ItemAndBlockRegister.CopperOre.get()).defaultBlockState(), 9, 0, 80, 15);
        }
        addOreSand(event, NATURAL_SAND, ((Block) ItemAndBlockRegister.IronsandOre.get()).defaultBlockState(), 4, 0, 120, 30);

    }
    public static void addOre(BiomeLoadingEvent event, RuleTest rule, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
        event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, (ConfiguredFeature)((ConfiguredFeature) Feature.ORE.configured(new OreFeatureConfig(rule, state, veinSize)).decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight))).squared()).count(amount));
    }
    public static void addOreSand(BiomeLoadingEvent event, RuleTest rule, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
        if (event.getCategory() != Biome.Category.DESERT && event.getCategory() != Biome.Category.MESA) {
            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, (ConfiguredFeature) ((ConfiguredFeature) Feature.ORE.configured(new OreFeatureConfig(rule, state, veinSize)).decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight))).squared()).count(amount));
        }
    }

}
package com.iwaliner.urushi.World;

import com.iwaliner.urushi.BlocksRegister;
import com.iwaliner.urushi.ConfigUrushi;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGen {
    public OreGen() {
    }

    public static void addOres(BiomeLoadingEvent event) {
        if (ConfigUrushi.genCopperOre.get()) {
            addOre(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ((Block) BlocksRegister.CopperOre.get()).defaultBlockState(), 9, 0, 80, 15);
        }

    }
    public static void addOre(BiomeLoadingEvent event, RuleTest rule, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
        event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, (ConfiguredFeature)((ConfiguredFeature) Feature.ORE.configured(new OreFeatureConfig(rule, state, veinSize)).decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight))).squared()).count(amount));
    }

}
package com.iwaliner.urushi.World;

import com.iwaliner.urushi.ItemAndBlockRegister;
import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ProbabilityConfig;

import java.util.Random;

public class WorldGenBamboo extends Feature<ProbabilityConfig> {
    public WorldGenBamboo(Codec<ProbabilityConfig> p_i231953_1_) {
        super(p_i231953_1_);
    }

    @Override
    public boolean place(ISeedReader iSeedReader, ChunkGenerator chunkGenerator, Random random, BlockPos pos, ProbabilityConfig probabilityConfig) {

        for(int i1 = 0; i1 <20; ++i1) {
            iSeedReader.setBlock(pos.above(i1), ItemAndBlockRegister.JapaneseTimberBamboo.get().defaultBlockState(), 4);
        }

        return true;
    }
}

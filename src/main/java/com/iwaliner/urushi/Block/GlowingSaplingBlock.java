package com.iwaliner.urushi.Block;

import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.trees.Tree;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Random;

public class GlowingSaplingBlock extends SaplingBlock {
    public GlowingSaplingBlock(Tree p_i48337_1_, Properties p_i48337_2_) {
        super(p_i48337_1_, p_i48337_2_);
    }
    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState state, World world, BlockPos pos, Random rand) {
        double d0 = (double)pos.getX() + 0.1D*rand.nextInt(16);
        double d1 = (double)pos.getY() + 0.1D*rand.nextInt(16);
        double d2 = (double)pos.getZ() + 0.1D*rand.nextInt(16);
        world.addParticle(ParticleTypes.FIREWORK, d0, d1, d2, 0.0D, 0.0D, 0.0D);

    }
}

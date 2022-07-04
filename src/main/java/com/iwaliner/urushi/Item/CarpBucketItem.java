package com.iwaliner.urushi.Item;

import com.iwaliner.urushi.EntityRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.passive.fish.AbstractFishEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class CarpBucketItem extends BucketItem {
    public CarpBucketItem(Fluid p_i49025_1_, Properties p_i49025_2_) {
        super(p_i49025_1_, p_i49025_2_);
    }
    public void checkExtraContent(World p_203792_1_, ItemStack p_203792_2_, BlockPos p_203792_3_) {
        if (p_203792_1_ instanceof ServerWorld) {
            this.spawn((ServerWorld)p_203792_1_, p_203792_2_, p_203792_3_);
        }

    }

    protected void playEmptySound(@Nullable PlayerEntity p_203791_1_, IWorld p_203791_2_, BlockPos p_203791_3_) {
        p_203791_2_.playSound(p_203791_1_, p_203791_3_, SoundEvents.BUCKET_EMPTY_FISH, SoundCategory.NEUTRAL, 1.0F, 1.0F);
    }

    private void spawn(ServerWorld p_205357_1_, ItemStack p_205357_2_, BlockPos p_205357_3_) {
        Entity entity = EntityRegister.CarpEntity.get().spawn(p_205357_1_, p_205357_2_, (PlayerEntity)null, p_205357_3_, SpawnReason.BUCKET, true, false);
        if (entity != null) {
            ((AbstractFishEntity)entity).setFromBucket(true);
        }

    }
}

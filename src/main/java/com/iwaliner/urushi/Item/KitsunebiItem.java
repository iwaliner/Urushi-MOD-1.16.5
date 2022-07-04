package com.iwaliner.urushi.Item;

import com.iwaliner.urushi.BlocksRegister;
import com.iwaliner.urushi.Entity.KitsunebiEntity;
import com.iwaliner.urushi.ItemsRegister;
import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.SnowballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.stats.Stats;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class KitsunebiItem extends Item {
   public KitsunebiItem(Properties p_i48466_1_) {
      super(p_i48466_1_);
   }

   public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
      ItemStack itemstack = player.getItemInHand(hand);
      world.playSound((PlayerEntity)null, player.getX(), player.getY(), player.getZ(), SoundEvents.FIRECHARGE_USE, SoundCategory.NEUTRAL, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
      if (!world.isClientSide) {
         KitsunebiEntity snowballentity = new KitsunebiEntity(world, player);
         snowballentity.setItem(new ItemStack(ItemsRegister.Kitsunebi.get()));
         snowballentity.shootFromRotation(player, player.xRot, player.yRot, 0.0F, 1.5F, 1.0F);
         world.addFreshEntity(snowballentity);
      }

      player.awardStat(Stats.ITEM_USED.get(this));
      if (!player.abilities.instabuild) {
         itemstack.shrink(1);
      }

      return ActionResult.sidedSuccess(itemstack, world.isClientSide());
   }

   @Override
   public void inventoryTick(ItemStack stack, World world, Entity entity, int a, boolean b) {
     if(entity instanceof PlayerEntity){
        int range=15;
        PlayerEntity player= (PlayerEntity) entity;
        BlockPos pos=new BlockPos(Math.floor(entity.getX()),Math.floor(entity.getY()),Math.floor(entity.getZ()));
        if (player.getOffhandItem() == stack || player.getMainHandItem() == stack) {
           for(int i=-range; i<range+1;i++) {
              for(int j=-range; j<range+1;j++) {
                 for(int k=-range; k<range+1;k++) {
                    if( world.getBlockState(pos.offset(i,j,k))== BlocksRegister.Kitsunebi.get().defaultBlockState()){
                       Random rand=new Random();
                       double d0 = (double)pos.getX()+(double)i + 0.1D*rand.nextInt(16);
                       double d1 = (double)pos.getY() +(double)j+ 0.1D*rand.nextInt(16);
                       double d2 = (double)pos.getZ() +(double)k+ 0.1D*rand.nextInt(16);
                       if(rand.nextInt(8)==0) {
                          world.addParticle(ParticleTypes.FLAME, d0, d1, d2, 0.0D, 0.0D, 0.0D);

                       }
                    }
                 }
              }
           }
        }
     }
   }

   @Override
   public ActionResultType useOn(ItemUseContext context) {
      World world = context.getLevel();
      BlockPos blockpos = context.getClickedPos();
      blockpos = blockpos.relative(context.getClickedFace());
      if (AbstractFireBlock.canBePlacedAt(world, blockpos, context.getHorizontalDirection())) {
         world.playSound((PlayerEntity)null, context.getPlayer().getX(), context.getPlayer().getY(), context.getPlayer().getZ(), SoundEvents.FIRECHARGE_USE, SoundCategory.NEUTRAL, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
         world.setBlockAndUpdate(blockpos, BlocksRegister.Kitsunebi.get().defaultBlockState());
         context.getItemInHand().shrink(1);
       return  ActionResultType.SUCCESS;
      }else{
         return  ActionResultType.FAIL;
      }
   }
}
package com.iwaliner.urushi.Entity;

import com.iwaliner.urushi.EntityRegister;
import com.iwaliner.urushi.ItemAndBlockRegister;
import com.iwaliner.urushi.ItemAndBlockRegister;

import net.minecraft.block.BushBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;

import net.minecraft.entity.projectile.ProjectileItemEntity;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.IPacket;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ItemParticleData;
import net.minecraft.particles.ParticleTypes;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.network.NetworkHooks;


import javax.annotation.Nonnull;

public class KitsunebiEntity extends ProjectileItemEntity {


    public KitsunebiEntity(World p_i1774_1_, LivingEntity p_i1774_2_) {
        super(EntityRegister.KitsunebiEntity.get(), p_i1774_2_, p_i1774_1_);
    }

    public KitsunebiEntity(World p_i1775_1_, double p_i1775_2_, double p_i1775_4_, double p_i1775_6_) {
        super(EntityRegister.KitsunebiEntity.get(), p_i1775_2_, p_i1775_4_, p_i1775_6_, p_i1775_1_);
    }

    public KitsunebiEntity(EntityType<? extends KitsunebiEntity> entityEntityType, World world) {
        super(EntityRegister.KitsunebiEntity.get(), world);
    }

    /**これがないと完全無色透明なエンティティになってしまう。このメソッドを書いた後はClientSetup.classでrenderを登録。*/
    @Nonnull
    @Override
    public IPacket<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }


    protected Item getDefaultItem() {
        return ItemAndBlockRegister.KitsunebiItem.get();
    }

    @OnlyIn(Dist.CLIENT)
    private IParticleData getParticle() {
        ItemStack itemstack = this.getItemRaw();
        return (IParticleData)(itemstack.isEmpty() ? ParticleTypes.FLAME : new ItemParticleData(ParticleTypes.ITEM, itemstack));
    }

    @OnlyIn(Dist.CLIENT)
    public void handleEntityEvent(byte p_70103_1_) {
        if (p_70103_1_ == 3) {
            IParticleData iparticledata = this.getParticle();

            for(int i = 0; i < 8; ++i) {
                this.level.addParticle(iparticledata, this.getX(), this.getY(), this.getZ(), 0.0D, 0.0D, 0.0D);
            }
        }

    }

    protected void onHitEntity(EntityRayTraceResult result) {
        if (!this.level.isClientSide) {
            ItemEntity itemEntity = new ItemEntity(this.level, this.getX(), this.getY(),this.getZ(), new ItemStack(ItemAndBlockRegister.Kitsunebi.get()));
           this.level.addFreshEntity(itemEntity);
            this.remove();
        }
    }

    protected void onHit(RayTraceResult result) {
        super.onHit(result);
        if (ItemAndBlockRegister.Kitsunebi.isPresent()) {
            BlockPos offsetPos = new BlockPos(Math.floor(this.getX()), Math.floor(this.getY()), Math.floor(this.getZ()));
            //  BlockPos offsetPos = new BlockPos(Math.floor(result.getLocation().x), Math.floor(result.getLocation().y), Math.floor(result.getLocation().z));
            if(this.level.getBlockState(offsetPos).isAir()||this.level.getBlockState(offsetPos).getBlock() instanceof BushBlock) {
                this.level.setBlockAndUpdate(offsetPos, ItemAndBlockRegister.Kitsunebi.get().defaultBlockState());

            }else{
               if (!this.level.isClientSide) {
                    ItemEntity itemEntity = new ItemEntity(this.level, offsetPos.getX()+0.5D,offsetPos.getX()+0.5D, offsetPos.getX()+0.5D, new ItemStack(ItemAndBlockRegister.Kitsunebi.get()));
                  this.level.addFreshEntity(itemEntity);

                }
            }
            this.remove();
        }
    }
}

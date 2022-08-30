package com.iwaliner.urushi.Entity.FoodEntity;

import net.minecraft.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;


public abstract class FoodEntity extends Entity {
    private Item itemContains;
    public FoodEntity(Item item, EntityType<?> p_i48580_1_, World p_i48580_2_) {
        super(p_i48580_1_, p_i48580_2_);
        itemContains=item;
    }
    /**プレイヤーがエンティティを殴れるかどうか。ItemEntityならfalseだし、ShulkerBulletならtrue。*/
    public boolean isPickable() {
        return true;
    }

    /**目線の高さ。0.0Fだと当たり判定の底面部分。*/
    @Override
    protected float getEyeHeight(Pose p_213316_1_, EntitySize p_213316_2_) {
        return 0.0F;
    }

    /**殴られたときの処理*/
    public boolean hurt(DamageSource p_70097_1_, float p_70097_2_) {
        if (this.isInvulnerableTo(p_70097_1_)) {
            return false;
        } else {
            if (!this.removed && !this.level.isClientSide) {
                this.remove();  //このエンティティを抹消
                this.markHurt();
                this.playSound(SoundEvents.ITEM_PICKUP, 1.0F, 1.0F);
                ItemStack itemStack=new ItemStack(itemContains);
                this.spawnAtLocation(itemStack);  //ItemEntityをスポーン
            }

            return true;
        }
    }
    /**右クリック時の処理*/
    @Override
    public ActionResultType interact(PlayerEntity player, Hand hand) {
        this.remove();  //このエンティティを抹消
        this.markHurt();
        this.playSound(SoundEvents.ITEM_PICKUP, 1.0F, 1.0F);
        ItemStack itemStack=new ItemStack(itemContains);
        this.spawnAtLocation(itemStack);
        return  ActionResultType.SUCCESS;
    }
    @Override
    public void tick() {
        this.setDeltaMovement(this.getDeltaMovement().add(0.0D, -0.04D, 0.0D));
        this.move(MoverType.SELF, this.getDeltaMovement()); //移動(落下)

    }
    @Override
    protected void defineSynchedData() {

    }

    @Override
    protected void readAdditionalSaveData(CompoundNBT p_70037_1_) {

    }

    @Override
    protected void addAdditionalSaveData(CompoundNBT p_213281_1_) {

    }


    /**このメソッドがないとエンティティの見た目どころかF3+B時の当たり判定すら反映されない*/
    @Override
    public IPacket<?> getAddEntityPacket() {
       return NetworkHooks.getEntitySpawningPacket(this);
    }

}

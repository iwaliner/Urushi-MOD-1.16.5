package com.iwaliner.urushi.Entity;

import com.iwaliner.urushi.EntityRegister;
import com.iwaliner.urushi.ItemsRegister;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import java.util.List;

public class CushionEntity extends Entity {
    private static final DataParameter<Integer> DATA_ID_TYPE = EntityDataManager.defineId(CushionEntity.class, DataSerializers.INT);
    public CushionEntity(EntityType<?> p_i48580_1_, World p_i48580_2_) {
        super(EntityRegister.CushionEntity.get(), p_i48580_2_);
    }
    public CushionEntity(World p_i1705_1_, double p_i1705_2_, double p_i1705_4_, double p_i1705_6_) {
        this(EntityRegister.CushionEntity.get(), p_i1705_1_);
        this.setPos(p_i1705_2_, p_i1705_4_, p_i1705_6_);
        this.setDeltaMovement(Vector3d.ZERO);
        this.xo = p_i1705_2_;
        this.yo = p_i1705_4_;
        this.zo = p_i1705_6_;
    }
    @Override
    protected void defineSynchedData() {
        this.entityData.define(DATA_ID_TYPE, DyeColor.WHITE.ordinal());
    }
    public DyeColor getCushionType() {
        return DyeColor.byId(this.entityData.get(DATA_ID_TYPE));
    }
    public void setType(DyeColor p_184458_1_) {
        this.entityData.set(DATA_ID_TYPE, p_184458_1_.ordinal());
    }
    @Override
    protected void readAdditionalSaveData(CompoundNBT p_70037_1_) {
            this.setType(DyeColor.byId(p_70037_1_.getInt("Type")));
    }

    @Override
    protected void addAdditionalSaveData(CompoundNBT p_213281_1_) {
        p_213281_1_.putInt("Type", this.getCushionType().ordinal());
    }
    /**プレイヤーがエンティティを殴れるかどうか。ItemEntityならfalseだし、ShulkerBulletならtrue。*/
    public boolean isPickable() {
        return true;
    }

    public boolean canBeCollidedWith() {
        return true;
    }

    /**目線の高さ。0.0Fだと当たり判定の底面部分。*/
    @Override
    protected float getEyeHeight(Pose p_213316_1_, EntitySize p_213316_2_) {
        return 0.0F;
    }

    public double getPassengersRidingOffset() {
        return -0.05D;
    }
    public Item getDropItem() {
        switch(this.getCushionType()) {
            case WHITE:
            default:
                return ItemsRegister.white_cushion.get();
            case ORANGE:
                return ItemsRegister.orange_cushion.get();
            case MAGENTA:
                return ItemsRegister.magenta_cushion.get();
            case LIGHT_BLUE:
                return ItemsRegister.light_blue_cushion.get();
            case YELLOW:
                return ItemsRegister.yellow_cushion.get();
            case LIME:
                return ItemsRegister.lime_cushion.get();
            case PINK:
                return ItemsRegister.pink_cushion.get();
            case GRAY:
                return ItemsRegister.gray_cushion.get();
            case LIGHT_GRAY:
                return ItemsRegister.light_gray_cushion.get();
            case CYAN:
                return ItemsRegister.cyan_cushion.get();
            case PURPLE:
                return ItemsRegister.purple_cushion.get();
            case BLUE:
                return ItemsRegister.blue_cushion.get();
            case BROWN:
                return ItemsRegister.brown_cushion.get();
            case GREEN:
                return ItemsRegister.green_cushion.get();
            case RED:
                return ItemsRegister.red_cushion.get();
            case BLACK:
                return ItemsRegister.black_cushion.get();
        }
    }

    /**殴られたときの処理*/
    public boolean hurt(DamageSource p_70097_1_, float p_70097_2_) {
        if (this.isInvulnerableTo(p_70097_1_)) {
            return false;
        } else {
            if (!this.removed && !this.level.isClientSide) {
                this.remove();  //このエンティティを抹消
                this.markHurt();
                this.playSound(SoundEvents.WOOL_BREAK, 1.0F, 1.0F);
                ItemStack itemStack=new ItemStack(getDropItem());
                this.spawnAtLocation(itemStack);  //ItemEntityをスポーン
            }

            return true;
        }
    }

    @Override
    public boolean canRiderInteract() {
        return true;
    }

    /**右クリック時の処理*/
    @Override
    public ActionResultType interact(PlayerEntity player, Hand hand) {
        if (!this.level.isClientSide()&&this.getPassengers().isEmpty())
        {
            player.startRiding(this);
            level.playSound((PlayerEntity) null, this.blockPosition(), SoundEvents.WOOL_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
            return ActionResultType.SUCCESS;
        }
        return ActionResultType.FAIL;
    }
    @Override
    public void tick() {
        this.setDeltaMovement(this.getDeltaMovement().add(0.0D, -0.04D, 0.0D));
        this.move(MoverType.SELF, this.getDeltaMovement()); //移動(落下)



        AxisAlignedBB axisalignedbb =this.getBoundingBox() .inflate(0.1D, 0.1D, 0.1D);
        List<LivingEntity> list =level.getEntitiesOfClass(LivingEntity.class, axisalignedbb);
        if(!level.isClientSide()&&this.getPassengers().isEmpty()){
        if(!list.isEmpty()) {
            for (LivingEntity entity : list) {
                if (entity instanceof PlayerEntity) {
                } else {
                    entity.startRiding(this);
                    level.playSound((PlayerEntity) null, this.blockPosition(), SoundEvents.WOOL_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
               break;
                }
            }
        }
        }

    }

    /**このメソッドがないとエンティティの見た目どころかF3+B時の当たり判定すら反映されない*/
    @Override
    public IPacket<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

}

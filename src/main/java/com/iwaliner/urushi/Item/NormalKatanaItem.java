package com.iwaliner.urushi.Item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.util.List;

public class NormalKatanaItem extends TieredItem {
    private final float attackDamage;

    private final Multimap<Attribute, AttributeModifier> defaultModifiers;
    public NormalKatanaItem(IItemTier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Properties p_i48460_4_) {
        super(p_i48460_1_,  p_i48460_4_);
        this.attackDamage = (float)p_i48460_2_ + p_i48460_1_.getAttackDamageBonus();
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", (double)this.attackDamage, AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Weapon modifier", (double)p_i48460_3_, AttributeModifier.Operation.ADDITION));
        this.defaultModifiers = builder.build();
    }

    public float getDamage() {
        return this.attackDamage;
    }

    public boolean canAttackBlock(BlockState p_195938_1_, World p_195938_2_, BlockPos p_195938_3_, PlayerEntity p_195938_4_) {
        return !p_195938_4_.isCreative();
    }

    public float getDestroySpeed(ItemStack p_150893_1_, BlockState p_150893_2_) {
        if (p_150893_2_.is(Blocks.COBWEB)) {
            return 15.0F;
        } else {
            Material material = p_150893_2_.getMaterial();
            return material != Material.PLANT && material != Material.REPLACEABLE_PLANT && material != Material.CORAL && !p_150893_2_.is(BlockTags.LEAVES) && material != Material.VEGETABLE ? 1.0F : 1.5F;
        }
    }

    public boolean hurtEnemy(ItemStack p_77644_1_, LivingEntity p_77644_2_, LivingEntity p_77644_3_) {
        p_77644_1_.hurtAndBreak(1, p_77644_3_, (p_220045_0_) -> {
            p_220045_0_.broadcastBreakEvent(EquipmentSlotType.MAINHAND);
        });
        return true;
    }

    public boolean mineBlock(ItemStack p_179218_1_, World p_179218_2_, BlockState p_179218_3_, BlockPos p_179218_4_, LivingEntity p_179218_5_) {
        if (p_179218_3_.getDestroySpeed(p_179218_2_, p_179218_4_) != 0.0F) {
            p_179218_1_.hurtAndBreak(2, p_179218_5_, (p_220044_0_) -> {
                p_220044_0_.broadcastBreakEvent(EquipmentSlotType.MAINHAND);
            });
        }

        return true;
    }

    public boolean isCorrectToolForDrops(BlockState p_150897_1_) {
        return p_150897_1_.is(Blocks.COBWEB);
    }

    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlotType p_111205_1_) {
        return p_111205_1_ == EquipmentSlotType.MAINHAND ? this.defaultModifiers : super.getDefaultAttributeModifiers(p_111205_1_);
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {

        boolean flag=player.isOnGround();
        float a=flag?2F:1F;
        float f = -MathHelper.sin(player.yRot * ((float)Math.PI / 180F)) * MathHelper.cos(player.xRot * ((float)Math.PI / 180F));
        float f1 = -MathHelper.sin((player.xRot + 0f) * ((float)Math.PI / 180F));
        float f2 = MathHelper.cos(player.yRot * ((float)Math.PI / 180F)) * MathHelper.cos(player.xRot * ((float)Math.PI / 180F));
        Vector3d vector3d = (new Vector3d((double)f*a, (double)f1*a*0.4D, (double)f2*a));
        player.getCooldowns().addCooldown(this, 10);
        player.startUsingItem(hand);
        player.setDeltaMovement(vector3d);
        player.getItemInHand(hand).hurtAndBreak(1, player, (x) -> {
            x.broadcastBreakEvent(hand);
        });
        AxisAlignedBB axisalignedbb =player.getBoundingBox() .inflate(4.0D, 4.0D, 4.0D);
        List<LivingEntity> list = player.level.getEntitiesOfClass(LivingEntity.class, axisalignedbb);
        if(!list.isEmpty()) {
            for (LivingEntity entity : list) {
                if(entity instanceof PlayerEntity) {
                }else{
                    entity.hurt(DamageSource.GENERIC, getDamage());
                    player.level.playSound((PlayerEntity) null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.PLAYER_ATTACK_KNOCKBACK, SoundCategory.PLAYERS, 1.5F, 1F);
                }
            }
        }
        return ActionResult.sidedSuccess(player.getItemInHand(hand), world.isClientSide());
    }

    @Override
    public ActionResultType interactLivingEntity(ItemStack itemStack, PlayerEntity player, LivingEntity living, Hand hand) {
        living.hurt(DamageSource.GENERIC,getDamage());
        this.use(player.level,player,hand);
        player.level.playSound((PlayerEntity) null, living.getX(), living.getY(), living.getZ(), SoundEvents.PLAYER_ATTACK_KNOCKBACK, SoundCategory.PLAYERS, 1.5F, 1F);
        return ActionResultType.sidedSuccess(player.level.isClientSide);
    }
    public boolean isValidRepairItem(ItemStack p_82789_1_, ItemStack p_82789_2_) {
        return p_82789_2_.getItem() == Item.byBlock(Blocks.STONECUTTER);
    }
}

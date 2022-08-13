package com.iwaliner.urushi.Item;

import com.iwaliner.urushi.Block.AbstractFramedBlock;
import com.iwaliner.urushi.Block.FramedPaneBlock;
import com.iwaliner.urushi.Block.IronIngotBlock;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class HammerItem extends Item {
    public HammerItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }


    public ActionResultType useOn(ItemUseContext context) {
        PlayerEntity playerentity = context.getPlayer();
        ItemStack itemstack = context.getItemInHand();

        playerentity.getCooldowns().addCooldown(this, 15);
        playerentity.startUsingItem(context.getHand());
        if(context.getLevel().getBlockState(context.getClickedPos()).getBlock() instanceof IronIngotBlock){
            IronIngotBlock ironIngotBlock= (IronIngotBlock) context.getLevel().getBlockState(context.getClickedPos()).getBlock();
            if(ironIngotBlock.getPostBlock()!=null){
                Random random=new Random();
                int i=random.nextInt(16);
                double d0 = (double) context.getClickedPos().getX() +random.nextInt(8)*0.1D+0.2D;
                double d1 = (double) context.getClickedPos().getY() +random.nextInt(5)*0.1D+0.2D;
                double d2 = (double) context.getClickedPos().getZ() +random.nextInt(8)*0.1D+0.2D;
                if (i == 0) {
                    context.getLevel().setBlockAndUpdate(context.getClickedPos(), ironIngotBlock.getPostBlock().defaultBlockState().setValue(IronIngotBlock.FACING, context.getLevel().getBlockState(context.getClickedPos()).getValue(IronIngotBlock.FACING)));
                    context.getLevel().addParticle(ParticleTypes.FLAME,  d0,d1, d2, 0.0D, 0D, 0.0D);
                    context.getLevel().playSound((PlayerEntity) null, context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), SoundEvents.ANVIL_USE, SoundCategory.BLOCKS, 0.3F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
                    itemstack.hurtAndBreak(1, playerentity, (x) -> {
                        x.broadcastBreakEvent(context.getHand());
                    });
                    return ActionResultType.SUCCESS;
                }else{
                    context.getLevel().addParticle(ParticleTypes.FLAME,  d0,d1, d2, 0.0D, 0D, 0.0D);
                    context.getLevel().playSound((PlayerEntity) null, context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), SoundEvents.ANVIL_PLACE, SoundCategory.BLOCKS, 0.3F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
                    itemstack.hurtAndBreak(1, playerentity, (x) -> {
                        x.broadcastBreakEvent(context.getHand());
                    });
                    return ActionResultType.SUCCESS;
                }
            }

        }else if(context.getLevel().getBlockState(context.getClickedPos()).getBlock() instanceof FramedPaneBlock||context.getLevel().getBlockState(context.getClickedPos()).getBlock() instanceof AbstractFramedBlock){
            BlockState state=context.getLevel().getBlockState(context.getClickedPos());
            context.getLevel().setBlockAndUpdate(context.getClickedPos(), state.setValue(AbstractFramedBlock.VARIANT, !state.getValue(AbstractFramedBlock.VARIANT)));
            itemstack.hurtAndBreak(1, playerentity, (x) -> {
                x.broadcastBreakEvent(context.getHand());
            });
            context.getLevel().playSound((PlayerEntity) null, context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), SoundEvents.STONE_PLACE, SoundCategory.BLOCKS, 1F, 1F);
            playerentity.getCooldowns().removeCooldown(this);
            return ActionResultType.SUCCESS;
        }
        return ActionResultType.FAIL;
    }



}

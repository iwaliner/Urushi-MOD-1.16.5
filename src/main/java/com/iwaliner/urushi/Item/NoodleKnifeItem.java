package com.iwaliner.urushi.Item;

import com.iwaliner.urushi.Block.*;
import com.iwaliner.urushi.BlocksRegister;
import com.iwaliner.urushi.UrushiUtils;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.io.DataOutput;
import java.util.List;
import java.util.Random;

public class NoodleKnifeItem extends Item {
    public NoodleKnifeItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }


    public ActionResultType useOn(ItemUseContext context) {
        PlayerEntity playerentity = context.getPlayer();
        ItemStack itemstack = context.getItemInHand();
        playerentity.startUsingItem(context.getHand());
        if(context.getLevel().getBlockState(context.getClickedPos()).getBlock() instanceof DoughBlock){
            context.getLevel().setBlock(context.getClickedPos(), BlocksRegister.udon.get().defaultBlockState().setValue(HorizonalRotateBlock.FACING,context.getLevel().getBlockState(context.getClickedPos()).getValue(HorizonalRotateBlock.FACING)),2);
               itemstack.hurtAndBreak(1, playerentity, (x) -> {
                        x.broadcastBreakEvent(context.getHand());
                    });
            context.getLevel().playSound((PlayerEntity) null, context.getClickedPos(), SoundEvents.WOOD_PLACE, SoundCategory.BLOCKS, 1.0F, 1F);

            return ActionResultType.SUCCESS;
                }
        return ActionResultType.FAIL;
    }
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack itemStack, @Nullable World world, List<ITextComponent> list, ITooltipFlag flag) {
        list.add((new TranslationTextComponent("info.urushi.noodleknife" )).withStyle(TextFormatting.GRAY));
    }


}

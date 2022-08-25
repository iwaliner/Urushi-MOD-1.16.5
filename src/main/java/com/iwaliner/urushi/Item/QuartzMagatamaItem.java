package com.iwaliner.urushi.Item;

import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class QuartzMagatamaItem extends Item implements HasReiryokuItem{
    public QuartzMagatamaItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
       if(context.getLevel().getBlockState(context.getClickedPos()).getBlock()== Blocks.BARRIER){
           context.getItemInHand().setDamageValue(context.getItemInHand().getDamageValue()+1000);
           return ActionResultType.SUCCESS;
       }else{
           return ActionResultType.FAIL;
       }
    }

    @Override
    public int getMaxReiryoku() {
        return 8000;
    }

    @Override
    public int getBewitchingTime() {
        return 200;
    }

    @Override
    public int getAltarVariant() {
        return 10;
    }
}

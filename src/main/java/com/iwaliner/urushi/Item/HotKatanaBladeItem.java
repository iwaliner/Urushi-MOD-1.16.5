package com.iwaliner.urushi.Item;

import net.minecraft.block.Block;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;

public class HotKatanaBladeItem extends Item {
    private Item item;
  public HotKatanaBladeItem(Item i, Properties p_i48527_2_) {
        super( p_i48527_2_);
        item=i;
    }
    @Override
    public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
        if(entity.isInWater()){
            entity.setItem(new ItemStack(item,stack.getCount()));
            entity.level.playSound((PlayerEntity) null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.FIRE_EXTINGUISH, SoundCategory.NEUTRAL, 1F, 1F);
            return true;
        }
        return false;
    }
}

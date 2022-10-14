package com.iwaliner.urushi;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class TagUrushi {
    public static final Tags.IOptionalNamedTag<Item> DIRT_FURNACE_IGNITE = ItemTags.createOptional( new ResourceLocation(ModCore_Urushi.MOD_ID,"dirt_furnace_ignite"));
    public static final Tags.IOptionalNamedTag<Item> KITSUNEBI_INGREDIENT = ItemTags.createOptional( new ResourceLocation(ModCore_Urushi.MOD_ID,"kitsunebi_ingredient"));
    public static final Tags.IOptionalNamedTag<Block> NO_FALLING_DAMAGE = BlockTags.createOptional( new ResourceLocation(ModCore_Urushi.MOD_ID,"no_falling_damage"));

}

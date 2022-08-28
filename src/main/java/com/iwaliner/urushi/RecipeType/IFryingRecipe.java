package com.iwaliner.urushi.RecipeType;

import com.iwaliner.urushi.ModCore_Urushi;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public interface IFryingRecipe extends IRecipe<IInventory> {
    ResourceLocation locationType=new ResourceLocation(ModCore_Urushi.MOD_ID,"frying");

    @Override
     default IRecipeType<?> getType(){
        return Registry.RECIPE_TYPE.getOptional(locationType).get();
    }

    @Override
    default boolean canCraftInDimensions(int p_194133_1_, int p_194133_2_){
        return true;
    }

    @Override
    default boolean isSpecial() {
        return true;
    }
}

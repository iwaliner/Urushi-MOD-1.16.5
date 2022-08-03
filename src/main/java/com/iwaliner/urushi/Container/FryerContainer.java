package com.iwaliner.urushi.Container;


import com.iwaliner.urushi.ContainerRegister;
import com.iwaliner.urushi.RecipeType.RecipeTypeRegister;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.crafting.RecipeBookCategory;
import net.minecraft.util.IIntArray;

public class FryerContainer extends AbstractFryerContainer{
    public FryerContainer(int p_i50082_1_, PlayerInventory p_i50082_2_) {
        super(ContainerRegister.FryerContainer.get(), RecipeTypeRegister.FRYING_RECIPE, RecipeBookCategory.SMOKER, p_i50082_1_, p_i50082_2_);
    }

    public FryerContainer(int p_i50083_1_, PlayerInventory p_i50083_2_, IInventory p_i50083_3_, IIntArray p_i50083_4_) {
        super(ContainerRegister.FryerContainer.get(), RecipeTypeRegister.FRYING_RECIPE, RecipeBookCategory.SMOKER, p_i50083_1_, p_i50083_2_, p_i50083_3_, p_i50083_4_);
    }
}

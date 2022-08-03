package com.iwaliner.urushi.TileEntity;

import com.iwaliner.urushi.Container.FryerContainer;
import com.iwaliner.urushi.RecipeType.RecipeTypeRegister;
import com.iwaliner.urushi.TileEntitiesRegister;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.FurnaceContainer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class FryerTileEntity extends AbstractFryerTileEntity{
    public FryerTileEntity() {
        super(TileEntitiesRegister.FryerTile.get(), RecipeTypeRegister.FRYING_RECIPE);
    }

    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("container.fryer");
    }

    protected Container createMenu(int p_213906_1_, PlayerInventory p_213906_2_) {
        return new FryerContainer(p_213906_1_, p_213906_2_, this, this.dataAccess);
    }
}

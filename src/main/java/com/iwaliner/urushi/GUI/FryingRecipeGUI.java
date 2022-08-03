package com.iwaliner.urushi.GUI;

import com.iwaliner.urushi.TileEntity.AbstractFryerTileEntity;
import net.minecraft.client.gui.recipebook.AbstractRecipeBookGui;
import net.minecraft.item.Item;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Set;

@OnlyIn(Dist.CLIENT)
public class FryingRecipeGUI extends AbstractRecipeBookGui {
    private static final ITextComponent FILTER_NAME = new TranslationTextComponent("gui.recipebook.toggleRecipes.fryable");

    public FryingRecipeGUI() {
    }

    protected ITextComponent getRecipeFilterName() {
        return FILTER_NAME;
    }

    protected Set<Item> getFuelItems() {
        return AbstractFryerTileEntity.getFuel().keySet();
    }
}

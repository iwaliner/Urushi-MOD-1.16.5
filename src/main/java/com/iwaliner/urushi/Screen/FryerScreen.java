package com.iwaliner.urushi.Screen;

import com.iwaliner.urushi.Container.FryerContainer;
import com.iwaliner.urushi.GUI.FryingRecipeGUI;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FryerScreen extends AbstractFryerScreen<FryerContainer> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("urushi:textures/gui/fryer.png");

    public FryerScreen(FryerContainer p_i51089_1_, PlayerInventory p_i51089_2_, ITextComponent p_i51089_3_) {
        super(p_i51089_1_, new FryingRecipeGUI(), p_i51089_2_, p_i51089_3_, TEXTURE);
    }
}
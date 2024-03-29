package com.iwaliner.urushi.Screen;


import com.iwaliner.urushi.Container.DoubledWoodenCabinetryContainer;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.IHasContainer;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ChestContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class DoubledWoodenCabinetryScreen extends ContainerScreen<DoubledWoodenCabinetryContainer> implements IHasContainer<DoubledWoodenCabinetryContainer> {
    private static final ResourceLocation CONTAINER_BACKGROUND = new ResourceLocation("urushi:textures/gui/doubled_wooden_cabinetry.png");
    private final int containerRows;

    public DoubledWoodenCabinetryScreen(DoubledWoodenCabinetryContainer p_i51095_1_, PlayerInventory p_i51095_2_, ITextComponent p_i51095_3_) {
        super(p_i51095_1_, p_i51095_2_, p_i51095_3_);
        this.passEvents = false;
        this.imageWidth+=4*18;
        this.imageHeight+=2*18;
        int i = 222;
        int j = 114;
        this.containerRows = p_i51095_1_.getRowCount();
        this.imageHeight = 114 + this.containerRows * 18;
        this.inventoryLabelY = this.imageHeight - 94;
    }

    public void render(MatrixStack p_230430_1_, int p_230430_2_, int p_230430_3_, float p_230430_4_) {
        this.renderBackground(p_230430_1_);
        super.render(p_230430_1_, p_230430_2_, p_230430_3_, p_230430_4_);
        this.renderTooltip(p_230430_1_, p_230430_2_, p_230430_3_);
    }

    protected void renderBg(MatrixStack p_230450_1_, float p_230450_2_, int p_230450_3_, int p_230450_4_) {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bind(CONTAINER_BACKGROUND);
        int i = (this.width - this.imageWidth) / 2;
        int j = (this.height - this.imageHeight) / 2;
        this.blit(p_230450_1_, i, j, 0, 0, this.imageWidth, this.containerRows * 18 + 17);
        this.blit(p_230450_1_, i, j + this.containerRows * 18 + 17-(2*18), 0, 126-1, this.imageWidth, 96+(2*18)-2);
    }
}

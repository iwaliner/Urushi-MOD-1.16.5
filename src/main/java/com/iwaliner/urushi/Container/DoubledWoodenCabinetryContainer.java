package com.iwaliner.urushi.Container;

import com.iwaliner.urushi.ContainerRegister;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class DoubledWoodenCabinetryContainer extends Container {
    private final IInventory container;
    private final int containerRows=8;
    private int wide=13;

    public static DoubledWoodenCabinetryContainer twRows(int p_216984_0_, PlayerInventory p_216984_1_, IInventory p_216984_2_) {
        return new DoubledWoodenCabinetryContainer(ContainerRegister.DoubledWoodenCabinetryContainer.get(), p_216984_0_, p_216984_1_,  p_216984_2_, 8);
    }
    public DoubledWoodenCabinetryContainer(ContainerType<?> p_i50092_1_, int p_i50092_2_, PlayerInventory p_i50092_3_, IInventory p_i50092_4_, int p_i50092_5_) {
        super(p_i50092_1_, p_i50092_2_);
        checkContainerSize(p_i50092_4_, p_i50092_5_ * wide);
        this.container = p_i50092_4_;
       // this.containerRows = p_i50092_5_;
        p_i50092_4_.startOpen(p_i50092_3_.player);
        int i = (this.containerRows - 4) * 18;

        for(int j = 0; j < this.containerRows; ++j) {
            for(int k = 0; k < wide; ++k) {
                this.addSlot(new Slot(p_i50092_4_, k + j * wide, 8 + (k-0) * 18, 18 + j * 18));
            }
        }
        this.addSlot(new Slot(p_i50092_4_, 104, 8 + (12 * 18), 18 + 126+18));
        this.addSlot(new Slot(p_i50092_4_, 105, 8 + (12 * 18), 18 + 126+18*2));
        this.addSlot(new Slot(p_i50092_4_, 106, 8 + (12 * 18), 18 + 126+18*3));
        this.addSlot(new Slot(p_i50092_4_, 107, 8 + (12 * 18), 18 + 126+18*4));
        for(int l = 0; l < 3; ++l) {
            for(int j1 = 0; j1 < 9; ++j1) {
                this.addSlot(new Slot(p_i50092_3_, j1 + l * 9 + 9, 8 + j1 * 18+2*18, 103 + l * 18 + i+1));
            }
        }

        for(int i1 = 0; i1 < 9; ++i1) {
            this.addSlot(new Slot(p_i50092_3_, i1, 8 + i1 * 18+2*18, 161 + i+1));
        }

    }

    public boolean stillValid(PlayerEntity p_75145_1_) {
        return this.container.stillValid(p_75145_1_);
    }

    public ItemStack quickMoveStack(PlayerEntity p_82846_1_, int p_82846_2_) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(p_82846_2_);
        if (slot != null && slot.hasItem()) {
            ItemStack itemstack1 = slot.getItem();
            itemstack = itemstack1.copy();
            if (p_82846_2_ < this.containerRows * wide) {
                if (!this.moveItemStackTo(itemstack1, this.containerRows *wide+4, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.moveItemStackTo(itemstack1, 0, this.containerRows * wide+4, false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }

        return itemstack;
    }

    public void removed(PlayerEntity p_75134_1_) {
        super.removed(p_75134_1_);
        this.container.stopOpen(p_75134_1_);
    }

    public IInventory getContainer() {
        return this.container;
    }

    @OnlyIn(Dist.CLIENT)
    public int getRowCount() {
        return this.containerRows;
    }
}

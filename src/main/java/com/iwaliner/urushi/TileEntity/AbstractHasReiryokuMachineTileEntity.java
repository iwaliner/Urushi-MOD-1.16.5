package com.iwaliner.urushi.TileEntity;

import net.minecraft.block.BlockState;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.tileentity.TileEntityType;

public abstract class AbstractHasReiryokuMachineTileEntity extends LockableLootTileEntity implements ITickableTileEntity,HasReiryoku,ImportableReiryoku, ISidedInventory {
    public int reiryokuStored;
    public int processingTime;
    public AbstractHasReiryokuMachineTileEntity(TileEntityType<?> p_i48289_1_) {
        super(p_i48289_1_);
    }

    public CompoundNBT save(CompoundNBT compound) {
        super.save(compound);
        compound.putInt("ReiryokuStored", this.reiryokuStored);
        compound.putInt("ProcessingTime", processingTime);
        return compound;
    }

    public void load(BlockState state, CompoundNBT compound) {
        super.load(state, compound);
        this.reiryokuStored = compound.getInt("ReiryokuStored");
        this.processingTime = compound.getInt("ProcessingTime");
    }

    @Override
    public int getStoredReiryoku() {
        return reiryokuStored;
    }
    @Override
    public void changeStoredReiryoku(int i) {
        if(i>=0) {
            if (getMaxReiryoku() >= reiryokuStored + i) {
                reiryokuStored += i;
            }
        }else {
            if(reiryokuStored-i>=0){
                reiryokuStored-=(-i);
            }
        }
    }

    @Override
    public void setStoredReiryokuEmpty() {
        reiryokuStored=0;
    }
}

package com.iwaliner.urushi.TileEntity;

import com.iwaliner.urushi.Block.ReiryokuPipeBlock;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class AbstractHasRiryokuTileEntity extends TileEntity implements HasReiryoku, ITickableTileEntity {
    public int reiryokuStored;
    //public int maxReiryoku=2000000000;

    public AbstractHasRiryokuTileEntity(TileEntityType<?> p_i48289_1_) {
        super(p_i48289_1_);
    }

    public CompoundNBT save(CompoundNBT compound) {
        super.save(compound);
        compound.putInt("ReiryokuStored", this.reiryokuStored);
       return compound;
    }

    public void load(BlockState state, CompoundNBT compound) {
        super.load(state, compound);
        this.reiryokuStored = compound.getInt("ReiryokuStored");
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

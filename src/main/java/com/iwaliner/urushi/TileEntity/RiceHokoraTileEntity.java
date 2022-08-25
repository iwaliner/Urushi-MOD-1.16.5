package com.iwaliner.urushi.TileEntity;

import com.iwaliner.urushi.Block.AbstractHasReiryokuBlock;
import com.iwaliner.urushi.Block.ReiryokuPipeBlock;
import com.iwaliner.urushi.BlocksRegister;
import com.iwaliner.urushi.TileEntitiesRegister;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;

public class RiceHokoraTileEntity extends AbstractHasRiryokuTileEntity implements ITickableTileEntity,HasReiryoku,ExportableReiryoku {
    public int coolTimeA;
    public int coolTimeB;
    public int coolTimeC;
    public int coolTimeD;
    public int coolTimeE;
    public int coolTimeF;
    public int coolTimeG;
    public int coolTimeH;

    private int debugCoolTimeAmount=100;
    @Override
    public int getMaxReiryoku() {
        return 1000;
    }
    public RiceHokoraTileEntity() {
        super(TileEntitiesRegister.RiceHokoraTile.get());
    }

    public CompoundNBT save(CompoundNBT compound) {
        super.save(compound);
        compound.putInt("CoolTimeA", this.coolTimeA);
        compound.putInt("CoolTimeB", this.coolTimeB);
        compound.putInt("CoolTimeC", this.coolTimeC);
        compound.putInt("CoolTimeD", this.coolTimeD);
        compound.putInt("CoolTimeE", this.coolTimeE);
        compound.putInt("CoolTimeF", this.coolTimeF);
        compound.putInt("CoolTimeG", this.coolTimeG);
        compound.putInt("CoolTimeH", this.coolTimeH);
        return compound;
    }

    public void load(BlockState state, CompoundNBT compound) {
        super.load(state, compound);
        this.coolTimeA = compound.getInt("CoolTimeA");
        this.coolTimeB = compound.getInt("CoolTimeB");
        this.coolTimeC = compound.getInt("CoolTimeC");
        this.coolTimeD = compound.getInt("CoolTimeD");
        this.coolTimeE = compound.getInt("CoolTimeE");
        this.coolTimeF = compound.getInt("CoolTimeF");
        this.coolTimeG = compound.getInt("CoolTimeG");
        this.coolTimeH = compound.getInt("CoolTimeH");
    }

    @Override
    public void tick() {
        BlockPos pos=this.worldPosition;
        BlockState state=level.getBlockState(worldPosition);
        int amountPer1=300;
        if(reiryokuStored<=getMaxReiryoku()-amountPer1) {
            if (level.getBlockState(pos.offset(1, 0, 0)).getBlock() == BlocksRegister.Tawara.get() && coolTimeA < debugCoolTimeAmount) {
                coolTimeA++;
            } else if (level.getBlockState(pos.offset(1, 0, 0)).getBlock() == BlocksRegister.Tawara.get()) {
                coolTimeA = 0;
                reiryokuStored += amountPer1;
                level.playSound((PlayerEntity) null, pos, SoundEvents.GRASS_BREAK, SoundCategory.BLOCKS, 1.0F, 1F);
                if (!level.isClientSide()) level.setBlockAndUpdate(pos.offset(1, 0, 0), Blocks.AIR.defaultBlockState());
            }

            if (level.getBlockState(pos.offset(-1, 0, 0)).getBlock() == BlocksRegister.Tawara.get() && coolTimeB < debugCoolTimeAmount) {
                coolTimeB++;
            } else if (level.getBlockState(pos.offset(-1, 0, 0)).getBlock() == BlocksRegister.Tawara.get()) {
                coolTimeB = 0;
                reiryokuStored += amountPer1;
                level.playSound((PlayerEntity) null, pos, SoundEvents.GRASS_BREAK, SoundCategory.BLOCKS, 1.0F, 1F);
                if (!level.isClientSide())
                    level.setBlockAndUpdate(pos.offset(-1, 0, 0), Blocks.AIR.defaultBlockState());
            }

            if (level.getBlockState(pos.offset(0, 0, 1)).getBlock() == BlocksRegister.Tawara.get() && coolTimeC < debugCoolTimeAmount) {
                coolTimeC++;
            } else if (level.getBlockState(pos.offset(0, 0, 1)).getBlock() == BlocksRegister.Tawara.get()) {
                coolTimeC = 0;
                reiryokuStored += amountPer1;
                level.playSound((PlayerEntity) null, pos, SoundEvents.GRASS_BREAK, SoundCategory.BLOCKS, 1.0F, 1F);
                if (!level.isClientSide()) level.setBlockAndUpdate(pos.offset(0, 0, 1), Blocks.AIR.defaultBlockState());
            }

            if (level.getBlockState(pos.offset(0, 0, -1)).getBlock() == BlocksRegister.Tawara.get() && coolTimeD < debugCoolTimeAmount) {
                coolTimeD++;
            } else if (level.getBlockState(pos.offset(0, 0, -1)).getBlock() == BlocksRegister.Tawara.get()) {
                coolTimeD = 0;
                reiryokuStored += amountPer1;
                level.playSound((PlayerEntity) null, pos, SoundEvents.GRASS_BREAK, SoundCategory.BLOCKS, 1.0F, 1F);
                if (!level.isClientSide())
                    level.setBlockAndUpdate(pos.offset(0, 0, -1), Blocks.AIR.defaultBlockState());
            }

            if (level.getBlockState(pos.offset(1, 0, 1)).getBlock() == BlocksRegister.Tawara.get() && coolTimeE < debugCoolTimeAmount) {
                coolTimeE++;
            } else if (level.getBlockState(pos.offset(1, 0, 1)).getBlock() == BlocksRegister.Tawara.get()) {
                coolTimeE = 0;
                reiryokuStored += amountPer1;
                level.playSound((PlayerEntity) null, pos, SoundEvents.GRASS_BREAK, SoundCategory.BLOCKS, 1.0F, 1F);
                if (!level.isClientSide()) level.setBlockAndUpdate(pos.offset(1, 0, 1), Blocks.AIR.defaultBlockState());
            }

            if (level.getBlockState(pos.offset(1, 0, -1)).getBlock() == BlocksRegister.Tawara.get() && coolTimeF < debugCoolTimeAmount) {
                coolTimeF++;
            } else if (level.getBlockState(pos.offset(1, 0, -1)).getBlock() == BlocksRegister.Tawara.get()) {
                coolTimeF = 0;
                reiryokuStored += amountPer1;
                level.playSound((PlayerEntity) null, pos, SoundEvents.GRASS_BREAK, SoundCategory.BLOCKS, 1.0F, 1F);
                if (!level.isClientSide())
                    level.setBlockAndUpdate(pos.offset(1, 0, -1), Blocks.AIR.defaultBlockState());
            }

            if (level.getBlockState(pos.offset(-1, 0, 1)).getBlock() == BlocksRegister.Tawara.get() && coolTimeG < debugCoolTimeAmount) {
                coolTimeG++;
            } else if (level.getBlockState(pos.offset(-1, 0, 1)).getBlock() == BlocksRegister.Tawara.get()) {
                coolTimeG = 0;
                reiryokuStored += amountPer1;
                level.playSound((PlayerEntity) null, pos, SoundEvents.GRASS_BREAK, SoundCategory.BLOCKS, 1.0F, 1F);
                if (!level.isClientSide())
                    level.setBlockAndUpdate(pos.offset(-1, 0, 1), Blocks.AIR.defaultBlockState());
            }

            if (level.getBlockState(pos.offset(-1, 0, -1)).getBlock() == BlocksRegister.Tawara.get() && coolTimeH < debugCoolTimeAmount) {
                coolTimeH++;
            } else if (level.getBlockState(pos.offset(-1, 0, -1)).getBlock() == BlocksRegister.Tawara.get()) {
                coolTimeH = 0;
                reiryokuStored += amountPer1;
                level.playSound((PlayerEntity) null, pos, SoundEvents.GRASS_BREAK, SoundCategory.BLOCKS, 1.0F, 1F);
                if (!level.isClientSide())
                    level.setBlockAndUpdate(pos.offset(-1, 0, -1), Blocks.AIR.defaultBlockState());
            }

        }


        if(this.getStoredReiryoku()>0){
            if (!level.isClientSide()) {
                level.setBlock(worldPosition, state.setValue(AbstractHasReiryokuBlock.ZERO, Boolean.valueOf(false)), 2);
            }
        }else{
            if (!level.isClientSide()) {
                level.setBlock(worldPosition, state.setValue(AbstractHasReiryokuBlock.ZERO, Boolean.valueOf(true)), 2);
            }
        }



    }
}

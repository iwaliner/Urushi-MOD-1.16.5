package com.iwaliner.urushi.TileEntity;

import com.iwaliner.urushi.Block.AbstractHasReiryokuBlock;
import com.iwaliner.urushi.Block.ReiryokuPipeBlock;
import com.iwaliner.urushi.BlocksRegister;
import com.iwaliner.urushi.TileEntitiesRegister;
import com.iwaliner.urushi.UrushiUtils;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

public class ReiryokuTankTier1TileEntity extends AbstractHasRiryokuTileEntity implements ITickableTileEntity,HasReiryoku,ExportableReiryoku,ImportableReiryoku {

    public ReiryokuTankTier1TileEntity() {
        super(TileEntitiesRegister.ReiryokuTankTier1.get());
    }
    @Override
    public int getMaxReiryoku() {
        return 100000;
    }
    @Override
    public void tick() {
        for(int i=0;i<6;i++) {
            Direction currentDirection = UrushiUtils.getDirectionFromInt(i);
            BlockState state=level.getBlockState(worldPosition);
            BlockState currentState = level.getBlockState(worldPosition.relative(currentDirection));
            if (state.getValue(AbstractHasReiryokuBlock.ZERO) == Boolean.valueOf(true) && level.getBlockEntity(worldPosition.relative(currentDirection)) instanceof ExportableReiryoku) {
                TileEntity currentTile =  level.getBlockEntity(worldPosition.relative(currentDirection));
                if (UrushiUtils.isTileNotPipeAndIsInOperationAndHasReiryoku(currentTile) || UrushiUtils.isPipeInOperation(currentState)) {
                    if(UrushiUtils.isEdgeDirectionOfPipe(level,worldPosition.relative(currentDirection),currentDirection)) {
                        if (!level.isClientSide()) {
                            level.setBlock(worldPosition, state.setValue(AbstractHasReiryokuBlock.ZERO, Boolean.valueOf(false)), 2);
                        }
                    }
                }
            } else if (state.getValue(AbstractHasReiryokuBlock.ZERO) == Boolean.valueOf(false) && level.getBlockEntity(worldPosition.relative(currentDirection)) instanceof ExportableReiryoku) {
                TileEntity currentTile = level.getBlockEntity(worldPosition.relative(currentDirection));
                if (UrushiUtils.isTileNotPipeAndIsIdleAndHasReiryoku(currentTile) || UrushiUtils.isPipeIdle(currentState)) {
                    if (UrushiUtils.isEdgeDirectionOfPipe(level, worldPosition.relative(currentDirection), currentDirection)) {
                        if (!level.isClientSide()) {
                            level.setBlock(worldPosition, state.setValue(AbstractHasReiryokuBlock.ZERO, Boolean.valueOf(true)), 2);
                        }
                    }
                }

            }
        }
    }
}

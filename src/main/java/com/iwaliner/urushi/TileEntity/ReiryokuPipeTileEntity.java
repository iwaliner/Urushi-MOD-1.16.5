package com.iwaliner.urushi.TileEntity;

import com.iwaliner.urushi.Block.AbstractHasReiryokuBlock;
import com.iwaliner.urushi.Block.ReiryokuPipeBlock;
import com.iwaliner.urushi.TileEntitiesRegister;
import com.iwaliner.urushi.UrushiUtils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;

public class ReiryokuPipeTileEntity extends AbstractHasRiryokuTileEntity implements ITickableTileEntity,HasReiryoku,ExportableReiryoku,ImportableReiryoku,IReiryokuPipe {


    public ReiryokuPipeTileEntity() {
        super(TileEntitiesRegister.ReiryokuPipe.get());
       // this.maxReiryoku=100;
    }
    private int transmitValuePerTick=10;
    @Override
    public int getMaxReiryoku() {
        return 1000;
    }

    @Override
    public void tick() {
        if(level.getBlockState(worldPosition).getBlock() instanceof ReiryokuPipeBlock) {
            BlockState pipe=level.getBlockState(worldPosition);
            Direction pipeDirection=pipe.getValue(ReiryokuPipeBlock.FACING);
            BlockState behindState=level.getBlockState(worldPosition.relative(pipeDirection.getOpposite()));
            BlockState frontState=level.getBlockState(worldPosition.relative(pipeDirection));

                 for(int i=0;i<6;i++){
                     Direction currentDirection= UrushiUtils.getDirectionFromInt(i);
                     BlockState currentState=level.getBlockState(worldPosition.relative(currentDirection));
                     if(currentDirection!=pipeDirection) {
                         /**霊力が流れているか流れていないかの見た目を変更する*/
                         if (pipe.getValue(AbstractHasReiryokuBlock.ZERO) == Boolean.valueOf(true) && level.getBlockEntity(worldPosition.relative(currentDirection)) instanceof ExportableReiryoku) {
                             TileEntity currentTile =  level.getBlockEntity(worldPosition.relative(currentDirection));
                             if (UrushiUtils.isTileNotPipeAndIsInOperationAndHasReiryoku(currentTile) || UrushiUtils.isPipeInOperation(currentState)) {
                                 if(UrushiUtils.isEdgeDirectionOfPipe(level,worldPosition.relative(currentDirection),currentDirection)) {
                                     if (!level.isClientSide()) {
                                         level.setBlock(worldPosition, pipe.setValue(AbstractHasReiryokuBlock.ZERO, Boolean.valueOf(false)), 2);
                                     }
                                 }
                             }
                         } else if (pipe.getValue(AbstractHasReiryokuBlock.ZERO) == Boolean.valueOf(false) && level.getBlockEntity(worldPosition.relative(currentDirection)) instanceof ExportableReiryoku) {
                             TileEntity currentTile = level.getBlockEntity(worldPosition.relative(currentDirection));
                             if (UrushiUtils.isTileNotPipeAndIsIdleAndHasReiryoku(currentTile) || UrushiUtils.isPipeIdle(currentState)) {
                                 if (UrushiUtils.isEdgeDirectionOfPipe(level, worldPosition.relative(currentDirection), currentDirection)) {
                                     if (!level.isClientSide()) {
                                         level.setBlock(worldPosition, pipe.setValue(AbstractHasReiryokuBlock.ZERO, Boolean.valueOf(true)), 2);
                                     }
                                 }
                             }

                         }
                     }

            if(currentDirection==pipeDirection){
                /**矢印の方向に搬出*/
                if (level.getBlockEntity(worldPosition.relative(pipeDirection)) instanceof ImportableReiryoku) {
                    TileEntity nextTile = level.getBlockEntity(worldPosition.relative(pipeDirection));
                    if (nextTile instanceof HasReiryoku&& !UrushiUtils.isPipe(nextTile)) {
                        if (this.getStoredReiryoku() >= transmitValuePerTick && ((HasReiryoku) nextTile).getStoredReiryoku() <= ((HasReiryoku) nextTile).getMaxReiryoku() - transmitValuePerTick) {
                            ((HasReiryoku) nextTile).changeStoredReiryoku(transmitValuePerTick);
                            this.changeStoredReiryoku(-transmitValuePerTick);
                        } else if (((HasReiryoku) nextTile).getStoredReiryoku() <= ((HasReiryoku) nextTile).getMaxReiryoku() - transmitValuePerTick) {
                            ((HasReiryoku) nextTile).changeStoredReiryoku(this.getStoredReiryoku());
                            this.setStoredReiryokuEmpty();
                        }
                    }
                }
            }else{
                /**矢印以外の方向から搬入*/
                if (level.getBlockEntity(worldPosition.relative(currentDirection)) instanceof ExportableReiryoku) {
                    TileEntity nextTile = level.getBlockEntity(worldPosition.relative(currentDirection));
                    if(nextTile instanceof HasReiryoku){
                    if (((HasReiryoku) nextTile).getStoredReiryoku() >= transmitValuePerTick && this.getStoredReiryoku() <= this.getMaxReiryoku() - transmitValuePerTick) {
                        if (UrushiUtils.getReiryokuImportablePipeAmountNear(level, worldPosition.relative(currentDirection)) != 0) {
                            if (level.random.nextInt(UrushiUtils.getReiryokuImportablePipeAmountNear(level, worldPosition.relative(currentDirection))) == 0) {
                                ((HasReiryoku) nextTile).changeStoredReiryoku(-transmitValuePerTick);
                                this.changeStoredReiryoku(transmitValuePerTick);
                            }
                        }
                    }
                    else if (this.getStoredReiryoku() <= this.getMaxReiryoku() - transmitValuePerTick) {
                        if (UrushiUtils.getReiryokuImportablePipeAmountNear(level, worldPosition.relative(currentDirection)) != 0) {
                            if (level.random.nextInt(UrushiUtils.getReiryokuImportablePipeAmountNear(level, worldPosition.relative(currentDirection))) == 0) {
                                this.changeStoredReiryoku(((HasReiryoku) nextTile).getStoredReiryoku());
                                ((HasReiryoku) nextTile).setStoredReiryokuEmpty();
                            }
                        }
                    }
                }
                }
            }
                 }

        }
    }
}

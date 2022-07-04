package com.iwaliner.urushi.TileEntity;

import net.minecraft.block.Block;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.IHopper;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public interface IFoxHopper extends IHopper {
    VoxelShape INSIDE = Block.box(2.0D, 11.0D, 2.0D, 14.0D, 16.0D, 14.0D);
    VoxelShape ABOVE = Block.box(0.0D, 16.0D, 0.0D, 16.0D, 64.1D, 16.0D);
    VoxelShape SUCK = VoxelShapes.or(INSIDE, ABOVE);

    default VoxelShape getSuckShape() {
        return SUCK;
    }

    @Nullable
    World getLevel();

    double getLevelX();

    double getLevelY();

    double getLevelZ();
}
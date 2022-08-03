package com.iwaliner.urushi.Block;

import com.iwaliner.urushi.ModCore_Urushi;
import com.iwaliner.urushi.TileEntity.FryerTileEntity;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.tileentity.TileEntity;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;


import java.util.Random;

public class FryerBlock extends AbstractFurnaceBlock {
    protected static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D);

    public FryerBlock(AbstractBlock.Properties p_i48393_1_) {
        super(p_i48393_1_);
    }
    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return SHAPE;
    }

    public TileEntity newBlockEntity(IBlockReader p_196283_1_) {
        return new FryerTileEntity();
    }

    protected void openContainer(World p_220089_1_, BlockPos p_220089_2_, PlayerEntity p_220089_3_) {
        TileEntity tileentity = p_220089_1_.getBlockEntity(p_220089_2_);
        if (tileentity instanceof FryerTileEntity) {
            p_220089_3_.openMenu((INamedContainerProvider)tileentity);
            p_220089_3_.awardStat(ModCore_Urushi.INTERACT_WITH_FRYER);
            //p_220089_3_.awardStat(Stats.INTERACT_WITH_FURNACE);
        }

    }

   /* @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState p_180655_1_, World p_180655_2_, BlockPos p_180655_3_, Random p_180655_4_) {
        if (p_180655_1_.getValue(LIT)) {
            double d0 = (double)p_180655_3_.getX() + 0.5D;
            double d1 = (double)p_180655_3_.getY();
            double d2 = (double)p_180655_3_.getZ() + 0.5D;
            if (p_180655_4_.nextDouble() < 0.1D) {
                p_180655_2_.playLocalSound(d0, d1, d2, SoundEvents.FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
            }

            Direction direction = p_180655_1_.getValue(FACING);
            Direction.Axis direction$axis = direction.getAxis();
            double d3 = 0.52D;
            double d4 = p_180655_4_.nextDouble() * 0.6D - 0.3D;
            double d5 = direction$axis == Direction.Axis.X ? (double)direction.getStepX() * 0.52D : d4;
            double d6 = p_180655_4_.nextDouble() * 6.0D / 16.0D;
            double d7 = direction$axis == Direction.Axis.Z ? (double)direction.getStepZ() * 0.52D : d4;
            p_180655_2_.addParticle(ParticleTypes.SMOKE, d0 + d5, d1 + d6, d2 + d7, 0.0D, 0.0D, 0.0D);
            p_180655_2_.addParticle(ParticleTypes.FLAME, d0 + d5, d1 + d6, d2 + d7, 0.0D, 0.0D, 0.0D);
        }
    }*/
    public void onRemove(BlockState p_196243_1_, World p_196243_2_, BlockPos p_196243_3_, BlockState p_196243_4_, boolean p_196243_5_) {
        if (!p_196243_1_.is(p_196243_4_.getBlock())) {
            TileEntity tileentity = p_196243_2_.getBlockEntity(p_196243_3_);
            if (tileentity instanceof IInventory) {
                InventoryHelper.dropContents(p_196243_2_, p_196243_3_, (IInventory)tileentity);
                p_196243_2_.updateNeighbourForOutputSignal(p_196243_3_, this);
            }

            super.onRemove(p_196243_1_, p_196243_2_, p_196243_3_, p_196243_4_, p_196243_5_);
        }
    }

}

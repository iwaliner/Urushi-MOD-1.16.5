package com.iwaliner.urushi.TileEntity;


import com.iwaliner.urushi.Block.DoubledWoodenCabinetryBlock;
import com.iwaliner.urushi.Block.WoodenCabinetryBlock;
import com.iwaliner.urushi.BlocksRegister;
import com.iwaliner.urushi.Container.DoubledWoodenCabinetryContainer;
import com.iwaliner.urushi.TileEntitiesRegister;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.ChestContainer;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.vector.Vector3i;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class DoubledWoodenCabinetryTileEntity extends LockableLootTileEntity {
    private NonNullList<ItemStack> items = NonNullList.withSize(128, ItemStack.EMPTY);
    private int openCount;
    public DoubledWoodenCabinetryTileEntity(TileEntityType<?> p_i48289_1_) {
        super(p_i48289_1_);
    }
    public DoubledWoodenCabinetryTileEntity(){
        this(TileEntitiesRegister.WoodenCabinetryTile.get());}

    public CompoundNBT save(CompoundNBT p_189515_1_) {
        super.save(p_189515_1_);
        if (!this.trySaveLootTable(p_189515_1_)) {
            ItemStackHelper.saveAllItems(p_189515_1_, this.items);
        }

        return p_189515_1_;
    }

    public void load(BlockState p_230337_1_, CompoundNBT p_230337_2_) {
        super.load(p_230337_1_, p_230337_2_);
        this.items = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
        if (!this.tryLoadLootTable(p_230337_2_)) {
            ItemStackHelper.loadAllItems(p_230337_2_, this.items);
        }

    }

    public int getContainerSize() {
        return 128;
    }

    protected NonNullList<ItemStack> getItems() {
        return this.items;
    }

    protected void setItems(NonNullList<ItemStack> p_199721_1_) {
        this.items = p_199721_1_;
    }

    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("container.doubledwoodencabinetry");
    }

    protected Container createMenu(int p_213906_1_, PlayerInventory p_213906_2_) {
        return new DoubledWoodenCabinetryContainer(p_213906_1_, p_213906_2_);
    }

    public void startOpen(PlayerEntity p_174889_1_) {
        if (!p_174889_1_.isSpectator()) {
            if (this.openCount < 0) {
                this.openCount = 0;
            }

            ++this.openCount;
            BlockState blockstate = this.getBlockState();
            boolean flag = blockstate.getValue(DoubledWoodenCabinetryBlock.OPEN);
            if (!flag) {
                this.playSound(blockstate, SoundEvents.BARREL_OPEN);
                this.updateBlockState(blockstate, true);
            }

            this.scheduleRecheck();
        }

    }

    private void scheduleRecheck() {
        this.level.getBlockTicks().scheduleTick(this.getBlockPos(), this.getBlockState().getBlock(), 5);
    }

    public void recheckOpen() {
        int i = this.worldPosition.getX();
        int j = this.worldPosition.getY();
        int k = this.worldPosition.getZ();
        this.openCount = ChestTileEntity.getOpenCount(this.level, this, i, j, k);
        if (this.openCount > 0) {
            this.scheduleRecheck();
        } else {
            BlockState blockstate = this.getBlockState();
            if (!blockstate.is(BlocksRegister.DoubledWoodenCabinetry.get())) {
                this.setRemoved();
                return;
            }

            boolean flag = blockstate.getValue(DoubledWoodenCabinetryBlock.OPEN);
            if (flag) {
                this.playSound(blockstate, SoundEvents.BARREL_CLOSE);
                this.updateBlockState(blockstate, false);
            }
        }

    }

    public void stopOpen(PlayerEntity p_174886_1_) {
        if (!p_174886_1_.isSpectator()) {
            --this.openCount;
        }

    }

    private void updateBlockState(BlockState p_213963_1_, boolean p_213963_2_) {
        this.level.setBlock(this.getBlockPos(), p_213963_1_.setValue(DoubledWoodenCabinetryBlock.OPEN, Boolean.valueOf(p_213963_2_)), 3);
    }

    private void playSound(BlockState p_213965_1_, SoundEvent p_213965_2_) {
        Vector3i vector3i = p_213965_1_.getValue(DoubledWoodenCabinetryBlock.FACING).getNormal();
        double d0 = (double)this.worldPosition.getX() + 0.5D + (double)vector3i.getX() / 2.0D;
        double d1 = (double)this.worldPosition.getY() + 0.5D + (double)vector3i.getY() / 2.0D;
        double d2 = (double)this.worldPosition.getZ() + 0.5D + (double)vector3i.getZ() / 2.0D;
        this.level.playSound((PlayerEntity)null, d0, d1, d2, p_213965_2_, SoundCategory.BLOCKS, 0.5F, this.level.random.nextFloat() * 0.1F + 0.9F);
    }
}

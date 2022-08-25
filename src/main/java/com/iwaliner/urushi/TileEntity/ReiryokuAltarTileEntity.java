package com.iwaliner.urushi.TileEntity;


import com.iwaliner.urushi.Block.AbstractHasReiryokuBlock;
import com.iwaliner.urushi.Block.ReiryokuAltarBlock;
import com.iwaliner.urushi.Block.WoodenCabinetryBlock;
import com.iwaliner.urushi.Item.HasReiryokuItem;
import com.iwaliner.urushi.ItemsRegister;
import com.iwaliner.urushi.TileEntitiesRegister;
import com.iwaliner.urushi.UrushiUtils;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.ChestContainer;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.*;
import net.minecraft.util.math.vector.Vector3i;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;

public class ReiryokuAltarTileEntity extends AbstractHasReiryokuMachineTileEntity {
    private static final int[] SLOTS_FOR_UP_AND_SIDES = new int[]{0};
    private static final int[] SLOTS_FOR_DOWN = new int[]{1};
    private NonNullList<ItemStack> items = NonNullList.withSize(2, ItemStack.EMPTY);
    private int processCount=100;

    public ReiryokuAltarTileEntity(TileEntityType<?> p_i48289_1_) {
        super(p_i48289_1_);
    }
    public ReiryokuAltarTileEntity(){
        this(TileEntitiesRegister.ReiryokuAltar.get());}

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
    public int getMaxStackSize() {
        return 1;
    }

    public int getContainerSize() {
        return 2;
    }
    public int getCount() {
        return 1;
    }

    protected NonNullList<ItemStack> getItems() {
        return this.items;
    }

    protected void setItems(NonNullList<ItemStack> p_199721_1_) {
        this.items = p_199721_1_;
    }

   protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("container.reiryokualtar");
    }

    protected Container createMenu(int p_213906_1_, PlayerInventory p_213906_2_) {
        return null;
    }


    @Override
    public int getMaxReiryoku() {
        return 10000;
    }

    @Override
    public void tick() {
        ItemStack slot0Stack=this.items.get(0);
        Item slot0Item=slot0Stack.getItem();
        ItemStack slot1Stack=this.items.get(1);
        Item slot1Item=slot1Stack.getItem();
        BlockState state=level.getBlockState(worldPosition);

        /**スロットに入ってるアイテムに対応した見た目のブロックにする*/
        if(processingTime==0&&!level.isClientSide()){
            if(UrushiUtils.isBewitchable(slot0Item)&&slot1Stack.isEmpty()){
                level.setBlock(worldPosition, state.setValue(ReiryokuAltarBlock.VARIANT, Integer.valueOf(UrushiUtils.getAltarVariant(slot0Item))), 2);
            }else if(!slot1Stack.isEmpty()){
                level.setBlock(worldPosition, state.setValue(ReiryokuAltarBlock.VARIANT, Integer.valueOf(UrushiUtils.getAltarVariant(slot1Item))), 2);
            }
            else {
                level.setBlock(worldPosition, state.setValue(ReiryokuAltarBlock.VARIANT, Integer.valueOf(0)), 2);
            }
        }

        /**アイテム変化*/
        if(getStoredReiryoku()>0) {
            if (slot0Stack.getCount() > 0 && slot1Stack.isEmpty()  && UrushiUtils.isBewitchable(slot0Item)&& this.processingTime < UrushiUtils.getBewitchingTime(slot0Item)) {
                this.processingTime++;
            }
            else if (slot0Stack.getCount() > 0 &&slot1Stack.isEmpty() && UrushiUtils.isBewitchable(slot0Item)) {
                if(slot0Item instanceof HasReiryokuItem) {
                    ItemStack postStack=new ItemStack(slot0Item);
                    if(UrushiUtils.getStoredReiryokuOfItem(slot0Stack)+this.getStoredReiryoku()>UrushiUtils.getMaxStoredReiryokuOfItem(slot0Stack)){
                        postStack.setDamageValue(0);
                        this.changeStoredReiryoku(-(UrushiUtils.getMaxStoredReiryokuOfItem(slot0Stack)-UrushiUtils.getStoredReiryokuOfItem(slot0Stack)));
                    }else{
                        postStack.setDamageValue(UrushiUtils.getMaxStoredReiryokuOfItem(slot0Stack)-(UrushiUtils.getStoredReiryokuOfItem(slot0Stack)+this.getStoredReiryoku()));
                        this.setStoredReiryokuEmpty();
                    }
                    this.setItem(1, postStack);
                }else{
                    this.setItem(1, new ItemStack(UrushiUtils.bewitchableMap.get(slot0Item)));
                }
                this.setItem(0, ItemStack.EMPTY);
                this.processingTime = 0;

            }
        }


        if(isWorking()){
            changeStoredReiryoku(-1);
        }
    }
    public boolean canPlaceItem(int i, ItemStack stack) {
        if (i == 1) {
            return false;
        }  else {
            return this.items.get(0).getCount()==0&&this.items.get(1).getCount()==0&& UrushiUtils.isBewitchable(stack.getItem());
        }
    }
    public boolean canTakeItemThroughFace(int i, ItemStack stack, Direction direction) {
        if ( direction==Direction.DOWN) {
            return true;
        }
            return false;

    }
    public boolean canPlaceItemThroughFace(int i, ItemStack itemStack, @Nullable Direction p_180462_3_) {
        return this.canPlaceItem(i, itemStack);
    }
    public int[] getSlotsForFace(Direction direction) {
        if(direction==Direction.DOWN){
            return SLOTS_FOR_DOWN;
        }else{
            return SLOTS_FOR_UP_AND_SIDES;
        }
    }
    private boolean isWorking(){
        return this.processingTime!=0&&getStoredReiryoku()>0;
    }
    net.minecraftforge.common.util.LazyOptional<? extends net.minecraftforge.items.IItemHandler>[] handlers =
            net.minecraftforge.items.wrapper.SidedInvWrapper.create(this, Direction.UP, Direction.DOWN, Direction.NORTH);
    @Override
    public <T> net.minecraftforge.common.util.LazyOptional<T> getCapability(net.minecraftforge.common.capabilities.Capability<T> capability, @Nullable Direction facing) {
        if (!this.remove && facing != null && capability == net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            if (facing == Direction.DOWN)
                return handlers[1].cast();
            else
                return handlers[0].cast();
        }
        return super.getCapability(capability, facing);
    }
}

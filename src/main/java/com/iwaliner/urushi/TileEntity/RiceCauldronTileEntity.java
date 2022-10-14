package com.iwaliner.urushi.TileEntity;

import com.iwaliner.urushi.Block.DirtFurnaceBlock;
import com.iwaliner.urushi.Block.ReiryokuAltarBlock;
import com.iwaliner.urushi.Block.RiceCauldronBlock;
import com.iwaliner.urushi.ItemAndBlockRegister;
import com.iwaliner.urushi.Item.HasReiryokuItem;
import com.iwaliner.urushi.ItemAndBlockRegister;
import com.iwaliner.urushi.TileEntitiesRegister;
import com.iwaliner.urushi.UrushiUtils;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;

public  class RiceCauldronTileEntity extends LockableLootTileEntity implements ITickableTileEntity, ISidedInventory {
    public int processingTime;
    private static final int[] SLOTS_FOR_UP_AND_SIDES = new int[]{1};
    private static final int[] SLOTS_FOR_UP = new int[]{0};
    private NonNullList<ItemStack> items = NonNullList.withSize(2, ItemStack.EMPTY);

    public RiceCauldronTileEntity(TileEntityType<?> p_i48289_1_) {
        super(p_i48289_1_);
    }
    public RiceCauldronTileEntity(){
        this(TileEntitiesRegister.RiceCauldron.get());}
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
        return 2;
    }
    protected NonNullList<ItemStack> getItems() {
        return this.items;
    }

    public void setItems(NonNullList<ItemStack> p_199721_1_) {
        this.items = p_199721_1_;
    }


    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("container.ricecauldron");
    }

    protected Container createMenu(int p_213906_1_, PlayerInventory p_213906_2_) {
        return null;
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
            if(slot0Stack.getCount()>0){
                level.setBlock(worldPosition, state.setValue(RiceCauldronBlock.VARIANT, Integer.valueOf(2)), 2);
            }else if(slot0Stack.isEmpty()&&slot1Stack.isEmpty()&&state.getValue(RiceCauldronBlock.VARIANT)!=1){
                level.setBlock(worldPosition, state.setValue(RiceCauldronBlock.VARIANT, Integer.valueOf(0)), 2);
            }
        }

        /**アイテム変化*/
        if(this.level.getBlockState(this.worldPosition.below()).getBlock()== ItemAndBlockRegister.dirt_furnace.get()&&this.level.getBlockState(this.worldPosition.below()).getValue(DirtFurnaceBlock.LIT)){
            if(slot0Stack.getCount()>0&&slot1Stack.isEmpty()){
                if(processingTime<100){
                    this.processingTime++;
                }else{
                    this.setItem(1, new ItemStack(ItemAndBlockRegister.Rice.get(),slot0Stack.getCount()));
                    this.setItem(0, ItemStack.EMPTY);
                    this.processingTime = 0;
                    if(!getLevel().isClientSide()) {
                        level.setBlock(worldPosition, state.setValue(RiceCauldronBlock.VARIANT, Integer.valueOf(3)), 2);
                    }
                }

            }

        }
    }
    public boolean canPlaceItem(int i, ItemStack stack) {
        if (i == 1) {
            return false;
        }  else {
            return this.items.get(0).getCount()==0&&this.items.get(1).getCount()==0&&stack.getItem()== ItemAndBlockRegister.RawRice.get();
        }
    }
    public boolean canTakeItemThroughFace(int i, ItemStack stack, Direction direction) {
        if ( direction==Direction.UP) {
            return false;
        }
        return true;

    }
    public boolean canPlaceItemThroughFace(int i, ItemStack itemStack, @Nullable Direction p_180462_3_) {
        return this.canPlaceItem(i, itemStack);
    }
    public int[] getSlotsForFace(Direction direction) {
        if(direction==Direction.UP){
            return SLOTS_FOR_UP;
        }else{
            return SLOTS_FOR_UP_AND_SIDES;
        }
    }
    private boolean isWorking(){
        return this.processingTime!=0;
    }
    net.minecraftforge.common.util.LazyOptional<? extends net.minecraftforge.items.IItemHandler>[] handlers =
            net.minecraftforge.items.wrapper.SidedInvWrapper.create(this, Direction.UP, Direction.DOWN, Direction.NORTH);
    @Override
    public <T> net.minecraftforge.common.util.LazyOptional<T> getCapability(net.minecraftforge.common.capabilities.Capability<T> capability, @Nullable Direction facing) {
        if (!this.remove && facing != null && capability == net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            if (facing == Direction.UP)
                return handlers[0].cast();
            else
                return handlers[1].cast();
        }
        return super.getCapability(capability, facing);
    }
}

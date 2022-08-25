package com.iwaliner.urushi;


import com.google.common.collect.Maps;
import com.iwaliner.urushi.Block.AbstractHasReiryokuBlock;
import com.iwaliner.urushi.Block.ReiryokuPipeBlock;
import com.iwaliner.urushi.Item.HasReiryokuItem;
import com.iwaliner.urushi.TileEntity.AbstractHasRiryokuTileEntity;
import com.iwaliner.urushi.TileEntity.HasReiryoku;
import com.iwaliner.urushi.TileEntity.IReiryokuPipe;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import java.util.Map;

public class UrushiUtils {
    public  static Map<Item, Item> bewitchableMap = Maps.newLinkedHashMap();
    public  static Map<Item, Integer> bewitchingTime = Maps.newLinkedHashMap();
    public  static Map<Item, Integer> altarVariant = Maps.newLinkedHashMap();
    public  static Direction getDirectionFromInt(int i){
        switch (i){
            case 0 :return  Direction.DOWN;
            case 1 :return  Direction.UP;
            case 2 :return  Direction.NORTH;
            case 3 :return  Direction.SOUTH;
            case 4 :return  Direction.WEST;
            case 5 :return  Direction.EAST;
            default: return Direction.NORTH;
        }
    }
    public  static int getIntFromDirection(Direction direction){
        switch (direction){
            case DOWN:  return  0;
            case UP:    return 1;
            case NORTH :return  2;
            case SOUTH :return  3;
            case WEST : return  4;
            case EAST : return 5;
            default:    return 6;
        }
    }
    public static boolean isBewitchable(Item item){
        if(bewitchableMap.containsKey(item)||item instanceof HasReiryokuItem){
            return true;
        }else{
            return  false;
        }
    }
    public static void setItemBewitchRecipe(Item requiredItem,Item resultItem){
        bewitchableMap.put(requiredItem,resultItem);
    }
    public static int getBewitchingTime(Item item){
        if(item instanceof HasReiryokuItem){
            return ((HasReiryokuItem) item).getBewitchingTime();
        }else if(isBewitchable(item)) {
            return bewitchingTime.get(item);
        }
        return 0;
    }
    public static void setBewitchingTime(Item requiredItem,int time){
        bewitchingTime.put(requiredItem,time);
    }
    public static int getAltarVariant(Item item){
        if(item instanceof HasReiryokuItem){
            return ((HasReiryokuItem) item).getAltarVariant();
        }
            return altarVariant.get(item);
    }
    public static void setAltarVariant(Item requiredItem,int variant){
        altarVariant.put(requiredItem,variant);
    }
    public static int getReiryokuImportablePipeAmountNear(World world,BlockPos pos){
        int amount=0;
        for(int i=0;i<6;i++){
            if(world.getBlockState(pos.relative(getDirectionFromInt(i))).getBlock() instanceof ReiryokuPipeBlock){
                BlockState state= world.getBlockState(pos.relative(getDirectionFromInt(i)));
               if(state.getValue(ReiryokuPipeBlock.FACING).getOpposite()!=getDirectionFromInt(i)){
                   amount++;
               }
            }
        }
        return amount;
    }
    public static int getPipeAmountNear(World world,BlockPos pos){
        int amount=0;
        for(int i=0;i<6;i++){
            BlockState state= world.getBlockState(pos.relative(getDirectionFromInt(i)));
                if(state.getBlock() instanceof AbstractHasReiryokuBlock){
                amount++;
            }
        }
        return amount;
    }
    public static int getPipeConnectionAmount(BlockState state){
        int amount=0;
        for(int i=0;i<6;i++){
          if(state.getBlock() instanceof AbstractHasReiryokuBlock){
                if(state.getValue(AbstractHasReiryokuBlock.PROPERTY_BY_DIRECTION.get(getDirectionFromInt(i)))){
                    amount++;
                }
            }
        }
        return amount;
    }
    public static boolean isEdgeDirectionOfPipe(World world,BlockPos pos,Direction direction){
        if(world.getBlockState(pos).getBlock() instanceof ReiryokuPipeBlock){
            Direction facing=world.getBlockState(pos).getValue(ReiryokuPipeBlock.FACING);
            return facing==direction||facing.getOpposite()==direction;
        }else if(world.getBlockState(pos).getBlock() instanceof AbstractHasReiryokuBlock){
            return true;
        } else{
            return false;
        }
    }

    public static boolean isPipe(TileEntity tileEntity){
        if(tileEntity instanceof IReiryokuPipe){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isPipeIdle(BlockState state){
        if(state.getBlock() instanceof ReiryokuPipeBlock){
            return state.getValue(AbstractHasReiryokuBlock.ZERO);
        }else {
            return false;
        }
    }
    public static boolean isPipeInOperation(BlockState state){
        if(state.getBlock() instanceof ReiryokuPipeBlock){
            return !state.getValue(AbstractHasReiryokuBlock.ZERO);
        }else {
            return false;
        }
    }
    public static TileEntity getReiryokuTileEntity(World level, BlockPos pos){
        if(level.getBlockEntity(pos) instanceof HasReiryoku){
            return level.getBlockEntity(pos);
        }else{
            return null;
        }
    }
    public static boolean isTileNotPipeAndIsInOperation(AbstractHasRiryokuTileEntity tileEntity){
        if(tileEntity instanceof IReiryokuPipe){
            return false;
        }else{
            return tileEntity.reiryokuStored>0;
        }
    }
    public static boolean isTileNotPipeAndIsInOperationAndHasReiryoku(TileEntity tileEntity){
        if(tileEntity instanceof IReiryokuPipe){
            return false;
        }else if(tileEntity instanceof HasReiryoku){
            return ((HasReiryoku) tileEntity).getStoredReiryoku()>0;
        }else{
            return false;
        }
    }
    public static boolean isTileNotPipeAndIsIdle(AbstractHasRiryokuTileEntity tileEntity){
        if(tileEntity instanceof IReiryokuPipe){
            return false;
        }else{
            return tileEntity.reiryokuStored<=0;
        }
    }
    public static boolean isTileNotPipeAndIsIdleAndHasReiryoku(TileEntity tileEntity){
        if(tileEntity instanceof IReiryokuPipe){
            return false;
        }else if(tileEntity instanceof HasReiryoku){
            return ((HasReiryoku) tileEntity).getStoredReiryoku()<=0;
        }else{
            return false;
        }
    }
    public static boolean isReiryokuStack(ItemStack stack){
        if(Block.byItem(stack.getItem()) instanceof  AbstractHasReiryokuBlock){
            return true;
        }else{
            return false;
        }
    }
    public static int getStoredReiryokuOfItem(ItemStack stack){
        if(stack.getItem() instanceof HasReiryokuItem){
            return ((HasReiryokuItem) stack.getItem()).getMaxReiryoku()-stack.getDamageValue();
        }
        return 0;
    }
    public static int getMaxStoredReiryokuOfItem(ItemStack stack){
        if(stack.getItem() instanceof HasReiryokuItem){
            return ((HasReiryokuItem) stack.getItem()).getMaxReiryoku();
        }
        return 0;
    }
    public static void changeStoredReiryokuOfItem(ItemStack stack,int i){
        if(stack.getItem() instanceof HasReiryokuItem){
            if(i>=0&&UrushiUtils.getStoredReiryokuOfItem(stack)+i<UrushiUtils.getMaxStoredReiryokuOfItem(stack)){
                stack.setDamageValue(UrushiUtils.getMaxStoredReiryokuOfItem(stack)-(UrushiUtils.getStoredReiryokuOfItem(stack)+i));
            }else if(i<0&&UrushiUtils.getStoredReiryokuOfItem(stack)-(-i)>=0){
                stack.setDamageValue(UrushiUtils.getMaxStoredReiryokuOfItem(stack)-(UrushiUtils.getStoredReiryokuOfItem(stack)+i));
            }
        }
    }
    public static void setStoredReiryokuEmptyItem(ItemStack stack){
        stack.setDamageValue(UrushiUtils.getMaxStoredReiryokuOfItem(stack));
    }
    public static void setStoredReiryokuMaxItem(ItemStack stack){
        stack.setDamageValue(0);
    }
}

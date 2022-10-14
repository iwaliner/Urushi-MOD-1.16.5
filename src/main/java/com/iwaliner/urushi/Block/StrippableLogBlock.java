package com.iwaliner.urushi.Block;

import com.iwaliner.urushi.ItemAndBlockRegister;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class StrippableLogBlock extends RotatedPillarBlock {
    private Block block;
   // private Item item;
    private int type;
    public StrippableLogBlock(Block b, int i, Properties p_i48339_1_) {
        super(p_i48339_1_);
        block=b;
     /*   if(i==0){
            if(ItemAndBlockRegister.JapaneseApricotBark.isPresent())
            item= ItemAndBlockRegister.JapaneseApricotBark.get();
        }*/
        type=i;
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {
        Item item=null;
        if(ItemAndBlockRegister.JapaneseApricotBark.isPresent()&&type==0){
            item= ItemAndBlockRegister.JapaneseApricotBark.get();
        }else if(ItemAndBlockRegister.SakuraBark.isPresent()&&type==1){
            item= ItemAndBlockRegister.SakuraBark.get();
        }else if(ItemAndBlockRegister.CypressBark.isPresent()&&type==2){
            item= ItemAndBlockRegister.CypressBark.get();
        }else if(ItemAndBlockRegister.japanese_cedar_bark.isPresent()&&type==3){
            item= ItemAndBlockRegister.japanese_cedar_bark.get();
        }

        if(player.getItemInHand(hand).getItem() instanceof AxeItem){
             EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;
            world.setBlock(pos,block.defaultBlockState().setValue(AXIS,state.getValue(AXIS)),4);
            world.playSound(player, pos, SoundEvents.AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
            //if(!world.isClientSide){
                ItemEntity itemEntity=new ItemEntity(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(item,8));
                world.addFreshEntity(itemEntity);
           // }
            return ActionResultType.SUCCESS;
        }else{
            return ActionResultType.FAIL;
        }
    }
}

package com.iwaliner.urushi.Block;

import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FlintAndSteelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class DirtFurnaceBlock extends HorizonalRotateBlock {
    public static final BooleanProperty LIT = BooleanProperty.create("lit");
    private static final VoxelShape Shape1 = Block.box(0D, 0.0D, 0D, 4D, 16D, 16D);
    private static final VoxelShape Shape2 = Block.box(12D, 0.0D, 0D, 16D, 16D, 16D);
    private static final VoxelShape Shape3 = Block.box(0D, 0.0D, 0D, 16D, 16D, 4D);
    private static final VoxelShape Shape4 = Block.box(0D, 0.0D, 12D, 16D, 16D, 16D);
    private static final VoxelShape AABB = VoxelShapes.or(Shape1, Shape2, Shape3, Shape4);

    public DirtFurnaceBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(LIT, Boolean.valueOf(false)));
    }
    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
            return AABB;
    }
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(FACING,LIT);
    }
    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {
         if(state.getValue(LIT)){
             world.setBlockAndUpdate(pos,state.setValue(LIT,Boolean.valueOf(false)));
             world.playSound((PlayerEntity) null, pos, SoundEvents.FIRE_EXTINGUISH, SoundCategory.BLOCKS, 1.0F, 1F);
             return ActionResultType.SUCCESS;
         }else{
             if(player.getItemInHand(hand).getItem() instanceof FlintAndSteelItem){
                 world.playSound((PlayerEntity) null, pos, SoundEvents.FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, world.random.nextFloat() * 0.4F + 0.8F);
                 world.setBlockAndUpdate(pos,state.setValue(LIT,Boolean.valueOf(true)));
                 return ActionResultType.SUCCESS;
             }else{
                 return ActionResultType.FAIL;
             }
         }
    }

    @Override
    public void neighborChanged(BlockState state, World world, BlockPos pos, Block block, BlockPos neighbor, boolean boo) {
    if(!state.getValue(LIT)){
        if(world.getBlockState(neighbor).getBlock() instanceof AbstractFireBlock){
            world.setBlockAndUpdate(pos,state.setValue(LIT,Boolean.valueOf(true)));
            world.playSound((PlayerEntity) null, pos, SoundEvents.FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, world.random.nextFloat() * 0.4F + 0.8F);

        }
    }


    }
    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable IBlockReader reader, List<ITextComponent> list, ITooltipFlag flag) {
        list.add((new TranslationTextComponent("info.urushi.dirtfurnace" )).withStyle(TextFormatting.GRAY));
    }
}

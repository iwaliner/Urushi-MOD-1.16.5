package com.iwaliner.urushi.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.PushReaction;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class IronIngotBlock extends HorizonalRotateBlock{
   // public static final IntegerProperty state = IntegerProperty.create("state",0,9);
   // public static final IntegerProperty level = IntegerProperty.create("level",1,3);
    protected static final VoxelShape SHAPEA = Block.box(6.0D, 0.0D, 2D, 10D, 2D, 14.0D);
    protected static final VoxelShape SHAPEB = Block.box(2D, 0.0D, 6D, 14D, 2D, 10.0D);
    private Block postBlock;
    public IronIngotBlock(Block block,Properties p_i48377_1_) {

        super(p_i48377_1_);
        postBlock=block;
    }
    public Block getPostBlock(){
     return postBlock;
    }
    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        if(state.getValue(FACING)== Direction.NORTH||state.getValue(FACING)==Direction.SOUTH){
            return SHAPEB;
        }else{
            return SHAPEA;
        }
    }
/*
    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {
       if(postBlock!=null&&postBlock instanceof IronIngotBlock){
           Random random=new Random();
           int i=random.nextInt(16);
           BlockState thisBlock=world.getBlockState(pos);
           double d0 = (double) pos.getX() +random.nextInt(16)*0.1D;
           double d1 = (double) pos.getY() +random.nextInt(5)*0.1D;
           double d2 = (double) pos.getZ() +random.nextInt(16)*0.1D;
           if(thisBlock.getBlock() instanceof IronIngotBlock){
               if (i == 0) {
                   world.setBlockAndUpdate(pos, postBlock.defaultBlockState().setValue(FACING, thisBlock.getValue(FACING)));
                   world.addParticle(ParticleTypes.FLAME,  d0,d1, d2, 0.0D, 0D, 0.0D);
                   world.playSound((PlayerEntity) null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ANVIL_LAND, SoundCategory.NEUTRAL, 0.1F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
                   return ActionResultType.FAIL;
               }else{
                   world.addParticle(ParticleTypes.FLAME,  d0,d1, d2, 0.0D, 0D, 0.0D);
                   world.playSound((PlayerEntity) null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ANVIL_PLACE, SoundCategory.NEUTRAL, 0.1F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
                   return ActionResultType.FAIL;
               }
           }
       }
       return ActionResultType.FAIL;
    }*/
public PushReaction getPistonPushReaction(BlockState p_149656_1_) {
    return PushReaction.DESTROY;
}
@Override
public void appendHoverText(ItemStack itemStack, @Nullable IBlockReader reader, List<ITextComponent> list, ITooltipFlag flag) {
    list.add((new TranslationTextComponent("info.urushi.iron_ingot" )).withStyle(TextFormatting.GRAY));
}

}

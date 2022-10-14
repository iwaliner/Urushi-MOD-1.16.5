package com.iwaliner.urushi.Block;

import com.iwaliner.urushi.ItemAndBlockRegister;
import com.iwaliner.urushi.TileEntity.ReiryokuAltarTileEntity;
import com.iwaliner.urushi.TileEntity.RiceCauldronTileEntity;
import com.iwaliner.urushi.UrushiUtils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ContainerBlock;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
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
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class RiceCauldronBlock extends ContainerBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public static final IntegerProperty VARIANT = IntegerProperty.create("variant",0,15);

    private static final VoxelShape BOX = Block.box(2D, 0.0D, 2D, 14D, 5D, 14D);

    public RiceCauldronBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
        this.registerDefaultState(this.stateDefinition.any().setValue(VARIANT,Integer.valueOf(0)).setValue(FACING, Direction.NORTH));
    }
    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        return BOX;
    }
    @Nullable
    @Override
    public TileEntity newBlockEntity(IBlockReader p_196283_1_) {
        return new RiceCauldronTileEntity() ;
    }
    public BlockRenderType getRenderShape(BlockState p_149645_1_) {
        return BlockRenderType.MODEL;
    }
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(VARIANT,FACING);
    }
    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {
           if(world.getBlockEntity(pos)instanceof RiceCauldronTileEntity) {
               RiceCauldronTileEntity  tileEntity= (RiceCauldronTileEntity) world.getBlockEntity(pos);
               if(state.getValue(VARIANT)==0){
                   world.setBlockAndUpdate(pos,this.defaultBlockState().setValue(VARIANT,Integer.valueOf(1)));
                   world.playSound((PlayerEntity) null,pos,SoundEvents.BARREL_CLOSE,SoundCategory.BLOCKS,1F,1F);
                   return ActionResultType.SUCCESS;
               }else if(state.getValue(VARIANT)==1){
                   if(player.getItemInHand(hand).getItem()== ItemAndBlockRegister.RawRice.get()){
                       tileEntity.setItem(0, new ItemStack(ItemAndBlockRegister.Rice.get(),player.getItemInHand(hand).getCount()));
                       player.setItemInHand(hand,ItemStack.EMPTY);
                       world.playSound((PlayerEntity) null,pos, SoundEvents.ITEM_PICKUP, SoundCategory.BLOCKS,1F,1F);
                       //world.setBlockAndUpdate(pos,this.defaultBlockState().setValue(VARIANT,Integer.valueOf(2)));
                       return ActionResultType.SUCCESS;
                   }else{
                       world.playSound((PlayerEntity) null,pos,SoundEvents.BARREL_CLOSE,SoundCategory.BLOCKS,1F,1F);
                       world.setBlockAndUpdate(pos,this.defaultBlockState().setValue(VARIANT,Integer.valueOf(0)));
                       return ActionResultType.SUCCESS;
                   }
               }else if(state.getValue(VARIANT)==3){
                   world.setBlockAndUpdate(pos,this.defaultBlockState().setValue(VARIANT,Integer.valueOf(4)));
                   world.playSound((PlayerEntity) null,pos,SoundEvents.BARREL_CLOSE,SoundCategory.BLOCKS,1F,1F);

                   return ActionResultType.SUCCESS;
               }else if(state.getValue(VARIANT)==4){
                   ItemEntity itemEntity=new ItemEntity(world,(double) pos.getX()+0.5D,(double) pos.getY()+0.5D,(double) pos.getZ()+0.5D);
                  itemEntity.setItem(tileEntity.getItem(1));
                  world.addFreshEntity(itemEntity);
                   world.playSound((PlayerEntity) null,pos,SoundEvents.ITEM_PICKUP,SoundCategory.BLOCKS,1F,1F);
                   tileEntity.setItem(1,ItemStack.EMPTY);
                   return ActionResultType.SUCCESS;
               }

        }
        return ActionResultType.FAIL;
    }
    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState state, World world, BlockPos pos, Random random) {
        if(state.getValue(VARIANT)==3||state.getValue(VARIANT)==4) {
            double d0 = (double) pos.getX() + random.nextInt(10) * 0.1D;
            double d1 = (double) pos.getY() + random.nextInt(10) * 0.1D;
            double d2 = (double) pos.getZ() + random.nextInt(10) * 0.1D;
            double d3 = (double) pos.getX() + random.nextInt(10) * 0.1D;
            double d4 = (double) pos.getY() + random.nextInt(10) * 0.1D;
            double d5 = (double) pos.getZ() + random.nextInt(10) * 0.1D;
            world.addParticle(ParticleTypes.SMOKE, d0, d1, d2, 0.0D, 0.1D, 0.0D);
            world.addParticle(ParticleTypes.CLOUD, d3, d4, d5, 0.0D, 0.1D, 0.0D);
        }
    }
    public BlockState rotate(BlockState p_185499_1_, Rotation p_185499_2_) {
        return p_185499_1_.setValue(FACING, p_185499_2_.rotate(p_185499_1_.getValue(FACING)));
    }

    public BlockState mirror(BlockState p_185471_1_, Mirror p_185471_2_) {
        return p_185471_1_.rotate(p_185471_2_.getRotation(p_185471_1_.getValue(FACING)));
    }
    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
        return this.defaultBlockState().setValue(FACING, p_196258_1_.getHorizontalDirection().getOpposite());
    }
    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable IBlockReader reader, List<ITextComponent> list, ITooltipFlag flag) {
        list.add((new TranslationTextComponent("info.urushi.ricecauldron" )).withStyle(TextFormatting.GRAY));
    }
}

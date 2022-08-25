package com.iwaliner.urushi.Block;

import com.iwaliner.urushi.TileEntity.RiceHokoraTileEntity;
import com.iwaliner.urushi.TileEntity.WoodenCabinetryTileEntity;
import com.iwaliner.urushi.UrushiUtils;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class RIceHokoraBlock extends AbstractHasReiryokuBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    private static final VoxelShape box = Block.box(1D, 0D, 1D, 15D, 16D, 15D);

    public RIceHokoraBlock(AbstractBlock.Properties p_i49996_1_) {
        super(p_i49996_1_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(NORTH, Boolean.valueOf(false)).setValue(SOUTH, Boolean.valueOf(false)).setValue(EAST, Boolean.valueOf(false)).setValue(WEST, Boolean.valueOf(false)).setValue(UP, Boolean.valueOf(false)).setValue(DOWN, Boolean.valueOf(false)));
    }
    @Override
    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return box;
    }
    @Nullable
    public TileEntity newBlockEntity(IBlockReader p_196283_1_) {
        return new RiceHokoraTileEntity();
    }

    public BlockRenderType getRenderShape(BlockState p_149645_1_) {
        return BlockRenderType.MODEL;
    }
    public BlockState rotate(BlockState p_185499_1_, Rotation p_185499_2_) {
        return p_185499_1_.setValue(FACING, p_185499_2_.rotate(p_185499_1_.getValue(FACING)));
    }

    public BlockState mirror(BlockState p_185471_1_, Mirror p_185471_2_) {
        return p_185471_1_.rotate(p_185471_2_.getRotation(p_185471_1_.getValue(FACING)));
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(FACING,NORTH, EAST, WEST, SOUTH,UP,DOWN,ZERO);
    }

    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
        return this.defaultBlockState().setValue(FACING, p_196258_1_.getHorizontalDirection().getOpposite());
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {
        if(!UrushiUtils.isReiryokuStack(player.getItemInHand(hand))){
            if(world.getBlockEntity(pos)instanceof RiceHokoraTileEntity) {
                RiceHokoraTileEntity  tileEntity= (RiceHokoraTileEntity) world.getBlockEntity(pos);
                player.displayClientMessage(new TranslationTextComponent("stored Reiryoku"+" : "+tileEntity.getStoredReiryoku()+" / "+tileEntity.getMaxReiryoku()).withStyle(TextFormatting.RED),true);
                return ActionResultType.SUCCESS;
            }
        }
        return ActionResultType.FAIL;
    }
}

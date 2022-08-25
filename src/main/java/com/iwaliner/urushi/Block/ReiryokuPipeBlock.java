package com.iwaliner.urushi.Block;

import com.google.common.collect.Maps;
import com.iwaliner.urushi.BlocksRegister;
import com.iwaliner.urushi.TileEntity.ReiryokuPipeTileEntity;
import com.iwaliner.urushi.TileEntity.RiceHokoraTileEntity;
import com.iwaliner.urushi.UrushiUtils;
import net.minecraft.advancements.criterion.PlayerEntityInteractionTrigger;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ContainerBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.Random;

public class ReiryokuPipeBlock extends AbstractHasReiryokuBlock {
    public static final DirectionProperty FACING = BlockStateProperties.FACING;


    private static final VoxelShape centerBox = Block.box(4D, 4D, 4D, 12D, 12D, 12D);
    private static final VoxelShape box1 = Block.box(0D, 4D, 4D, 4D, 12D, 12D);
    private static final VoxelShape box2 = Block.box(12D, 4D, 4D, 16D, 12D, 12D);
    private static final VoxelShape box3 = Block.box(4D, 4D, 0D, 12D, 12D, 4D);
    private static final VoxelShape box4 = Block.box(4D, 4D, 12D, 12D, 12D, 16D);
    private static final VoxelShape box5 = Block.box(4D, 0D, 4D, 12D, 4D, 12D);
    private static final VoxelShape box6 = Block.box(4D, 12D, 4D, 12D, 16D, 12D);
    private static final VoxelShape aabbNS = VoxelShapes.or(centerBox, box3,box4);
    private static final VoxelShape aabbEW = VoxelShapes.or(centerBox, box1,box2);
    private static final VoxelShape aabbUD = VoxelShapes.or(centerBox, box5,box6);


    public ReiryokuPipeBlock(Properties p_i49996_1_) {
        super(p_i49996_1_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(ZERO, Boolean.valueOf(true)).setValue(NORTH, Boolean.valueOf(false)).setValue(SOUTH, Boolean.valueOf(false)).setValue(EAST, Boolean.valueOf(false)).setValue(WEST, Boolean.valueOf(false)).setValue(UP, Boolean.valueOf(false)).setValue(DOWN, Boolean.valueOf(false)));
    }
    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
       Direction facing=state.getValue(FACING);
       Boolean isOppositeTrue=state.getValue(PROPERTY_BY_DIRECTION.get(facing.getOpposite()));
       if(isOppositeTrue) {
           if (facing == Direction.NORTH || facing == Direction.SOUTH) {
               return aabbNS;
           } else if (facing == Direction.WEST || facing == Direction.EAST) {
               return aabbEW;
           } else {
               return aabbUD;
           }
       }else{
               VoxelShape currentShape=VoxelShapes.or(centerBox,this.getShapeFacing(state),state.getValue(NORTH)?box3:centerBox,state.getValue(SOUTH)?box4:centerBox,state.getValue(WEST)?box1:centerBox,state.getValue(EAST)?box2:centerBox,state.getValue(DOWN)?box5:centerBox,state.getValue(UP)?box6:centerBox);
          return currentShape;

       }
    }
    private VoxelShape getShapeFacing(BlockState state){
       Direction direction= state.getValue(FACING);
        switch (UrushiUtils.getIntFromDirection(direction)){
            case 0: return box5;
            case 1: return box6;
            case 2: return box3;
            case 3: return box4;
            case 4: return box1;
            case 5: return box2;
            default:return centerBox;
        }
    }
    @Nullable
    public TileEntity newBlockEntity(IBlockReader p_196283_1_) {
        return new ReiryokuPipeTileEntity();
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
        p_206840_1_.add(FACING,ZERO,NORTH, EAST, WEST, SOUTH,UP,DOWN);
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        IBlockReader iblockreader = context.getLevel();
        BlockPos blockpos = context.getClickedPos();
        BlockState thisState=iblockreader.getBlockState(blockpos);
        BlockState nState = iblockreader.getBlockState(blockpos.north());
        BlockState eState = iblockreader.getBlockState(blockpos.east());
        BlockState sState = iblockreader.getBlockState(blockpos.south());
        BlockState wState = iblockreader.getBlockState(blockpos.west());
        BlockState aState = iblockreader.getBlockState(blockpos.above());
        BlockState bState = iblockreader.getBlockState(blockpos.below());
        BlockState state=this.defaultBlockState().setValue(NORTH, Boolean.valueOf(this.connectsTo(thisState, nState)))
                .setValue(SOUTH, Boolean.valueOf(this.connectsTo(thisState, sState)))
                .setValue(WEST, Boolean.valueOf(this.connectsTo(thisState, wState)))
                .setValue(EAST, Boolean.valueOf(this.connectsTo(thisState, eState)))
                .setValue(UP, Boolean.valueOf(this.connectsTo(thisState, aState)))
                .setValue(DOWN, Boolean.valueOf(this.connectsTo(thisState, bState)));
        return state.setValue(FACING,context.getPlayer().isSuppressingBounce()? context.getNearestLookingDirection():context.getNearestLookingDirection().getOpposite());
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {
       if(!UrushiUtils.isReiryokuStack(player.getItemInHand(hand))){
            if(world.getBlockEntity(pos)instanceof ReiryokuPipeTileEntity) {
                ReiryokuPipeTileEntity  tileEntity= (ReiryokuPipeTileEntity) world.getBlockEntity(pos);
                player.displayClientMessage(new TranslationTextComponent("stored Reiryoku"+" : "+tileEntity.getStoredReiryoku()+" / "+tileEntity.getMaxReiryoku()).withStyle(TextFormatting.YELLOW),true);
                return ActionResultType.SUCCESS;
            }

        }
        return ActionResultType.FAIL;
    }
    @Override
    public boolean canSurvive(BlockState state, IWorldReader world, BlockPos pos) {
        if(UrushiUtils.getPipeAmountNear((World) world,pos)>2){
           return false;
        }else{
            return true;
        }
    }

    @Override
    public void neighborChanged(BlockState state, World world, BlockPos pos, Block block, BlockPos neighbor, boolean boo) {
        if(UrushiUtils.getPipeAmountNear( world,pos)>2){
           world.destroyBlock(pos,true);
        }
    }
}

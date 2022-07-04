package com.iwaliner.urushi.Block;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoorHingeSide;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

public class SlideDoorBlock extends Block {
    public static final DirectionProperty FACING = HorizontalBlock.FACING;
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
    protected static final VoxelShape SOUTH_CLOSED = Block.box(0.0D, 0.0D, 8D, 16.0D, 16.0D, 9D);
    protected static final VoxelShape NORTH_CLOSED = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 8.0D);
    protected static final VoxelShape WEST_CLOSED = Block.box(7.0D, 0.0D, 0.0D, 8.0D, 16.0D, 16.0D);
    protected static final VoxelShape EAST_CLOSED = Block.box(8.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D);
    //protected static final VoxelShape SOUTH_OPEN = Block.box(0.0D, 0.0D, 8D, 3.0D, 16.0D, 9D);
    //protected static final VoxelShape NORTH_OPEN = Block.box(13.0D, 0.0D, 7.0D, 16.0D, 16.0D, 8.0D);
    //protected static final VoxelShape WEST_OPEN = Block.box(7.0D, 0.0D, 0.0D, 8.0D, 16.0D, 3.0D);
    //protected static final VoxelShape EAST_OPEN = Block.box(8.0D, 0.0D, 13.0D, 9.0D, 16.0D, 16.0D);
    protected static final VoxelShape SOUTH_OPEN = Block.box(-13D, 0.0D, 8D, 3.0D, 16.0D, 9D);
    protected static final VoxelShape NORTH_OPEN = Block.box(13.0D, 0.0D, 7.0D, 29D, 16.0D, 8.0D);
    protected static final VoxelShape WEST_OPEN = Block.box(7.0D, 0.0D, -13D, 8.0D, 16.0D, 3.0D);
    protected static final VoxelShape EAST_OPEN = Block.box(8.0D, 0.0D, 13.0D, 9.0D, 16.0D, 29D);

    public SlideDoorBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(OPEN, Boolean.valueOf(false)).setValue(POWERED, Boolean.valueOf(false)).setValue(HALF, DoubleBlockHalf.LOWER));

    }
    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext selectionContext) {
        Direction direction = state.getValue(FACING);
        boolean flag = !state.getValue(OPEN);
        switch(direction) {
            case EAST:
            default:
                return flag ? EAST_CLOSED : EAST_OPEN;
            case SOUTH:
                return flag ? SOUTH_CLOSED : SOUTH_OPEN;
            case WEST:
                return flag ? WEST_CLOSED : WEST_OPEN;
            case NORTH:
                return flag ? NORTH_CLOSED : NORTH_OPEN;
        }
    }
    public BlockState updateShape(BlockState state, Direction direction, BlockState state2, IWorld world, BlockPos pos, BlockPos pos2) {
        DoubleBlockHalf doubleblockhalf = state.getValue(HALF);
        if (direction.getAxis() == Direction.Axis.Y && doubleblockhalf == DoubleBlockHalf.LOWER == (direction == Direction.UP)) {
            return state2.is(this) && state2.getValue(HALF) != doubleblockhalf ? state.setValue(FACING, state2.getValue(FACING)).setValue(OPEN, state2.getValue(OPEN)).setValue(POWERED, state2.getValue(POWERED)) : Blocks.AIR.defaultBlockState();
        } else {
            return doubleblockhalf == DoubleBlockHalf.LOWER && direction == Direction.DOWN && !state.canSurvive(world, pos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, direction, state2, world, pos, pos2);
        }
    }
    public void playerWillDestroy(World world, BlockPos pos, BlockState state, PlayerEntity entity) {
        if (!world.isClientSide && entity.isCreative()) {
            this.preventCreativeDropFromBottomPart(world, pos, state, entity);
        }

        super.playerWillDestroy(world, pos, state, entity);
    }
    protected static void preventCreativeDropFromBottomPart(World world, BlockPos pos, BlockState state, PlayerEntity entity) {
        DoubleBlockHalf doubleblockhalf = state.getValue(HALF);
        if (doubleblockhalf == DoubleBlockHalf.UPPER) {
            BlockPos blockpos = pos.below();
            BlockState blockstate = world.getBlockState(blockpos);
            if (blockstate.getBlock() == state.getBlock() && blockstate.getValue(HALF) == DoubleBlockHalf.LOWER) {
                world.setBlock(blockpos, Blocks.AIR.defaultBlockState(), 35);
                world.levelEvent(entity, 2001, blockpos, Block.getId(blockstate));
            }
        }

    }
    public boolean isPathfindable(BlockState state, IBlockReader blockReader, BlockPos pos, PathType type) {
        switch(type) {
            case LAND:
                return state.getValue(OPEN);
            case WATER:
                return false;
            case AIR:
                return state.getValue(OPEN);
            default:
                return false;
        }
    }



    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockPos blockpos = context.getClickedPos();
        if (blockpos.getY() < 255 && context.getLevel().getBlockState(blockpos.above()).canBeReplaced(context)) {
            World world = context.getLevel();
            boolean flag = world.hasNeighborSignal(blockpos) || world.hasNeighborSignal(blockpos.above());

            return context.getPlayer().isSuppressingBounce()?
                      this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(POWERED, Boolean.valueOf(flag)).setValue(OPEN, Boolean.valueOf(flag)).setValue(HALF, DoubleBlockHalf.LOWER)
                    : this.defaultBlockState().setValue(FACING, context.getHorizontalDirection()).setValue(POWERED, Boolean.valueOf(flag)).setValue(OPEN, Boolean.valueOf(flag)).setValue(HALF, DoubleBlockHalf.LOWER);
        } else {
            return null;
        }
    }

    public void setPlacedBy(World p_180633_1_, BlockPos p_180633_2_, BlockState p_180633_3_, LivingEntity p_180633_4_, ItemStack p_180633_5_) {
        p_180633_1_.setBlock(p_180633_2_.above(), p_180633_3_.setValue(HALF, DoubleBlockHalf.UPPER), 3);
    }
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {

            state = state.cycle(OPEN);
            world.setBlock(pos, state, 10);
            world.playSound(player, pos,  SoundEvents.BARREL_OPEN, SoundCategory.BLOCKS, 1.0F, 1.0F);

           return ActionResultType.sidedSuccess(world.isClientSide);

    }

    public boolean isOpen(BlockState state) {
        return state.getValue(OPEN);
    }

    public void setOpen(World world, BlockState state, BlockPos pos, boolean boo) {
        if (state.is(this) && state.getValue(OPEN) != boo) {
            world.setBlock(pos, state.setValue(OPEN, Boolean.valueOf(boo)), 10);
           world.playSound((PlayerEntity) null, pos, SoundEvents.BARREL_OPEN, SoundCategory.BLOCKS, 1.0F, 1.0F);

        }
    }

    public void neighborChanged(BlockState state, World world, BlockPos pos, Block block, BlockPos pos2, boolean boo) {
        boolean flag = world.hasNeighborSignal(pos) || world.hasNeighborSignal(pos.relative(state.getValue(HALF) == DoubleBlockHalf.LOWER ? Direction.UP : Direction.DOWN));
        if (block != this && flag != state.getValue(POWERED)) {
            if (flag != state.getValue(OPEN)) {
               world.playSound((PlayerEntity) null, pos, SoundEvents.BARREL_OPEN, SoundCategory.BLOCKS, 1.0F, 1.0F);

            }

            world.setBlock(pos, state.setValue(POWERED, Boolean.valueOf(flag)).setValue(OPEN, Boolean.valueOf(flag)), 2);
        }

    }

    public boolean canSurvive(BlockState state, IWorldReader reader, BlockPos pos2) {
        BlockPos blockpos = pos2.below();
        BlockState blockstate = reader.getBlockState(blockpos);
        return state.getValue(HALF) == DoubleBlockHalf.LOWER ? blockstate.isFaceSturdy(reader, blockpos, Direction.UP) : blockstate.is(this);
    }

  

    public PushReaction getPistonPushReaction(BlockState state) {
        return PushReaction.DESTROY;
    }

    public BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirror) {
        return mirror == Mirror.NONE ? state : state.rotate(mirror.getRotation(state.getValue(FACING)));
    }

    @OnlyIn(Dist.CLIENT)
    public long getSeed(BlockState state, BlockPos pos) {
        return MathHelper.getSeed(pos.getX(), pos.below(state.getValue(HALF) == DoubleBlockHalf.LOWER ? 0 : 1).getY(), pos.getZ());
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(HALF, FACING, OPEN, POWERED);
    }
    public boolean useShapeForLightOcclusion(BlockState p_220074_1_) {
        return true;
    }

}

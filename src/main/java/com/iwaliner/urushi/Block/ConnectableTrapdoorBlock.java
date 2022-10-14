package com.iwaliner.urushi.Block;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.TrapDoorBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.Half;
import net.minecraft.util.Direction;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

import java.util.Map;

public class ConnectableTrapdoorBlock extends TrapDoorBlock {
    public static final BooleanProperty NORTH = BlockStateProperties.NORTH;
    public static final BooleanProperty EAST = BlockStateProperties.EAST;
    public static final BooleanProperty SOUTH = BlockStateProperties.SOUTH;
    public static final BooleanProperty WEST = BlockStateProperties.WEST;
    public static final BooleanProperty UP = BlockStateProperties.UP;
    public static final BooleanProperty DOWN = BlockStateProperties.DOWN;
    public static final Map<Direction, BooleanProperty> PROPERTY_BY_DIRECTION = Util.make(Maps.newEnumMap(Direction.class), (p_203421_0_) -> {
        p_203421_0_.put(Direction.NORTH, NORTH);
        p_203421_0_.put(Direction.EAST, EAST);
        p_203421_0_.put(Direction.SOUTH, SOUTH);
        p_203421_0_.put(Direction.WEST, WEST);
        p_203421_0_.put(Direction.UP, UP);
        p_203421_0_.put(Direction.DOWN, DOWN);
    });
    public ConnectableTrapdoorBlock(Properties p_i48307_1_) {
        super(p_i48307_1_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(OPEN, Boolean.valueOf(false)).setValue(HALF, Half.BOTTOM).setValue(POWERED, Boolean.valueOf(false)).setValue(WATERLOGGED, Boolean.valueOf(false)).setValue(UP,Boolean.valueOf(false)).setValue(DOWN,Boolean.valueOf(false)).setValue(NORTH,Boolean.valueOf(false)).setValue(SOUTH,Boolean.valueOf(false)).setValue(WEST,Boolean.valueOf(false)).setValue(EAST,Boolean.valueOf(false)));

    }
    public boolean connectsTo(BlockState thisState, BlockState nextState) {
        if(nextState.getBlock() instanceof ConnectableTrapdoorBlock&&thisState.getBlock() instanceof ConnectableTrapdoorBlock) {
           return thisState.getBlock() == nextState.getBlock();
        }else{
            return false;
        }
    }
    public boolean connectsToByFacing(BlockState thisState, Direction direction, IWorld world, BlockPos pos) {
        BlockPos offsetPos = pos;

        if (direction== Direction.NORTH) {
            offsetPos = pos.north();
        } else if (direction == Direction.SOUTH) {
            offsetPos = pos.south();
        } else if (direction == Direction.WEST) {
            offsetPos = pos.west();
        } else if (direction == Direction.EAST) {
            offsetPos = pos.east();
        }else if (direction == Direction.UP) {
            offsetPos = pos.above();
        }else if (direction == Direction.DOWN) {
            offsetPos = pos.below();
        }

        if(world.getBlockState(offsetPos).getBlock() instanceof ConnectableTrapdoorBlock) {
                return thisState.getBlock() == world.getBlockState(offsetPos).getBlock();
        }else{
            return false;
        }
    }
    public BlockState updateShape(BlockState state1, Direction facing, BlockState state2, IWorld world, BlockPos pos1, BlockPos pos2) {
            return state1.setValue(PROPERTY_BY_DIRECTION.get(facing), Boolean.valueOf(this.connectsToByFacing(state1, facing, world, pos1)));

    }
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(FACING, OPEN, HALF, POWERED, WATERLOGGED,UP,DOWN,NORTH,SOUTH,EAST,WEST);
    }
    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
        IBlockReader iblockreader = p_196258_1_.getLevel();
        BlockPos blockpos = p_196258_1_.getClickedPos();
        BlockState thisState=iblockreader.getBlockState(blockpos);
        BlockState aState = iblockreader.getBlockState(blockpos.above());
        BlockState bState = iblockreader.getBlockState(blockpos.below());
        BlockState cState = iblockreader.getBlockState(blockpos.north());
        BlockState dState = iblockreader.getBlockState(blockpos.south());
        BlockState eState = iblockreader.getBlockState(blockpos.west());
        BlockState fState = iblockreader.getBlockState(blockpos.east());

        return super.getStateForPlacement(p_196258_1_)
                .setValue(UP, Boolean.valueOf(this.connectsTo(thisState, aState)))
                .setValue(DOWN, Boolean.valueOf(this.connectsTo(thisState, bState)))
                .setValue(NORTH, Boolean.valueOf(this.connectsTo(thisState, cState)))
                .setValue(SOUTH, Boolean.valueOf(this.connectsTo(thisState, dState)))
                .setValue(WEST, Boolean.valueOf(this.connectsTo(thisState, eState)))
                .setValue(EAST, Boolean.valueOf(this.connectsTo(thisState, fState)))
                ;
    }

}

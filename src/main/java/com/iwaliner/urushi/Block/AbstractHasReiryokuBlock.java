package com.iwaliner.urushi.Block;


import com.google.common.collect.Maps;
import net.minecraft.block.BlockState;
import net.minecraft.block.ContainerBlock;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;

import java.util.Map;


public abstract class AbstractHasReiryokuBlock extends ContainerBlock {
    public static final BooleanProperty NORTH = BlockStateProperties.NORTH;
    public static final BooleanProperty EAST = BlockStateProperties.EAST;
    public static final BooleanProperty SOUTH = BlockStateProperties.SOUTH;
    public static final BooleanProperty WEST = BlockStateProperties.WEST;
    public static final BooleanProperty UP = BlockStateProperties.UP;
    public static final BooleanProperty DOWN = BlockStateProperties.DOWN;
    public static final BooleanProperty ZERO = BooleanProperty.create("zero");
    public AbstractHasReiryokuBlock(Properties p_i49996_1_) {
        super(p_i49996_1_);
          }
    public static final Map<Direction, BooleanProperty> PROPERTY_BY_DIRECTION = Util.make(Maps.newEnumMap(Direction.class), (p_203421_0_) -> {
        p_203421_0_.put(Direction.NORTH, NORTH);
        p_203421_0_.put(Direction.EAST, EAST);
        p_203421_0_.put(Direction.SOUTH, SOUTH);
        p_203421_0_.put(Direction.WEST, WEST);
        p_203421_0_.put(Direction.UP, UP);
        p_203421_0_.put(Direction.DOWN, DOWN);
    });
    public boolean connectsTo(BlockState thisState,BlockState nextState) {
        if(nextState.getBlock() instanceof AbstractHasReiryokuBlock&&thisState.getBlock() instanceof AbstractHasReiryokuBlock) {
            return true;
        }else{
            return false;
        }
    }

    public boolean connectsToByFacing(BlockState thisState, Direction direction, IWorld world, BlockPos pos) {

        if(world.getBlockState(pos.relative(direction)).getBlock() instanceof AbstractHasReiryokuBlock) {
            return true;
        }else{
            return false;
        }
    }
    public BlockState updateShape(BlockState state1, Direction facing, BlockState state2, IWorld world, BlockPos pos1, BlockPos pos2) {
        return state1.setValue(PROPERTY_BY_DIRECTION.get(facing), Boolean.valueOf(this.connectsToByFacing(state1,facing,world,pos1))) ;
    }
}

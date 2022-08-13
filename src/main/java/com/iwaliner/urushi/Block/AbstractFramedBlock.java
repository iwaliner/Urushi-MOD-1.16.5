package com.iwaliner.urushi.Block;

import com.google.common.collect.Maps;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public class AbstractFramedBlock extends Block {
    private static final Direction[] DIRECTIONS = Direction.values();
    public static final BooleanProperty NORTH = BlockStateProperties.NORTH;
    public static final BooleanProperty EAST = BlockStateProperties.EAST;
    public static final BooleanProperty SOUTH = BlockStateProperties.SOUTH;
    public static final BooleanProperty WEST = BlockStateProperties.WEST;
    public static final BooleanProperty UP = BlockStateProperties.UP;
    public static final BooleanProperty DOWN = BlockStateProperties.DOWN;
    public static final BooleanProperty VARIANT = BooleanProperty.create("variant");
    public static final Map<Direction, BooleanProperty> PROPERTY_BY_DIRECTION = Util.make(Maps.newEnumMap(Direction.class), (p_203421_0_) -> {
        p_203421_0_.put(Direction.NORTH, NORTH);
        p_203421_0_.put(Direction.EAST, EAST);
        p_203421_0_.put(Direction.SOUTH, SOUTH);
        p_203421_0_.put(Direction.WEST, WEST);
        p_203421_0_.put(Direction.UP, UP);
        p_203421_0_.put(Direction.DOWN, DOWN);
    });


    public AbstractFramedBlock( AbstractBlock.Properties p_i48355_2_) {
        super(p_i48355_2_);
    }



    public boolean propagatesSkylightDown(BlockState p_200123_1_, IBlockReader p_200123_2_, BlockPos p_200123_3_) {
        return false;
    }
    public boolean connectsTo(BlockState thisState,BlockState nextState) {
        if(nextState.getBlock() instanceof AbstractFramedBlock&&thisState.getBlock() instanceof AbstractFramedBlock) {
            if(nextState.getValue(VARIANT)==thisState.getValue(VARIANT)) {
                return thisState.getBlock() == nextState.getBlock();
            }else{
                return false;
            }
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

        if(world.getBlockState(offsetPos).getBlock() instanceof AbstractFramedBlock) {
            if(world.getBlockState(offsetPos).getValue(VARIANT)==thisState.getValue(VARIANT)) {
                return thisState.getBlock() == world.getBlockState(offsetPos).getBlock();
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public BlockState rotate(BlockState p_185499_1_, Rotation p_185499_2_) {
        switch(p_185499_2_) {
            case CLOCKWISE_180:
                return p_185499_1_.setValue(NORTH, p_185499_1_.getValue(SOUTH)).setValue(EAST, p_185499_1_.getValue(WEST)).setValue(SOUTH, p_185499_1_.getValue(NORTH)).setValue(WEST, p_185499_1_.getValue(EAST));
            case COUNTERCLOCKWISE_90:
                return p_185499_1_.setValue(NORTH, p_185499_1_.getValue(EAST)).setValue(EAST, p_185499_1_.getValue(SOUTH)).setValue(SOUTH, p_185499_1_.getValue(WEST)).setValue(WEST, p_185499_1_.getValue(NORTH));
            case CLOCKWISE_90:
                return p_185499_1_.setValue(NORTH, p_185499_1_.getValue(WEST)).setValue(EAST, p_185499_1_.getValue(NORTH)).setValue(SOUTH, p_185499_1_.getValue(EAST)).setValue(WEST, p_185499_1_.getValue(SOUTH));
            default:
                return p_185499_1_;
        }
    }

    public BlockState mirror(BlockState p_185471_1_, Mirror p_185471_2_) {
        switch(p_185471_2_) {
            case LEFT_RIGHT:
                return p_185471_1_.setValue(NORTH, p_185471_1_.getValue(SOUTH)).setValue(SOUTH, p_185471_1_.getValue(NORTH));
            case FRONT_BACK:
                return p_185471_1_.setValue(EAST, p_185471_1_.getValue(WEST)).setValue(WEST, p_185471_1_.getValue(EAST));
            default:
                return super.mirror(p_185471_1_, p_185471_2_);
        }
    }
    public BlockState updateShape(BlockState state1, Direction facing, BlockState state2, IWorld world, BlockPos pos1, BlockPos pos2) {
        return state1.setValue(PROPERTY_BY_DIRECTION.get(facing), Boolean.valueOf(this.connectsToByFacing(state1,facing,world,pos1))) ;
    }
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(NORTH, EAST, WEST, SOUTH,UP,DOWN,VARIANT);
    }
    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
        IBlockReader iblockreader = p_196258_1_.getLevel();
        BlockPos blockpos = p_196258_1_.getClickedPos();
        BlockState thisState=iblockreader.getBlockState(blockpos);
        BlockPos blockpos1 = blockpos.north();
        BlockPos blockpos2 = blockpos.east();
        BlockPos blockpos3 = blockpos.south();
        BlockPos blockpos4 = blockpos.west();
        BlockPos blockpos5 = blockpos.above();
        BlockPos blockpos6 = blockpos.below();
        BlockState nState = iblockreader.getBlockState(blockpos1);
        BlockState eState = iblockreader.getBlockState(blockpos2);
        BlockState sState = iblockreader.getBlockState(blockpos3);
        BlockState wState = iblockreader.getBlockState(blockpos4);
        BlockState aState = iblockreader.getBlockState(blockpos5);
        BlockState bState = iblockreader.getBlockState(blockpos6);

        return super.getStateForPlacement(p_196258_1_).setValue(NORTH, Boolean.valueOf(this.connectsTo(thisState, nState)))
                .setValue(SOUTH, Boolean.valueOf(this.connectsTo(thisState, sState)))
                .setValue(WEST, Boolean.valueOf(this.connectsTo(thisState, wState)))
                .setValue(EAST, Boolean.valueOf(this.connectsTo(thisState, eState)))
                .setValue(UP, Boolean.valueOf(this.connectsTo(thisState, aState)))
                .setValue(DOWN, Boolean.valueOf(this.connectsTo(thisState, bState)))
                .setValue(VARIANT, Boolean.valueOf(p_196258_1_.getPlayer().isSuppressingBounce()))
                ;

    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable IBlockReader reader, List<ITextComponent> list, ITooltipFlag flag) {
        list.add((new TranslationTextComponent("info.urushi.framed_block1" )).withStyle(TextFormatting.GRAY));
        list.add((new TranslationTextComponent("info.urushi.framed_block2" )).withStyle(TextFormatting.GRAY));

    }
}

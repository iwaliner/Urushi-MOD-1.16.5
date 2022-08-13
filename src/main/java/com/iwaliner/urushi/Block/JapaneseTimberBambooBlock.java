package com.iwaliner.urushi.Block;

import com.iwaliner.urushi.ConfigUrushi;
import net.minecraft.block.*;
import net.minecraft.block.material.PushReaction;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.fluid.FluidState;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BambooLeaves;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.PlantType;

import java.util.Random;

public class JapaneseTimberBambooBlock extends Block implements net.minecraftforge.common.IPlantable, IGrowable {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_15;
    protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);

    public JapaneseTimberBambooBlock(AbstractBlock.Properties p_i48312_1_) {
        super(p_i48312_1_);
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, Integer.valueOf(0)));
    }



    public void tick(BlockState p_225534_1_, ServerWorld p_225534_2_, BlockPos p_225534_3_, Random p_225534_4_) {
        if (!p_225534_1_.canSurvive(p_225534_2_, p_225534_3_)) {
            p_225534_2_.destroyBlock(p_225534_3_, true);
        }

    }

    public void randomTick(BlockState p_225542_1_, ServerWorld p_225542_2_, BlockPos p_225542_3_, Random random) {
        if (p_225542_2_.isEmptyBlock(p_225542_3_.above())) {
            int i;
            for(i = 1; p_225542_2_.getBlockState(p_225542_3_.below(i)).is(this); ++i) {
            }

            if (i < ConfigUrushi.maxHightBamboo.get()) {
                int j = p_225542_1_.getValue(AGE);
                if (j >0) {
                    p_225542_2_.setBlockAndUpdate(p_225542_3_.above(), this.defaultBlockState());
                    p_225542_2_.setBlock(p_225542_3_, p_225542_1_.setValue(AGE, Integer.valueOf(0)), 4);
                } else {
                    p_225542_2_.setBlock(p_225542_3_, p_225542_1_.setValue(AGE, Integer.valueOf(j + 1)), 4);

                }
            }
        }

    }

    public BlockState updateShape(BlockState p_196271_1_, Direction p_196271_2_, BlockState p_196271_3_, IWorld p_196271_4_, BlockPos p_196271_5_, BlockPos p_196271_6_) {
        if (!p_196271_1_.canSurvive(p_196271_4_, p_196271_5_)) {
            p_196271_4_.getBlockTicks().scheduleTick(p_196271_5_, this, 1);
        }

        return super.updateShape(p_196271_1_, p_196271_2_, p_196271_3_, p_196271_4_, p_196271_5_, p_196271_6_);
    }

    public boolean canSurvive(BlockState state, IWorldReader iWorldReader, BlockPos pos) {
        BlockState soil = iWorldReader.getBlockState(pos.below());
        if (soil.canSustainPlant(iWorldReader, pos.below(), Direction.UP, this)) return true;
        BlockState blockstate = iWorldReader.getBlockState(pos.below());

        if (blockstate.getBlock() == this) {
            return true;
        } else {
            if (blockstate.is(Blocks.GRASS_BLOCK) || blockstate.is(Blocks.DIRT) || blockstate.is(Blocks.COARSE_DIRT) || blockstate.is(Blocks.PODZOL) || blockstate.is(Blocks.SAND) || blockstate.is(Blocks.RED_SAND)) {
                BlockPos blockpos = pos.below();

               return true;
            }

            return false;
        }
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(AGE);
    }

    @Override
    public net.minecraftforge.common.PlantType getPlantType(IBlockReader world, BlockPos pos) {
        return PlantType.PLAINS;
    }

    @Override
    public BlockState getPlant(IBlockReader world, BlockPos pos) {
        return defaultBlockState();
    }

    public boolean isValidBonemealTarget(IBlockReader p_176473_1_, BlockPos p_176473_2_, BlockState p_176473_3_, boolean p_176473_4_) {
        return true;
    }

    public boolean isBonemealSuccess(World p_180670_1_, Random p_180670_2_, BlockPos p_180670_3_, BlockState p_180670_4_) {
        return true;
    }

    public void performBonemeal(ServerWorld world, Random random, BlockPos pos, BlockState state) {



    }
    public PushReaction getPistonPushReaction(BlockState p_149656_1_) {
        return PushReaction.DESTROY;
    }
    public AbstractBlock.OffsetType getOffsetType() {
        return AbstractBlock.OffsetType.XZ;
    }
    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
       Vector3d vector3d = p_220053_1_.getOffset(p_220053_2_, p_220053_3_);
        return SHAPE.move(vector3d.x, vector3d.y, vector3d.z);
    }
    public VoxelShape getCollisionShape(BlockState p_220071_1_, IBlockReader p_220071_2_, BlockPos p_220071_3_, ISelectionContext p_220071_4_) {
        Vector3d vector3d = p_220071_1_.getOffset(p_220071_2_, p_220071_3_);
        return SHAPE.move(vector3d.x, vector3d.y, vector3d.z);
    }
}

package com.iwaliner.urushi.Block;

import com.iwaliner.urushi.BlocksRegister;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Random;

public class ChiseledLacquerLogBlock extends HorizontalBlock {
   public ChiseledLacquerLogBlock(Properties p_i48377_1_) {
        super(p_i48377_1_);

   }
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(FACING);
    }

    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
        return this.defaultBlockState().setValue(FACING, p_196258_1_.getHorizontalDirection().getOpposite());
    }
    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState state, World world, BlockPos pos, Random random) {

           BlockPos offsetPos = pos;
           if (state.getValue(FACING) == Direction.NORTH) {
               offsetPos = pos.north();
           } else if (state.getValue(FACING) == Direction.SOUTH) {
               offsetPos = pos.south();
           } else if (state.getValue(FACING) == Direction.WEST) {
               offsetPos = pos.west();
           } else if (state.getValue(FACING) == Direction.EAST) {
               offsetPos = pos.east();
           }
           double d0 = (double) offsetPos.getX() +random.nextInt(16)*0.1D;
           double d1 = (double) offsetPos.getY() +random.nextInt(8)*0.1D;
           double d2 = (double) offsetPos.getZ() +random.nextInt(16)*0.1D;
           world.addParticle(ParticleTypes.FALLING_HONEY, d0, d1, d2, 0.0D, 0D, 0.0D);

    }
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
       if(BlocksRegister.RawUrushiLayer.isPresent()) {
           BlockPos offsetPos = pos;
           if (state.getValue(FACING) == Direction.NORTH) {
               offsetPos = pos.north();
           } else if (state.getValue(FACING) == Direction.SOUTH) {
               offsetPos = pos.south();
           } else if (state.getValue(FACING) == Direction.WEST) {
               offsetPos = pos.west();
           } else if (state.getValue(FACING) == Direction.EAST) {
               offsetPos = pos.east();
           }

           for (int i = 1; i < 255; ++i) {
               if (!world.isEmptyBlock(offsetPos.below(i))&&world.getBlockState(offsetPos.below(i)).getBlock()!= BlocksRegister.RawUrushiLayer.get()) {
                   world.setBlockAndUpdate(offsetPos.below(i - 1), BlocksRegister.RawUrushiLayer.get().defaultBlockState());
                   break;
               } else {
                   continue;
               }
           }

       }
        }

    }


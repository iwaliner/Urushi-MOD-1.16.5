package com.iwaliner.urushi.Block;

import com.iwaliner.urushi.BlocksRegister;
import net.minecraft.block.BlockState;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class LacquerLogBlock extends RotatedPillarBlock {
    public LacquerLogBlock( Properties p_i48339_1_) {
        super(p_i48339_1_);
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {

if(BlocksRegister.ChiseledLacquerLog.isPresent()) {
    if(result.getDirection()!=Direction.UP&&result.getDirection()!=Direction.DOWN){
    if (player.getItemInHand(hand).getItem() instanceof ToolItem || player.getItemInHand(hand).getItem() == Items.FLINT) {
        world.setBlock(pos, BlocksRegister.ChiseledLacquerLog.get().defaultBlockState().setValue(ChiseledLacquerLogBlock.FACING, result.getDirection()), 4);
        world.playSound(player, pos, SoundEvents.WOOD_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);

    }}
        return ActionResultType.SUCCESS;

}else{
            return ActionResultType.FAIL;
        }
    }
}

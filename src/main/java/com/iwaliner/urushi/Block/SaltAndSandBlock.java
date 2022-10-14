package com.iwaliner.urushi.Block;

import com.iwaliner.urushi.ItemAndBlockRegister;
import com.iwaliner.urushi.ItemAndBlockRegister;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FallingBlock;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.Tags;

import javax.annotation.Nullable;
import java.util.List;

public class SaltAndSandBlock extends FallingBlock {
    public SaltAndSandBlock(Properties p_i48401_1_) {
        super(p_i48401_1_);
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {
        ItemEntity entity = new ItemEntity(world,pos.getX()+0.5D, pos.getY()+1.5D, pos.getZ()+0.5D, new ItemStack(ItemAndBlockRegister.salt.get()));
        world.addFreshEntity(entity);
        world.setBlock(pos, Blocks.SAND.defaultBlockState(),2);
        world.playSound((PlayerEntity) null,pos, SoundEvents.SAND_BREAK, SoundCategory.BLOCKS, 1.0F, 1F);
        return ActionResultType.SUCCESS;
    }
    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable IBlockReader reader, List<ITextComponent> list, ITooltipFlag flag) {
        list.add((new TranslationTextComponent("info.urushi.saltandsand" )).withStyle(TextFormatting.GRAY));
    }
}

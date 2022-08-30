package com.iwaliner.urushi.Item;

import com.iwaliner.urushi.Entity.CushionEntity;
import com.iwaliner.urushi.Entity.FoodEntity.FoodEntity;
import com.iwaliner.urushi.EntityRegister;
import com.iwaliner.urushi.UrushiUtils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.server.ServerWorld;

public class CushionItem extends Item {
    private DyeColor color;
    public CushionItem(DyeColor dyeColor, Properties p_i48487_1_) {
        super(p_i48487_1_);
        this.color=dyeColor;
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {

       if (!(context.getLevel() instanceof ServerWorld)) {
            return ActionResultType.SUCCESS;
        }

            Vector3d vector3d = Vector3d.atBottomCenterOf(context.getClickedPos());
            AxisAlignedBB axisalignedbb = EntityRegister.CushionEntity.get().getDimensions().makeBoundingBox(vector3d.x(), vector3d.y(), vector3d.z());
            if (context.getLevel().getEntities((Entity) null, axisalignedbb).isEmpty()) {
                CushionEntity entity = new CushionEntity(context.getLevel(), context.getClickLocation().x,  context.getClickLocation().y,  context.getClickLocation().z);
                entity.moveTo(context.getClickLocation().x, context.getClickLocation().y, context.getClickLocation().z, context.getRotation(), 0.0F);
                entity.setType(this.color);
                context.getLevel().addFreshEntity(entity);
                context.getItemInHand().shrink(1);
                context.getLevel().playSound((PlayerEntity) null, context.getClickedPos(), SoundEvents.WOOL_PLACE, SoundCategory.BLOCKS, 1.0F, 1F);
                return ActionResultType.SUCCESS;
            }

        return ActionResultType.PASS;
    }
}

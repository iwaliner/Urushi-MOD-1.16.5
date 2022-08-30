package com.iwaliner.urushi.Item;

import com.iwaliner.urushi.Entity.FoodEntity.FoodEntity;
import com.iwaliner.urushi.UrushiUtils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
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

public class PlaceableFoodItem extends Item {


    public PlaceableFoodItem( Properties p_i48487_1_) {
        super(p_i48487_1_);

    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        if(!context.getPlayer().isSuppressingBounce()){
            return ActionResultType.PASS;
        }
        EntityType<?> entity= UrushiUtils.getEntityTypeFromFoodItem(this.getItem());

        if (!(context.getLevel() instanceof ServerWorld)) {
            return ActionResultType.SUCCESS;
        }
       if(context.getPlayer().isSuppressingBounce()) {
           Vector3d vector3d = Vector3d.atBottomCenterOf(context.getClickedPos());
           AxisAlignedBB axisalignedbb = entity.getDimensions().makeBoundingBox(vector3d.x(), vector3d.y(), vector3d.z());
           if (context.getLevel().getEntities((Entity) null, axisalignedbb).isEmpty()) {
               FoodEntity foodEntity = (FoodEntity) entity.create((ServerWorld) context.getLevel(), (CompoundNBT) null, (ITextComponent)null, context.getPlayer(), context.getClickedPos(), SpawnReason.SPAWN_EGG, true, true);
              foodEntity.moveTo(context.getClickLocation().x, context.getClickLocation().y, context.getClickLocation().z, context.getRotation(), 0.0F);
              context.getLevel().addFreshEntity(foodEntity);
               context.getItemInHand().shrink(1);
               context.getLevel().playSound((PlayerEntity) null, context.getClickedPos(), SoundEvents.ITEM_PICKUP, SoundCategory.BLOCKS, 1.0F, 1F);
               return ActionResultType.SUCCESS;
           }
       }
       return ActionResultType.PASS;
    }
}

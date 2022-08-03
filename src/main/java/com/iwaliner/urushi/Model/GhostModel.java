package com.iwaliner.urushi.Model;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelHelper;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.util.HandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Function;

@OnlyIn(Dist.CLIENT)
public class GhostModel<T extends MonsterEntity> extends BipedModel<T> {

    public GhostModel(float p_i1148_1_) {
        this(RenderType::entityTranslucent, p_i1148_1_, 0.0F, 64, 64);
    }

    public GhostModel(Function<ResourceLocation, RenderType> p_i225946_1_, float p_i225946_2_, float p_i225946_3_, int p_i225946_4_, int p_i225946_5_) {
        super(p_i225946_1_, p_i225946_2_, p_i225946_3_, p_i225946_4_, p_i225946_5_);

    }

    public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {
        boolean flag = p_225597_1_.getFallFlyingTicks() > 4;
        boolean flag1 = p_225597_1_.isVisuallySwimming();
        this.head.yRot = p_225597_5_ * ((float)Math.PI / 180F);
        if (flag) {
            this.head.xRot = (-(float)Math.PI / 4F);
        } else if (this.swimAmount > 0.0F) {
            if (flag1) {
                this.head.xRot = this.rotlerpRad(this.swimAmount, this.head.xRot, (-(float)Math.PI / 4F));
            } else {
                this.head.xRot = this.rotlerpRad(this.swimAmount, this.head.xRot, p_225597_6_ * ((float)Math.PI / 180F));
            }
        } else {
            this.head.xRot = p_225597_6_ * ((float)Math.PI / 180F);
        }

        this.body.yRot = 0.0F;
        this.rightLeg.yRot = 0.0F;
        this.leftLeg.yRot = 0.0F;
        this.rightArm.z = 0.0F;
        this.rightArm.x = -5.0F;
        this.leftArm.z = 0.0F;
        this.leftArm.x = 5.0F;
        float f = 1.0F;
        if (flag) {
            f = (float)p_225597_1_.getDeltaMovement().lengthSqr();
            f = f / 0.2F;
            f = f * f * f;
        }

        if (f < 1.0F) {
            f = 1.0F;
        }

        this.rightArm.xRot = MathHelper.cos(p_225597_2_ * 0.6662F + (float)Math.PI) * 2.0F * p_225597_3_ * 0.5F / f;
        this.leftArm.xRot = MathHelper.cos(p_225597_2_ * 0.6662F) * 2.0F * p_225597_3_ * 0.5F / f;
        this.rightArm.zRot = 0.0F;
        this.leftArm.zRot = 0.0F;
        if (this.riding) {
            this.rightArm.xRot += (-(float)Math.PI / 5F);
            this.leftArm.xRot += (-(float)Math.PI / 5F);

        }

        this.rightArm.yRot = 0.0F;
        this.leftArm.yRot = 0.0F;
        boolean flag2 = p_225597_1_.getMainArm() == HandSide.RIGHT;
        boolean flag3 = flag2 ? this.leftArmPose.isTwoHanded() : this.rightArmPose.isTwoHanded();
        if (flag2 != flag3) {
            this.poseLeftArm(p_225597_1_);
            this.poseRightArm(p_225597_1_);
        } else {
            this.poseRightArm(p_225597_1_);
            this.poseLeftArm(p_225597_1_);
        }

        this.setupAttackAnimation(p_225597_1_, p_225597_4_);
        if (this.crouching) {
            this.body.xRot = 0.5F;
            this.rightArm.xRot += 0.4F;
            this.leftArm.xRot += 0.4F;
            this.head.y = 4.2F;
            this.body.y = 3.2F;
            this.leftArm.y = 5.2F;
            this.rightArm.y = 5.2F;
            this.rightLeg.z = 4.0F;
            this.leftLeg.z = 4.0F;
            this.rightLeg.y = 12.2F;
            this.leftLeg.y = 12.2F;
            this.rightLeg.xRot = 0.5F;
            this.leftLeg.xRot = 0.5F;
        } else {
            this.body.xRot = 0.0F;
            this.rightLeg.z = 0.1F;
            this.leftLeg.z = 0.1F;
            this.rightLeg.y = 12.0F;
            this.leftLeg.y = 12.0F;
            this.head.y = 0.0F;
            this.body.y = 0.0F;
            this.leftArm.y = 2.0F;
            this.rightArm.y = 2.0F;

        }

        ModelHelper.bobArms(this.rightArm, this.leftArm, p_225597_4_);
        if (this.swimAmount > 0.0F) {
            float f1 = p_225597_2_ % 26.0F;
            HandSide handside = this.getAttackArm(p_225597_1_);
            float f2 = handside == HandSide.RIGHT && this.attackTime > 0.0F ? 0.0F : this.swimAmount;
            float f3 = handside == HandSide.LEFT && this.attackTime > 0.0F ? 0.0F : this.swimAmount;
            if (f1 < 14.0F) {
                this.leftArm.xRot = this.rotlerpRad(f3, this.leftArm.xRot, 0.0F);
                this.rightArm.xRot = MathHelper.lerp(f2, this.rightArm.xRot, 0.0F);
                this.leftArm.yRot = this.rotlerpRad(f3, this.leftArm.yRot, (float)Math.PI);
                this.rightArm.yRot = MathHelper.lerp(f2, this.rightArm.yRot, (float)Math.PI);
                this.leftArm.zRot = this.rotlerpRad(f3, this.leftArm.zRot, (float)Math.PI + 1.8707964F * this.quadraticArmUpdate(f1) / this.quadraticArmUpdate(14.0F));
                this.rightArm.zRot = MathHelper.lerp(f2, this.rightArm.zRot, (float)Math.PI - 1.8707964F * this.quadraticArmUpdate(f1) / this.quadraticArmUpdate(14.0F));
            } else if (f1 >= 14.0F && f1 < 22.0F) {
                float f6 = (f1 - 14.0F) / 8.0F;
                this.leftArm.xRot = this.rotlerpRad(f3, this.leftArm.xRot, ((float)Math.PI / 2F) * f6);
                this.rightArm.xRot = MathHelper.lerp(f2, this.rightArm.xRot, ((float)Math.PI / 2F) * f6);
                this.leftArm.yRot = this.rotlerpRad(f3, this.leftArm.yRot, (float)Math.PI);
                this.rightArm.yRot = MathHelper.lerp(f2, this.rightArm.yRot, (float)Math.PI);
                this.leftArm.zRot = this.rotlerpRad(f3, this.leftArm.zRot, 5.012389F - 1.8707964F * f6);
                this.rightArm.zRot = MathHelper.lerp(f2, this.rightArm.zRot, 1.2707963F + 1.8707964F * f6);
            } else if (f1 >= 22.0F && f1 < 26.0F) {
                float f4 = (f1 - 22.0F) / 4.0F;
                this.leftArm.xRot = this.rotlerpRad(f3, this.leftArm.xRot, ((float)Math.PI / 2F) - ((float)Math.PI / 2F) * f4);
                this.rightArm.xRot = MathHelper.lerp(f2, this.rightArm.xRot, ((float)Math.PI / 2F) - ((float)Math.PI / 2F) * f4);
                this.leftArm.yRot = this.rotlerpRad(f3, this.leftArm.yRot, (float)Math.PI);
                this.rightArm.yRot = MathHelper.lerp(f2, this.rightArm.yRot, (float)Math.PI);
                this.leftArm.zRot = this.rotlerpRad(f3, this.leftArm.zRot, (float)Math.PI);
                this.rightArm.zRot = MathHelper.lerp(f2, this.rightArm.zRot, (float)Math.PI);
            }

            float f7 = 0.3F;
            float f5 = 0.33333334F;
              }

        this.hat.copyFrom(this.head);
         ModelHelper.animateZombieArms(this.leftArm, this.rightArm, false, this.attackTime, p_225597_4_);

    }
    private void poseRightArm(T p_241654_1_) {
        switch(this.rightArmPose) {
            case EMPTY:
                this.rightArm.yRot = 0.0F;
                break;
            case BLOCK:
                this.rightArm.xRot = this.rightArm.xRot * 0.5F - 0.9424779F;
                this.rightArm.yRot = (-(float)Math.PI / 6F);
                break;
            case ITEM:
                this.rightArm.xRot = this.rightArm.xRot * 0.5F - ((float)Math.PI / 10F);
                this.rightArm.yRot = 0.0F;
                break;
            case THROW_SPEAR:
                this.rightArm.xRot = this.rightArm.xRot * 0.5F - (float)Math.PI;
                this.rightArm.yRot = 0.0F;
                break;
            case BOW_AND_ARROW:
                this.rightArm.yRot = -0.1F + this.head.yRot;
                this.leftArm.yRot = 0.1F + this.head.yRot + 0.4F;
                this.rightArm.xRot = (-(float)Math.PI / 2F) + this.head.xRot;
                this.leftArm.xRot = (-(float)Math.PI / 2F) + this.head.xRot;
                break;
            case CROSSBOW_CHARGE:
                ModelHelper.animateCrossbowCharge(this.rightArm, this.leftArm, p_241654_1_, true);
                break;
            case CROSSBOW_HOLD:
                ModelHelper.animateCrossbowHold(this.rightArm, this.leftArm, this.head, true);
        }

    }

    private void poseLeftArm(T p_241655_1_) {
        switch(this.leftArmPose) {
            case EMPTY:
                this.leftArm.yRot = 0.0F;
                break;
            case BLOCK:
                this.leftArm.xRot = this.leftArm.xRot * 0.5F - 0.9424779F;
                this.leftArm.yRot = ((float)Math.PI / 6F);
                break;
            case ITEM:
                this.leftArm.xRot = this.leftArm.xRot * 0.5F - ((float)Math.PI / 10F);
                this.leftArm.yRot = 0.0F;
                break;
            case THROW_SPEAR:
                this.leftArm.xRot = this.leftArm.xRot * 0.5F - (float)Math.PI;
                this.leftArm.yRot = 0.0F;
                break;
            case BOW_AND_ARROW:
                this.rightArm.yRot = -0.1F + this.head.yRot - 0.4F;
                this.leftArm.yRot = 0.1F + this.head.yRot;
                this.rightArm.xRot = (-(float)Math.PI / 2F) + this.head.xRot;
                this.leftArm.xRot = (-(float)Math.PI / 2F) + this.head.xRot;
                break;
            case CROSSBOW_CHARGE:
                ModelHelper.animateCrossbowCharge(this.rightArm, this.leftArm, p_241655_1_, false);
                break;
            case CROSSBOW_HOLD:
                ModelHelper.animateCrossbowHold(this.rightArm, this.leftArm, this.head, false);
        }

    }
    private float quadraticArmUpdate(float p_203068_1_) {
        return -65.0F * p_203068_1_ + p_203068_1_ * p_203068_1_;
    }
}

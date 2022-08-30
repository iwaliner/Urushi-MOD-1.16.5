package com.iwaliner.urushi.Renderer.FoodRenderer;

import com.iwaliner.urushi.Entity.FoodEntity.FoodEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class AbstractFoodRenderer<T extends FoodEntity> extends EntityRenderer<T> {
    public static ResourceLocation TEXTURE_LOCATION;
    public static EntityModel<FoodEntity> model ;

    public AbstractFoodRenderer(EntityRendererManager p_i47208_1_) {
        super(p_i47208_1_);
    }

    public void render(FoodEntity entity, float p_225623_2_, float p_225623_3_, MatrixStack p_225623_4_, IRenderTypeBuffer p_225623_5_, int p_225623_6_) {

            p_225623_4_.pushPose();
            p_225623_4_.mulPose(Vector3f.XN.rotationDegrees(180.0F));
            p_225623_4_.translate(0.0D, (double)-1.5F, 0.0D);
            p_225623_4_.scale(1F, 1F, 1F);

        p_225623_4_.mulPose(Vector3f.YN.rotationDegrees(180.0F - p_225623_2_)); //この行がないとモデルの回転ができない

            IVertexBuilder ivertexbuilder = p_225623_5_.getBuffer(this.model.renderType(TEXTURE_LOCATION));
            this.model.renderToBuffer(p_225623_4_, ivertexbuilder, p_225623_6_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
            p_225623_4_.popPose();
            super.render((T) entity, p_225623_2_, p_225623_3_, p_225623_4_, p_225623_5_, p_225623_6_);


    }

    public ResourceLocation getTextureLocation(FoodEntity p_110775_1_) {
        return TEXTURE_LOCATION;
    }
}
package com.iwaliner.urushi.RecipeType;

import com.iwaliner.urushi.ModCore_Urushi;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RecipeTypeRegister {
    public static final DeferredRegister<IRecipeSerializer<?>> RECIPE_SERIALIZER =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ModCore_Urushi.MOD_ID);

    public static final RegistryObject<FryingRecipe.FryingSerializer> FRYING_SERIALIZER
            = RECIPE_SERIALIZER.register("frying", FryingRecipe.FryingSerializer::new);

    public static IRecipeType<FryingRecipe> FRYING_RECIPE
            = new FryingRecipe.FryingRecipeType();


    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZER.register(eventBus);

        Registry.register(Registry.RECIPE_TYPE, FryingRecipe.locationType, FRYING_RECIPE);
    }
}

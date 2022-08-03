package com.iwaliner.urushi.RecipeType;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.iwaliner.urushi.ItemsRegister;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapedRecipe;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistryEntry;

import javax.annotation.Nullable;

public class FryingRecipe implements IFryingRecipe {
    private final NonNullList<Ingredient> ingredient;
    private final ItemStack output;
    private final ResourceLocation location;

    public FryingRecipe(NonNullList<Ingredient> input, ItemStack output, ResourceLocation location) {
        this.ingredient = input;
        this.output = output;
        this.location = location;
    }

    @Override
    public boolean matches(IInventory inventory, World world) {
      /* if(ingredient.get(0).test(inventory.getItem(0))){
           return ingredient.get(2).test(inventory.getItem(2));
       } return false;
       */
        return ingredient.get(0).test(inventory.getItem(0));
    }

    @Override
    public ItemStack assemble(IInventory p_77572_1_) {
        return output;
    }

    public NonNullList<Ingredient> getIngredient() {
        return ingredient;
    }

    @Override
    public ItemStack getResultItem() {
        return output.copy();
    }

    @Override
    public ResourceLocation getId() {
        return location;
    }

    @Override
    public IRecipeSerializer<?> getSerializer() {
        return RecipeTypeRegister.FRYING_SERIALIZER.get();
    }

    @Override
    public ItemStack getToastSymbol() {
        return new ItemStack(ItemsRegister.Fryer.get());
    }

    public static class FryingRecipeType implements IRecipeType<FryingRecipe> {
        @Override
        public String toString() {
            return FryingRecipe.locationType.toString();
        }
    }

    public static class FryingSerializer extends ForgeRegistryEntry<IRecipeSerializer<?>> implements IRecipeSerializer<FryingRecipe> {


        @Override
        public FryingRecipe fromJson(ResourceLocation location, JsonObject json) {
            ItemStack output=ShapedRecipe.itemFromJson(JSONUtils.getAsJsonObject(json,"output"));
            JsonArray ingredient=JSONUtils.getAsJsonArray(json,"ingredients");
            NonNullList<Ingredient> input=NonNullList.withSize(1,Ingredient.EMPTY);
             for(int i=0;i<input.size();i++){
                 input.set(i,Ingredient.fromJson(ingredient.get(i)));
             }
             return new FryingRecipe(input,output,location);
        }

        @Nullable
        @Override
        public FryingRecipe fromNetwork(ResourceLocation location, PacketBuffer buffer) {
          NonNullList<Ingredient> input=NonNullList.withSize(1,Ingredient.EMPTY);
            for(int i=0;i<input.size();i++){
                input.set(i,Ingredient.fromNetwork(buffer));
            }
            ItemStack output=buffer.readItem();
            return new FryingRecipe(input,output,location);
        }

        @Override
        public void toNetwork(PacketBuffer buffer, FryingRecipe recipe) {
            buffer.writeInt(recipe.getIngredient().size());
            for (Ingredient ingredient :recipe.getIngredient()){
                ingredient.toNetwork(buffer);
            }
            buffer.writeItemStack(recipe.getResultItem(),false);
        }
    }
}
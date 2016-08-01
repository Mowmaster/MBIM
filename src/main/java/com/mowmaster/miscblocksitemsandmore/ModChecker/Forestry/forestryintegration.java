package com.mowmaster.miscblocksitemsandmore.ModChecker.Forestry;

import forestry.api.core.ForestryAPI;
import forestry.api.recipes.ISqueezerManager;
import forestry.api.recipes.ISqueezerRecipe;
import forestry.api.recipes.RecipeManagers;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.Loader;

import static com.mowmaster.miscblocksitemsandmore.recipies.removeRecipies.removeSmelting;


public class forestryintegration
{
    public static void checktheForest()
    {
        if (Loader.isModLoaded("forestry"))
        {
            if (Loader.isModLoaded("harvestcraft")) {
                //HarvestCraft seeds
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:gingerseedItem")))}, new FluidStack(FluidRegistry.getFluid("seed.oil"), 10), new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("forestry:mulch"))), 2);
            }
            if (Loader.isModLoaded("SilentGems")) {
                //Silents gems
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("silentgems:FluffyPuffSeeds")))}, new FluidStack(FluidRegistry.getFluid("seed.oil"), 10), new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("forestry:mulch"))), 2);
            }
            if (Loader.isModLoaded("actuallyadditions")) {
                //Actually Additions
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("actuallyadditions:itemCoffeeSeed")))}, new FluidStack(FluidRegistry.getFluid("seed.oil"), 10), new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("forestry:mulch"))), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("actuallyadditions:itemRiceSeed")))}, new FluidStack(FluidRegistry.getFluid("seed.oil"), 10), new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("forestry:mulch"))), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("actuallyadditions:itemCanolaSeed")))}, new FluidStack(FluidRegistry.getFluid("seed.oil"), 10), new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("forestry:mulch"))), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("actuallyadditions:itemFlaxSeed")))}, new FluidStack(FluidRegistry.getFluid("seed.oil"), 10), new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("forestry:mulch"))), 2);
            }
            if (Loader.isModLoaded("betterwithmods")) {
                //Better with mods
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("betterwithmods:hemp")))}, new FluidStack(FluidRegistry.getFluid("seed.oil"), 10), new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("forestry:mulch"))), 2);
            }
            if (Loader.isModLoaded("calculator")) {
                //Calculator
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("calculator:BroccoliSeeds")))}, new FluidStack(FluidRegistry.getFluid("seed.oil"), 10), new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("forestry:mulch"))), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("calculator:PrunaeSeeds")))}, new FluidStack(FluidRegistry.getFluid("seed.oil"), 10), new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("forestry:mulch"))), 2);
            }

            //removeSmelting(Items.COAL); Will put back in once forestry adds their charcoal recipes to the game
        }
    }
}

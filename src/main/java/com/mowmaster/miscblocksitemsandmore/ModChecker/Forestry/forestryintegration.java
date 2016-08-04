package com.mowmaster.miscblocksitemsandmore.ModChecker.Forestry;


import forestry.api.recipes.RecipeManagers;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.oredict.OreDictionary;

import static com.mowmaster.miscblocksitemsandmore.recipies.removeRecipies.removeSmelting;


public class forestryintegration
{
    public static void checktheForest()
    {
        if (Loader.isModLoaded("forestry"))
        {
            Item FMulch = Item.REGISTRY.getObject(new ResourceLocation("forestry:mulch"));
            Fluid FSeedOil = FluidRegistry.getFluid("seed.oil");

            if (Loader.isModLoaded("harvestcraft")) {
                //HarvestCraft seeds, probably an easier way to do this to get them to show in jei...

                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:oatsseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:barleyseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:asparagusseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:cactusfruitseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:strawberryseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:raspberryseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:candleberryseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:blueberryseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:blackberryseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:lettuceseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:leekseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:cauliflowerseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:broccoliseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:mustardseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:coffeeseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:teaseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:spiceleafseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:gingerseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:parsnipseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:peanutseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:radishseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:rutabagaseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:sweetpotatoseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:turnipseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:rhubarbseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:celeryseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:garlicseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:ryeseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:cornseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:bambooshootseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:cantaloupeseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:cucumberseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:wintersquashseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:zucchiniseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:beetseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:onionseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:eggplantseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:okraseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:peasseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:tomatoseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:cottonseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:pineappleseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:grapeseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:kiwiseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:cranberryseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:chilipepperseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:bellpepperseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:soybeanseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:scallionseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:artichokeseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:brusselsproutseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:cabbageseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:spinachseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:beanseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:waterchestnutseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:sesameseedsseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:sunflowerseedsItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:curryleafseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:seaweedseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("harvestcraft:riceseedItem")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);

            }
            if (Loader.isModLoaded("SilentGems")) {
                //Silents gems
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("silentgems:FluffyPuffSeeds")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
            }
            if (Loader.isModLoaded("actuallyadditions")) {
                //Actually Additions
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("actuallyadditions:itemCoffeeSeed")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("actuallyadditions:itemRiceSeed")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("actuallyadditions:itemCanolaSeed")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("actuallyadditions:itemFlaxSeed")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
            }
            if (Loader.isModLoaded("betterwithmods")) {
                //Better with mods
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("betterwithmods:hemp")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
            }
            if (Loader.isModLoaded("Calculator")) {
                //Calculator
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("calculator:BroccoliSeeds")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack[]{new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("calculator:PrunaeSeeds")))}, new FluidStack(FSeedOil, 10), new ItemStack(FMulch), 2);
            }

            //removeSmelting(Items.COAL); Will put back in once forestry adds their charcoal recipes to the game
        }
    }
}

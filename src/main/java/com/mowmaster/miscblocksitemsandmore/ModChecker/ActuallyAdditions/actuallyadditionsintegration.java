package com.mowmaster.miscblocksitemsandmore.ModChecker.ActuallyAdditions;

import de.ellpeck.actuallyadditions.api.recipe.CrusherRecipe;
import de.ellpeck.actuallyadditions.api.recipe.LensConversionRecipe;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import static com.mowmaster.miscblocksitemsandmore.item.ItemRegistry.glass_tinypile;
import static de.ellpeck.actuallyadditions.api.ActuallyAdditionsAPI.*;

/**
 * Created by KingMowmaster on 12/5/2016.
 */
public class actuallyadditionsintegration
{
    public static void checkActually()
    {
        Item SubZinc = Item.REGISTRY.getObject(new ResourceLocation("substratum:ingot"));
        Item SubBlockZinc = Item.REGISTRY.getObject(new ResourceLocation("substratum:blockMetal1"));


        //Not the best way but it works
        for(ItemStack stack : OreDictionary.getOres("ingotLead")) {
            RECONSTRUCTOR_LENS_CONVERSION_RECIPES.add(new LensConversionRecipe(stack,new ItemStack(SubZinc,1,6),120,lensDefaultConversion));
        }
        for(ItemStack stack : OreDictionary.getOres("blockLead")) {
            RECONSTRUCTOR_LENS_CONVERSION_RECIPES.add(new LensConversionRecipe(stack,new ItemStack(SubBlockZinc,1,6),1200,lensDefaultConversion));
        }

        OIL_GENERATOR_RECIPES.put("plantoil",40);
        OIL_GENERATOR_RECIPES.put("creosote",60);



    }
}

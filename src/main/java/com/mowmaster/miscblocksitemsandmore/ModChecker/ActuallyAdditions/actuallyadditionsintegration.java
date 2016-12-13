package com.mowmaster.miscblocksitemsandmore.ModChecker.ActuallyAdditions;

import de.ellpeck.actuallyadditions.api.recipe.CrusherRecipe;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import static com.mowmaster.miscblocksitemsandmore.item.ItemRegistry.glass_tinypile;
import static de.ellpeck.actuallyadditions.api.ActuallyAdditionsAPI.CRUSHER_RECIPES;

/**
 * Created by KingMowmaster on 12/5/2016.
 */
public class actuallyadditionsintegration
{
    public static void checkActually()
    {
        Item IELeadGrit = Item.REGISTRY.getObject(new ResourceLocation("immersiveengineering:metal"));
        Item SubZinc = Item.REGISTRY.getObject(new ResourceLocation("substratum:dust"));
        Item TSONORE = Item.REGISTRY.getObject(new ResourceLocation("cavecraft:oreLeadb"));


        //Not the best way but it works
        for(ItemStack stack : OreDictionary.getOres("oreLead")) {
            //CRUSHER_RECIPES.add(new CrusherRecipe(stack, new ItemStack(IELeadGrit,1,11), new ItemStack(SubZinc,1,9), 25));
            GameRegistry.addShapelessRecipe(new ItemStack(TSONORE, 1), stack);
        }
        CRUSHER_RECIPES.add(new CrusherRecipe(new ItemStack(TSONORE), new ItemStack(IELeadGrit,1,11), new ItemStack(SubZinc,1,9), 25));
    }
}

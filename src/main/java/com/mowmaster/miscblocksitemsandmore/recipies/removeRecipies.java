package com.mowmaster.miscblocksitemsandmore.recipies;


import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;

import javax.jws.soap.InitParam;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class removeRecipies
{

    public static void removeCrafting(Item item)
    {
        List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
        Iterator<IRecipe> removeCrafting = recipes.iterator();

        while (removeCrafting.hasNext())
        {
            ItemStack is = removeCrafting.next().getRecipeOutput();
            if (is != null && is.getItem() == item)
                removeCrafting.remove();
        }
    }

    public static void removedCraftingItems()
    {

        //Removed Metal Armor
        removeCrafting(Items.IRON_HELMET);
        removeCrafting(Items.IRON_CHESTPLATE);
        removeCrafting(Items.IRON_LEGGINGS);
        removeCrafting(Items.IRON_BOOTS);
        removeCrafting(Items.GOLDEN_HELMET);
        removeCrafting(Items.GOLDEN_CHESTPLATE);
        removeCrafting(Items.GOLDEN_LEGGINGS);
        removeCrafting(Items.GOLDEN_BOOTS);


    }

    public static void removeSmelting(Item item)
    {
        Map<ItemStack, ItemStack> smeltingList = FurnaceRecipes.instance().getSmeltingList();
        Iterator<ItemStack> smeltingOutputIter = smeltingList.values().iterator();
        while (smeltingOutputIter.hasNext())
        {
            ItemStack output = smeltingOutputIter.next();
            if (output.getItem() == item)
            {
                smeltingOutputIter.remove();
            }
        }
    }

    public static void removedSmeltingItems()
    {
        //removeSmelting(Items.IRON_INGOT);
    }
}

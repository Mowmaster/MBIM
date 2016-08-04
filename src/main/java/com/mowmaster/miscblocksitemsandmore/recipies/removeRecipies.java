package com.mowmaster.miscblocksitemsandmore.recipies;



import com.mowmaster.miscblocksitemsandmore.Configs.config;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;



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



    if (config.NewEraTweaks)
        {
        //Removed Metal Armor

        //Iron
        removeCrafting(Items.IRON_HELMET);
        removeCrafting(Items.IRON_CHESTPLATE);
        removeCrafting(Items.IRON_LEGGINGS);
        removeCrafting(Items.IRON_BOOTS);

        //Gold
        removeCrafting(Items.GOLDEN_HELMET);
        removeCrafting(Items.GOLDEN_CHESTPLATE);
        removeCrafting(Items.GOLDEN_LEGGINGS);
        removeCrafting(Items.GOLDEN_BOOTS);
        // Other Vanilla Tweaks
        }

        if (config.FlintForDays) {
            //Remove other flint recipes
            removeCrafting(Items.FLINT);
        }

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

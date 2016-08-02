package com.mowmaster.miscblocksitemsandmore.ModChecker.BloodMagic;

import WayofTime.bloodmagic.api.orb.BloodOrb;
import WayofTime.bloodmagic.api.recipe.AlchemyTableCustomRecipe;
import WayofTime.bloodmagic.api.registry.AlchemyArrayRecipeRegistry;
import WayofTime.bloodmagic.api.registry.AltarRecipeRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;

/**
 * Created by KingMowmaster on 8/2/2016.
 */
public class bloodmagic
{
    public static void bloodCheck()
    {
        if (Loader.isModLoaded("bloodmagic"))
        {
            //AlchemyArrayRecipeRegistry.registerCraftingRecipe();
        }
    }
}

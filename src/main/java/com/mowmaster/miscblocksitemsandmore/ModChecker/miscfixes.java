package com.mowmaster.miscblocksitemsandmore.ModChecker;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static com.mowmaster.miscblocksitemsandmore.item.ItemRegistry.glass_tinypile;
import static com.mowmaster.miscblocksitemsandmore.recipies.removeRecipies.removeCrafting;


public class miscfixes
{
    public static void miscfixescheck()
    {
        Item BPStick = Item.REGISTRY.getObject(new ResourceLocation("backpack:stick"));
        //0=stone   1=iron
        Item IEStick = Item.REGISTRY.getObject(new ResourceLocation("immersiveengineering:material"));
        //0=treated,  1=iron, 2=steel, 3=aluminum
        Item TSONStick = Item.REGISTRY.getObject(new ResourceLocation("cavecraft:stickIron"));

        GameRegistry.addShapelessRecipe(new ItemStack(BPStick,1,1), new ItemStack(TSONStick,1));
        GameRegistry.addShapelessRecipe(new ItemStack(IEStick,1,1), new ItemStack(BPStick,1,1));
        GameRegistry.addShapelessRecipe(new ItemStack(TSONStick,1), new ItemStack(IEStick,1,1));

    }
}

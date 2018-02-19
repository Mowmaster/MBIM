package com.mowmaster.mbim.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class Smelting
{
    public static void addSmelting()
    {
        for(ItemStack stack : OreDictionary.getOres("glassDust")){ GameRegistry.addSmelting(stack, new ItemStack(Blocks.GLASS,1), 0.05f); }
        GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER,1), 0.05f);
    }
}

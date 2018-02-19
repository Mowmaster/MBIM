package com.mowmaster.mbim.recipes;


import com.mowmaster.mbim.items.ItemRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict
{
    public static void addEntries()
    {
        OreDictionary.registerOre("glassDust", ItemRegistry.glassDust);
        OreDictionary.registerOre("tinyGlassDust", ItemRegistry.tinyDust);
    }
}

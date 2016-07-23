package com.mowmaster.miscblocksitemsandmore.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ItemRegistry
{
    public static Item glass_tinypile;
    public static Item glass_pile;
    public static Item glass_largepile;

    public static void registerBottles()
    {
        GameRegistry.register(glass_tinypile = new basicItem("glass_tinypile").setRegistryName("glass_tinypile"));
        GameRegistry.register(glass_pile = new basicItem("glass_pile").setRegistryName("glass_pile"));
        GameRegistry.register(glass_largepile = new basicItem("glass_largepile").setRegistryName("glass_largepile"));
    }
}

package com.mowmaster.miscblocksitemsandmore.item;

import com.mowmaster.miscblocksitemsandmore.Configs.config;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ItemRegistry
{
    public static Item glass_tinypile;
    public static Item glass_pile;
    public static Item glass_largepile;

    public static Item tool_hammer;
    public static Item enderium_blend_dust;
    public static Item fake_pyrothium;

    public static void registerBottles()
    {
        if (config.RecyclableGlass) {
            GameRegistry.register(glass_tinypile = new basicItem("glass_tinypile").setRegistryName("glass_tinypile"));
            GameRegistry.register(glass_pile = new basicItem("glass_pile").setRegistryName("glass_pile"));
            GameRegistry.register(glass_largepile = new basicItem("glass_largepile").setRegistryName("glass_largepile"));
        }
        if (config.HammaTime) {
            GameRegistry.register(tool_hammer = new basicItem("tool_hammer").setRegistryName("tool_hammer"));
            GameRegistry.register(enderium_blend_dust = new basicItem("enderium_blend_dust").setRegistryName("enderium_blend_dust"));
            GameRegistry.register(fake_pyrothium = new basicItem("fake_pyrothium").setRegistryName("fake_pyrothium"));
        }
    }
}

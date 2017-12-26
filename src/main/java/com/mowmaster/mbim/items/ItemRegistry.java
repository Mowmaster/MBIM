package com.mowmaster.mbim.items;

import com.mowmaster.mbim.reference.references;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;


public class ItemRegistry
{
    public static Item basicItem;


    public static void init()
    {

        basicItem = new ItemPullBack("bow","bow");
    }

    public static void register()
    {
        registerItem(basicItem);

    }

    public static void registerRenders()
    {
        registerRender(basicItem);
    }

    public static void registerItem(Item item)
    {
        ForgeRegistries.ITEMS.register(item);
    }

    public static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(references.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
    }

    public static void registerRender(Item item, int meta, String fileName)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(references.MODID, fileName), "inventory"));
    }

}

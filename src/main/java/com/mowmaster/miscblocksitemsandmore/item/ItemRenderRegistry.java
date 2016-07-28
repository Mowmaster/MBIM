package com.mowmaster.miscblocksitemsandmore.item;

import com.mowmaster.miscblocksitemsandmore.references.reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;


public class ItemRenderRegistry
{
    public static void ItemRR()
    {
        register(ItemRegistry.glass_tinypile);
        register(ItemRegistry.glass_pile);
        register(ItemRegistry.glass_largepile);

        register(ItemRegistry.tool_hammer);
    }
    public static void register(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(reference.MODID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
    }
}

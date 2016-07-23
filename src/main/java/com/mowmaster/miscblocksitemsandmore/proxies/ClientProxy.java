package com.mowmaster.miscblocksitemsandmore.proxies;


import com.mowmaster.miscblocksitemsandmore.item.ItemRegistry;
import com.mowmaster.miscblocksitemsandmore.item.ItemRenderRegistry;
import com.mowmaster.miscblocksitemsandmore.references.reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy
{
    @SideOnly(Side.CLIENT)
            private void ItemRegRenderClient()
    {
        ItemRenderRegistry.ItemRR();
    }
}

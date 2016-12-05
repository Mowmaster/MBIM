package com.mowmaster.miscblocksitemsandmore.proxies;


import com.mowmaster.miscblocksitemsandmore.ModChecker.*;
import com.mowmaster.miscblocksitemsandmore.block.compressedandesite;
import com.mowmaster.miscblocksitemsandmore.block.compresseddiorite;
import com.mowmaster.miscblocksitemsandmore.block.compressedgranite;
import com.mowmaster.miscblocksitemsandmore.item.ItemRegistry;
import com.mowmaster.miscblocksitemsandmore.item.ItemRenderRegistry;
import com.mowmaster.miscblocksitemsandmore.recipies.addRecipies;
import com.mowmaster.miscblocksitemsandmore.recipies.removeRecipies;
import com.mowmaster.miscblocksitemsandmore.references.reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLLoadEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.mowmaster.miscblocksitemsandmore.block.blockreg.*;

public class ClientProxy extends CommonProxy
{
    @Override
    @SideOnly(Side.CLIENT)

    public void preInit()
    {
        ItemRenderRegistry.ItemRR();


        //final Item itemgranite = Item.getItemFromBlock(cbblockscgranite);
        //final Item itemdiorite = Item.getItemFromBlock(cbblockscdiorite);
        final Item itemandesite = Item.getItemFromBlock(cbblockscandesite);

        for (int meta = 0; meta < 8; meta++) {
            //ModelLoader.setCustomModelResourceLocation(itemgranite, meta, new ModelResourceLocation("miscblocksitemsandmore:granite/" + compressedgranite.types[meta], "inventory"));

            //ModelLoader.setCustomModelResourceLocation(itemdiorite, meta, new ModelResourceLocation("miscblocksitemsandmore:diorite/" + compresseddiorite.types[meta], "inventory"));

            ModelLoader.setCustomModelResourceLocation(itemandesite, meta, new ModelResourceLocation("miscblocksitemsandmore:andesite/" + compressedandesite.types[meta], "inventory"));


        }
        MinecraftForge.EVENT_BUS.register(this);
    }
}

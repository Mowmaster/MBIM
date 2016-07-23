package com.mowmaster.miscblocksitemsandmore;


import com.mowmaster.miscblocksitemsandmore.item.ItemRegistry;
import com.mowmaster.miscblocksitemsandmore.item.ItemRenderRegistry;
import com.mowmaster.miscblocksitemsandmore.proxies.ClientProxy;
import com.mowmaster.miscblocksitemsandmore.proxies.CommonProxy;
import com.mowmaster.miscblocksitemsandmore.recipies.bottleRecipies;
import com.mowmaster.miscblocksitemsandmore.references.reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = reference.MODID, name = reference.MODNAME, version = reference.VERSION)
public class miscblocksitemsandmore
{
    @Mod.Instance(reference.MODID)
    public static miscblocksitemsandmore instance;

    @SidedProxy(serverSide = reference.SERVERSIDE, clientSide = reference.CLIENTSIDE)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ItemRegistry.registerBottles();
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.preInit();
        //ItemRenderRegistry.ItemRR();
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        bottleRecipies.bR();
    }
}

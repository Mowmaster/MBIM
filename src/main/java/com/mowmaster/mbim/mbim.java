package com.mowmaster.mbim;

import com.mowmaster.mbim.items.ItemRegistry;
import com.mowmaster.mbim.proxies.CommonProxy;
import com.mowmaster.mbim.reference.references;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = references.MODID,  name = references.MODNAME,version = references.VERSION)
public class mbim
{
    @Mod.Instance(references.MODID)
    public static mbim instance;

    @SidedProxy(serverSide = references.SERVER_SIDE,clientSide = references.CLIENT_SIDE)
    public static CommonProxy proxy;
    

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ItemRegistry.init();
        ItemRegistry.register();
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
        proxy.registerEntityRenders();
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}

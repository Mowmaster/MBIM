package com.mowmaster.miscblocksitemsandmore;


import com.google.common.eventbus.Subscribe;
import com.mowmaster.miscblocksitemsandmore.ModChecker.*;
import com.mowmaster.miscblocksitemsandmore.item.ItemRegistry;
import com.mowmaster.miscblocksitemsandmore.proxies.CommonProxy;
import com.mowmaster.miscblocksitemsandmore.recipies.addRecipies;
import com.mowmaster.miscblocksitemsandmore.recipies.removeRecipies;
import com.mowmaster.miscblocksitemsandmore.references.reference;
import javafx.scene.layout.Priority;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

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
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public void serverStart(FMLServerStartingEvent event)
    {
        cookingforblockheads.checkCFB();
        extrautils2.checkUtils2();
        quark.checkQuark();
        silentsgems.checkSG();
        tcon.checkTCon();
        removeRecipies.removedCraftingItems();
        removeRecipies.removedSmeltingItems();
        addRecipies.bR();
    }

}

package com.mowmaster.miscblocksitemsandmore;


import com.mowmaster.miscblocksitemsandmore.ModChecker.*;
import com.mowmaster.miscblocksitemsandmore.ModChecker.Forestry.forestryintegration;
import com.mowmaster.miscblocksitemsandmore.ModChecker.TinkersConstruct.tcon;
import com.mowmaster.miscblocksitemsandmore.ModChecker.TinkersConstruct.tconintegration;
import com.mowmaster.miscblocksitemsandmore.fluid.basicFluid;
import com.mowmaster.miscblocksitemsandmore.item.ItemRegistry;
import com.mowmaster.miscblocksitemsandmore.proxies.CommonProxy;
import com.mowmaster.miscblocksitemsandmore.recipies.addRecipies;
import com.mowmaster.miscblocksitemsandmore.recipies.removeRecipies;
import com.mowmaster.miscblocksitemsandmore.references.reference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
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
        MinecraftForge.EVENT_BUS.register(this);
        //basicFluid.regFluid();
        tconintegration.checkTCon2();
        forestryintegration.checktheForest();


    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
    @SubscribeEvent
    public void worldLoad(WorldEvent.Load event)
    {
        if (event.getWorld().isRemote && event.getWorld() != null && event.getWorld().provider.getDimension() == 0)
        {
            cookingforblockheads.checkCFB();
            extrautils2.checkUtils2();
            quark.checkQuark();
            silentsgems.checkSG();
            substratum.checkSub();
            tcon.checkTCon();
            removeRecipies.removedCraftingItems();
            removeRecipies.removedSmeltingItems();

            addRecipies.bR();


        }

    }


}

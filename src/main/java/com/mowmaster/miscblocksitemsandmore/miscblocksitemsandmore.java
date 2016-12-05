package com.mowmaster.miscblocksitemsandmore;


import com.mowmaster.miscblocksitemsandmore.Configs.config;
import com.mowmaster.miscblocksitemsandmore.ModChecker.*;
import com.mowmaster.miscblocksitemsandmore.ModChecker.ActuallyAdditions.actuallyadditionsintegration;
import com.mowmaster.miscblocksitemsandmore.ModChecker.Forestry.forestryintegration;
import com.mowmaster.miscblocksitemsandmore.ModChecker.railcraft;
import com.mowmaster.miscblocksitemsandmore.ModChecker.TinkersConstruct.tcon;
import com.mowmaster.miscblocksitemsandmore.ModChecker.TinkersConstruct.tconintegration;
import com.mowmaster.miscblocksitemsandmore.block.blockreg;
import com.mowmaster.miscblocksitemsandmore.item.ItemRegistry;
import com.mowmaster.miscblocksitemsandmore.proxies.CommonProxy;
import com.mowmaster.miscblocksitemsandmore.recipies.addRecipies;
import com.mowmaster.miscblocksitemsandmore.recipies.oredictionaryEntries;
import com.mowmaster.miscblocksitemsandmore.recipies.removeRecipies;
import com.mowmaster.miscblocksitemsandmore.references.reference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

import java.io.File;


@Mod(modid = reference.modid, name = reference.modname, version = reference.version)
public class miscblocksitemsandmore
{
    @Mod.Instance(reference.modid)
    public static miscblocksitemsandmore instance;

    @SidedProxy(serverSide = reference.serverside, clientSide = reference.clientside)
    public static CommonProxy proxy;


    private static File configDir;
    public static File getConfigDir()
    {
        return configDir;
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        configDir = new File(event.getModConfigurationDirectory() + "/" + reference.modid);
        configDir.mkdirs();
        config.initConfig(new File(configDir.getPath(), reference.modid + ".cfg"));
        blockreg.cbreg();
        ItemRegistry.registerBottles();
        oredictionaryEntries.addEntries();


    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.preInit();
        MinecraftForge.EVENT_BUS.register(this);


    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

        actuallyadditionsintegration.checkActually();
        tconintegration.checkTCon2();
        forestryintegration.checktheForest();

        removeRecipies.removedCraftingItems();
        removeRecipies.removedSmeltingItems();
        enderio.enderCheck();
        extrautils2.checkUtils2();
        miscfixes.miscfixescheck();
        quantomstorage.quantumCheck();
        quark.checkQuark();
        railcraft.checkrails();
        reliquary.checkXeno();
        rftools.notOPenough();
        scm.scmcheck();
        substratum.checkSub();
        tcon.checkTCon();
        tson.tsoncheck();

        addRecipies.bR();
    }
/*
    @Mod.EventHandler
    public void serverStarted(FMLServerStartedEvent event)
    {

    }
    */


}

package com.mowmaster.miscblocksitemsandmore;


import com.mowmaster.miscblocksitemsandmore.Configs.config;
import com.mowmaster.miscblocksitemsandmore.ModChecker.*;
import com.mowmaster.miscblocksitemsandmore.ModChecker.Forestry.forestryintegration;
import com.mowmaster.miscblocksitemsandmore.ModChecker.TinkersConstruct.tcon;
import com.mowmaster.miscblocksitemsandmore.ModChecker.TinkersConstruct.tconintegration;
import com.mowmaster.miscblocksitemsandmore.item.ItemRegistry;
import com.mowmaster.miscblocksitemsandmore.proxies.CommonProxy;
import com.mowmaster.miscblocksitemsandmore.recipies.addRecipies;
import com.mowmaster.miscblocksitemsandmore.recipies.removeRecipies;
import com.mowmaster.miscblocksitemsandmore.references.reference;
import com.mowmaster.miscblocksitemsandmore.world.biomes.BiomeReg;
import com.mowmaster.miscblocksitemsandmore.world.worlds.MinersDelightSpawnable;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.WorldTypeEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;


@Mod(modid = reference.MODID, name = reference.MODNAME, version = reference.VERSION)
public class miscblocksitemsandmore
{
    @Mod.Instance(reference.MODID)
    public static miscblocksitemsandmore instance;

    @SidedProxy(serverSide = reference.SERVERSIDE, clientSide = reference.CLIENTSIDE)
    public static CommonProxy proxy;


    private static File configDir;
    public static File getConfigDir()
    {
        return configDir;
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        configDir = new File(event.getModConfigurationDirectory() + "/" + reference.MODID);
        configDir.mkdirs();
        config.initConfig(new File(configDir.getPath(), reference.MODID + ".cfg"));
        ItemRegistry.registerBottles();
        BiomeReg.biomeRegistry();

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
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        WorldType MINERSDELIGHT = new MinersDelightSpawnable("Miners Delight");
    }
    @SubscribeEvent
    public void worldLoad(WorldEvent.Load event)
    {
        if (event.getWorld().isRemote && event.getWorld() != null && event.getWorld().provider.getDimension() == 0)
        {
            cookingforblockheads.checkCFB();
            enderio.enderCheck();
            extrautils2.checkUtils2();
            quark.checkQuark();
            reliquary.checkXeno();
            rftools.notOPenough();
            silentsgems.checkSG();
            substratum.checkSub();
            tcon.checkTCon();
            removeRecipies.removedCraftingItems();
            removeRecipies.removedSmeltingItems();


            addRecipies.bR();


        }

    }


}

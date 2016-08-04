package com.mowmaster.miscblocksitemsandmore.Configs;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import java.io.File;

/**
 * Created by KingMowmaster on 8/4/2016.
 */
public class config
{




    public static Configuration configFile;


    //Make Glass Recyclable?
    public static boolean RecyclableGlass;
    public static boolean FlintForDays;
    public static boolean LeatherForDays;
    public static boolean CompactUncrafting;
    public static boolean HammaTime;


    public static boolean NewEraTweaks;


    public static void initConfig(File file)
    {
        configFile = new Configuration(file);
        syncConfig();

    }

    public static void syncConfig()
    {
        String category;

        category = "Items";
        configFile.addCustomCategoryComment(category,"Added by MBIM");


        RecyclableGlass = configFile.getBoolean("Recycleable Glass",category,true,"Do you want to be able to recycle glass?");
        HammaTime = configFile.getBoolean("Hamma Time!",category,true,"Do you need more Hammers in your life?");




        category = "Vanilla";
        configFile.addCustomCategoryComment(category,"Vanilla Tweaks");

        FlintForDays = configFile.getBoolean("Flint For Days",category,true,"Should two gravel make flint?");
        LeatherForDays = configFile.getBoolean("Leather For Days",category,true,"Can you make Leather out of Rotting Flesh?");
        CompactUncrafting = configFile.getBoolean("Compact Uncrafting",category,true,"Should Uncrafting of some blocks be Possible?");



        category = "NewEra";
        configFile.addCustomCategoryComment(category,"New Era Tweaks");

        NewEraTweaks = configFile.getBoolean("New Era Tweaks",category,true,"Are you playing the modpack 'New Era'?");



        configFile.save();
    }
}

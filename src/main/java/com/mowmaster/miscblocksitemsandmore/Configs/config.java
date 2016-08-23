package com.mowmaster.miscblocksitemsandmore.Configs;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import java.io.File;


public class config
{




    public static Configuration configFile;


    //Make Glass Recyclable?
    public static boolean RecyclableGlass;
    public static boolean FlintForDays;
    public static boolean LeatherForDays;
    public static boolean CompactUncrafting;
    public static boolean HammaTime;
    public static boolean harderRecipes;
    public static boolean rftoolsHARD;


    public static boolean NewEraTweaks;
    public static boolean rfTooOP;

    public static boolean VoidDrums;


    public static int MinersDelightBiomeID;


    public static void initConfig(File file)
    {
        configFile = new Configuration(file);
        syncConfig();

    }

    public static void syncConfig()
    {
        String category;

        //category = "HardRecipes";
        //configFile.addCustomCategoryComment(category,"Harder Recipes");

        //harderRecipes = configFile.getBoolean("Harder Recipes",category,false,"Are the default recipes to easy for a pro like you?");
        //rftoolsHARD = configFile.getBoolean("Harder Recipes for RFTools",category,false,"For those who don't want to make dimensions in your first 10 minutes of playing");

        category = "Biome";
        configFile.addCustomCategoryComment(category,"Biome ID Settings");
        MinersDelightBiomeID = configFile.getInt("MinersDelightBiomeID",category,40,40,80,"Biome ID for Miners Delight");


        category = "Items";
        configFile.addCustomCategoryComment(category,"Added by MBIM");


        RecyclableGlass = configFile.getBoolean("Recycleable Glass",category,true,"Do you want to be able to recycle glass?");
        HammaTime = configFile.getBoolean("Hamma Time!",category,true,"Do you need more Hammers in your life?");




        category = "NewEra";
        configFile.addCustomCategoryComment(category,"New Era Tweaks");

        NewEraTweaks = configFile.getBoolean("New Era Tweaks",category,true,"Are you playing the modpack 'New Era'?");
        rfTooOP = configFile.getBoolean("RFTools Too Op",category,true,"Nerfing RFTools is so much fun!");




        category = "Vanilla";
        configFile.addCustomCategoryComment(category,"Vanilla Tweaks");

        FlintForDays = configFile.getBoolean("Flint For Days",category,true,"Should two gravel make flint?");
        LeatherForDays = configFile.getBoolean("Leather For Days",category,true,"Can you make Leather out of Rotting Flesh?");
        CompactUncrafting = configFile.getBoolean("Compact Uncrafting",category,true,"Should Uncrafting of some blocks be Possible?");


        category = "Extra Utilities 2";
        configFile.addCustomCategoryComment(category,"Extra Utils 2 Tweeks");
        VoidDrums = configFile.getBoolean("Void Drums",category,false,"Can you void liquids by crafting drums?");







        configFile.save();
    }
}

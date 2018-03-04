package com.mowmaster.mbim.blocks;

import com.mowmaster.mbim.reference.references;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;


public class BlockRegistry
{
    public static Block compressedCobble;
    public static Block compressedAndesite;
    public static Block compressedGranite;
    public static Block compressedDiorite;

    public static Block compressedDirt;
    public static Block compressedRedSand;
    public static Block compressedSand;
    public static Block compressedGravel;
    public static Block compressedNetherrack;


    public static void init()
    {
        compressedCobble = new BlockBasic("ccobble","ccobble", Material.ROCK, SoundType.STONE,2f,30f,0);
        compressedAndesite = new BlockBasic("candesite","candesite", Material.ROCK, SoundType.STONE,1.5f,30f,0);
        compressedDiorite = new BlockBasic("cdiorite","cdiorite", Material.ROCK, SoundType.STONE,1.5f,30f,0);
        compressedGranite = new BlockBasic("cgranite","cgranite", Material.ROCK, SoundType.STONE,1.5f,30f,0);
        compressedNetherrack = new BlockBasic("cnetherrack","cnetherrack", Material.ROCK, SoundType.STONE,0.4f,2f,0);

        compressedDirt = new BlockBasic("cdirt","cdirt", Material.GROUND, SoundType.GROUND,0.5f,2.5f,0);
        compressedRedSand = new BlockBasic("crsand","crsand", Material.SAND, SoundType.SAND,0.5f,2.5f,0);
        compressedSand = new BlockBasic("csand","csand", Material.SAND, SoundType.SAND,0.5f,2.5f,0);
        compressedGravel = new BlockBasic("cgravel","cgravel", Material.GROUND, SoundType.GROUND,0.5f,2.5f,0);
    }

    public static void register()
    {
        registerBlock(compressedCobble);
        registerBlock(compressedAndesite);
        registerBlock(compressedDiorite);
        registerBlock(compressedGranite);
        registerBlock(compressedNetherrack);

        registerBlock(compressedDirt);
        registerBlock(compressedRedSand);
        registerBlock(compressedSand);
        registerBlock(compressedGravel);
    }

    public static void registerRenders()
    {
        registerRender(compressedCobble);
        registerRender(compressedAndesite);
        registerRender(compressedDiorite);
        registerRender(compressedGranite);
        registerRender(compressedNetherrack);

        registerRender(compressedDirt);
        registerRender(compressedRedSand);
        registerRender(compressedSand);
        registerRender(compressedGravel);
    }

    public static void registerBlock(Block block)
    {
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    public static void registerBlock(Block block, ItemBlock itemBlock)
    {

        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock.setRegistryName(block.getRegistryName()));
    }

    ///Regular Block regRender
    public static void registerRender(Block block)
    {
        //ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.getUnlocalizedName().substring(5),"inventory")));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(references.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
    }

    public static void registerRender(Block block, int meta, String fileName)
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(references.MODID, fileName), "inventory"));
    }
}

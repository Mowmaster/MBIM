package com.mowmaster.miscblocksitemsandmore.world.biomes;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.BiomeManager;

import static com.mowmaster.miscblocksitemsandmore.world.BiomeReg.MinersDelight;

/**
 * Created by KingMowmaster on 8/6/2016.
 */
public class BiomeMinersDelight extends Biome
{
    public BiomeMinersDelight(BiomeProperties properties)
    {
        super(properties);

        this.topBlock = Blocks.GRASS.getDefaultState();
        this.fillerBlock = Blocks.STONE.getDefaultState();


        this.theBiomeDecorator.coalGen = new WorldGenMinable(Blocks.COAL_ORE.getDefaultState(),64);
        this.theBiomeDecorator.coalGen = new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(),16);
        this.theBiomeDecorator.ironGen = new WorldGenMinable(Blocks.REDSTONE_ORE.getDefaultState(),64);
        this.theBiomeDecorator.ironGen = new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(),32);
        this.theBiomeDecorator.ironGen = new WorldGenMinable(Blocks.GOLD_ORE.getDefaultState(),8);
        this.theBiomeDecorator.redstoneGen = new WorldGenMinable(Blocks.REDSTONE_ORE.getDefaultState(),64);
        this.theBiomeDecorator.lapisGen = new WorldGenMinable(Blocks.LAPIS_ORE.getDefaultState(),16);
        this.theBiomeDecorator.goldGen = new WorldGenMinable(Blocks.GOLD_ORE.getDefaultState(),16);
        this.theBiomeDecorator.goldGen = new WorldGenMinable(Blocks.DIAMOND_ORE.getDefaultState(),4);
        this.theBiomeDecorator.goldGen = new WorldGenMinable(Blocks.EMERALD_ORE.getDefaultState(),1);
        this.theBiomeDecorator.diamondGen = new WorldGenMinable(Blocks.DIAMOND_ORE.getDefaultState(),8);
        this.theBiomeDecorator.diamondGen = new WorldGenMinable(Blocks.EMERALD_ORE.getDefaultState(),2);

        //this.spawnableCaveCreatureList.clear();
        //this.spawnableMonsterList.clear();

    }


}

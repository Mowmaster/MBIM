package com.mowmaster.miscblocksitemsandmore.world.biomes;


import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkProviderSettings;
import net.minecraft.world.gen.feature.WorldGenMinable;


public class BiomeMinersDelight extends Biome
{


    public BiomeMinersDelight(BiomeProperties properties)
    {
        super(properties);

        this.topBlock = Blocks.GRASS.getDefaultState();
        this.fillerBlock = Blocks.STONE.getDefaultState();


        this.theBiomeDecorator.dirtGen = new WorldGenMinable(Blocks.GOLD_BLOCK.getDefaultState(),10);

        this.theBiomeDecorator.gravelGen = new WorldGenMinable(Blocks.DIAMOND_BLOCK.getDefaultState(),10);

        this.spawnableCaveCreatureList.clear();
        this.spawnableMonsterList.clear();

    }


}

package com.mowmaster.miscblocksitemsandmore.world.biomes;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenMinable;


public class BiomeMinersDelight extends Biome
{


    public BiomeMinersDelight(BiomeProperties properties)
    {
        super(properties);

        this.topBlock = Blocks.GRASS.getDefaultState();
        this.fillerBlock = Blocks.STONE.getDefaultState();


        this.theBiomeDecorator.dirtGen = new WorldGenMinable(Blocks.COAL_ORE.getDefaultState(),10);
        this.theBiomeDecorator.dirtGen = new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(),10);
        this.theBiomeDecorator.dirtGen = new WorldGenMinable(Blocks.REDSTONE_ORE.getDefaultState(),10);
        this.theBiomeDecorator.dirtGen = new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(),10);
        this.theBiomeDecorator.dirtGen = new WorldGenMinable(Blocks.GOLD_ORE.getDefaultState(),10);
        this.theBiomeDecorator.dirtGen = new WorldGenMinable(Blocks.REDSTONE_ORE.getDefaultState(),10);
        this.theBiomeDecorator.dirtGen = new WorldGenMinable(Blocks.LAPIS_ORE.getDefaultState(),10);
        this.theBiomeDecorator.dirtGen = new WorldGenMinable(Blocks.GOLD_ORE.getDefaultState(),10);
        this.theBiomeDecorator.dirtGen = new WorldGenMinable(Blocks.DIAMOND_ORE.getDefaultState(),10);
        this.theBiomeDecorator.dirtGen = new WorldGenMinable(Blocks.EMERALD_ORE.getDefaultState(),10);
        this.theBiomeDecorator.dirtGen = new WorldGenMinable(Blocks.DIAMOND_ORE.getDefaultState(),10);
        this.theBiomeDecorator.dirtGen = new WorldGenMinable(Blocks.EMERALD_ORE.getDefaultState(),10);

        this.theBiomeDecorator.gravelGen = new WorldGenMinable(Blocks.COAL_ORE.getDefaultState(),10);
        this.theBiomeDecorator.gravelGen = new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(),10);
        this.theBiomeDecorator.gravelGen = new WorldGenMinable(Blocks.REDSTONE_ORE.getDefaultState(),10);
        this.theBiomeDecorator.gravelGen = new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(),10);
        this.theBiomeDecorator.gravelGen = new WorldGenMinable(Blocks.GOLD_ORE.getDefaultState(),10);
        this.theBiomeDecorator.gravelGen = new WorldGenMinable(Blocks.REDSTONE_ORE.getDefaultState(),10);
        this.theBiomeDecorator.gravelGen = new WorldGenMinable(Blocks.LAPIS_ORE.getDefaultState(),10);
        this.theBiomeDecorator.gravelGen = new WorldGenMinable(Blocks.GOLD_ORE.getDefaultState(),10);
        this.theBiomeDecorator.gravelGen = new WorldGenMinable(Blocks.DIAMOND_ORE.getDefaultState(),10);
        this.theBiomeDecorator.gravelGen = new WorldGenMinable(Blocks.EMERALD_ORE.getDefaultState(),10);
        this.theBiomeDecorator.gravelGen = new WorldGenMinable(Blocks.DIAMOND_ORE.getDefaultState(),10);
        this.theBiomeDecorator.gravelGen = new WorldGenMinable(Blocks.EMERALD_ORE.getDefaultState(),10);

        this.spawnableCaveCreatureList.clear();
        this.spawnableMonsterList.clear();

    }


}

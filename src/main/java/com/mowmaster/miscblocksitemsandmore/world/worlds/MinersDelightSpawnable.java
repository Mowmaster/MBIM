package com.mowmaster.miscblocksitemsandmore.world.worlds;

import net.minecraft.world.WorldType;
import net.minecraft.world.gen.layer.*;


public class MinersDelightSpawnable extends WorldType
{
    public MinersDelightSpawnable(String name)
    {
        super(name);
    }
    @Override
    public GenLayer getBiomeLayer(long worldSeed, GenLayer parentLayer, String chunkProviderSettingsJson)
    {
        GenLayer ret = new MinersDelightGenLayerBiome(200L, parentLayer, this, chunkProviderSettingsJson);
        ret = GenLayerZoom.magnify(1000L, ret, 2);
        ret = new GenLayerBiomeEdge(1000L, ret);
        return ret;
    }
}

package com.mowmaster.mbim.blocks;

import com.mowmaster.mbim.reference.ModTab;
import com.mowmaster.mbim.reference.references;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

/**
 * Created by KingMowmaster on 3/4/2018.
 */
public class BlockBasic extends Block
{
    public BlockBasic(String unloc, String registryName, Material material, SoundType sound, float hardness, float resistance, int light)
    {
        super(material);
        this.setUnlocalizedName(unloc);
        this.setRegistryName(new ResourceLocation(references.MODID, registryName));
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightOpacity(light);
        this.setSoundType(sound);
        this.setCreativeTab(ModTab.MODTAB);
    }
}

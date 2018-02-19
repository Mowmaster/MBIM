package com.mowmaster.mbim.items;

import com.mowmaster.mbim.reference.references;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by KingMowmaster on 12/24/2017.
 */
public class ItemBasic extends Item
{
    public ItemBasic(String unlocalName,String regName)
    {
        this.setUnlocalizedName(unlocalName);
        this.setRegistryName(new ResourceLocation(references.MODID, regName));
        this.maxStackSize = 64;
    }

}

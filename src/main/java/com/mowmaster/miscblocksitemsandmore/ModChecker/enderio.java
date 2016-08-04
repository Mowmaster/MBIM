package com.mowmaster.miscblocksitemsandmore.ModChecker;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by KingMowmaster on 8/3/2016.
 */
public class enderio
{
    public static void enderCheck()
    {
        if (Loader.isModLoaded("EnderIO"))
        {

            Item EIInvPan = Item.REGISTRY.getObject(new ResourceLocation("enderio:blockInventoryPanel"));
            Item EITravStaf = Item.REGISTRY.getObject(new ResourceLocation("enderio:itemTravelStaff"));
            Item EIRemInv = Item.REGISTRY.getObject(new ResourceLocation("enderio:itemRemoteInvAccess"));

            GameRegistry.addShapedRecipe(new ItemStack(EIRemInv,1), "  X", "XYX", "XZX", 'X', Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE, 'Y',EIInvPan,'Z', EITravStaf);
        }
    }
}

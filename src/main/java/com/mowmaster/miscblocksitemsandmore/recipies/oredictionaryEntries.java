package com.mowmaster.miscblocksitemsandmore.recipies;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;
import slimeknights.tconstruct.shared.block.BlockClearGlass;

import static com.mowmaster.miscblocksitemsandmore.item.ItemRegistry.fake_pyrothium;

/**
 * Created by KingMowmaster on 9/25/2016.
 */
public class oredictionaryEntries
{

    public static void addEntries()
    {
        OreDictionary.registerOre("dustPyrothium",fake_pyrothium);
    }
}

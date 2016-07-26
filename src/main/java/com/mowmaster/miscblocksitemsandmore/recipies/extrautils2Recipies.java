package com.mowmaster.miscblocksitemsandmore.recipies;

import com.mowmaster.miscblocksitemsandmore.ModChecker.extrautils2;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by KingMowmaster on 7/26/2016.
 */
public class extrautils2Recipies
{
    public static void extrautils2R()
    {
        GameRegistry.addShapedRecipe(new ItemStack(Item.getByNameOrId("pipe"),8), new Object[]{"XXX","YZY", "XXX", 'X', new ItemStack(Blocks.STONE_SLAB),'Y', new ItemStack(Blocks.GLASS), 'Z', new ItemStack(Items.REDSTONE)});
    }
}

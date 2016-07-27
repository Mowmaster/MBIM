package com.mowmaster.miscblocksitemsandmore.ModChecker;


import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static com.mowmaster.miscblocksitemsandmore.recipies.removeRecipies.removeCrafting;


public class extrautils2
{
    public static void checkUtils2()
    {
        if (Loader.isModLoaded("ExtraUtils2"))
        {
            Item EU2Pipe = Item.REGISTRY.getObject(new ResourceLocation("extrautils2:pipe"));




            //Removed Recipies
            removeCrafting(EU2Pipe);


            //Added Recipies
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(EU2Pipe,8), new Object[]{"XXX","YZY", "XXX", 'X',new ItemStack(Blocks.STONE_SLAB),'Y', "blockGlass",'Z', new ItemStack(Items.REDSTONE)}));




        }
    }
}

package com.mowmaster.miscblocksitemsandmore.ModChecker;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static com.mowmaster.miscblocksitemsandmore.recipies.removeRecipies.removeCrafting;

/**
 * Created by KingMowmaster on 7/26/2016.
 */
public class quark
{
    public static void checkQuark()
    {
        if (Loader.isModLoaded("Quark"))
        {

            Item QBeds = Item.REGISTRY.getObject(new ResourceLocation("quark:colored_bed_item"));




            //Removed Recipies


            //Added Recipies
            //GameRegistry.addShapedRecipe(new ItemStack(CFBCounter,1), new Object[]{"X","Y", 'X',new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,15),'Y', new ItemStack(Blocks.CHEST)});
            //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CFBTable,1), new Object[]{"XXX","YZY", "YYY", 'X',new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,15),'Y', "logWood",'Z', new ItemStack(CFBBook,1,2)}));




        }
    }
}

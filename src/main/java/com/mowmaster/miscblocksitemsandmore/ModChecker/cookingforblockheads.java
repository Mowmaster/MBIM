package com.mowmaster.miscblocksitemsandmore.ModChecker;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static com.mowmaster.miscblocksitemsandmore.recipies.removeRecipies.removeCrafting;
import static net.minecraft.init.Blocks.LOG;


public class cookingforblockheads
{
    public static void checkCFB()
    {
        if (Loader.isModLoaded("cookingforblockheads"))
        {
            Item CFBTable = Item.REGISTRY.getObject(new ResourceLocation("cookingforblockheads:cookingTable"));
            Item CFBCounter = Item.REGISTRY.getObject(new ResourceLocation("cookingforblockheads:counter"));
            Item CFBBook = Item.REGISTRY.getObject(new ResourceLocation("cookingforblockheads:recipeBook"));
            //version 3 of the book = meta 2




            //Removed Recipies
            removeCrafting(CFBTable);


            //Added Recipies
            GameRegistry.addShapedRecipe(new ItemStack(CFBCounter,1), new Object[]{"X","Y", 'X',new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,15),'Y', new ItemStack(Blocks.CHEST)});
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CFBTable,1), new Object[]{"XXX","YZY", "YYY", 'X',new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,15),'Y', "logWood",'Z', new ItemStack(CFBBook,1,2)}));





        }
    }
}

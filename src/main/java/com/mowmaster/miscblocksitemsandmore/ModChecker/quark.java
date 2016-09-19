package com.mowmaster.miscblocksitemsandmore.ModChecker;

import com.mowmaster.miscblocksitemsandmore.Configs.config;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import static com.mowmaster.miscblocksitemsandmore.recipies.removeRecipies.removeCrafting;


public class quark
{
    public static void checkQuark() {
        if (config.NewEraTweaks) {
            if (Loader.isModLoaded("Quark")) {

                Item QBeds = Item.REGISTRY.getObject(new ResourceLocation("quark:colored_bed_item"));
                Item QChest = Item.REGISTRY.getObject(new ResourceLocation("quark:custom_chest"));
                Item QTCrest = Item.REGISTRY.getObject(new ResourceLocation("quark:custom_chest_trap"));
                Item QFrame = Item.REGISTRY.getObject(new ResourceLocation("quark:colored_item_frame"));
                Item QShelf = Item.REGISTRY.getObject(new ResourceLocation("quark:custom_bookshelf"));


                //Quark Chests/BookShelves into their Vanilla counterparts

                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.CHEST, 1), new ItemStack(QChest, 1, OreDictionary.WILDCARD_VALUE));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.TRAPPED_CHEST, 1), new ItemStack(QTCrest, 1, OreDictionary.WILDCARD_VALUE));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BOOKSHELF, 1), new ItemStack(QShelf, 1, OreDictionary.WILDCARD_VALUE));

                //Add colorability for Quark Beds
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 0), "dyeWhite", new ItemStack(QBeds, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 1), "dyeOrange", new ItemStack(QBeds, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 2), "dyeMagenta", new ItemStack(QBeds, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 3), "dyeLightBlue", new ItemStack(QBeds, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 4), "dyeYellow", new ItemStack(QBeds, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 5), "dyeLime", new ItemStack(QBeds, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 6), "dyePink", new ItemStack(QBeds, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 7), "dyeGray", new ItemStack(QBeds, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 8), "dyeLightGray", new ItemStack(QBeds, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 9), "dyeCyan", new ItemStack(QBeds, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 10), "dyePurple", new ItemStack(QBeds, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 11), "dyeBlue", new ItemStack(QBeds, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 12), "dyeBrown", new ItemStack(QBeds, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 13), "dyeGreen", new ItemStack(QBeds, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.BED), "dyeRed", new ItemStack(QBeds, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 14), "dyeBlack", new ItemStack(QBeds, 1, OreDictionary.WILDCARD_VALUE)));


                // Add colorability to the Minecraft Bed...UGG!
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 0), "dyeWhite", new ItemStack(Items.BED)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 1), "dyeOrange", new ItemStack(Items.BED)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 2), "dyeMagenta", new ItemStack(Items.BED)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 3), "dyeLightBlue", new ItemStack(Items.BED)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 4), "dyeYellow", new ItemStack(Items.BED)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 5), "dyeLime", new ItemStack(Items.BED)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 6), "dyePink", new ItemStack(Items.BED)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 7), "dyeGray", new ItemStack(Items.BED)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 8), "dyeLightGray", new ItemStack(Items.BED)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 9), "dyeCyan", new ItemStack(Items.BED)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 10), "dyePurple", new ItemStack(Items.BED)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 11), "dyeBlue", new ItemStack(Items.BED)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 12), "dyeBrown", new ItemStack(Items.BED)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 13), "dyeGreen", new ItemStack(Items.BED)));
                //GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.BED), "dyeRed", new ItemStack(Items.BED))); Removed because it seems silly
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, 14), "dyeBlack", new ItemStack(Items.BED)));

                //All The Colored Item Frames!
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QFrame, 1, 0), "dyeWhite", new ItemStack(QFrame, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QFrame, 1, 1), "dyeOrange", new ItemStack(QFrame, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QFrame, 1, 2), "dyeMagenta", new ItemStack(QFrame, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QFrame, 1, 3), "dyeLightBlue", new ItemStack(QFrame, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QFrame, 1, 4), "dyeYellow", new ItemStack(QFrame, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QFrame, 1, 5), "dyeLime", new ItemStack(QFrame, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QFrame, 1, 6), "dyePink", new ItemStack(QFrame, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QFrame, 1, 7), "dyeGray", new ItemStack(QFrame, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QFrame, 1, 8), "dyeLightGray", new ItemStack(QFrame, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QFrame, 1, 9), "dyeCyan", new ItemStack(QFrame, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QFrame, 1, 10), "dyePurple", new ItemStack(QFrame, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QFrame, 1, 11), "dyeBlue", new ItemStack(QFrame, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QFrame, 1, 12), "dyeBrown", new ItemStack(QFrame, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QFrame, 1, 13), "dyeGreen", new ItemStack(QFrame, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QFrame, 1, 14), "dyeRed", new ItemStack(QFrame, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QFrame, 1, 15), "dyeBlack", new ItemStack(QFrame, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.ITEM_FRAME), "listAllwater", new ItemStack(QFrame, 1, OreDictionary.WILDCARD_VALUE)));
                    //GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.ITEM_FRAME), Items.POTIONITEM, new ItemStack(QFrame,1,meta))); //Potions wash Frames?!

            }

        }
    }
}

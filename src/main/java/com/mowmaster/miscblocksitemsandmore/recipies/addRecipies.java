package com.mowmaster.miscblocksitemsandmore.recipies;

import com.mowmaster.miscblocksitemsandmore.Configs.config;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionAbsorption;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import static com.mowmaster.miscblocksitemsandmore.item.ItemRegistry.*;




public class addRecipies
{
    public static void bR()
    {
            if (config.RecyclableGlass) {
            //Glass dust into Glass recipies
            GameRegistry.addShapelessRecipe(new ItemStack(glass_tinypile, 1), new ItemStack(Blocks.GLASS_PANE, 1));
            GameRegistry.addShapelessRecipe(new ItemStack(glass_pile, 1), new ItemStack(Items.GLASS_BOTTLE, 1));
            GameRegistry.addShapedRecipe(new ItemStack(glass_pile, 1), new Object[]{"XX", "XX", 'X', new ItemStack(glass_tinypile, 1)});
            GameRegistry.addShapedRecipe(new ItemStack(glass_largepile, 1), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(glass_pile, 1)});
            GameRegistry.addSmelting(new ItemStack(glass_pile), new ItemStack(Blocks.GLASS, 1), 0.1F);
            GameRegistry.addSmelting(new ItemStack(glass_largepile), new ItemStack(Blocks.GLASS, 9), 0.9F);
            }

            if (config.HammaTime) {
            // Added to smash and crush things when needed
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(tool_hammer, 1), new Object[]{"XXX", "XYX", " Y ", 'X', "ingotIron", 'Y', Items.STICK}));
            }
        //Vanilla Tweaks
            if (config.FlintForDays) {
                //Gravel into Flint
                GameRegistry.addShapedRecipe(new ItemStack(Items.FLINT, 1), new Object[]{"XX", 'X', new ItemStack(Blocks.GRAVEL)});
                GameRegistry.addShapedRecipe(new ItemStack(Items.FLINT, 1), new Object[]{"X", "X", 'X', new ItemStack(Blocks.GRAVEL)});
            }
            if (config.LeatherForDays) {
                //Rotten Flesh into Leather
                GameRegistry.addSmelting(new ItemStack(Items.ROTTEN_FLESH), new ItemStack(Items.LEATHER, 1), 0.1F);
            }
            if (config.CompactUncrafting) {
                // Uncrafting of Compact Blocks
                GameRegistry.addShapelessRecipe(new ItemStack(Items.NETHER_WART, 9), new ItemStack(Block.getBlockFromName("nether_wart_block"), 1));
                GameRegistry.addShapelessRecipe(new ItemStack(Items.MAGMA_CREAM, 4), new ItemStack(Block.getBlockFromName("magma"), 1));
            }

    }
}

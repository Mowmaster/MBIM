package com.mowmaster.miscblocksitemsandmore.recipies;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.mowmaster.miscblocksitemsandmore.item.ItemRegistry.*;

/**
 * Created by KingMowmaster on 6/22/2016.
 */
public class addRecipies
{
    public static void bR()
    {

        //Glass dust into Glass recipies
        GameRegistry.addShapelessRecipe(new ItemStack(glass_tinypile,1), new ItemStack(Blocks.GLASS_PANE,1));
        GameRegistry.addShapelessRecipe(new ItemStack(glass_pile,1), new ItemStack(Items.GLASS_BOTTLE,1));
        GameRegistry.addShapedRecipe(new ItemStack(glass_pile,1), new Object[]{"XX","XX", 'X', new ItemStack(glass_tinypile, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(glass_largepile, 1), new Object[]{"XXX","XXX","XXX", 'X', new ItemStack(glass_pile, 1)});
        GameRegistry.addSmelting(new ItemStack(glass_pile), new ItemStack(Blocks.GLASS,1),0.1F);
        GameRegistry.addSmelting(new ItemStack(glass_largepile), new ItemStack(Blocks.GLASS,9),0.9F);

        //Rotten Flesh into Leather
        GameRegistry.addSmelting(new ItemStack(Items.ROTTEN_FLESH), new ItemStack(Items.LEATHER,1),0.1F);
    }
}

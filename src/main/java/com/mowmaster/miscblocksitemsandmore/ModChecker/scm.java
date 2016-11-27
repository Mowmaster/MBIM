package com.mowmaster.miscblocksitemsandmore.ModChecker;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static com.mowmaster.miscblocksitemsandmore.recipies.removeRecipies.removeCrafting;

/**
 * Created by KingMowmaster on 11/27/2016.
 */
public class scm
{
    public static void scmcheck()
    {
        Item SCMRedstone = Item.REGISTRY.getObject(new ResourceLocation("rscircuits:resource"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCMRedstone,45,0), new Object[]{"X X"," X ","X X", 'X', "dustRedstone"}));
    }
}

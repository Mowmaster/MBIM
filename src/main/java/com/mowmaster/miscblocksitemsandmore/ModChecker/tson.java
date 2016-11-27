package com.mowmaster.miscblocksitemsandmore.ModChecker;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static com.mowmaster.miscblocksitemsandmore.recipies.removeRecipies.removeCrafting;

/**
 * Created by KingMowmaster on 11/27/2016.
 */
public class tson
{
    public static void tsoncheck()
    {
        Item TSONStick = Item.REGISTRY.getObject(new ResourceLocation("cavecraft:stickIron"));
        Item TSONCatalyst = Item.REGISTRY.getObject(new ResourceLocation("cavecraft:woodCatalystb"));


        removeCrafting(TSONStick);
        removeCrafting(TSONCatalyst);

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TSONCatalyst, 1), new Object[]{"XX","XX", 'X', "barkWood"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TSONStick, 6), new Object[]{"  X"," X ","X  ", 'X', "ingotIron"}));
    }
}

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
public class miscfixes
{
    public static void miscfixescheck()
    {
        Item BPStick = Item.REGISTRY.getObject(new ResourceLocation("backpack:stick"));
        //0=stone   1=iron
        Item IEStick = Item.REGISTRY.getObject(new ResourceLocation("immersiveengineering:material"));
        //0=treated,  1=iron, 2=steel, 3=aluminum


        removeCrafting(BPStick);
        removeCrafting(IEStick);

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BPStick, 2, 0), new Object[]{"X","X", 'X', "stone"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BPStick, 2, 1), new Object[]{"X  ","X  ", 'X', "ingotIron"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(IEStick, 4, 0), new Object[]{" X "," X ", 'X', "plankTreatedWood"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(IEStick, 4, 1), new Object[]{" X "," X ", 'X', "ingotIron"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(IEStick, 4, 2), new Object[]{" X "," X ", 'X', "ingotSteel"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(IEStick, 4, 3), new Object[]{" X "," X ", 'X', "ingotAluminium"}));
    }
}

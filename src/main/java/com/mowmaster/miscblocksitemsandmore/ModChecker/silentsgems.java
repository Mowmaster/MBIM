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
public class silentsgems
{
    public static void checkSG()
    {
        if (Loader.isModLoaded("SilentGems"))
        {
            Item SGArmorFrame = Item.REGISTRY.getObject(new ResourceLocation("silentgems:ArmorFrame"));
            Item SGSuperLattice = Item.REGISTRY.getObject(new ResourceLocation("silentgems:CraftingMaterial"));
            Item SGHelmet = Item.REGISTRY.getObject(new ResourceLocation("silentgems:Helmet"));
            Item SGChestplate = Item.REGISTRY.getObject(new ResourceLocation("silentgems:Chestplate"));
            Item SGLeggings = Item.REGISTRY.getObject(new ResourceLocation("silentgems:Leggings"));
            Item SGBoots = Item.REGISTRY.getObject(new ResourceLocation("silentgems:Boots"));
            Item SGGem = Item.REGISTRY.getObject(new ResourceLocation("silentgems:Gem"));
            Item SGToken = Item.REGISTRY.getObject(new ResourceLocation("silentgems:EnchantmentToken"));



            //Removed Recipies
            removeCrafting(SGArmorFrame);
            //removeCrafting(SGHelmet);
            //removeCrafting(SGChestplate);
            //removeCrafting(SGLeggings);
            //removeCrafting(SGBoots);


            //Added Recipies
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SGArmorFrame,1,8), new Object[]{"XXX","X X", 'X',new ItemStack(SGSuperLattice,1,26)}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SGArmorFrame,1,9), new Object[]{"X X","XXX", "XXX", 'X',new ItemStack(SGSuperLattice,1,26)}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SGArmorFrame,1,10), new Object[]{"XXX","X X", "X X", 'X',new ItemStack(SGSuperLattice,1,26)}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SGArmorFrame,1,11), new Object[]{"X X","X X", 'X',new ItemStack(SGSuperLattice,1,26)}));





        }
    }
}

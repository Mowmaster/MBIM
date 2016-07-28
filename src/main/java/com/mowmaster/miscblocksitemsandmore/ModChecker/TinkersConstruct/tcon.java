package com.mowmaster.miscblocksitemsandmore.ModChecker.TinkersConstruct;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import slimeknights.tconstruct.library.TinkerRegistry;

import static com.mowmaster.miscblocksitemsandmore.recipies.removeRecipies.removeCrafting;

/**
 * Created by KingMowmaster on 7/26/2016.
 */
public class tcon
{
    public static void checkTCon()
    {
        if (Loader.isModLoaded("tconstruct"))
        {
            Item ThrowBall = Item.REGISTRY.getObject(new ResourceLocation("tconstruct:throwball"));
            Item TCMSlimeCrystal = Item.REGISTRY.getObject(new ResourceLocation("tconstruct:materials"));




            //Removed Recipies
            removeCrafting(ThrowBall);


            //Added Recipies
            //EFLN
            GameRegistry.addShapedRecipe(new ItemStack(ThrowBall,2,1), new Object[]{"XYX","YZY","XYX", 'X', new ItemStack(Items.GUNPOWDER, 1), 'Y',new ItemStack(Items.MAGMA_CREAM,1),'Z', new ItemStack(TCMSlimeCrystal,1,11)});
            //GlowstoneThrowableThingy
            GameRegistry.addShapedRecipe(new ItemStack(ThrowBall,4,0), new Object[]{"XXX","XYX","XXX", 'X', new ItemStack(Items.SNOWBALL, 1), 'Y',new ItemStack(Items.GLOWSTONE_DUST)});


        }

    }
}

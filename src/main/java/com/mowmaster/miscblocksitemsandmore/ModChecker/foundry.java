package com.mowmaster.miscblocksitemsandmore.ModChecker;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import slimeknights.tconstruct.library.TinkerRegistry;

import static com.mowmaster.miscblocksitemsandmore.recipies.removeRecipies.removeCrafting;

/**
 * Created by KingMowmaster on 7/29/2016.
 */
public class foundry
{
    public static void checkFound()
    {
        if (Loader.isModLoaded("foundry"))
        {
            //Item ThrowBall = Item.REGISTRY.getObject(new ResourceLocation("tconstruct:throwball"));
            //Fluid Enderium = new Fluid("enderium", new ResourceLocation("foundry:liquidEnderium", new ResourceLocation("foundry:liquidEnderium"))) ;
            //Item EnderiumIngot = Item.REGISTRY.getObject(new ResourceLocation("substratum:ingot:15"));



            //TinkerRegistry.registerMelting(EnderiumIngot,Enderium,144);
            //Removed Recipies
            //removeCrafting(ThrowBall);


            //Added Recipies



        }

    }
}

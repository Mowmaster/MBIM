package com.mowmaster.miscblocksitemsandmore.ModChecker.TinkersConstruct;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.Loader;
import slimeknights.tconstruct.library.TinkerRegistry;

import static com.mowmaster.miscblocksitemsandmore.item.ItemRegistry.glass_largepile;
import static com.mowmaster.miscblocksitemsandmore.item.ItemRegistry.glass_pile;
import static com.mowmaster.miscblocksitemsandmore.item.ItemRegistry.glass_tinypile;
import static slimeknights.tconstruct.shared.TinkerFluids.*;
import static slimeknights.tconstruct.smeltery.TinkerSmeltery.cast;
import static slimeknights.tconstruct.smeltery.TinkerSmeltery.castCustom;
import static slimeknights.tconstruct.smeltery.TinkerSmeltery.clayCast;

/**
 * Created by KingMowmaster on 7/28/2016.
 */
public class tconintegration
{
    public static void checkTCon2()
    {

        if (Loader.isModLoaded("tconstruct"))
        {
            //Smeltable Casts
            TinkerRegistry.registerMelting(cast,brass,144 );
            TinkerRegistry.registerMelting(castCustom,brass,144 );
            TinkerRegistry.registerMelting(clayCast,clay,288 );
            // Ways to get Steel
            TinkerRegistry.registerMelting(Items.CHAINMAIL_HELMET,steel,720 );
            TinkerRegistry.registerMelting(Items.CHAINMAIL_CHESTPLATE,steel,1152 );
            TinkerRegistry.registerMelting(Items.CHAINMAIL_LEGGINGS,steel,1008 );
            TinkerRegistry.registerMelting(Items.CHAINMAIL_BOOTS,steel,576 );
            // Glass Recycling
            TinkerRegistry.registerMelting(glass_largepile,glass,11664 );
            TinkerRegistry.registerMelting(glass_pile,glass,1296 );
            TinkerRegistry.registerMelting(glass_tinypile,glass,486 );

            TinkerRegistry.registerMelting(Items.GLASS_BOTTLE,glass,1296 );

            // Smelting Substratum ingots down into Foundry Fluids
            //PurpleSlime is a Placeholder for the time being
            TinkerRegistry.registerMelting(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("substratum:ingot")),1,15),FluidRegistry.getFluid("purpleslime"),144);
            //TinkerRegistry.registerAlloy();
        }

    }
}

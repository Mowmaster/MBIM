package com.mowmaster.miscblocksitemsandmore.ModChecker.TinkersConstruct;

import com.mowmaster.miscblocksitemsandmore.Configs.config;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
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

            if (config.RecyclableGlass) {
                // Glass Recycling
                TinkerRegistry.registerMelting(glass_largepile, glass, 11664);
                TinkerRegistry.registerMelting(glass_pile, glass, 1296);
                TinkerRegistry.registerMelting(glass_tinypile, glass, 486);
            }

            TinkerRegistry.registerMelting(Items.GLASS_BOTTLE,glass,1296 );

            if (Loader.isModLoaded("foundry")) {
                // Smelting Substratum ingots down into Foundry Fluids
                TinkerRegistry.registerMelting(Items.ENDER_PEARL, FluidRegistry.getFluid("liquidenderpearl"), 250);
                TinkerRegistry.registerMelting(Items.GLOWSTONE_DUST, FluidRegistry.getFluid("liquidglowstone"), 100);
                TinkerRegistry.registerMelting(Blocks.GLOWSTONE, FluidRegistry.getFluid("liquidglowstone"), 400);
                TinkerRegistry.registerMelting(Items.REDSTONE, FluidRegistry.getFluid("liquidredstone"), 100);
                TinkerRegistry.registerMelting(Blocks.REDSTONE_BLOCK, FluidRegistry.getFluid("liquidredstone"), 900);
                TinkerRegistry.registerMelting(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("substratum:ingot")), 1, 15), FluidRegistry.getFluid("liquidenderium"), 108);
                TinkerRegistry.registerMelting(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("substratum:ingot")), 1, 11), FluidRegistry.getFluid("liquidplatinum"), 108);
                TinkerRegistry.registerMelting(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("substratum:ingot")), 1, 13), FluidRegistry.getFluid("liquidsignalum"), 108);
                TinkerRegistry.registerMelting(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("substratum:ingot")), 1, 14), FluidRegistry.getFluid("liquidlumium"), 108);
                TinkerRegistry.registerMelting(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("substratum:ingot")), 1, 4), FluidRegistry.getFluid("liquidinvar"), 108);
                TinkerRegistry.registerMelting(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("substratum:ingot")), 1, 12), FluidRegistry.getFluid("liquidcupronickel"), 108);
                TinkerRegistry.registerMelting(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("substratum:ingot")), 1, 18), FluidRegistry.getFluid("liquidchrome"), 108);
                TinkerRegistry.registerMelting(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("substratum:ingot")), 1, 16), aluminum, 144);
                //EnderIO Added dark steel to the liquid options
                TinkerRegistry.registerMelting(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("enderio:itemAlloy")),1,6), FluidRegistry.getFluid("liquiddarksteel"), 108);

                TinkerRegistry.registerMelting("oreChrome", FluidRegistry.getFluid("liquidchrome"), 216);
                TinkerRegistry.registerMelting("orePlatinum", FluidRegistry.getFluid("liquidplatinum"), 216);
                TinkerRegistry.registerMelting("oreAlumina", aluminum, 288);
/*
                // Foundry to TCon is a 4:3 Ratio (432 is the common factor)or 144mb:108mb
                //Enderium
                TinkerRegistry.registerAlloy(new FluidStack(FluidRegistry.getFluid("liquidenderium"), 2), new FluidStack(FluidRegistry.getFluid("liquidplatinum"), 1), new FluidStack(FluidRegistry.getFluid("silver"), 1), new FluidStack(FluidRegistry.getFluid("liquidenderpearl"), 9), new FluidStack(FluidRegistry.getFluid("tin"), 2));
                TinkerRegistry.registerAlloy(new FluidStack(FluidRegistry.getFluid("liquidenderium"), 2), new FluidStack(FluidRegistry.getFluid("liquidplatinum"), 1), new FluidStack(FluidRegistry.getFluid("liquidsilver"), 1), new FluidStack(FluidRegistry.getFluid("liquidenderpearl"), 9), new FluidStack(FluidRegistry.getFluid("liquidtin"), 2));
                //Invar
                TinkerRegistry.registerAlloy(new FluidStack(FluidRegistry.getFluid("liquidinvar"), 9), new FluidStack(FluidRegistry.getFluid("iron"), 6), new FluidStack(FluidRegistry.getFluid("nickel"), 3));
                TinkerRegistry.registerAlloy(new FluidStack(FluidRegistry.getFluid("liquidinvar"), 12), new FluidStack(FluidRegistry.getFluid("liquidiron"), 8), new FluidStack(FluidRegistry.getFluid("liquidnickel"), 4));
                //Signalum
                TinkerRegistry.registerAlloy(new FluidStack(FluidRegistry.getFluid("liquidsignalum"), 12), new FluidStack(FluidRegistry.getFluid("copper"), 6), new FluidStack(FluidRegistry.getFluid("silver"), 3), new FluidStack(FluidRegistry.getFluid("liquidredstone"), 10));
                TinkerRegistry.registerAlloy(new FluidStack(FluidRegistry.getFluid("liquidsignalum"), 16), new FluidStack(FluidRegistry.getFluid("liquidcopper"), 8), new FluidStack(FluidRegistry.getFluid("liquidsilver"), 4), new FluidStack(FluidRegistry.getFluid("liquidredstone"), 10));
                //Lumium
                TinkerRegistry.registerAlloy(new FluidStack(FluidRegistry.getFluid("liquidlumium"), 12), new FluidStack(FluidRegistry.getFluid("tin"), 9), new FluidStack(FluidRegistry.getFluid("silver"), 3), new FluidStack(FluidRegistry.getFluid("liquidglowstone"), 10));
                TinkerRegistry.registerAlloy(new FluidStack(FluidRegistry.getFluid("liquidlumium"), 16), new FluidStack(FluidRegistry.getFluid("liquidtin"), 12), new FluidStack(FluidRegistry.getFluid("liquidsilver"), 4), new FluidStack(FluidRegistry.getFluid("liquidglowstone"), 10));
                //Cupronickel
                TinkerRegistry.registerAlloy(new FluidStack(FluidRegistry.getFluid("liquidcupronickel"), 6), new FluidStack(FluidRegistry.getFluid("copper"), 3), new FluidStack(FluidRegistry.getFluid("nickel"), 3));
                TinkerRegistry.registerAlloy(new FluidStack(FluidRegistry.getFluid("liquidcupronickel"), 8), new FluidStack(FluidRegistry.getFluid("liquidcopper"), 4), new FluidStack(FluidRegistry.getFluid("liquidnickel"), 4));
*/
            }


        }

    }
}

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
import static slimeknights.tconstruct.smeltery.TinkerSmeltery.*;

public class tconintegration
{
    public static void checkTCon2()
    {
        if (config.NewEraTweaks) {
            if (Loader.isModLoaded("tconstruct")) {


                //Smeltable Casts
                TinkerRegistry.registerMelting(cast, brass, 144);
                TinkerRegistry.registerMelting(castCustom, brass, 144);
                TinkerRegistry.registerMelting(clayCast, clay, 288);
                // Ways to get Steel
                //Using Itemstack required an unbroken items to be meltable
                TinkerRegistry.registerMelting(new ItemStack(Items.CHAINMAIL_HELMET), steel, 720);
                TinkerRegistry.registerMelting(new ItemStack(Items.CHAINMAIL_CHESTPLATE), steel, 1152);
                TinkerRegistry.registerMelting(new ItemStack(Items.CHAINMAIL_LEGGINGS), steel, 1008);
                TinkerRegistry.registerMelting(new ItemStack(Items.CHAINMAIL_BOOTS), steel, 576);

                if (config.RecyclableGlass) {
                    // Glass Recycling
                    TinkerRegistry.registerMelting(glass_largepile, glass, 11664);
                    TinkerRegistry.registerMelting(glass_pile, glass, 1296);
                    TinkerRegistry.registerMelting(glass_tinypile, glass, 486);
                }

                TinkerRegistry.registerMelting(Items.GLASS_BOTTLE, glass, 1296);

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
                    TinkerRegistry.registerMelting(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("enderio:itemAlloy")), 1, 6), FluidRegistry.getFluid("liquiddarksteel"), 108);

                    TinkerRegistry.registerMelting("oreChrome", FluidRegistry.getFluid("liquidchrome"), 216);
                    TinkerRegistry.registerMelting("orePlatinum", FluidRegistry.getFluid("liquidplatinum"), 216);
                    TinkerRegistry.registerMelting("oreAlumina", aluminum, 288);

                }

                Item SlimeBall = Item.REGISTRY.getObject(new ResourceLocation("tconstruct:edible"));
                Item ConSlime = Item.REGISTRY.getObject(new ResourceLocation("tconstruct:slime_congealed"));

                TinkerRegistry.registerMelting(new ItemStack(SlimeBall,1,1),blueslime,250);
                TinkerRegistry.registerMelting(new ItemStack(ConSlime,1,1),blueslime,1000);
                TinkerRegistry.registerTableCasting(new ItemStack(SlimeBall,1,2),null,purpleSlime,250);
                TinkerRegistry.registerTableCasting(new ItemStack(SlimeBall,1,1),null,blueslime,250);
                TinkerRegistry.registerBasinCasting(new ItemStack(ConSlime,1,2),null,purpleSlime,1000);
                TinkerRegistry.registerBasinCasting(new ItemStack(ConSlime,1,1),null,blueslime,1000);

            }


    }
}

}
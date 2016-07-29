package com.mowmaster.miscblocksitemsandmore.ModChecker.TinkersConstruct;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import slimeknights.tconstruct.library.TinkerRegistry;

import static com.mowmaster.miscblocksitemsandmore.item.ItemRegistry.glass_largepile;
import static com.mowmaster.miscblocksitemsandmore.item.ItemRegistry.glass_pile;
import static com.mowmaster.miscblocksitemsandmore.item.ItemRegistry.glass_tinypile;
import static slimeknights.tconstruct.shared.TinkerFluids.brass;
import static slimeknights.tconstruct.shared.TinkerFluids.glass;
import static slimeknights.tconstruct.shared.TinkerFluids.steel;
import static slimeknights.tconstruct.smeltery.TinkerSmeltery.cast;

/**
 * Created by KingMowmaster on 7/28/2016.
 */
public class tconintegration
{
    public static void checkTCon2()
    {

        if (Loader.isModLoaded("tconstruct"))
        {
            TinkerRegistry.registerMelting(cast,brass,144 );

            TinkerRegistry.registerMelting(Items.CHAINMAIL_HELMET,steel,720 );
            TinkerRegistry.registerMelting(Items.CHAINMAIL_CHESTPLATE,steel,1152 );
            TinkerRegistry.registerMelting(Items.CHAINMAIL_LEGGINGS,steel,1008 );
            TinkerRegistry.registerMelting(Items.CHAINMAIL_BOOTS,steel,576 );

            TinkerRegistry.registerMelting(glass_largepile,glass,11664 );
            TinkerRegistry.registerMelting(glass_pile,glass,1296 );
            TinkerRegistry.registerMelting(glass_tinypile,glass,486 );

            TinkerRegistry.registerMelting(Items.GLASS_BOTTLE,glass,1296 );

            //TinkerRegistry.registerAlloy();
        }

    }
}

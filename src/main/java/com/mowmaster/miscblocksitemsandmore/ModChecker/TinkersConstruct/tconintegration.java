package com.mowmaster.miscblocksitemsandmore.ModChecker.TinkersConstruct;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import slimeknights.tconstruct.library.TinkerRegistry;

import static slimeknights.tconstruct.shared.TinkerFluids.brass;
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
            //TinkerRegistry.registerAlloy();
        }

    }
}

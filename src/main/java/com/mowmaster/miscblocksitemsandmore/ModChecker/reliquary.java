package com.mowmaster.miscblocksitemsandmore.ModChecker;

import com.mowmaster.miscblocksitemsandmore.Configs.config;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.oredict.OreDictionary;

import static com.mowmaster.miscblocksitemsandmore.recipies.removeRecipies.removeCrafting;
/**
 * Created by KingMowmaster on 8/2/2016.
 */
public class reliquary
{
    public static void checkXeno() {
        if (config.NewEraTweaks) {
            if (Loader.isModLoaded("xreliquary")) {
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("xreliquary:alkahestry_tome")));
            }

        }
    }
}

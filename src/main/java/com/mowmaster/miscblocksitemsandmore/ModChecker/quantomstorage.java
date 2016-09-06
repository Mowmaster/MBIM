package com.mowmaster.miscblocksitemsandmore.ModChecker;

import com.mowmaster.miscblocksitemsandmore.Configs.config;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.mowmaster.miscblocksitemsandmore.recipies.removeRecipies.removeCrafting;

public class quantomstorage
{
    public static void quantumCheck() {
        if (config.NewEraTweaks) {
            if (Loader.isModLoaded("QuantumStorage")) {
                Item QStorage = Item.REGISTRY.getObject(new ResourceLocation("quantumstorage:quantumdsu"));
                Item SDupgrade = Item.REGISTRY.getObject(new ResourceLocation("storagedrawers:upgradeStorage"));
                Item ICchest = Item.REGISTRY.getObject(new ResourceLocation("ironchest:BlockIronChest"));

                removeCrafting(QStorage);

                GameRegistry.addShapedRecipe(new ItemStack(QStorage, 1), "XYX", "XZX", "XYX", 'X', new ItemStack(SDupgrade, 1, 2), 'Y', new ItemStack(ICchest, 1, 4), 'Z', Items.EMERALD);
            }
        }
    }
}

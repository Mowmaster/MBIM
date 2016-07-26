package com.mowmaster.miscblocksitemsandmore.ModChecker;


import com.mowmaster.miscblocksitemsandmore.recipies.extrautils2Recipies;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class extrautils2
{
    public static void checkUtils2()
    {
        if (Loader.isModLoaded("extrautils2"))
        {
            extrautils2Recipies.extrautils2R();
        }
    }
}

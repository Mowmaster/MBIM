package com.mowmaster.mbim.reference;

import com.mowmaster.mbim.blocks.BlockRegistry;
import com.mowmaster.mbim.items.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * Created by KingMowmaster on 3/4/2018.
 */
public class ModTab
{
    public static final CreativeTabs MODTAB = new CreativeTabs("mbimtab") {
        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ItemRegistry.tinyDust);
        }
    };
}

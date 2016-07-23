package com.mowmaster.miscblocksitemsandmore.Configs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import static com.mowmaster.miscblocksitemsandmore.item.ItemRegistry.glass_pile;


public class NeverEnoughTabs
{
    public static final CreativeTabs tabBottles = new CreativeTabs("tabBottles") {
        @Override
        public Item getTabIconItem() {
            return glass_pile;
        }
    };
}

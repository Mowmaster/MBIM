package com.mowmaster.miscblocksitemsandmore.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static com.mowmaster.miscblocksitemsandmore.Configs.NeverEnoughTabs.tabBottles;


public class basicItem extends Item
{
    public basicItem(String unloc)
    {
        super();
        this.setUnlocalizedName(unloc);
        this.maxStackSize = 64;
        this.setCreativeTab(tabBottles);
    }
}

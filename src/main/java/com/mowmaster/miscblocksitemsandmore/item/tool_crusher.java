package com.mowmaster.miscblocksitemsandmore.item;

import net.minecraft.item.Item;

import static com.mowmaster.miscblocksitemsandmore.Configs.NeverEnoughTabs.tabBottles;

/**
 * Created by KingMowmaster on 10/24/2016.
 */
public class tool_crusher extends Item {
    public tool_crusher(String unloc)
    {
        super();
        this.setUnlocalizedName(unloc);
        this.maxStackSize = 1;
        this.setCreativeTab(tabBottles);
        this.bFull3D=true;
    }
}

package com.mowmaster.mbim.Tabs;

import com.mowmaster.mbim.registeries.DeferredRegisterItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MBIMTab extends CreativeModeTab
{
    public MBIMTab() {
        super("tab_mbim");
    }

    public static final MBIMTab TAB_MBIM = new MBIMTab() {};

    @Override
    public ItemStack makeIcon() {
        return ItemStack.EMPTY;
        //return new ItemStack(DeferredRegisterItems..get());
    }
}

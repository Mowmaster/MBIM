package com.mowmaster.mbim.registeries;

import com.mowmaster.mbim.items.MetalCrystalBaseItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.mowmaster.mbim.MBIMUtils.References.MODID;
import static com.mowmaster.mbim.Tabs.MBIMTab.TAB_MBIM;

public class DeferredRegisterItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> IRON_CRYSTAL = ITEMS.register("item_iron_crystal",
            () -> new MetalCrystalBaseItem(new Item.Properties().stacksTo(64).tab(TAB_MBIM)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

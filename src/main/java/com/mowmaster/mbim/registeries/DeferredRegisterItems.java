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
    public static final RegistryObject<Item> COAL_CRYSTAL = ITEMS.register("item_coal_crystal",
            () -> new MetalCrystalBaseItem(new Item.Properties().stacksTo(64).tab(TAB_MBIM)));
    public static final RegistryObject<Item> LAPIS_CRYSTAL = ITEMS.register("item_lapis_crystal",
            () -> new MetalCrystalBaseItem(new Item.Properties().stacksTo(64).tab(TAB_MBIM)));
    public static final RegistryObject<Item> REDSTONE_CRYSTAL = ITEMS.register("item_redstone_crystal",
            () -> new MetalCrystalBaseItem(new Item.Properties().stacksTo(64).tab(TAB_MBIM)));
    public static final RegistryObject<Item> COPPER_CRYSTAL = ITEMS.register("item_copper_crystal",
            () -> new MetalCrystalBaseItem(new Item.Properties().stacksTo(64).tab(TAB_MBIM)));
    /*

    public static final RegistryObject<Item> GOLD_CRYSTAL = ITEMS.register("item_gold_crystal",
            () -> new MetalCrystalBaseItem(new Item.Properties().stacksTo(64).tab(TAB_MBIM)));
    public static final RegistryObject<Item> DIAMOND_CRYSTAL = ITEMS.register("item_diamond_crystal",
            () -> new MetalCrystalBaseItem(new Item.Properties().stacksTo(64).tab(TAB_MBIM)));
    public static final RegistryObject<Item> EMERALD_CRYSTAL = ITEMS.register("item_emerald_crystal",
            () -> new MetalCrystalBaseItem(new Item.Properties().stacksTo(64).tab(TAB_MBIM)));
    public static final RegistryObject<Item> NETHERITE_CRYSTAL = ITEMS.register("item_netherite_crystal",
            () -> new MetalCrystalBaseItem(new Item.Properties().stacksTo(64).tab(TAB_MBIM)));

    public static final RegistryObject<Item> TIN_CRYSTAL = ITEMS.register("item_tin_crystal",
            () -> new MetalCrystalBaseItem(new Item.Properties().stacksTo(64).tab(TAB_MBIM)));

    public static final RegistryObject<Item> LEAD_CRYSTAL = ITEMS.register("item_lead_crystal",
            () -> new MetalCrystalBaseItem(new Item.Properties().stacksTo(64).tab(TAB_MBIM)));
    public static final RegistryObject<Item> SILVER_CRYSTAL = ITEMS.register("item_silver_crystal",
            () -> new MetalCrystalBaseItem(new Item.Properties().stacksTo(64).tab(TAB_MBIM)));

    public static final RegistryObject<Item> ZINC_CRYSTAL = ITEMS.register("item_zinc_crystal",
            () -> new MetalCrystalBaseItem(new Item.Properties().stacksTo(64).tab(TAB_MBIM)));
    public static final RegistryObject<Item> NICKEL_CRYSTAL = ITEMS.register("item_nickel_crystal",
            () -> new MetalCrystalBaseItem(new Item.Properties().stacksTo(64).tab(TAB_MBIM)));

    public static final RegistryObject<Item> PLATINUM_CRYSTAL = ITEMS.register("item_platinum_crystal",
            () -> new MetalCrystalBaseItem(new Item.Properties().stacksTo(64).tab(TAB_MBIM)));
    public static final RegistryObject<Item> URANIUM_CRYSTAL = ITEMS.register("item_uranium_crystal",
            () -> new MetalCrystalBaseItem(new Item.Properties().stacksTo(64).tab(TAB_MBIM)));
*/
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

package com.mowmaster.mbim.registeries;

import com.mojang.serialization.Codec;
import com.mowmaster.mbim.Tabs.MBIMTab;
import com.mowmaster.mbim.blocks.BaseMetalCrystalBlock;
import com.mowmaster.mbim.blocks.BaseMetalCrystalBlockItem;
import com.mowmaster.mbim.blocks.GeneratedBlocks.BaseMetalCrystalClusterBlock;
import com.mowmaster.mbim.blocks.GeneratedBlocks.BaseMetalCrystalNodeBlock;
import com.mowmaster.mowlib.Blocks.BaseBlocks.BaseWorkStationBlock;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.mowmaster.mbim.MBIMUtils.References.MODID;
import static com.mowmaster.mbim.Tabs.MBIMTab.TAB_MBIM;

public class DeferredRegisterBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,MODID);

    public static final RegistryObject<Block> IRON_CRYSTAL_CLUSTER = registerBlockNoTab("block_iron_cluster",
            () -> new BaseMetalCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.0F).sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops().lightLevel((p_152629_) -> { return 10; })));
    public static final RegistryObject<Block> IRON_CRYSTAL_NODE = registerBlock("block_iron_node",
            () -> new BaseMetalCrystalNodeBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(10.0F, 1200.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel(
                    (p_152629_) -> { return 10; }),DeferredRegisterBlocks.IRON_CRYSTAL_CLUSTER.get()));

    public static final RegistryObject<Block> COAL_CRYSTAL_CLUSTER = registerBlockNoTab("block_coal_cluster",
            () -> new BaseMetalCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.0F).sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops().lightLevel((p_152629_) -> { return 10; })));
    public static final RegistryObject<Block> COAL_CRYSTAL_NODE = registerBlock("block_coal_node",
            () -> new BaseMetalCrystalNodeBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(10.0F, 1200.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel(
                    (p_152629_) -> { return 10; }),DeferredRegisterBlocks.COAL_CRYSTAL_CLUSTER.get()));

    public static final RegistryObject<Block> LAPIS_CRYSTAL_CLUSTER = registerBlockNoTab("block_lapis_cluster",
            () -> new BaseMetalCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.0F).sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops().lightLevel((p_152629_) -> { return 10; })));
    public static final RegistryObject<Block> LAPIS_CRYSTAL_NODE = registerBlock("block_lapis_node",
            () -> new BaseMetalCrystalNodeBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(10.0F, 1200.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel(
                    (p_152629_) -> { return 10; }),DeferredRegisterBlocks.LAPIS_CRYSTAL_CLUSTER.get()));

    public static final RegistryObject<Block> REDSTONE_CRYSTAL_CLUSTER = registerBlockNoTab("block_redstone_cluster",
            () -> new BaseMetalCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.0F).sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops().lightLevel((p_152629_) -> { return 10; })));
    public static final RegistryObject<Block> REDSTONE_CRYSTAL_NODE = registerBlock("block_redstone_node",
            () -> new BaseMetalCrystalNodeBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(10.0F, 1200.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel(
                    (p_152629_) -> { return 10; }),DeferredRegisterBlocks.REDSTONE_CRYSTAL_CLUSTER.get()));

    public static final RegistryObject<Block> COPPER_CRYSTAL_CLUSTER = registerBlockNoTab("block_copper_cluster",
            () -> new BaseMetalCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.0F).sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops().lightLevel((p_152629_) -> { return 10; })));
    public static final RegistryObject<Block> COPPER_CRYSTAL_NODE = registerBlock("block_copper_node",
            () -> new BaseMetalCrystalNodeBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(10.0F, 1200.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel(
                    (p_152629_) -> { return 10; }),DeferredRegisterBlocks.COPPER_CRYSTAL_CLUSTER.get()));
    /*


    public static final RegistryObject<Block> GOLD_CRYSTAL_CLUSTER = registerBlockNoTab("block_gold_cluster",
            () -> new BaseMetalCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.0F).sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops().lightLevel((p_152629_) -> { return 10; })));
    public static final RegistryObject<Block> GOLD_CRYSTAL_NODE = registerBlock("block_gold_node",
            () -> new BaseMetalCrystalNodeBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(10.0F, 1200.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel(
                    (p_152629_) -> { return 10; }),DeferredRegisterBlocks.GOLD_CRYSTAL_CLUSTER.get()));

    public static final RegistryObject<Block> DIAMOND_CRYSTAL_CLUSTER = registerBlockNoTab("block_diamond_cluster",
            () -> new BaseMetalCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.0F).sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops().lightLevel((p_152629_) -> { return 10; })));
    public static final RegistryObject<Block> DIAMOND_CRYSTAL_NODE = registerBlock("block_diamond_node",
            () -> new BaseMetalCrystalNodeBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(10.0F, 1200.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel(
                    (p_152629_) -> { return 10; }),DeferredRegisterBlocks.DIAMOND_CRYSTAL_CLUSTER.get()));

    public static final RegistryObject<Block> EMERALD_CRYSTAL_CLUSTER = registerBlockNoTab("block_emerald_cluster",
            () -> new BaseMetalCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.0F).sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops().lightLevel((p_152629_) -> { return 10; })));
    public static final RegistryObject<Block> EMERALD_CRYSTAL_NODE = registerBlock("block_emerald_node",
            () -> new BaseMetalCrystalNodeBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(10.0F, 1200.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel(
                    (p_152629_) -> { return 10; }),DeferredRegisterBlocks.EMERALD_CRYSTAL_CLUSTER.get()));

    public static final RegistryObject<Block> QUARTZ_CRYSTAL_CLUSTER = registerBlockNoTab("block_quartz_cluster",
            () -> new BaseMetalCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.0F).sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops().lightLevel((p_152629_) -> { return 10; })));
    public static final RegistryObject<Block> QUARTZ_CRYSTAL_NODE = registerBlock("block_quartz_node",
            () -> new BaseMetalCrystalNodeBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(10.0F, 1200.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel(
                    (p_152629_) -> { return 10; }),DeferredRegisterBlocks.QUARTZ_CRYSTAL_CLUSTER.get()));

    public static final RegistryObject<Block> NETHERITE_CRYSTAL_CLUSTER = registerBlockNoTab("block_netherite_cluster",
            () -> new BaseMetalCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.0F).sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops().lightLevel((p_152629_) -> { return 10; })));
    public static final RegistryObject<Block> NETHERITE_CRYSTAL_NODE = registerBlock("block_netherite_node",
            () -> new BaseMetalCrystalNodeBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(10.0F, 1200.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel(
                    (p_152629_) -> { return 10; }),DeferredRegisterBlocks.NETHERITE_CRYSTAL_CLUSTER.get()));




    public static final RegistryObject<Block> TIN_CRYSTAL_CLUSTER = registerBlockNoTab("block_tin_cluster",
            () -> new BaseMetalCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.0F).sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops().lightLevel((p_152629_) -> { return 10; })));
    public static final RegistryObject<Block> TIN_CRYSTAL_NODE = registerBlock("block_tin_node",
            () -> new BaseMetalCrystalNodeBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(10.0F, 1200.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel(
                    (p_152629_) -> { return 10; }),DeferredRegisterBlocks.TIN_CRYSTAL_CLUSTER.get()));

    public static final RegistryObject<Block> LEAD_CRYSTAL_CLUSTER = registerBlockNoTab("block_lead_cluster",
            () -> new BaseMetalCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.0F).sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops().lightLevel((p_152629_) -> { return 10; })));
    public static final RegistryObject<Block> LEAD_CRYSTAL_NODE = registerBlock("block_lead_node",
            () -> new BaseMetalCrystalNodeBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(10.0F, 1200.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel(
                    (p_152629_) -> { return 10; }),DeferredRegisterBlocks.LEAD_CRYSTAL_CLUSTER.get()));
    public static final RegistryObject<Block> SILVER_CRYSTAL_CLUSTER = registerBlockNoTab("block_silver_cluster",
            () -> new BaseMetalCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.0F).sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops().lightLevel((p_152629_) -> { return 10; })));
    public static final RegistryObject<Block> SILVER_CRYSTAL_NODE = registerBlock("block_silver_node",
            () -> new BaseMetalCrystalNodeBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(10.0F, 1200.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel(
                    (p_152629_) -> { return 10; }),DeferredRegisterBlocks.SILVER_CRYSTAL_CLUSTER.get()));

    public static final RegistryObject<Block> ZINC_CRYSTAL_CLUSTER = registerBlockNoTab("block_zinc_cluster",
            () -> new BaseMetalCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.0F).sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops().lightLevel((p_152629_) -> { return 10; })));
    public static final RegistryObject<Block> ZINC_CRYSTAL_NODE = registerBlock("block_zinc_node",
            () -> new BaseMetalCrystalNodeBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(10.0F, 1200.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel(
                    (p_152629_) -> { return 10; }),DeferredRegisterBlocks.ZINC_CRYSTAL_CLUSTER.get()));
    public static final RegistryObject<Block> NICKEL_CRYSTAL_CLUSTER = registerBlockNoTab("block_nickel_cluster",
            () -> new BaseMetalCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.0F).sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops().lightLevel((p_152629_) -> { return 10; })));
    public static final RegistryObject<Block> NICKEL_CRYSTAL_NODE = registerBlock("block_nickel_node",
            () -> new BaseMetalCrystalNodeBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(10.0F, 1200.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel(
                    (p_152629_) -> { return 10; }),DeferredRegisterBlocks.NICKEL_CRYSTAL_CLUSTER.get()));

    public static final RegistryObject<Block> PLATINUM_CRYSTAL_CLUSTER = registerBlockNoTab("block_platinum_cluster",
            () -> new BaseMetalCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.0F).sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops().lightLevel((p_152629_) -> { return 10; })));
    public static final RegistryObject<Block> PLATINUM_CRYSTAL_NODE = registerBlock("block_platinum_node",
            () -> new BaseMetalCrystalNodeBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(10.0F, 1200.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel(
                    (p_152629_) -> { return 10; }),DeferredRegisterBlocks.PLATINUM_CRYSTAL_CLUSTER.get()));
    public static final RegistryObject<Block> URANIUM_CRYSTAL_CLUSTER = registerBlockNoTab("block_uranium_cluster",
            () -> new BaseMetalCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.0F).sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops().lightLevel((p_152629_) -> { return 10; })));
    public static final RegistryObject<Block> URANIUM_CRYSTAL_NODE = registerBlock("block_uranium_node",
            () -> new BaseMetalCrystalNodeBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(10.0F, 1200.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel(
                    (p_152629_) -> { return 10; }),DeferredRegisterBlocks.URANIUM_CRYSTAL_CLUSTER.get()));
*/






    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        DeferredRegisterItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(TAB_MBIM)));
    }

    private static <T extends Block> RegistryObject<T> registerBlockNoTab(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItemNoTab(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItemNoTab(String name, RegistryObject<T> block) {
        DeferredRegisterItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    //For Geodes
    private static <P extends PlacementModifier> PlacementModifierType<P> register(String name, Codec<P> codec) {
        return Registry.register(Registry.PLACEMENT_MODIFIERS, name, () -> {
            return codec;
        });
    }
}

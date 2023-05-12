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

   public static final RegistryObject<Block> IRON_CRYSTAL_CLUSTER = registerBlock("block_iron_cluster",
            () -> new BaseMetalCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).strength(0.25F).sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops().lightLevel((p_152629_) -> { return 10; })));
    public static final RegistryObject<Block> IRON_CRYSTAL_NODE = registerBlock("block_iron_node",
            () -> new BaseMetalCrystalNodeBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(50.0F, 1200.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel((p_152629_) -> { return 10; }),DeferredRegisterBlocks.IRON_CRYSTAL_CLUSTER.get()));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        DeferredRegisterItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(TAB_MBIM)));
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

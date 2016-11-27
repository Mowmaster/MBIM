package com.mowmaster.miscblocksitemsandmore.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

import static com.mowmaster.miscblocksitemsandmore.Configs.NeverEnoughTabs.tabBottles;

/**
 * Created by KingMowmaster on 11/27/2016.
 */
public class compressedandesite extends Block
{
    public static String[] types = new String[] { "compressed_andesite", "compressed_andesite_double", "compressed_andesite_tripple", "compressed_andesite_quadrupple", "compressed_andesite_quintupple", "compressed_andesite_sixtupple", "compressed_andesite_septupple", "compressed_andesite_octupple" };
    public static final PropertyEnum<compressedandesite.EnumType> VARIANT = PropertyEnum.<compressedandesite.EnumType> create("variant", compressedandesite.EnumType.class);

    public compressedandesite() {

        super(Material.ROCK);
        this.setUnlocalizedName("compressed_andesite");
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, compressedandesite.EnumType.COMPRESSED));
        this.setRegistryName("compressed_andesite");
        this.setHardness(1.5f);
        this.setHarvestLevel("pickaxe", 1);
        this.setCreativeTab(tabBottles);
    }

    @Override
    public IBlockState getStateFromMeta (int meta) {

        return this.getDefaultState().withProperty(VARIANT, compressedandesite.EnumType.byMetadata(meta));
    }

    @Override
    public int getMetaFromState (IBlockState state) {

        return state.getValue(VARIANT).getMetadata();
    }

    @Override
    protected BlockStateContainer createBlockState () {

        return new BlockStateContainer(this, new IProperty[] { VARIANT });
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks (Item item, CreativeTabs tab, List<ItemStack> list) {

        for (int meta = 0; meta < 8; meta++)
            list.add(new ItemStack(item, 1, meta));
    }

    public enum EnumType implements IStringSerializable {

        COMPRESSED(0, "andesite"),
        DOUBLE(1, "andesite_double"),
        TRIPPLE(2, "andesite_tripple"),
        QUADRUPPLE(3, "andesite_quadrupple"),
        QUINTUPPLE(4, "andesite_quintupple"),
        SIXTUPPLE(5,"andesite_sixtupple"),
        SEPTUPPLE(6, "andesite_septupple"),
        OCTUPPLE(7, "andesite_octupple");

        private static final compressedandesite.EnumType[] META_LOOKUP = new compressedandesite.EnumType[values().length];
        private final int meta;
        private final String name;

        EnumType(int meta, String name) {

            this.meta = meta;
            this.name = name;
        }

        public int getMetadata () {

            return this.meta;
        }

        @Override
        public String toString () {

            return this.name;
        }

        public static compressedandesite.EnumType byMetadata (int meta) {

            if (meta < 0 || meta >= META_LOOKUP.length)
                meta = 0;

            return META_LOOKUP[meta];
        }

        @Override
        public String getName () {

            return this.name;
        }

        static {

            for (final compressedandesite.EnumType type : values())
                META_LOOKUP[type.getMetadata()] = type;
        }
    }
}

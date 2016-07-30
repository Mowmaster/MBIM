package com.mowmaster.miscblocksitemsandmore.fluid;

import com.mowmaster.miscblocksitemsandmore.Configs.NeverEnoughTabs;
import com.mowmaster.miscblocksitemsandmore.references.reference;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by KingMowmaster on 7/30/2016.
 */
public class basicFluid
{
    private static ModelResourceLocation basicFluid = new ModelResourceLocation(reference.MODID + ":" + BlockFluid.name, "fluid" );

    public static void regFluid()
    {
        FluidRegistry.registerFluid(FluidBase.instance);
        GameRegistry.registerBlock(BlockFluid.instance, BlockFluid.name);
        final Item baseF = Item.getItemFromBlock(BlockFluid.instance);

        ModelLoader.setCustomMeshDefinition(baseF, new ItemMeshDefinition() {
            @Override
            public ModelResourceLocation getModelLocation(ItemStack stack) {
                return basicFluid;
            }
        });

        ModelLoader.setCustomStateMapper(BlockFluid.instance, new StateMapperBase() {
            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
                return basicFluid;
            }
        });
    }

    public static final class FluidBase extends Fluid
    {
        public static final String name = "name";
        public static final FluidBase instance = new FluidBase();

            public FluidBase()
            {
                super(name, new ResourceLocation(reference.MODID + ":" + "blocks/" + name + "_still"),new ResourceLocation(reference.MODID + ":" + "blocks/" + name + "_flow"));
                this.setDensity(1000);


            }


    }

    public static final class BlockFluid extends BlockFluidClassic
    {
        public static final BlockFluid instance = new BlockFluid();
        public static final String name = "name";

        public BlockFluid()
        {
            super(FluidBase.instance, Material.WATER);
            this.setUnlocalizedName(name);
            this.setCreativeTab(NeverEnoughTabs.tabBottles);
        }
    }

    //@Override
    public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return EnumBlockRenderType.MODEL;
    }
}

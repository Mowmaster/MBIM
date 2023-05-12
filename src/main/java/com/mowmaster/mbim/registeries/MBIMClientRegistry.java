package com.mowmaster.mbim.registeries;

import com.mowmaster.mowlib.MowLibUtils.MowLibColorReference;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = "mbim", bus = Mod.EventBusSubscriber.Bus.MOD)
public class MBIMClientRegistry
{

    @SubscribeEvent
    public static void registerItemColor(RegisterColorHandlersEvent.Item event) {

        /*
        event.getItemColors().register((stack, color) ->
        {if (color == 1) {return MowLibColorReference.getColorFromItemStackInt(stack);} else {return -1;}}, com.mowmaster.effectscrolls.Registry.DeferredRegisterItems.COLORED_CRYSTAL.get());

        // ItemModelPropertiesEffectScrolls.effectscrollsItemModes(com.mowmaster.effectscrolls.Registry.DeferredRegisterItems.EFFECT_SCROLL.get());

        *
        * TILE ENTITY BLOCKS HERE
        *

        event.getItemColors().register((stack, color) ->
        {if (color == 1) {return MowLibColorReference.getColorFromItemStackInt(stack);} else {return -1;}}, com.mowmaster.effectscrolls.Registry.DeferredRegisterBlocks.BASE_WORKSTATION_BLOCK.get());
        */
    }

    @SubscribeEvent
    public static void registerBlockColor(RegisterColorHandlersEvent.Block event) {
        /*
        event.getBlockColors().register((blockstate, blockReader, blockPos, color) ->
        {if (color == 1) {return MowLibColorReference.getColorFromStateInt(blockstate);} else {return -1;}}, com.mowmaster.effectscrolls.Registry.DeferredRegisterBlocks.BASE_WORKSTATION_BLOCK.get());


         *
         * TILE ENTITY BLOCKS HERE
         *


        event.getBlockColors().register((blockstate, blockReader, blockPos, color) ->
        {if (color == 1) {return MowLibColorReference.getColorFromStateInt(blockstate);} else {return -1;}}, DeferredRegisterTileBlocks.BLOCK_DUST_JAR.get());
        */

    }

    @SubscribeEvent
    @SuppressWarnings("deprecation")
    public static void textureStitchPreEvent(TextureStitchEvent.Pre event)
    {

        /*
        ResourceLocation location = event.getAtlas().location();

        if(location.equals(TextureAtlas.LOCATION_BLOCKS))
        {
            event.addSprite(new ResourceLocation(References.MODID, "util/crystal_dust"));
        }
         */

    }

    /*@SubscribeEvent
    public static void registerLayers(FMLClientSetupEvent event)
    {
        *//*NamedRenderTypeManager.preRegisterVanillaRenderTypes()
        blockRenderTypes.put(new ResourceLocation("solid"), new RenderTypeGroup(RenderType.solid(), ForgeRenderTypes.ITEM_LAYERED_SOLID.get()));
        blockRenderTypes.put(new ResourceLocation("cutout"), new RenderTypeGroup(RenderType.cutout(), ForgeRenderTypes.ITEM_LAYERED_CUTOUT.get()));
        blockRenderTypes.put(new ResourceLocation("cutout_mipped"), new RenderTypeGroup(RenderType.cutoutMipped(), ForgeRenderTypes.ITEM_LAYERED_CUTOUT_MIPPED.get()));
        blockRenderTypes.put(new ResourceLocation("translucent"), new RenderTypeGroup(RenderType.translucent(), ForgeRenderTypes.ITEM_LAYERED_TRANSLUCENT.get()));
        blockRenderTypes.put(new ResourceLocation("tripwire"), new RenderTypeGroup(RenderType.tripwire(), ForgeRenderTypes.ITEM_LAYERED_TRANSLUCENT.get()));*//*
        ItemBlockRenderTypes.setRenderLayer(DeferredRegisterBlocks.BASE_WORKSTATION_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DeferredRegisterTileBlocks.BLOCK_CRAFTER_SCROLL_T15.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DeferredRegisterTileBlocks.BLOCK_DUST_JAR.get(), RenderType.cutout());
    }*/

    public static void registerBlockEntityRenderers()
    {
        //BlockEntityRenderers.register(DeferredBlockEntityTypes.CLUSTER.get(), EffectCrystalClusterBlockEntityRenderer::new);
    }
}

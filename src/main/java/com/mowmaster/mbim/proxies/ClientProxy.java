package com.mowmaster.mbim.proxies;


import com.mowmaster.mbim.blocks.BlockRegistry;
import com.mowmaster.mbim.items.ItemRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ClientProxy extends CommonProxy
{
    @Override
    @SideOnly(Side.CLIENT)
    public void preInit()
    {
        ItemRegistry.registerRenders();
        BlockRegistry.registerRenders();
    }


    @Override
    public void registerModelBakeryVarients()
    {

    }
}

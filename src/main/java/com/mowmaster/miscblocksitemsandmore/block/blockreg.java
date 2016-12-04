package com.mowmaster.miscblocksitemsandmore.block;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by KingMowmaster on 11/27/2016.
 */
public class blockreg
{

    //public static Block cbblockscgranite = new compressedgranite();
    public static Block cbblockscdiorite = new compresseddiorite();
    public static Block cbblockscandesite = new compressedandesite();

    public static void cbreg()
    {
        //GameRegistry.register(cbblockscgranite);
        //GameRegistry.register(new blockbasic(cbblockscgranite, compressedgranite.types,true));
        GameRegistry.register(cbblockscdiorite);
        GameRegistry.register(new blockbasic(cbblockscdiorite, compresseddiorite.types,true));
        GameRegistry.register(cbblockscandesite);
        GameRegistry.register(new blockbasic(cbblockscandesite, compressedandesite.types,true));
    }


}

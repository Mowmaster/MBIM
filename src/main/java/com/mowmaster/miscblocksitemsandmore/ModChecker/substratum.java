package com.mowmaster.miscblocksitemsandmore.ModChecker;

import com.mowmaster.miscblocksitemsandmore.Configs.config;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import static com.mowmaster.miscblocksitemsandmore.item.ItemRegistry.tool_hammer;
import static com.mowmaster.miscblocksitemsandmore.recipies.removeRecipies.removeCrafting;

/**
 * Created by KingMowmaster on 7/27/2016.
 */
public class substratum
{
    public static void checkSub()
    {
        if (config.NewEraTweaks) {
            if (Loader.isModLoaded("substratum")) {
                Item SPlate = Item.REGISTRY.getObject(new ResourceLocation("substratum:plate"));
                Item SDust = Item.REGISTRY.getObject(new ResourceLocation("substratum:dust"));
                Item IEHammer = Item.REGISTRY.getObject(new ResourceLocation("immersiveengineering:tool"));


                //Removed Recipies

                //Helmets
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:helmetBronze")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:helmetCopper")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:helmetElectrum")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:helmetEnderium")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:helmetInvar")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:helmetLumium")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:helmetSignalum")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:helmetSilver")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:helmetSteel")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:helmetAluminium")));
                //Chestplates
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:chestplateBronze")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:chestplateCopper")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:chestplateElectrum")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:chestplateEnderium")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:chestplateInvar")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:chestplateLumium")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:chestplateSignalum")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:chestplateSilver")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:chestplateSteel")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:chestAluminium")));
                //Panties
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:leggingsBronze")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:leggingsCopper")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:leggingsElectrum")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:leggingsEnderium")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:leggingsInvar")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:leggingsLumium")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:leggingsSignalum")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:leggingsSilver")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:leggingsSteel")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:leggingsAluminium")));
                //Booties
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:bootsBronze")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:bootsCopper")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:bootsElectrum")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:bootsEnderium")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:bootsInvar")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:bootsLumium")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:bootsSignalum")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:bootsSilver")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:bootsSteel")));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:bootsAluminium")));


                if (config.HammaTime) {

                    removeCrafting(SPlate);



                    //Added Recipies
                    //GameRegistry.addShapedRecipe(new ItemStack(CFBCounter,1), new Object[]{"X","Y", 'X',new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,15),'Y', new ItemStack(Blocks.CHEST)});
                    //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CFBTable,1), new Object[]{"XXX","YZY", "YYY", 'X',new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,15),'Y', "logWood",'Z', new ItemStack(CFBBook,1,2)}));
                    //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 0), new Object[]{"XXY", 'X', "ingotIron", 'Y', new ItemStack(IEHammer,1,0)}));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 1), new Object[]{"XY", 'X', "ingotGold", 'Y', new ItemStack(IEHammer,1,0)}));
                    //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 2), new Object[]{"XXY", 'X', "ingotCopper", 'Y', new ItemStack(tool_hammer.setContainerItem(tool_hammer))}));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 3), new Object[]{"XY", 'X', "ingotTin", 'Y', new ItemStack(IEHammer,1,0)}));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 4), new Object[]{"XY", 'X', "ingotBronze", 'Y', new ItemStack(IEHammer,1,0)}));
                    //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 5), new Object[]{"XXY", 'X', "ingotElectrum", 'Y', new ItemStack(tool_hammer.setContainerItem(tool_hammer))}));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 6), new Object[]{"XY", 'X', "ingotInvar", 'Y', new ItemStack(IEHammer,1,0)}));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 7), new Object[]{"XY", 'X', "ingotNickel", 'Y', new ItemStack(IEHammer,1,0)}));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 8), new Object[]{"XY", 'X', "ingotZinc", 'Y', new ItemStack(IEHammer,1,0)}));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 9), new Object[]{"XY", 'X', "ingotBrass", 'Y', new ItemStack(IEHammer,1,0)}));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 10), new Object[]{"XY", 'X', "ingotSilver", 'Y', new ItemStack(IEHammer,1,0)}));
                    //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 11), new Object[]{"XXY", 'X', "ingotSteel", 'Y', new ItemStack(tool_hammer.setContainerItem(tool_hammer))}));
                    //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 12), new Object[]{"XXY", 'X', "ingotLead", 'Y', new ItemStack(tool_hammer.setContainerItem(tool_hammer))}));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 13), new Object[]{"XY", 'X', "ingotPlatinum", 'Y', new ItemStack(IEHammer,1,0)}));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 14), new Object[]{"XY", 'X', "ingotCupronickel", 'Y', new ItemStack(IEHammer,1,0)}));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 15), new Object[]{"XY", 'X', "ingotSignalum", 'Y', new ItemStack(IEHammer,1,0)}));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 16), new Object[]{"XY", 'X', "ingotLumium", 'Y', new ItemStack(IEHammer,1,0)}));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 17), new Object[]{"XY", 'X', "ingotEnderium", 'Y', new ItemStack(IEHammer,1,0)}));
                    //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 18), new Object[]{"XXY", 'X', "ingotAluminium", 'Y', new ItemStack(tool_hammer.setContainerItem(tool_hammer))}));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 19), new Object[]{"XY", 'X', "ingotChromium", 'Y', new ItemStack(IEHammer,1,0)}));
                }


                //Added Steel Dust
                GameRegistry.addShapelessRecipe(new ItemStack(SDust, 1, 12), new ItemStack(SDust, 1, 1), new ItemStack(SDust, 1, 20), new ItemStack(SDust, 1, 20));
                GameRegistry.addShapelessRecipe(new ItemStack(SDust, 1, 12), new ItemStack(SDust, 1, 1), new ItemStack(SDust, 1, 0));


            }
        }
    }
}

package com.mowmaster.miscblocksitemsandmore.ModChecker;

import com.mowmaster.miscblocksitemsandmore.Configs.config;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import static com.mowmaster.miscblocksitemsandmore.Configs.config.configFile;
import static com.mowmaster.miscblocksitemsandmore.item.ItemRegistry.enderium_blend_dust;
import static com.mowmaster.miscblocksitemsandmore.item.ItemRegistry.fake_pyrothium;
import static com.mowmaster.miscblocksitemsandmore.item.ItemRegistry.tool_hammer;
import static com.mowmaster.miscblocksitemsandmore.recipies.removeRecipies.removeCrafting;

/**
 * Created by KingMowmaster on 8/6/2016.
 */
public class rftools
{
    public static void notOPenough()
    {
        if (Loader.isModLoaded("rftools"))
        {
            Item MachineFrame = Item.REGISTRY.getObject(new ResourceLocation("rftools:machine_frame"));
            Item MachineFrameBase = Item.REGISTRY.getObject(new ResourceLocation("rftools:machine_base"));
            Item CoalGen = Item.REGISTRY.getObject(new ResourceLocation("rftools:coalgenerator"));
            Item Builder = Item.REGISTRY.getObject(new ResourceLocation("rftools:builder"));

            if (config.harderRecipes)
            {
                if (config.rftoolsHARD)
                {
                    //removeCrafting(MachineFrame);
                    //GameRegistry.addShapedRecipe(new ItemStack(MachineFrame, 1), new Object[]{"XX", 'X', new ItemStack(Blocks.GRAVEL)});
                    //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CFBTable,1), new Object[]{"XXX","YZY", "YYY", 'X',new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,15),'Y', "logWood",'Z', new ItemStack(CFBBook,1,2)}));
                }
            }



            if (config.NewEraTweaks)
            {
                if (config.rfTooOP)
                {
                    Item IronFrame = Item.REGISTRY.getObject(new ResourceLocation("advgenerators:IronFrame"));
                    Item EnderiumDust = Item.REGISTRY.getObject(new ResourceLocation("substratum:dust"));


                    removeCrafting(MachineFrame);
                    removeCrafting(CoalGen);
                    removeCrafting(Builder);



                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MachineFrame,1), new Object[]{"XYX","Y Y", "XYX", 'X',"rodIron",'Y', IronFrame}));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoalGen,1), new Object[]{"XYX","ZAZ", "BBB", 'X',Blocks.REDSTONE_TORCH,'Y',"dustRedstone" ,'Z',"gearIron",'A',Blocks.FURNACE,'B',"blockCoal"}));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Builder,1), new Object[]{"XYX","ZAZ", "XZX", 'X',"ingotEnderium",'Y', "gearIron",'Z',IronFrame,'A',MachineFrame}));

                    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(enderium_blend_dust,1), new ItemStack(tool_hammer.setContainerItem(tool_hammer)),"ingotEnderiumBase"));
                    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(fake_pyrothium,1), "toolMixingbowl","dustGlowstone","dustRedstone","dustBlaze"));
                    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(EnderiumDust,1,19), "toolMixingbowl",fake_pyrothium,enderium_blend_dust));
                }
            }
        }
    }
}

package com.mowmaster.mbim.blocks;

import com.mowmaster.mowlib.MowLibUtils.MowLibColorReference;
import com.mowmaster.mowlib.MowLibUtils.MowLibReferences;
import com.mowmaster.mowlib.api.IColorable;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.mowmaster.mbim.MBIMUtils.References.MODID;

public class BaseMetalCrystalBlockItem extends BlockItem implements IColorable {

    public BaseMetalCrystalBlockItem(Block p_40565_, Properties p_40566_) {
        super(p_40565_, p_40566_);

    }
}

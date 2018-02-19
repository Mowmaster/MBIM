package com.mowmaster.mbim.items;

import com.mowmaster.mbim.reference.references;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.*;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nonnull;



public class ItemPullBack extends Item
{
    public ItemPullBack(String unlocalName,String regName)
    {
        this.setUnlocalizedName(unlocalName);
        this.setRegistryName(new ResourceLocation(references.MODID, regName));
        this.setMaxStackSize(1);
    }

    @Nonnull
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand hand) {
        ItemStack itemStackIn = playerIn.getHeldItem(hand);
        playerIn.setActiveHand(hand);
        return new ActionResult<>(EnumActionResult.SUCCESS, itemStackIn);
    }

    @Nonnull
    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.BOW;
    }

    private static int useDuration = 72000;

    @Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return useDuration;
    }

    @Override
    public void onPlayerStoppedUsing(ItemStack stack, World world, EntityLivingBase entity, int timeLeft) {
        if(!(entity instanceof EntityPlayer)) {
            System.out.println(useDuration-timeLeft);
            return;
        }
        EntityPlayer player = (EntityPlayer) entity;
        // has to be on ground to do something
        if(!player.onGround) {
            return;
        }

        // copy chargeup code from bow \o/
        int i = this.getMaxItemUseDuration(stack) - timeLeft;
        float f = i / 20.0F;
        f = (f * f + f * 2.0F) / 3.0F;
        f *= 4f;

        if(f > 6f) {
            f = 6f;
        }

        // check if player was targeting a block
        RayTraceResult mop = rayTrace(world, player, false);

        if(mop != null && mop.typeOfHit == RayTraceResult.Type.BLOCK) {
            // we fling the inverted player look vector
            Vec3d vec = player.getLookVec().normalize();

            player.addVelocity(vec.x * -f,
                    vec.y * -f / 3f,
                    vec.z * -f);

            if(player instanceof EntityPlayerMP) {
                EntityPlayerMP playerMP = (EntityPlayerMP) player;
            }
        }
    }
}

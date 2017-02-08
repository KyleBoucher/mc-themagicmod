package com.celestialcode.themagicmod.items;

import com.celestialcode.themagicmod.TheMagicMod;
import com.celestialcode.themagicmod.lib.Names;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemTutorial extends Item {

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "item." + TheMagicMod.RESOURCE_PREFIX + Names.TUTORIAL_ITEM;
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		if(false == worldIn.isRemote) {
			playerIn.sendMessage(new TextComponentString("Used item " + playerIn.getHeldItem(handIn).getDisplayName()));
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
}

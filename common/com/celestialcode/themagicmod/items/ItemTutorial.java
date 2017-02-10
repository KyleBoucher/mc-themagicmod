package com.celestialcode.themagicmod.items;

import com.celestialcode.themagicmod.TheMagicMod;
import com.celestialcode.themagicmod.lib.Names;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemTutorial extends ItemOre {
	
	public ItemTutorial() {
		super(Names.TUTORIAL_ITEM, "ingotIron");
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		// process on server
		if(false == worldIn.isRemote) {
			ItemStack itemStack = playerIn.getHeldItem(handIn);
			playerIn.sendMessage(new TextComponentString("Used item " + itemStack.getDisplayName()));
			
			itemStack.shrink(1);
			
			return new ActionResult(EnumActionResult.SUCCESS, itemStack);
		}
		
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
}

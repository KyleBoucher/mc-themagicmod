package com.celestialcode.themagicmod.items;

import com.celestialcode.themagicmod.TheMagicMod;
import com.celestialcode.themagicmod.lib.ItemModelProvider;
import com.celestialcode.themagicmod.lib.Names;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemTutorialFood extends ItemFood implements ItemModelProvider {
	public ItemTutorialFood() {
		super(5, false);
		
		setCreativeTab(TheMagicMod.creativeTab);
		setAlwaysEdible();
		
		setUnlocalizedName(TheMagicMod.RESOURCE_PREFIX + Names.TUTORIAL_FOOD);
		setRegistryName(Names.TUTORIAL_FOOD);
	}
	
	@Override
	public void registerItemModel(Item item) {
		TheMagicMod.proxy.registerItemRenderer(item, 0, Names.TUTORIAL_FOOD);
	}
}

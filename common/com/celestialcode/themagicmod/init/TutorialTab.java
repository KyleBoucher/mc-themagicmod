package com.celestialcode.themagicmod.init;

import com.celestialcode.themagicmod.TheMagicMod;
import com.celestialcode.themagicmod.lib.Names;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TutorialTab extends CreativeTabs {

	public TutorialTab() {
		super(TheMagicMod.MODID);
		
		setBackgroundImageName("item_search.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.tutorialItem);
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}
	
}

package com.celestialcode.themagicmod.items;

import com.celestialcode.themagicmod.TheMagicMod;
import com.celestialcode.themagicmod.lib.ItemModelProvider;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements ItemModelProvider {
	protected String name;
	
	public ItemBase(String name) {
		setCreativeTab(TheMagicMod.creativeTab);
		
		this.name = name;
		setUnlocalizedName(TheMagicMod.RESOURCE_PREFIX + name);
		setRegistryName(name);
	}
	
	@Override
	public void registerItemModel(Item item) {
		TheMagicMod.proxy.registerItemRenderer(item, 0, name);
	}
	
	@Override
	public Item setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
}

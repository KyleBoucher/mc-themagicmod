package com.celestialcode.themagicmod.blocks;

import com.celestialcode.themagicmod.TheMagicMod;
import com.celestialcode.themagicmod.lib.ItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockBase extends Block implements ItemModelProvider {
	protected String name;
	
	public BlockBase(Material material, String name) {
		super(material);
		
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
	public Block setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}

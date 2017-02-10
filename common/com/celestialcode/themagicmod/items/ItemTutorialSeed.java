package com.celestialcode.themagicmod.items;

import com.celestialcode.themagicmod.TheMagicMod;
import com.celestialcode.themagicmod.init.ModBlocks;
import com.celestialcode.themagicmod.lib.ItemModelProvider;
import com.celestialcode.themagicmod.lib.Names;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class ItemTutorialSeed extends ItemSeeds implements ItemModelProvider {
	public ItemTutorialSeed() {
		super(ModBlocks.tutorialCrop, Blocks.FARMLAND);
		
		setCreativeTab(TheMagicMod.creativeTab);
		
		setUnlocalizedName(TheMagicMod.RESOURCE_PREFIX + Names.TUTORIAL_SEED);
		setRegistryName(Names.TUTORIAL_SEED);
	}
	
	@Override
	public void registerItemModel(Item item) {
		TheMagicMod.proxy.registerItemRenderer(item, 0, Names.TUTORIAL_SEED);
	}
}

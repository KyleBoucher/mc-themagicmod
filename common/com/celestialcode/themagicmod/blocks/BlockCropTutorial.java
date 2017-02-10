package com.celestialcode.themagicmod.blocks;

import com.celestialcode.themagicmod.TheMagicMod;
import com.celestialcode.themagicmod.init.ModItems;
import com.celestialcode.themagicmod.lib.Names;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockCropTutorial extends BlockCrops {
	public BlockCropTutorial() {
		setCreativeTab(TheMagicMod.creativeTab);
		
		setUnlocalizedName(TheMagicMod.RESOURCE_PREFIX + Names.TUTORIAL_CROP);
		setRegistryName(Names.TUTORIAL_CROP);
	}
	
	@Override
	protected Item getSeed() {
		return ModItems.tutorialSeed;
	}
	
	@Override
	protected Item getCrop() {
		return ModItems.tutorialFood;
	}
}

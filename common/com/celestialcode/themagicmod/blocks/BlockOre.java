package com.celestialcode.themagicmod.blocks;

import java.util.List;
import java.util.Random;

import com.celestialcode.themagicmod.lib.ItemOreDict;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class BlockOre extends BlockBase implements ItemOreDict {
	private String oreName;
	
	public BlockOre(String name, String oreName) {
		super(Material.ROCK, name);
		
		this.oreName = oreName;
		
		setHardness(3f);
		setResistance(5f);
	}
	
	@Override
	public void initOreDict() {
		OreDictionary.registerOre(oreName, this);
	}
	
	@Override
	public int quantityDropped(Random random) {
		return 2;
	}
	
	@Override
	public Block setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}

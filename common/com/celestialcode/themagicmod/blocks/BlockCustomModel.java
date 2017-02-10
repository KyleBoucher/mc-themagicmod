package com.celestialcode.themagicmod.blocks;

import com.celestialcode.themagicmod.lib.Names;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockCustomModel extends BlockBase {
	public BlockCustomModel() {
		super(Material.ROCK, Names.TUTORIAL_CUSTOM_MODEL);
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
}

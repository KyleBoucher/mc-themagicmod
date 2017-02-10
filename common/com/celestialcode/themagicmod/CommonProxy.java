package com.celestialcode.themagicmod;

import com.celestialcode.themagicmod.init.ModBlocks;
import com.celestialcode.themagicmod.init.ModItems;
import com.celestialcode.themagicmod.init.ModRecipes;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.init();
		ModItems.init();
	}

	public void init(FMLInitializationEvent event) {
		ModRecipes.init();
	}

	public void postInit(FMLPostInitializationEvent event) {
		
	}

	public void registerItemRenderer(Item itemBase, int meta, String name) {
		
	}
}

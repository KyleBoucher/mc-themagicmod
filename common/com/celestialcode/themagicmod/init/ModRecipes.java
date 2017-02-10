package com.celestialcode.themagicmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModRecipes {
	public static void init() {
		initShapeless();
		initShaped();
		initSmelting();
	}
	
	private static void initShapeless() {
		GameRegistry.addShapelessRecipe(
				new ItemStack(ModItems.tutorialSeed, 2), 
				ModItems.tutorialFood);
		
		
		GameRegistry.addRecipe(new ShapedOreRecipe(Items.BUCKET, "x x", " x ", 'x', "ingotIron"));
	}
	
	private static void initShaped() {
		GameRegistry.addShapedRecipe(
				new ItemStack(Items.APPLE), 
				" x", "x ", //2x2
				'x', ModItems.tutorialFood);
	}
	
	private static void initSmelting() {
		GameRegistry.addSmelting(
				ModBlocks.tutorialOre, 
				new ItemStack(ModItems.tutorialItem, 4), 
				0.7f);
	}
}

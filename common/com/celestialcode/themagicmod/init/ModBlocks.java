package com.celestialcode.themagicmod.init;

import com.celestialcode.themagicmod.blocks.BlockCropTutorial;
import com.celestialcode.themagicmod.blocks.BlockCustomModel;
import com.celestialcode.themagicmod.blocks.BlockOre;
import com.celestialcode.themagicmod.lib.ItemModelProvider;
import com.celestialcode.themagicmod.lib.ItemOreDict;
import com.celestialcode.themagicmod.lib.Names;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static BlockOre tutorialOre;
	public static BlockCropTutorial tutorialCrop;
	public static BlockCustomModel tutorialCustomModel;
	
	public static void init() {
		tutorialOre = (BlockOre)register(new BlockOre(Names.TUTORIAL_ORE, "oreTutorial"));
		tutorialCrop = (BlockCropTutorial)register(new BlockCropTutorial(), null);
		tutorialCustomModel = (BlockCustomModel)register(new BlockCustomModel());
	}
	
	public static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		
		if(itemBlock != null) {
			GameRegistry.register(itemBlock);
			
			if(block instanceof ItemModelProvider) {
				((ItemModelProvider)block).registerItemModel(itemBlock);
			}
			if(block instanceof ItemOreDict) {
				((ItemOreDict)block).initOreDict();
			}
			if(itemBlock instanceof ItemOreDict) {
				((ItemOreDict)itemBlock).initOreDict();
			}
		}
		
		return block;
	}
	
	public static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}
}

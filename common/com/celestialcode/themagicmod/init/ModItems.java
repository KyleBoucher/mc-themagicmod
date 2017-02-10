package com.celestialcode.themagicmod.init;

import com.celestialcode.themagicmod.TheMagicMod;
import com.celestialcode.themagicmod.items.ItemBase;
import com.celestialcode.themagicmod.items.ItemTutorial;
import com.celestialcode.themagicmod.items.ItemTutorialFood;
import com.celestialcode.themagicmod.items.ItemTutorialSeed;
import com.celestialcode.themagicmod.lib.ItemModelProvider;
import com.celestialcode.themagicmod.lib.ItemOreDict;
import com.celestialcode.themagicmod.lib.Names;

import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

	public static ItemTutorial tutorialItem;
	public static ItemTutorialSeed tutorialSeed;
	public static ItemTutorialFood tutorialFood;
	
	public static void init() {
		tutorialItem = (ItemTutorial)register(new ItemTutorial());
		tutorialSeed = (ItemTutorialSeed)register(new ItemTutorialSeed());
		tutorialFood = (ItemTutorialFood)register(new ItemTutorialFood());
	}
	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if(item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}
		if(item instanceof ItemOreDict) {
			((ItemOreDict)item).initOreDict();
		}
		
		return item;
	}
}

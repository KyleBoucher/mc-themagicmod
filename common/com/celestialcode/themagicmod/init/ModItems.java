package com.celestialcode.themagicmod.init;

import com.celestialcode.themagicmod.TheMagicMod;
import com.celestialcode.themagicmod.items.ItemTutorial;
import com.celestialcode.themagicmod.lib.Names;

import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

	public static ItemTutorial tutorialItem;
	
	public static void init() {
		tutorialItem = new ItemTutorial();
		tutorialItem.setRegistryName(new ResourceLocation(TheMagicMod.MODID, Names.TUTORIAL_ITEM));
		GameRegistry.register(tutorialItem);
	}
	
	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher) {
		ModelResourceLocation modResource = new ModelResourceLocation(TheMagicMod.RESOURCE_PREFIX + Names.TUTORIAL_ITEM, "inventory");
		ModelLoader.registerItemVariants(tutorialItem, modResource);
		mesher.register(tutorialItem, 0, modResource);
	}
}

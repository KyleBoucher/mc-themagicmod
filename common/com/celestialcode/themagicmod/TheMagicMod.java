package com.celestialcode.themagicmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
		modid=TheMagicMod.MODID, 
		version=TheMagicMod.VERSION, 
		name=TheMagicMod.MODNAME,
		dependencies=TheMagicMod.DEPENDENCIES
	)
public class TheMagicMod {
	// constants
	public static final String MODID = "themagicmod";
	public static final String MODNAME = "The Magic Mod";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDENCIES = "required-after:forge@[13.19.1.2189,)"; //;after:modid (or required-after)
	public static final String RESOURCE_PREFIX = TheMagicMod.MODID.toLowerCase() + ":";
	
	// variables
	@Instance(MODID)
	public static TheMagicMod instance;
	
	// functions
	@SidedProxy(clientSide="com.celestialcode.themagicmod.ClientProxy", serverSide="com.celestialcode.themagicmod.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}




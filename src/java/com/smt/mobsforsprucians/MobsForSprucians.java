package com.smt.mobsforsprucians;

import com.smt.mobsforsprucians.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MobsForSprucians.MODID, name = MobsForSprucians.MODNAME, version = MobsForSprucians.VERSION)
public class MobsForSprucians {

	public static final String MODID = "mobsforsprucians";
	public static final String MODNAME = "Mobs For Sprucians";
	public static final String VERSION = "1.0.0";
	
	@Instance
	public static MobsForSprucians instance = new MobsForSprucians();
	
	@SidedProxy(clientSide="com.bedrockminer.tutorial.ClientProxy", serverSide="com.bedrockminer.tutorial.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent e) {
		proxy.Init(e);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}

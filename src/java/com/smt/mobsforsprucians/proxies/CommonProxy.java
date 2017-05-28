package com.smt.mobsforsprucians.proxies;

import java.io.File;

import com.smt.mobsforsprucians.Registeration;
import com.smt.mobsforsprucians.config.ManagerConfig;
import com.smt.mobsforsprucians.entities.EntityMain;
import com.smt.mobsforsprucians.entities.SpawnMobs;

//import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
//import net.minecraft.client.model.ModelBiped;

public class CommonProxy {
	
	static Registeration registry;
	int EntityId;
	
	@EventHandler
	public void serverStart(FMLServerStartingEvent e) {
		Registeration.serverStart(e);
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		registry = new Registeration();
		registry.preInit(e);
		ManagerConfig.init(new File("config/WorldBoss.cfg"));
		SpawnMobs.preinIt();
		EntityMain.registerEntity();
	}
	
	public void init(FMLInitializationEvent e) {
		registry.Init(e);
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
	
	public static Registeration returnRegistry() {
		return registry;
	}
	
}

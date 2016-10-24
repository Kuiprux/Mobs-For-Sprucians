package com.smt.mobsforsprucians.proxies;

import java.io.File;

import com.smt.mobsforsprucians.Registeration;
import com.smt.mobsforsprucians.commands.SetWorldCommand;
import com.smt.mobsforsprucians.config.ManagerConfig;
import com.smt.mobsforsprucians.mobs.SpawnMobs;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.server.MinecraftServer;

public class CommonProxy {

	@EventHandler
	public void serverStart(FMLServerStartingEvent e) {
		Registeration.serverStart(e);
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		Registeration registry = new Registeration();
		registry.preInit(e);
		ManagerConfig.init(new File("config/WorldBoss.cfg"));
		SpawnMobs.preinIt();
	}
	
	public void init(FMLInitializationEvent e) {
		
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
}

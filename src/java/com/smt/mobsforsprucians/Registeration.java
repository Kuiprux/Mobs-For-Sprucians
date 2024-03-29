package com.smt.mobsforsprucians;

import java.io.File;

import com.smt.mobsforsprucians.blocks.MFSBlocks;
import com.smt.mobsforsprucians.commands.SetWorldCommand;
import com.smt.mobsforsprucians.config.ManagerConfig;
import com.smt.mobsforsprucians.entities.DropHandler;
import com.smt.mobsforsprucians.items.MFSItems;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.MinecraftForge;

public class Registeration {
	
	public static File configFile;
	
	//Tab
	public static CreativeTabs tab = new com.smt.mobsforsprucians.tabs.TabMFS(CreativeTabs.getNextID(),"TabMFS");
	
	public static void serverStart(FMLServerStartingEvent e) {
		MinecraftServer server = MinecraftServer.getServer();
		ICommandManager command = server.getCommandManager();
		ServerCommandManager manager = (ServerCommandManager) command;
		manager.registerCommand(new SetWorldCommand());
	}

	//Registering
	public final void preInit(FMLPreInitializationEvent e) {

		configFile = e.getSuggestedConfigurationFile();
		
		//Configs
		ManagerConfig.init(configFile);
		
		//Bosses
//		BossRegister.mainRegistry();
		
		//Registering Blocks
		MFSBlocks.registerBlocks();
		
		//Registering Items
		MFSItems.registerItems();
	}
	
	public final void Init(FMLInitializationEvent e) {
		MinecraftForge.EVENT_BUS.register(new DropHandler());
	}
}
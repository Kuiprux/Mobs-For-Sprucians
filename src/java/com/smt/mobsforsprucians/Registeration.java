package com.smt.mobsforsprucians;

import com.smt.mobsforsprucians.blocks.MFSBlocks;
import com.smt.mobsforsprucians.commands.SetWorldCommand;
import com.smt.mobsforsprucians.config.ManagerConfig;
import com.smt.mobsforsprucians.items.Items;
//import com.smt.mobsforsprucians.mobs.BossRegister;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.server.MinecraftServer;

public class Registeration {
	
	//Tab
	public static CreativeTabs tab = new com.smt.mobsforsprucians.tabs.TabMFS(CreativeTabs.getNextID(),"TabMFS");

	@Instance(MobsForSprucians.MODID)
	public Registeration modInstance;
	
	public static void serverStart(FMLServerStartingEvent e) {
		MinecraftServer server = MinecraftServer.getServer();
		ICommandManager command = server.getCommandManager();
		ServerCommandManager manager = (ServerCommandManager) command;
		manager.registerCommand(new SetWorldCommand());
	}

	//Registering
	public final void preInit(FMLPreInitializationEvent e) {

		//Configs
		ManagerConfig.init(e.getSuggestedConfigurationFile());
		
		//Bosses
//		BossRegister.mainRegistry();
		
		//Registering Blocks
		MFSBlocks.registerBlocks();
		
		//Registering Items
		Items.registerItems();
	}
}
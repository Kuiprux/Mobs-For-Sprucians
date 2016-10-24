package com.smt.mobsforsprucians;

import com.smt.mobsforsprucians.commands.SetWorldCommand;
import com.smt.mobsforsprucians.config.ManagerConfig;
import com.smt.mobsforsprucians.mobs.BossRegister;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.server.MinecraftServer;

public class Registeration {
	
	//Tab
	public static CreativeTabs tab = new com.smt.mobsforsprucians.tabs.TabMFS(CreativeTabs.getNextID(),"TabMFS");

	//Boss Items
	public static Item worldItem1;
	public static Item worldItem2;
	public static Item worldItem3;
	public static Item worldItem4;
	public static Item worldItem5;
	public static Item worldItem6;
	public static Item worldItem7;
	public static Item worldItem8;
	public static Item worldItem9;
	
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
		
		//Registering Boss Items
        worldItem1 = new Item().setUnlocalizedName("worldItem1").setCreativeTab(tab)
        		.setTextureName(MobsForSprucians.MODID + ":worldItem1");
        GameRegistry.registerItem(worldItem1, "worldItem1");
        
        worldItem2 = new Item().setUnlocalizedName("worldItem2").setCreativeTab(tab)
        		.setTextureName(MobsForSprucians.MODID + ":worldItem2");
        GameRegistry.registerItem(worldItem2, "worldItem2");
        
        worldItem3 = new Item().setUnlocalizedName("worldItem3").setCreativeTab(tab)
        		.setTextureName(MobsForSprucians.MODID + ":worldItem3");
        GameRegistry.registerItem(worldItem3, "worldItem3");
        
        worldItem4 = new Item().setUnlocalizedName("worldItem4").setCreativeTab(tab)
        		.setTextureName(MobsForSprucians.MODID + ":worldItem4");
        GameRegistry.registerItem(worldItem4, "worldItem4");
        
        worldItem5 = new Item().setUnlocalizedName("worldItem5").setCreativeTab(tab)
        		.setTextureName(MobsForSprucians.MODID + ":worldItem5");
        GameRegistry.registerItem(worldItem5, "worldItem5");
        
        worldItem6 = new Item().setUnlocalizedName("worldItem6").setCreativeTab(tab)
        		.setTextureName(MobsForSprucians.MODID + ":worldItem6");
        GameRegistry.registerItem(worldItem6, "worldItem6");
        
        worldItem7 = new Item().setUnlocalizedName("worldItem7").setCreativeTab(tab)
        		.setTextureName(MobsForSprucians.MODID + ":worldItem7");
        GameRegistry.registerItem(worldItem7, "worldItem7");
        
        worldItem8 = new Item().setUnlocalizedName("worldItem8").setCreativeTab(tab)
        		.setTextureName(MobsForSprucians.MODID + ":worldItem8");
        GameRegistry.registerItem(worldItem8, "worldItem8");
        
        worldItem9 = new Item().setUnlocalizedName("worldItem9").setCreativeTab(tab)
        		.setTextureName(MobsForSprucians.MODID + ":worldItem9");
        GameRegistry.registerItem(worldItem9, "worldItem9");
        
        System.out.println("test");
	}
}
package com.smt.mobsforsprucians.items;

import com.smt.mobsforsprucians.MobsForSprucians;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WorldItems {

	//Tab
	public static CreativeTabs Tab = new com.smt.mobsforsprucians.tabs.TabMFS(CreativeTabs.getNextID(),"TabMFS");
	//Boss Items
	public static Item WorldItem1;
	public static Item WorldItem2;
	public static Item WorldItem3;
	public static Item WorldItem4;
	public static Item WorldItem5;
	public static Item WorldItem6;
	public static Item WorldItem7;
	public static Item WorldItem8;
	public static Item WorldItem9;
	
	//World Setting Items
	public static Item SettingWorldItem1;
	public static Item SettingWorldItem2;
	public static Item SettingWorldItem3;
	public static Item SettingWorldItem4;
	public static Item SettingWorldItem5;
	public static Item SettingWorldItem6;
	public static Item SettingWorldItem7;
	public static Item SettingWorldItem8;
	public static Item SettingWorldItem9;
	
	//Registering
	public static final void preInit() {
		
		//Registering Boss Items
        WorldItem1 = new Item().setUnlocalizedName("WorldItem1").setCreativeTab(Tab)
        		.setTextureName(MobsForSprucians.MODID + ":WorldItem1");
        GameRegistry.registerItem(WorldItem1, "WorldItem1");
        
        WorldItem2 = new Item().setUnlocalizedName("WorldItem2").setCreativeTab(Tab)
        		.setTextureName(MobsForSprucians.MODID + ":WorldItem2");
        GameRegistry.registerItem(WorldItem2, "WorldItem2");
        
        WorldItem3 = new Item().setUnlocalizedName("WorldItem3").setCreativeTab(Tab)
        		.setTextureName(MobsForSprucians.MODID + ":WorldItem3");
        GameRegistry.registerItem(WorldItem3, "WorldItem3");
        
        WorldItem4 = new Item().setUnlocalizedName("WorldItem4").setCreativeTab(Tab)
        		.setTextureName(MobsForSprucians.MODID + ":WorldItem4");
        GameRegistry.registerItem(WorldItem4, "WorldItem4");
        
        WorldItem5 = new Item().setUnlocalizedName("WorldItem5").setCreativeTab(Tab)
        		.setTextureName(MobsForSprucians.MODID + ":WorldItem5");
        GameRegistry.registerItem(WorldItem5, "WorldItem5");
        
        WorldItem6 = new Item().setUnlocalizedName("WorldItem6").setCreativeTab(Tab)
        		.setTextureName(MobsForSprucians.MODID + ":WorldItem6");
        GameRegistry.registerItem(WorldItem6, "WorldItem6");
        
        WorldItem7 = new Item().setUnlocalizedName("WorldItem7").setCreativeTab(Tab)
        		.setTextureName(MobsForSprucians.MODID + ":WorldItem7");
        GameRegistry.registerItem(WorldItem7, "WorldItem7");
        
        WorldItem8 = new Item().setUnlocalizedName("WorldItem8").setCreativeTab(Tab)
        		.setTextureName(MobsForSprucians.MODID + ":WorldItem8");
        GameRegistry.registerItem(WorldItem8, "WorldItem8");
        
        WorldItem9 = new Item().setUnlocalizedName("WorldItem9").setCreativeTab(Tab)
        		.setTextureName(MobsForSprucians.MODID + ":WorldItem9");
        GameRegistry.registerItem(WorldItem9, "WorldItem9");
        
        //registering World Items
        SettingWorldItem1 = new Item().setUnlocalizedName("SettingWorldItem1").setCreativeTab(Tab)
        		.setTextureName(MobsForSprucians.MODID + ":SettingWorldItem1");
        GameRegistry.registerItem(SettingWorldItem1, "SettingWorldItem1");

        SettingWorldItem2 = new Item().setUnlocalizedName("SettingWorldItem2").setCreativeTab(Tab)
        		.setTextureName(MobsForSprucians.MODID + ":SettingWorldItem2");
        GameRegistry.registerItem(SettingWorldItem2, "SettingWorldItem2");

        SettingWorldItem3 = new Item().setUnlocalizedName("SettingWorldItem3").setCreativeTab(Tab)
        		.setTextureName(MobsForSprucians.MODID + ":SettingWorldItem3");
        GameRegistry.registerItem(SettingWorldItem3, "SettingWorldItem3");

        SettingWorldItem4 = new Item().setUnlocalizedName("SettingWorldItem4").setCreativeTab(Tab)
        		.setTextureName(MobsForSprucians.MODID + ":SettingWorldItem4");
        GameRegistry.registerItem(SettingWorldItem4, "SettingWorldItem4");

        SettingWorldItem5 = new Item().setUnlocalizedName("SettingWorldItem5").setCreativeTab(Tab)
        		.setTextureName(MobsForSprucians.MODID + ":SettingWorldItem5");
        GameRegistry.registerItem(SettingWorldItem5, "SettingWorldItem5");

        SettingWorldItem6 = new Item().setUnlocalizedName("SettingWorldItem6").setCreativeTab(Tab)
        		.setTextureName(MobsForSprucians.MODID + ":SettingWorldItem6");
        GameRegistry.registerItem(SettingWorldItem6, "SettingWorldItem6");

        SettingWorldItem7 = new Item().setUnlocalizedName("SettingWorldItem7").setCreativeTab(Tab)
        		.setTextureName(MobsForSprucians.MODID + ":SettingWorldItem7");
        GameRegistry.registerItem(SettingWorldItem7, "SettingWorldItem7");

        SettingWorldItem8 = new Item().setUnlocalizedName("SettingWorldItem8").setCreativeTab(Tab)
        		.setTextureName(MobsForSprucians.MODID + ":SettingWorldItem8");
        GameRegistry.registerItem(SettingWorldItem8, "SettingWorldItem8");

        SettingWorldItem9 = new Item().setUnlocalizedName("SettingWorldItem9").setCreativeTab(Tab)
        		.setTextureName(MobsForSprucians.MODID + ":SettingWorldItem9");
        GameRegistry.registerItem(SettingWorldItem9, "SettingWorldItem9");

	}
}
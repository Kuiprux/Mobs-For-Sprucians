package com.smt.mobsforsprucians.items;

import com.smt.mobsforsprucians.MobsForSprucians;
import com.smt.mobsforsprucians.Registeration;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class Items {
	public static Item worldItem1;
	public static Item worldItem2;
	public static Item worldItem3;
	public static Item worldItem4;
	public static Item worldItem5;
	public static Item worldItem6;
	public static Item worldItem7;
	public static Item worldItem8;
	public static Item worldItem9;
	
	public static void registerItems() {
	    worldItem1 = new Item().setUnlocalizedName("worldItem1").setCreativeTab(Registeration.tab)
	    		.setTextureName(MobsForSprucians.MODID + ":worldItem1");
	    GameRegistry.registerItem(worldItem1, "worldItem1");
	    
	    worldItem2 = new Item().setUnlocalizedName("worldItem2").setCreativeTab(Registeration.tab)
	    		.setTextureName(MobsForSprucians.MODID + ":worldItem2");
	    GameRegistry.registerItem(worldItem2, "worldItem2");
	    
	    worldItem3 = new Item().setUnlocalizedName("worldItem3").setCreativeTab(Registeration.tab)
	    		.setTextureName(MobsForSprucians.MODID + ":worldItem3");
	    GameRegistry.registerItem(worldItem3, "worldItem3");
	    
	    worldItem4 = new Item().setUnlocalizedName("worldItem4").setCreativeTab(Registeration.tab)
	    		.setTextureName(MobsForSprucians.MODID + ":worldItem4");
	    GameRegistry.registerItem(worldItem4, "worldItem4");
	    
	    worldItem5 = new Item().setUnlocalizedName("worldItem5").setCreativeTab(Registeration.tab)
	    		.setTextureName(MobsForSprucians.MODID + ":worldItem5");
	    GameRegistry.registerItem(worldItem5, "worldItem5");
	    
	    worldItem6 = new Item().setUnlocalizedName("worldItem6").setCreativeTab(Registeration.tab)
	    		.setTextureName(MobsForSprucians.MODID + ":worldItem6");
	    GameRegistry.registerItem(worldItem6, "worldItem6");
	    
	    worldItem7 = new Item().setUnlocalizedName("worldItem7").setCreativeTab(Registeration.tab)
	    		.setTextureName(MobsForSprucians.MODID + ":worldItem7");
	    GameRegistry.registerItem(worldItem7, "worldItem7");
	    
	    worldItem8 = new Item().setUnlocalizedName("worldItem8").setCreativeTab(Registeration.tab)
	    		.setTextureName(MobsForSprucians.MODID + ":worldItem8");
	    GameRegistry.registerItem(worldItem8, "worldItem8");
	    
	    worldItem9 = new Item().setUnlocalizedName("worldItem9").setCreativeTab(Registeration.tab)
	    		.setTextureName(MobsForSprucians.MODID + ":worldItem9");
	    GameRegistry.registerItem(worldItem9, "worldItem9");
	}
}

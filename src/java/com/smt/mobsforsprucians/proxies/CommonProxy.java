package com.smt.mobsforsprucians.proxies;

import com.smt.mobsforsprucians.items.WorldItems;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		WorldItems.preInit();
	}
	
	public void Init(FMLInitializationEvent e) {
		
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
}

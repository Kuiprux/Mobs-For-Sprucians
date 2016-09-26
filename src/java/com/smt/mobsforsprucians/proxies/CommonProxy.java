package com.smt.mobsforsprucians.proxies;

import com.smt.mobsforsprucians.Registeration;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		Registeration.preInit();
	}
	
	public void Init(FMLInitializationEvent e) {
		
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
}

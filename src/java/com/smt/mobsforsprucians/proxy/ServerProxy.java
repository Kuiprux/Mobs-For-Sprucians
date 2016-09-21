package com.smt.mobsforsprucians.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy extends CommonProxy{

	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}
	
	public void Init(FMLInitializationEvent e) {
		super.Init(e);		
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);	
	}
}

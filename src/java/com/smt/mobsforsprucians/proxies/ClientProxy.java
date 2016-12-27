package com.smt.mobsforsprucians.proxies;

import org.apache.logging.log4j.Logger;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	private static final Logger LOGGER = FMLLog.getLogger();
	
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}
	
	public void init(FMLInitializationEvent e) {
		super.init(e);		
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);	
	}
	
	public void print(String s)
	{
		LOGGER.info(s);
	}
}

package com.smt.mobsforsprucians.mobs;

import com.smt.mobsforsprucians.MobsForSprucians;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;

public class EntityMain {

	public EntityMain() {
		
	}
	
	public static void mainRegistry() {
		registerEntity();
	}
	
	public static void registerEntity() {
		createEntity(EntityMain.class, "Notch", 0xffd299, 0x262626);
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, MobsForSprucians.instance, 64, 1, true);
	
		createEgg(randomId, solidColor, spotColor);
	}
	
	private static void createEgg(int randomId, int solidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	}
}

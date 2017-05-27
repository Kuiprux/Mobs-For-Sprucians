package com.smt.mobsforsprucians.entities;

import com.smt.mobsforsprucians.MobsForSprucians;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;

public class EntityMain {
	
	public static void registerEntity() {
		createEntity(EntityWorldBoss1.class, "Notch", 0xffd299, 0x262626);
		createEntity(EntityWorldBoss2.class, "UtgardLoki", 0xffd299, 0x262626);
		createEntity(EntityWorldBoss3.class, "LightElf", 0xffd299, 0x262626);
		createEntity(EntityWorldBoss4.class, "Dwarf", 0xffd299, 0x262626);
		createEntity(EntityWorldBoss5.class, "Olaf", 0xffd299, 0x262626);
		createEntity(EntityWorldBoss6.class, "Surt", 0xffd299, 0x262626);
		createEntity(EntityWorldBoss7.class, "Hel", 0xffd299, 0x262626);
		createEntity(EntityWorldBoss8.class, "Freya", 0xffd299, 0x262626);
		createEntity(EntityWorldBoss9.class, "Odin", 0xffd299, 0x262626);
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

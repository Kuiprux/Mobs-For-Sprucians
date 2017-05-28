package com.smt.mobsforsprucians.entities;

import com.smt.mobsforsprucians.items.MFSItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent;

public class DropHandler {

	@SubscribeEvent
	public void onEntityDrop(LivingEvent e) {
		/*
		if(e.entityLiving instanceof EntityWorldBoss1) {
			e.entityLiving.entityDropItem(new ItemStack(MFSItems.bossItem1), 1);
		} else if(e.entityLiving instanceof EntityWorldBoss2) {
			e.entityLiving.entityDropItem(new ItemStack(MFSItems.bossItem2), 1);
		} else if(e.entityLiving instanceof EntityWorldBoss3) {
			e.entityLiving.entityDropItem(new ItemStack(MFSItems.bossItem3), 1);
		} else if(e.entityLiving instanceof EntityWorldBoss4) {
			e.entityLiving.entityDropItem(new ItemStack(MFSItems.bossItem4), 1);
		} else if(e.entityLiving instanceof EntityWorldBoss5) {
			e.entityLiving.entityDropItem(new ItemStack(MFSItems.bossItem5), 1);
		} else if(e.entityLiving instanceof EntityWorldBoss6) {
			e.entityLiving.entityDropItem(new ItemStack(MFSItems.bossItem6), 1);
		} else if(e.entityLiving instanceof EntityWorldBoss7) {
			e.entityLiving.entityDropItem(new ItemStack(MFSItems.bossItem7), 1);
		} else if(e.entityLiving instanceof EntityWorldBoss8) {
			e.entityLiving.entityDropItem(new ItemStack(MFSItems.bossItem8), 1);
		} else if(e.entityLiving instanceof EntityWorldBoss9) {
			e.entityLiving.entityDropItem(new ItemStack(MFSItems.bossItem9), 1);
		}	*/
	}
}

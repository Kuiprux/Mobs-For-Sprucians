package com.smt.mobsforsprucians.entities;

import com.smt.mobsforsprucians.items.MFSItems;

import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityWorldBoss1 extends EntityWorldBossBase{
	
	public EntityWorldBoss1(World p_i1738_1_) {
		super(p_i1738_1_);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource damSource, float par2) {
		return super.attackEntityFrom(damSource, par2);
	}
	
	@Override
	protected boolean isAIEnabled()
	{
	   return true;
	}
	
	protected Item getDropItem() {
		return MFSItems.bossItem1;
	}
	
	protected void dropFewItems(boolean par1, int par2) {
		Item item = this.getDropItem();
		
		if (item != null && par1) {
			this.dropItem(item, 1);
		}
	}
}

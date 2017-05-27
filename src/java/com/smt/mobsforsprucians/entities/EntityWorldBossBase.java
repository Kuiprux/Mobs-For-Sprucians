package com.smt.mobsforsprucians.entities;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityWorldBossBase extends EntityMob{

	EntityPlayer lastAttacked;
	
	public EntityWorldBossBase(World p_i1738_1_) {
		super(p_i1738_1_);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource damSource, float par2) {
		if(damSource.getDamageType() == "player") {
			lastAttacked = (EntityPlayer) damSource.getSourceOfDamage();
		}
	    if (isEntityInvulnerable()) {
	        return false;
	    }
	    else {
	        return super.attackEntityFrom(damSource, par2);
	    }
	}
	@Override
	protected boolean isAIEnabled()
	{
	   return true;
	}

}

package com.smt.mobsforsprucians.entities;

import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityWorldBoss5 extends EntityWorldBossBase{

	public EntityWorldBoss5(World p_i1738_1_) {
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

}

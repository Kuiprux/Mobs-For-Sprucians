package com.smt.mobsforsprucians.entities.ai;

import net.minecraft.entity.player.EntityPlayer;

public class AILightning extends AIBase {

	int max;
	EntityPlayer lastAt;
	
	AILightning(int max) {
		
	}
	
	@Override
	public boolean shouldExecute() {
		return true;
	}
	
	@Override
	public void startExecuting() {
		
	}
	
	@Override
	public boolean continueExecuting() {
		return true;
	}

}

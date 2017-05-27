package com.smt.mobsforsprucians.entities.ai;

import net.minecraft.entity.ai.EntityAIBase;

public class AIBase extends EntityAIBase {

	@Override
	public boolean shouldExecute() {
		return false;
	}
	
	@Override
	public void startExecuting() {
		
	}
	
	@Override
	public boolean continueExecuting() {
		return false;
	}

}

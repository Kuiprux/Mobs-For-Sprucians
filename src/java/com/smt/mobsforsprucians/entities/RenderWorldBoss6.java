package com.smt.mobsforsprucians.entities;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderWorldBoss6 extends RenderBiped{
	
	public static void renderEntity() {
		RenderingRegistry.registerEntityRenderingHandler(EntityWorldBoss6.class, new RenderWorldBoss6(new ModelBiped(), 1));
	}
	
	public RenderWorldBoss6(ModelBiped model, float shadowSize) {
		super(model, shadowSize);
		// TODO Auto-generated constructor stub
	}
	
	protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return new ResourceLocation("mobsforsprucians:textures/entities/Notch.png");
    }

    public void doRender(Entity entity, double x, double y, double z, float rotationYaw, float rotationPitch)
    {
        this.doRender((EntityLiving)entity, x, y, z, rotationYaw, rotationPitch);
    }
	
}

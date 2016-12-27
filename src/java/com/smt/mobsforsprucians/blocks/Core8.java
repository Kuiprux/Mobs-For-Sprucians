package com.smt.mobsforsprucians.blocks;

import com.smt.mobsforsprucians.Registeration;
import com.smt.mobsforsprucians.mobs.SpawnMobs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class Core8 extends Block {

	String name = "Core8";

	public Core8() {
		super(Material.rock);
		setBlockName(name);
		setBlockTextureName("block." + name);
		setCreativeTab(Registeration.tab);
		setHarvestLevel("pickaxe", 1);
		setHardness(2.0F);
		setResistance(10.0F);
	}
	
	@Override
    public boolean onBlockActivated(World world, int xPos, int yPos, int zPos, EntityPlayer player, int n1, float n2, float n3, float n4)
    {
		SpawnMobs.spawnMob(world, xPos, yPos, zPos, player, name);
        return true;
    }
}
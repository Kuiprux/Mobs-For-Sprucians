package com.smt.mobsforsprucians.blocks;

import com.smt.mobsforsprucians.Registeration;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Core6 extends Block {

	String name = "Core6";

	public Core6() {
		super(Material.rock);
		setBlockName(name);
		setBlockTextureName("block." + name);
		setCreativeTab(Registeration.tab);
		setHarvestLevel("pickaxe", 1);
		setHardness(2.0F);
		setResistance(10.0F);
	}
}
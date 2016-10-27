package com.smt.mobsforsprucians.blocks;

import com.smt.mobsforsprucians.Registeration;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Core2 extends Block {

	String name = "Core2";

	public Core2() {
		super(Material.rock);
		setBlockName(name);
		setBlockTextureName("block." + name);
		setCreativeTab(Registeration.tab);
		setHarvestLevel("pickaxe", 1);
		setHardness(2.0F);
		setResistance(10.0F);
	}
}
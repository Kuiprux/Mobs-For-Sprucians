package com.smt.mobsforsprucians.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class MFSBlocks {
	public static Block core1;
	public static Block core2;
	public static Block core3;
	public static Block core4;
	public static Block core5;
	public static Block core6;
	public static Block core7;
	public static Block core8;
	public static Block core9;

	public static void registerBlocks() {
		GameRegistry.registerBlock(core1 = new Core1(), "Core1");
		GameRegistry.registerBlock(core2 = new Core1(), "Core2");
		GameRegistry.registerBlock(core3 = new Core1(), "Core3");
		GameRegistry.registerBlock(core4 = new Core1(), "Core4");
		GameRegistry.registerBlock(core5 = new Core1(), "Core5");
		GameRegistry.registerBlock(core6 = new Core1(), "Core6");
		GameRegistry.registerBlock(core7 = new Core1(), "Core7");
		GameRegistry.registerBlock(core8 = new Core1(), "Core8");
		GameRegistry.registerBlock(core9 = new Core1(), "Core9");
    }
}

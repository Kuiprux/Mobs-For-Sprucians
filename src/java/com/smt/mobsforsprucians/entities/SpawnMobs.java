package com.smt.mobsforsprucians.entities;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import com.smt.mobsforsprucians.blocks.MFSBlocks;
import com.smt.mobsforsprucians.config.ManagerConfig;
import com.smt.mobsforsprucians.multiblockstructures.MultiblockChecker;


public class SpawnMobs{
	static Block[][] bossSpawningBlock1;
	static Block[][] bossSpawningBlock2;
	static Block[][] bossSpawningBlock3;
	static Block[][] bossSpawningBlock4;
	static Block[][] bossSpawningBlock5;
	static Block[][] bossSpawningBlock6;
	static Block[][] bossSpawningBlock7;
	static Block[][] bossSpawningBlock8;
	static Block[][] bossSpawningBlock9;
	static Block[][][] bossSpawningBlocks;
	static ChatComponentText textToPlayer;
	
	public static void preinIt() {
		bossSpawningBlock1 = new Block[][]{	{Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.stone,Blocks.air,Blocks.air,Blocks.air,Blocks.air},
											{Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.stone,Blocks.air,Blocks.air,Blocks.air,Blocks.air},
											{Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,MFSBlocks.core9,Blocks.air,Blocks.air,Blocks.air,Blocks.air},
											{Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air},
											{Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air}	};
		
		bossSpawningBlock2 = new Block[][]{	{Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt},
											{Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt},
											{Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt},
											{Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt},
											{Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt,Blocks.dirt}	};
		
		bossSpawningBlock3 = new Block[][]{	{Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass},
											{Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass},
											{Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass},
											{Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass},
											{Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass,Blocks.glass}	};
		
		bossSpawningBlock4 = new Block[][]{	{Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston},
											{Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston},
											{Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston},
											{Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston},
											{Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston,Blocks.piston}	};
		
		bossSpawningBlock5 = new Block[][]{	{Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone},
											{Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone},
											{Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone},
											{Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone},
											{Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone,Blocks.cobblestone}	};
		
		bossSpawningBlock6 = new Block[][]{	{Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web},
											{Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web},
											{Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web},
											{Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web},
											{Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web,Blocks.web}	};
		
		bossSpawningBlock7 = new Block[][]{	{Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool},
											{Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool},
											{Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool},
											{Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool},
											{Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool,Blocks.wool}	};
		
		bossSpawningBlock8 = new Block[][]{	{Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock},
											{Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock},
											{Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock},
											{Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock},
											{Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock,Blocks.noteblock}	};
		
		bossSpawningBlock9 = new Block[][]{	{Blocks.stone,Blocks.dirt,Blocks.glass,Blocks.piston,Blocks.web,Blocks.cobblestone,Blocks.noteblock,Blocks.grass,Blocks.sponge,Blocks.tnt,Blocks.planks,Blocks.ice,Blocks.packed_ice},
											{Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air},
											{Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,MFSBlocks.core9,Blocks.air,Blocks.air,Blocks.air,Blocks.air},
											{Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air},
											{Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air}	};
											
		bossSpawningBlocks = new Block[][][]{bossSpawningBlock1, bossSpawningBlock2, bossSpawningBlock3, bossSpawningBlock4, bossSpawningBlock5, bossSpawningBlock6, bossSpawningBlock7, bossSpawningBlock8, bossSpawningBlock9};
	}
	
	public static void spawnMob(World world, int x, int y, int z, EntityPlayer player, String blockName) {
		System.out.println(blockName);
		int num = ManagerConfig.getId(getId(blockName));
		System.out.println(num + " & " + player.dimension);
		if(num == player.dimension) {
			if(MultiblockChecker.checkMultiblockStructure(world, x, y, z, bossSpawningBlocks[getId(blockName)])) {
				removeBlocks(world, x, y, z);
				spawnBoss(world, getId(blockName), x, y, z);
				textToPlayer =  new ChatComponentText("[MFS] Congratulations!");
				player.addChatMessage(textToPlayer);
			}
		}
	}
	
	private static int getId(String name) {
		switch(name) {
		case "Core1":
			return 0;
		case "Core2":
			return 1;
		case "Core3":
			return 2;
		case "Core4":
			return 3;
		case "Core5":
			return 4;
		case "Core6":
			return 5;
		case "Core7":
			return 6;
		case "Core8":
			return 7;
		case "Core9":
			return 8;
		}
		return -1;
	}
	
	private static void spawnBoss(World world, int num, int x, int y, int z) {
		switch(num) {
		case 0:
			EntityWorldBoss1 notch = new EntityWorldBoss1(world);
			notch.setPosition(x, y, z);
			world.spawnEntityInWorld(notch);
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		}
	}
	
	private static void removeBlocks(World world, int x, int y, int z) {
		for(int forX = x-4; forX <= x+4; forX++) {
			for(int forY = y-2; forY <= y+2; forY++) {
				for(int forZ = z-4; forZ <= z+4; forZ++) {
					world.setBlockToAir(forX, forY, forZ);
				}
			}
		}
	}
}

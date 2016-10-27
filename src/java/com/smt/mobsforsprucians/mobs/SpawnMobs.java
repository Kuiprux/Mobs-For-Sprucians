package com.smt.mobsforsprucians.mobs;

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
	
	public static void preinIt() {
		bossSpawningBlock1 = new Block[][]{	{Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian},
											{Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian},
											{Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian},
											{Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.air,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian},
											{Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.air,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian}	};
		
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
		
		bossSpawningBlock9 = new Block[][]{	{Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air},
											{Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air},
											{Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,MFSBlocks.core9,Blocks.air,Blocks.air,Blocks.air,Blocks.air},
											{Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air},
											{Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air,Blocks.air}	};
											
		bossSpawningBlocks = new Block[][][]{bossSpawningBlock1, bossSpawningBlock2, bossSpawningBlock3, bossSpawningBlock4, bossSpawningBlock5, bossSpawningBlock6, bossSpawningBlock7, bossSpawningBlock8, bossSpawningBlock9};
	}
	
	public void spawnMob(World world, int x, int y, int z, EntityPlayer player) {
		int num = ManagerConfig.getWorldNum(world.provider.dimensionId);
		if(num!=0) {
			if(MultiblockChecker.checkMultiblockStructure(world, x, y, z, bossSpawningBlocks[num])) {
				player.addChatMessage(new ChatComponentText("[MFS] Congratulations!"));
			}
		}
	}
}

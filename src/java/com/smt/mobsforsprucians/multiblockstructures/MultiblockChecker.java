package com.smt.mobsforsprucians.multiblockstructures;

import net.minecraft.block.Block;
import net.minecraft.world.World;

public class MultiblockChecker {

	public static boolean checkMultiblockStructure(World world, int x, int y, int z, Block[][] blocks){
		
		//first Layer
		if(world.getBlock(x-4, y-2, z-4) == blocks[0][0] &&
				world.getBlock(x-3, y-2, z-4) == blocks[0][1] &&
				world.getBlock(x-2, y-2, z-4) == blocks[0][2] &&
				world.getBlock(x-1, y-2, z-4) == blocks[0][3] &&
				world.getBlock(x+0, y-2, z-4) == blocks[0][9] &&
				world.getBlock(x+1, y-2, z-4) == blocks[0][3] &&
				world.getBlock(x+2, y-2, z-4) == blocks[0][2] &&
				world.getBlock(x+3, y-2, z-4) == blocks[0][1] &&
				world.getBlock(x-4, y-2, z-4) == blocks[0][0] &&
				
				world.getBlock(x-4, y-2, z-3) == blocks[0][1] &&
				world.getBlock(x-3, y-2, z-3) == blocks[0][10] &&
				world.getBlock(x-2, y-2, z-3) == blocks[0][3] &&
				world.getBlock(x-1, y-2, z-3) == blocks[0][4] &&
				world.getBlock(x+0, y-2, z-3) == blocks[0][5] &&
				world.getBlock(x+1, y-2, z-3) == blocks[0][4] &&
				world.getBlock(x+2, y-2, z-3) == blocks[0][3] &&
				world.getBlock(x+3, y-2, z-3) == blocks[0][10] &&
				world.getBlock(x-4, y-2, z-3) == blocks[0][1] &&
				
				world.getBlock(x-4, y-2, z-2) == blocks[0][2] &&
				world.getBlock(x-3, y-2, z-2) == blocks[0][3] &&
				world.getBlock(x-2, y-2, z-2) == blocks[0][11] &&
				world.getBlock(x-1, y-2, z-2) == blocks[0][5] &&
				world.getBlock(x+0, y-2, z-2) == blocks[0][6] &&
				world.getBlock(x+1, y-2, z-2) == blocks[0][5] &&
				world.getBlock(x+2, y-2, z-2) == blocks[0][11] &&
				world.getBlock(x+3, y-2, z-2) == blocks[0][3] &&
				world.getBlock(x-4, y-2, z-2) == blocks[0][2] &&
				
				world.getBlock(x-4, y-2, z-1) == blocks[0][3] &&
				world.getBlock(x-3, y-2, z-1) == blocks[0][4] &&
				world.getBlock(x-2, y-2, z-1) == blocks[0][5] &&
				world.getBlock(x-1, y-2, z-1) == blocks[0][12] &&
				world.getBlock(x+0, y-2, z-1) == blocks[0][7] &&
				world.getBlock(x+1, y-2, z-1) == blocks[0][12] &&
				world.getBlock(x+2, y-2, z-1) == blocks[0][5] &&
				world.getBlock(x+3, y-2, z-1) == blocks[0][4] &&
				world.getBlock(x-4, y-2, z-1) == blocks[0][3] &&
				
				world.getBlock(x-4, y-2, z+0) == blocks[0][9] &&
				world.getBlock(x-3, y-2, z+0) == blocks[0][5] &&
				world.getBlock(x-2, y-2, z+0) == blocks[0][6] &&
				world.getBlock(x-1, y-2, z+0) == blocks[0][7] &&
				world.getBlock(x+0, y-2, z+0) == blocks[0][8] &&
				world.getBlock(x+1, y-2, z+0) == blocks[0][7] &&
				world.getBlock(x+2, y-2, z+0) == blocks[0][6] &&
				world.getBlock(x+3, y-2, z+0) == blocks[0][5] &&
				world.getBlock(x-4, y-2, z+0) == blocks[0][9] &&
				
				world.getBlock(x-4, y-2, z+1) == blocks[0][3] &&
				world.getBlock(x-3, y-2, z+1) == blocks[0][4] &&
				world.getBlock(x-2, y-2, z+1) == blocks[0][5] &&
				world.getBlock(x-1, y-2, z+1) == blocks[0][12] &&
				world.getBlock(x+0, y-2, z+1) == blocks[0][7] &&
				world.getBlock(x+1, y-2, z+1) == blocks[0][12] &&
				world.getBlock(x+2, y-2, z+1) == blocks[0][5] &&
				world.getBlock(x+3, y-2, z+1) == blocks[0][4] &&
				world.getBlock(x-4, y-2, z+1) == blocks[0][3] &&
				
				world.getBlock(x-4, y-2, z+2) == blocks[0][2] &&
				world.getBlock(x-3, y-2, z+2) == blocks[0][3] &&
				world.getBlock(x-2, y-2, z+2) == blocks[0][11] &&
				world.getBlock(x-1, y-2, z+2) == blocks[0][5] &&
				world.getBlock(x+0, y-2, z+2) == blocks[0][6] &&
				world.getBlock(x+1, y-2, z+2) == blocks[0][5] &&
				world.getBlock(x+2, y-2, z+2) == blocks[0][11] &&
				world.getBlock(x+3, y-2, z+2) == blocks[0][3] &&
				world.getBlock(x-4, y-2, z+2) == blocks[0][2] &&
				
				world.getBlock(x-4, y-2, z+3) == blocks[0][1] &&
				world.getBlock(x-3, y-2, z+3) == blocks[0][10] &&
				world.getBlock(x-2, y-2, z+3) == blocks[0][3] &&
				world.getBlock(x-1, y-2, z+3) == blocks[0][4] &&
				world.getBlock(x+0, y-2, z+3) == blocks[0][5] &&
				world.getBlock(x+1, y-2, z+3) == blocks[0][4] &&
				world.getBlock(x+2, y-2, z+3) == blocks[0][3] &&
				world.getBlock(x+3, y-2, z+3) == blocks[0][10] &&
				world.getBlock(x-4, y-2, z+3) == blocks[0][1] &&
				
				world.getBlock(x-4, y-2, z+4) == blocks[0][0] &&
				world.getBlock(x-3, y-2, z+4) == blocks[0][1] &&
				world.getBlock(x-2, y-2, z+4) == blocks[0][2] &&
				world.getBlock(x-1, y-2, z+4) == blocks[0][3] &&
				world.getBlock(x+0, y-2, z+4) == blocks[0][9] &&
				world.getBlock(x+1, y-2, z+4) == blocks[0][3] &&
				world.getBlock(x+2, y-2, z+4) == blocks[0][2] &&
				world.getBlock(x+3, y-2, z+4) == blocks[0][1] &&
				world.getBlock(x-4, y-2, z+4) == blocks[0][0]) {
			
			//Second Layer
			if(world.getBlock(x-4, y-2, z-4) == blocks[1][0] &&
					world.getBlock(x-3, y-2, z-4) == blocks[1][1] &&
					world.getBlock(x-2, y-2, z-4) == blocks[1][2] &&
					world.getBlock(x-1, y-2, z-4) == blocks[1][3] &&
					world.getBlock(x+0, y-2, z-4) == blocks[1][9] &&
					world.getBlock(x+1, y-2, z-4) == blocks[1][3] &&
					world.getBlock(x+2, y-2, z-4) == blocks[1][2] &&
					world.getBlock(x+3, y-2, z-4) == blocks[1][1] &&
					world.getBlock(x-4, y-2, z-4) == blocks[1][0] &&
					
					world.getBlock(x-4, y-2, z-3) == blocks[1][1] &&
					world.getBlock(x-3, y-2, z-3) == blocks[1][10] &&
					world.getBlock(x-2, y-2, z-3) == blocks[1][3] &&
					world.getBlock(x-1, y-2, z-3) == blocks[1][4] &&
					world.getBlock(x+0, y-2, z-3) == blocks[1][5] &&
					world.getBlock(x+1, y-2, z-3) == blocks[1][4] &&
					world.getBlock(x+2, y-2, z-3) == blocks[1][3] &&
					world.getBlock(x+3, y-2, z-3) == blocks[1][10] &&
					world.getBlock(x-4, y-2, z-3) == blocks[1][1] &&
					
					world.getBlock(x-4, y-2, z-2) == blocks[1][2] &&
					world.getBlock(x-3, y-2, z-2) == blocks[1][3] &&
					world.getBlock(x-2, y-2, z-2) == blocks[1][11] &&
					world.getBlock(x-1, y-2, z-2) == blocks[1][5] &&
					world.getBlock(x+0, y-2, z-2) == blocks[1][6] &&
					world.getBlock(x+1, y-2, z-2) == blocks[1][5] &&
					world.getBlock(x+2, y-2, z-2) == blocks[1][11] &&
					world.getBlock(x+3, y-2, z-2) == blocks[1][3] &&
					world.getBlock(x-4, y-2, z-2) == blocks[1][2] &&
					
					world.getBlock(x-4, y-2, z-1) == blocks[1][3] &&
					world.getBlock(x-3, y-2, z-1) == blocks[1][4] &&
					world.getBlock(x-2, y-2, z-1) == blocks[1][5] &&
					world.getBlock(x-1, y-2, z-1) == blocks[1][12] &&
					world.getBlock(x+0, y-2, z-1) == blocks[1][7] &&
					world.getBlock(x+1, y-2, z-1) == blocks[1][12] &&
					world.getBlock(x+2, y-2, z-1) == blocks[1][5] &&
					world.getBlock(x+3, y-2, z-1) == blocks[1][4] &&
					world.getBlock(x-4, y-2, z-1) == blocks[1][3] &&
					
					world.getBlock(x-4, y-2, z+0) == blocks[1][9] &&
					world.getBlock(x-3, y-2, z+0) == blocks[1][5] &&
					world.getBlock(x-2, y-2, z+0) == blocks[1][6] &&
					world.getBlock(x-1, y-2, z+0) == blocks[1][7] &&
					world.getBlock(x+0, y-2, z+0) == blocks[1][8] &&
					world.getBlock(x+1, y-2, z+0) == blocks[1][7] &&
					world.getBlock(x+2, y-2, z+0) == blocks[1][6] &&
					world.getBlock(x+3, y-2, z+0) == blocks[1][5] &&
					world.getBlock(x-4, y-2, z+0) == blocks[1][9] &&
					
					world.getBlock(x-4, y-2, z+1) == blocks[1][3] &&
					world.getBlock(x-3, y-2, z+1) == blocks[1][4] &&
					world.getBlock(x-2, y-2, z+1) == blocks[1][5] &&
					world.getBlock(x-1, y-2, z+1) == blocks[1][12] &&
					world.getBlock(x+0, y-2, z+1) == blocks[1][7] &&
					world.getBlock(x+1, y-2, z+1) == blocks[1][12] &&
					world.getBlock(x+2, y-2, z+1) == blocks[1][5] &&
					world.getBlock(x+3, y-2, z+1) == blocks[1][4] &&
					world.getBlock(x-4, y-2, z+1) == blocks[1][3] &&
					
					world.getBlock(x-4, y-2, z+2) == blocks[1][2] &&
					world.getBlock(x-3, y-2, z+2) == blocks[1][3] &&
					world.getBlock(x-2, y-2, z+2) == blocks[1][11] &&
					world.getBlock(x-1, y-2, z+2) == blocks[1][5] &&
					world.getBlock(x+0, y-2, z+2) == blocks[1][6] &&
					world.getBlock(x+1, y-2, z+2) == blocks[1][5] &&
					world.getBlock(x+2, y-2, z+2) == blocks[1][11] &&
					world.getBlock(x+3, y-2, z+2) == blocks[1][3] &&
					world.getBlock(x-4, y-2, z+2) == blocks[1][2] &&
					
					world.getBlock(x-4, y-2, z+3) == blocks[1][1] &&
					world.getBlock(x-3, y-2, z+3) == blocks[1][10] &&
					world.getBlock(x-2, y-2, z+3) == blocks[1][3] &&
					world.getBlock(x-1, y-2, z+3) == blocks[1][4] &&
					world.getBlock(x+0, y-2, z+3) == blocks[1][5] &&
					world.getBlock(x+1, y-2, z+3) == blocks[1][4] &&
					world.getBlock(x+2, y-2, z+3) == blocks[1][3] &&
					world.getBlock(x+3, y-2, z+3) == blocks[1][10] &&
					world.getBlock(x-4, y-2, z+3) == blocks[1][1] &&
					
					world.getBlock(x-4, y-2, z+4) == blocks[1][0] &&
					world.getBlock(x-3, y-2, z+4) == blocks[1][1] &&
					world.getBlock(x-2, y-2, z+4) == blocks[1][2] &&
					world.getBlock(x-1, y-2, z+4) == blocks[1][3] &&
					world.getBlock(x+0, y-2, z+4) == blocks[1][9] &&
					world.getBlock(x+1, y-2, z+4) == blocks[1][3] &&
					world.getBlock(x+2, y-2, z+4) == blocks[1][2] &&
					world.getBlock(x+3, y-2, z+4) == blocks[1][1] &&
					world.getBlock(x-4, y-2, z+4) == blocks[1][0]) {
				
				//Third Layer
				if(world.getBlock(x-4, y-2, z-4) == blocks[2][0] &&
						world.getBlock(x-3, y-2, z-4) == blocks[2][1] &&
						world.getBlock(x-2, y-2, z-4) == blocks[2][2] &&
						world.getBlock(x-1, y-2, z-4) == blocks[2][3] &&
						world.getBlock(x+0, y-2, z-4) == blocks[2][9] &&
						world.getBlock(x+1, y-2, z-4) == blocks[2][3] &&
						world.getBlock(x+2, y-2, z-4) == blocks[2][2] &&
						world.getBlock(x+3, y-2, z-4) == blocks[2][1] &&
						world.getBlock(x-4, y-2, z-4) == blocks[2][0] &&
						
						world.getBlock(x-4, y-2, z-3) == blocks[2][1] &&
						world.getBlock(x-3, y-2, z-3) == blocks[2][10] &&
						world.getBlock(x-2, y-2, z-3) == blocks[2][3] &&
						world.getBlock(x-1, y-2, z-3) == blocks[2][4] &&
						world.getBlock(x+0, y-2, z-3) == blocks[2][5] &&
						world.getBlock(x+1, y-2, z-3) == blocks[2][4] &&
						world.getBlock(x+2, y-2, z-3) == blocks[2][3] &&
						world.getBlock(x+3, y-2, z-3) == blocks[2][10] &&
						world.getBlock(x-4, y-2, z-3) == blocks[2][1] &&
						
						world.getBlock(x-4, y-2, z-2) == blocks[2][2] &&
						world.getBlock(x-3, y-2, z-2) == blocks[2][3] &&
						world.getBlock(x-2, y-2, z-2) == blocks[2][11] &&
						world.getBlock(x-1, y-2, z-2) == blocks[2][5] &&
						world.getBlock(x+0, y-2, z-2) == blocks[2][6] &&
						world.getBlock(x+1, y-2, z-2) == blocks[2][5] &&
						world.getBlock(x+2, y-2, z-2) == blocks[2][11] &&
						world.getBlock(x+3, y-2, z-2) == blocks[2][3] &&
						world.getBlock(x-4, y-2, z-2) == blocks[2][2] &&
						
						world.getBlock(x-4, y-2, z-1) == blocks[2][3] &&
						world.getBlock(x-3, y-2, z-1) == blocks[2][4] &&
						world.getBlock(x-2, y-2, z-1) == blocks[2][5] &&
						world.getBlock(x-1, y-2, z-1) == blocks[2][12] &&
						world.getBlock(x+0, y-2, z-1) == blocks[2][7] &&
						world.getBlock(x+1, y-2, z-1) == blocks[2][12] &&
						world.getBlock(x+2, y-2, z-1) == blocks[2][5] &&
						world.getBlock(x+3, y-2, z-1) == blocks[2][4] &&
						world.getBlock(x-4, y-2, z-1) == blocks[2][3] &&
						
						world.getBlock(x-4, y-2, z+0) == blocks[2][9] &&
						world.getBlock(x-3, y-2, z+0) == blocks[2][5] &&
						world.getBlock(x-2, y-2, z+0) == blocks[2][6] &&
						world.getBlock(x-1, y-2, z+0) == blocks[2][7] &&
						world.getBlock(x+0, y-2, z+0) == blocks[2][8] &&
						world.getBlock(x+1, y-2, z+0) == blocks[2][7] &&
						world.getBlock(x+2, y-2, z+0) == blocks[2][6] &&
						world.getBlock(x+3, y-2, z+0) == blocks[2][5] &&
						world.getBlock(x-4, y-2, z+0) == blocks[2][9] &&
						
						world.getBlock(x-4, y-2, z+1) == blocks[2][3] &&
						world.getBlock(x-3, y-2, z+1) == blocks[2][4] &&
						world.getBlock(x-2, y-2, z+1) == blocks[2][5] &&
						world.getBlock(x-1, y-2, z+1) == blocks[2][12] &&
						world.getBlock(x+0, y-2, z+1) == blocks[2][7] &&
						world.getBlock(x+1, y-2, z+1) == blocks[2][12] &&
						world.getBlock(x+2, y-2, z+1) == blocks[2][5] &&
						world.getBlock(x+3, y-2, z+1) == blocks[2][4] &&
						world.getBlock(x-4, y-2, z+1) == blocks[2][3] &&
						
						world.getBlock(x-4, y-2, z+2) == blocks[2][2] &&
						world.getBlock(x-3, y-2, z+2) == blocks[2][3] &&
						world.getBlock(x-2, y-2, z+2) == blocks[2][11] &&
						world.getBlock(x-1, y-2, z+2) == blocks[2][5] &&
						world.getBlock(x+0, y-2, z+2) == blocks[2][6] &&
						world.getBlock(x+1, y-2, z+2) == blocks[2][5] &&
						world.getBlock(x+2, y-2, z+2) == blocks[2][11] &&
						world.getBlock(x+3, y-2, z+2) == blocks[2][3] &&
						world.getBlock(x-4, y-2, z+2) == blocks[2][2] &&
						
						world.getBlock(x-4, y-2, z+3) == blocks[2][1] &&
						world.getBlock(x-3, y-2, z+3) == blocks[2][10] &&
						world.getBlock(x-2, y-2, z+3) == blocks[2][3] &&
						world.getBlock(x-1, y-2, z+3) == blocks[2][4] &&
						world.getBlock(x+0, y-2, z+3) == blocks[2][5] &&
						world.getBlock(x+1, y-2, z+3) == blocks[2][4] &&
						world.getBlock(x+2, y-2, z+3) == blocks[2][3] &&
						world.getBlock(x+3, y-2, z+3) == blocks[2][10] &&
						world.getBlock(x-4, y-2, z+3) == blocks[2][1] &&
						
						world.getBlock(x-4, y-2, z+4) == blocks[2][0] &&
						world.getBlock(x-3, y-2, z+4) == blocks[2][1] &&
						world.getBlock(x-2, y-2, z+4) == blocks[2][2] &&
						world.getBlock(x-1, y-2, z+4) == blocks[2][3] &&
						world.getBlock(x+0, y-2, z+4) == blocks[2][9] &&
						world.getBlock(x+1, y-2, z+4) == blocks[2][3] &&
						world.getBlock(x+2, y-2, z+4) == blocks[2][2] &&
						world.getBlock(x+3, y-2, z+4) == blocks[2][1] &&
						world.getBlock(x-4, y-2, z+4) == blocks[2][0]) {
					
					//Fourth Layer
					if(world.getBlock(x-4, y-2, z-4) == blocks[3][0] &&
							world.getBlock(x-3, y-2, z-4) == blocks[3][1] &&
							world.getBlock(x-2, y-2, z-4) == blocks[3][2] &&
							world.getBlock(x-1, y-2, z-4) == blocks[3][3] &&
							world.getBlock(x+0, y-2, z-4) == blocks[3][9] &&
							world.getBlock(x+1, y-2, z-4) == blocks[3][3] &&
							world.getBlock(x+2, y-2, z-4) == blocks[3][2] &&
							world.getBlock(x+3, y-2, z-4) == blocks[3][1] &&
							world.getBlock(x-4, y-2, z-4) == blocks[3][0] &&
							
							world.getBlock(x-4, y-2, z-3) == blocks[3][1] &&
							world.getBlock(x-3, y-2, z-3) == blocks[3][10] &&
							world.getBlock(x-2, y-2, z-3) == blocks[3][3] &&
							world.getBlock(x-1, y-2, z-3) == blocks[3][4] &&
							world.getBlock(x+0, y-2, z-3) == blocks[3][5] &&
							world.getBlock(x+1, y-2, z-3) == blocks[3][4] &&
							world.getBlock(x+2, y-2, z-3) == blocks[3][3] &&
							world.getBlock(x+3, y-2, z-3) == blocks[3][10] &&
							world.getBlock(x-4, y-2, z-3) == blocks[3][1] &&
							
							world.getBlock(x-4, y-2, z-2) == blocks[3][2] &&
							world.getBlock(x-3, y-2, z-2) == blocks[3][3] &&
							world.getBlock(x-2, y-2, z-2) == blocks[3][11] &&
							world.getBlock(x-1, y-2, z-2) == blocks[3][5] &&
							world.getBlock(x+0, y-2, z-2) == blocks[3][6] &&
							world.getBlock(x+1, y-2, z-2) == blocks[3][5] &&
							world.getBlock(x+2, y-2, z-2) == blocks[3][11] &&
							world.getBlock(x+3, y-2, z-2) == blocks[3][3] &&
							world.getBlock(x-4, y-2, z-2) == blocks[3][2] &&
							
							world.getBlock(x-4, y-2, z-1) == blocks[3][3] &&
							world.getBlock(x-3, y-2, z-1) == blocks[3][4] &&
							world.getBlock(x-2, y-2, z-1) == blocks[3][5] &&
							world.getBlock(x-1, y-2, z-1) == blocks[3][12] &&
							world.getBlock(x+0, y-2, z-1) == blocks[3][7] &&
							world.getBlock(x+1, y-2, z-1) == blocks[3][12] &&
							world.getBlock(x+2, y-2, z-1) == blocks[3][5] &&
							world.getBlock(x+3, y-2, z-1) == blocks[3][4] &&
							world.getBlock(x-4, y-2, z-1) == blocks[3][3] &&
							
							world.getBlock(x-4, y-2, z+0) == blocks[3][9] &&
							world.getBlock(x-3, y-2, z+0) == blocks[3][5] &&
							world.getBlock(x-2, y-2, z+0) == blocks[3][6] &&
							world.getBlock(x-1, y-2, z+0) == blocks[3][7] &&
							world.getBlock(x+0, y-2, z+0) == blocks[3][8] &&
							world.getBlock(x+1, y-2, z+0) == blocks[3][7] &&
							world.getBlock(x+2, y-2, z+0) == blocks[3][6] &&
							world.getBlock(x+3, y-2, z+0) == blocks[3][5] &&
							world.getBlock(x-4, y-2, z+0) == blocks[3][9] &&
							
							world.getBlock(x-4, y-2, z+1) == blocks[3][3] &&
							world.getBlock(x-3, y-2, z+1) == blocks[3][4] &&
							world.getBlock(x-2, y-2, z+1) == blocks[3][5] &&
							world.getBlock(x-1, y-2, z+1) == blocks[3][12] &&
							world.getBlock(x+0, y-2, z+1) == blocks[3][7] &&
							world.getBlock(x+1, y-2, z+1) == blocks[3][12] &&
							world.getBlock(x+2, y-2, z+1) == blocks[3][5] &&
							world.getBlock(x+3, y-2, z+1) == blocks[3][4] &&
							world.getBlock(x-4, y-2, z+1) == blocks[3][3] &&
							
							world.getBlock(x-4, y-2, z+2) == blocks[3][2] &&
							world.getBlock(x-3, y-2, z+2) == blocks[3][3] &&
							world.getBlock(x-2, y-2, z+2) == blocks[3][11] &&
							world.getBlock(x-1, y-2, z+2) == blocks[3][5] &&
							world.getBlock(x+0, y-2, z+2) == blocks[3][6] &&
							world.getBlock(x+1, y-2, z+2) == blocks[3][5] &&
							world.getBlock(x+2, y-2, z+2) == blocks[3][11] &&
							world.getBlock(x+3, y-2, z+2) == blocks[3][3] &&
							world.getBlock(x-4, y-2, z+2) == blocks[3][2] &&
							
							world.getBlock(x-4, y-2, z+3) == blocks[3][1] &&
							world.getBlock(x-3, y-2, z+3) == blocks[3][10] &&
							world.getBlock(x-2, y-2, z+3) == blocks[3][3] &&
							world.getBlock(x-1, y-2, z+3) == blocks[3][4] &&
							world.getBlock(x+0, y-2, z+3) == blocks[3][5] &&
							world.getBlock(x+1, y-2, z+3) == blocks[3][4] &&
							world.getBlock(x+2, y-2, z+3) == blocks[3][3] &&
							world.getBlock(x+3, y-2, z+3) == blocks[3][10] &&
							world.getBlock(x-4, y-2, z+3) == blocks[3][1] &&
							
							world.getBlock(x-4, y-2, z+4) == blocks[3][0] &&
							world.getBlock(x-3, y-2, z+4) == blocks[3][1] &&
							world.getBlock(x-2, y-2, z+4) == blocks[3][2] &&
							world.getBlock(x-1, y-2, z+4) == blocks[3][3] &&
							world.getBlock(x+0, y-2, z+4) == blocks[3][9] &&
							world.getBlock(x+1, y-2, z+4) == blocks[3][3] &&
							world.getBlock(x+2, y-2, z+4) == blocks[3][2] &&
							world.getBlock(x+3, y-2, z+4) == blocks[3][1] &&
							world.getBlock(x-4, y-2, z+4) == blocks[3][0]) {
						
						//Fifth Layer
						if(world.getBlock(x-4, y-2, z-4) == blocks[4][0] &&
								world.getBlock(x-3, y-2, z-4) == blocks[4][1] &&
								world.getBlock(x-2, y-2, z-4) == blocks[4][2] &&
								world.getBlock(x-1, y-2, z-4) == blocks[4][3] &&
								world.getBlock(x+0, y-2, z-4) == blocks[4][9] &&
								world.getBlock(x+1, y-2, z-4) == blocks[4][3] &&
								world.getBlock(x+2, y-2, z-4) == blocks[4][2] &&
								world.getBlock(x+3, y-2, z-4) == blocks[4][1] &&
								world.getBlock(x-4, y-2, z-4) == blocks[4][0] &&
								
								world.getBlock(x-4, y-2, z-3) == blocks[4][1] &&
								world.getBlock(x-3, y-2, z-3) == blocks[4][10] &&
								world.getBlock(x-2, y-2, z-3) == blocks[4][3] &&
								world.getBlock(x-1, y-2, z-3) == blocks[4][4] &&
								world.getBlock(x+0, y-2, z-3) == blocks[4][5] &&
								world.getBlock(x+1, y-2, z-3) == blocks[4][4] &&
								world.getBlock(x+2, y-2, z-3) == blocks[4][3] &&
								world.getBlock(x+3, y-2, z-3) == blocks[4][10] &&
								world.getBlock(x-4, y-2, z-3) == blocks[4][1] &&
								
								world.getBlock(x-4, y-2, z-2) == blocks[4][2] &&
								world.getBlock(x-3, y-2, z-2) == blocks[4][3] &&
								world.getBlock(x-2, y-2, z-2) == blocks[4][11] &&
								world.getBlock(x-1, y-2, z-2) == blocks[4][5] &&
								world.getBlock(x+0, y-2, z-2) == blocks[4][6] &&
								world.getBlock(x+1, y-2, z-2) == blocks[4][5] &&
								world.getBlock(x+2, y-2, z-2) == blocks[4][11] &&
								world.getBlock(x+3, y-2, z-2) == blocks[4][3] &&
								world.getBlock(x-4, y-2, z-2) == blocks[4][2] &&
								
								world.getBlock(x-4, y-2, z-1) == blocks[4][3] &&
								world.getBlock(x-3, y-2, z-1) == blocks[4][4] &&
								world.getBlock(x-2, y-2, z-1) == blocks[4][5] &&
								world.getBlock(x-1, y-2, z-1) == blocks[4][12] &&
								world.getBlock(x+0, y-2, z-1) == blocks[4][7] &&
								world.getBlock(x+1, y-2, z-1) == blocks[4][12] &&
								world.getBlock(x+2, y-2, z-1) == blocks[4][5] &&
								world.getBlock(x+3, y-2, z-1) == blocks[4][4] &&
								world.getBlock(x-4, y-2, z-1) == blocks[4][3] &&
								
								world.getBlock(x-4, y-2, z+0) == blocks[4][9] &&
								world.getBlock(x-3, y-2, z+0) == blocks[4][5] &&
								world.getBlock(x-2, y-2, z+0) == blocks[4][6] &&
								world.getBlock(x-1, y-2, z+0) == blocks[4][7] &&
								world.getBlock(x+0, y-2, z+0) == blocks[4][8] &&
								world.getBlock(x+1, y-2, z+0) == blocks[4][7] &&
								world.getBlock(x+2, y-2, z+0) == blocks[4][6] &&
								world.getBlock(x+3, y-2, z+0) == blocks[4][5] &&
								world.getBlock(x-4, y-2, z+0) == blocks[4][9] &&
								
								world.getBlock(x-4, y-2, z+1) == blocks[4][3] &&
								world.getBlock(x-3, y-2, z+1) == blocks[4][4] &&
								world.getBlock(x-2, y-2, z+1) == blocks[4][5] &&
								world.getBlock(x-1, y-2, z+1) == blocks[4][12] &&
								world.getBlock(x+0, y-2, z+1) == blocks[4][7] &&
								world.getBlock(x+1, y-2, z+1) == blocks[4][12] &&
								world.getBlock(x+2, y-2, z+1) == blocks[4][5] &&
								world.getBlock(x+3, y-2, z+1) == blocks[4][4] &&
								world.getBlock(x-4, y-2, z+1) == blocks[4][3] &&
								
								world.getBlock(x-4, y-2, z+2) == blocks[4][2] &&
								world.getBlock(x-3, y-2, z+2) == blocks[4][3] &&
								world.getBlock(x-2, y-2, z+2) == blocks[4][11] &&
								world.getBlock(x-1, y-2, z+2) == blocks[4][5] &&
								world.getBlock(x+0, y-2, z+2) == blocks[4][6] &&
								world.getBlock(x+1, y-2, z+2) == blocks[4][5] &&
								world.getBlock(x+2, y-2, z+2) == blocks[4][11] &&
								world.getBlock(x+3, y-2, z+2) == blocks[4][3] &&
								world.getBlock(x-4, y-2, z+2) == blocks[4][2] &&
								
								world.getBlock(x-4, y-2, z+3) == blocks[4][1] &&
								world.getBlock(x-3, y-2, z+3) == blocks[4][10] &&
								world.getBlock(x-2, y-2, z+3) == blocks[4][3] &&
								world.getBlock(x-1, y-2, z+3) == blocks[4][4] &&
								world.getBlock(x+0, y-2, z+3) == blocks[4][5] &&
								world.getBlock(x+1, y-2, z+3) == blocks[4][4] &&
								world.getBlock(x+2, y-2, z+3) == blocks[4][3] &&
								world.getBlock(x+3, y-2, z+3) == blocks[4][10] &&
								world.getBlock(x-4, y-2, z+3) == blocks[4][1] &&
								
								world.getBlock(x-4, y-2, z+4) == blocks[4][0] &&
								world.getBlock(x-3, y-2, z+4) == blocks[4][1] &&
								world.getBlock(x-2, y-2, z+4) == blocks[4][2] &&
								world.getBlock(x-1, y-2, z+4) == blocks[4][3] &&
								world.getBlock(x+0, y-2, z+4) == blocks[4][9] &&
								world.getBlock(x+1, y-2, z+4) == blocks[4][3] &&
								world.getBlock(x+2, y-2, z+4) == blocks[4][2] &&
								world.getBlock(x+3, y-2, z+4) == blocks[4][1] &&
								world.getBlock(x-4, y-2, z+4) == blocks[4][0]) {
							return true;
						}
					}
				}
			}		
		}
		return false;
	}
}

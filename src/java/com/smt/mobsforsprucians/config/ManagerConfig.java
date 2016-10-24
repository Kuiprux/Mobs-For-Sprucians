package com.smt.mobsforsprucians.config;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import net.minecraftforge.common.config.Configuration;

public class ManagerConfig {
	
	static int[] worldIds;
	static File config;
	
	public static void init(File configFile) {
		
		worldIds = new int[9];
		config = configFile;
		
		Configuration config = new Configuration(configFile);

		config.load();
		worldIds[0] = config.get("World", "Id1", 1).getInt();
		worldIds[1] = config.get("World", "Id2", 1).getInt();
		worldIds[2] = config.get("World", "Id3", 1).getInt();
		worldIds[3] = config.get("World", "Id4", 1).getInt();
		worldIds[4] = config.get("World", "Id5", 1).getInt();
		worldIds[5] = config.get("World", "Id6", 1).getInt();
		worldIds[6] = config.get("World", "Id7", 1).getInt();
		worldIds[7] = config.get("World", "Id8", 1).getInt();
		worldIds[8] = config.get("World", "Id9", 1).getInt();
		config.save();
	}
	
	public static void setId(int worldNum, int worldId) {
		worldIds[worldNum-1] = worldId;
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(config));
			out.write("world {");
			out.newLine();
			for(int x=1; x<=9; x++) {
				out.write("    I:Id" + x + "=" + worldIds[x-1]);
				out.newLine();  
			}
			out.write("}");
			out.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public static int getWorldNum(int id) {
		for(int x=1; x<=9; x++) {
			System.out.println(worldIds[x-1]);
			if(worldIds[x-1]==id) {
				return x;
			}
		}
		return 0;
	}
	
	public int getId(int worldNum) {
		switch(worldNum) {
		case 1:
			return worldIds[0];
		case 2:
			return worldIds[1];
		case 3:
			return worldIds[2];
		case 4:
			return worldIds[3];
		case 5:
			return worldIds[4];
		case 6:
			return worldIds[5];
		case 7:
			return worldIds[6];
		case 8:
			return worldIds[7];
		default:
			return worldIds[8];
		}
	}
}

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
				
		readFile(configFile);
	}
	
	public static void readFile(File configFile) {
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
		System.out.println(worldIds[0] + " " + worldIds[1] + " " + worldIds[2] + " " + worldIds[3] + " " + worldIds[4] + " " + worldIds[5] + " " + worldIds[6] + " " + worldIds[7] + " " + worldIds[8]);
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
		} catch (IOException e) {}
	}
	
	public static int getWorldNum(int id) {
		System.out.println(id);
		for(int x=0; x<=8; x++) {
			System.out.print(x + " " + worldIds[x]);
			if(worldIds[x]==id) {
				return x;
			}
		}
		return 0;
	}
	
	public static int getId(int num) {
		return worldIds[num];
	}
}

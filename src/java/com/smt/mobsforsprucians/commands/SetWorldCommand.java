package com.smt.mobsforsprucians.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import com.smt.mobsforsprucians.config.ManagerConfig;

public class SetWorldCommand extends CommandBase{

	@Override
	public String getCommandName() {
		return "SetWorld";
	}

	@Override
	public String getCommandUsage(ICommandSender iCommandSender) {
		// TODO Auto-generated method stub
		return "Sets World";
	}

	@Override
	public void processCommand(ICommandSender iCommandSender, String[] arg) {
		if(iCommandSender instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) iCommandSender;
			if(arg.length != 1) {
				player.addChatMessage(new ChatComponentText("Usage: '/setworld <worldnumber>'m"));
			} else {
				int worldNum = 0;
				try {
					worldNum = Integer.parseInt(arg[0]);
				} catch(NumberFormatException e) {
					player.addChatMessage(new ChatComponentText("Usage: '/setworld <worldnumber>'"));
				}
				ManagerConfig.setId(worldNum, player.dimension);
				player.addChatMessage(new ChatComponentText("[MFS] Successfully Saved."));
			}
		}	
	}
}
//[MFS] You can't use this command on server side.
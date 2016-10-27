package com.smt.mobsforsprucians.tabs;

import com.smt.mobsforsprucians.items.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabMFS extends CreativeTabs{
	
	public TabMFS(int id, String name) {
		super(id, name);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return Items.worldItem1;
	}
}

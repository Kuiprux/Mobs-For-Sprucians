package com.smt.mobsforsprucians.tabs;

import com.smt.mobsforsprucians.items.WorldItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabMFS extends CreativeTabs{

	public TabMFS(int p_i1853_1_, String p_i1853_2_) {
		super(p_i1853_1_, p_i1853_2_);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return WorldItems.WorldItem1;
	}
}

package com.ewenokx;

import com.ewenokx.Init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EwenokxTap extends CreativeTabs{

	public EwenokxTap(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {

		return items.orichalque_ingot;
	}

}

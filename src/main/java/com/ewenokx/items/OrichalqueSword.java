package com.ewenokx.items;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class OrichalqueSword extends ItemSword {

	public OrichalqueSword(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
	}

}
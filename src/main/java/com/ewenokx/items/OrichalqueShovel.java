package com.ewenokx.items;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class OrichalqueShovel extends ItemSpade {

	public OrichalqueShovel(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
	}

}
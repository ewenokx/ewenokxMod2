package com.ewenokx.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OrichalqueOre extends Block {

	public OrichalqueOre(Material material) {
		super(material);

		this.setHarvestLevel("pickaxe", 3);

	}

}

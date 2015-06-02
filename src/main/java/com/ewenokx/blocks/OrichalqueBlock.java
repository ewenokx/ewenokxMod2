package com.ewenokx.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;



public class OrichalqueBlock extends Block{

	public OrichalqueBlock(Material material) {
		super(material);
		
		this .setHarvestLevel("pickaxe", 1);

	}

}
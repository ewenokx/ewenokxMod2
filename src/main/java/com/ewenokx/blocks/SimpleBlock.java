package com.ewenokx.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;



public class SimpleBlock extends Block{

	public SimpleBlock(Material material) {
		super(material);
		
		this .setHarvestLevel("pickaxe", 1);

	}

}
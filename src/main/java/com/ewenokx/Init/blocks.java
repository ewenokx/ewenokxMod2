package com.ewenokx.Init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ewenokx.Reference;
import com.ewenokx.ewenokx;
import com.ewenokx.blocks.OrichalqueBlock;
import com.ewenokx.blocks.OrichalqueOre;
import com.ewenokx.blocks.RedDiamondOre;

public class blocks {

	public static Block orichalque_block;
	public static Block orichalque_ore;
	public static Block reddiamond_ore;

	public static void init() {
		orichalque_block = new OrichalqueBlock(Material.rock)
				.setUnlocalizedName("orichalque_block").setHardness(1.5f)
				.setResistance(1.0F).setStepSound(Block.soundTypeMetal)
				.setCreativeTab(ewenokx.EwenokxTap);
		orichalque_ore = new OrichalqueOre(Material.rock)
				.setUnlocalizedName("orichalque_ore").setHardness(1.5f)
				.setResistance(1.0F).setStepSound(Block.soundTypePiston)
				.setCreativeTab(ewenokx.EwenokxTap);
		reddiamond_ore = new RedDiamondOre(Material.rock).setUnlocalizedName(
				"reddiamond_ore").setCreativeTab(ewenokx.EwenokxTap);
	}

	public static void register() {
		GameRegistry.registerBlock(orichalque_block, orichalque_block
				.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(orichalque_ore, orichalque_ore
				.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(reddiamond_ore, reddiamond_ore
				.getUnlocalizedName().substring(5));

	}

	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						item,
						0,
						new ModelResourceLocation(Reference.MODID + ":"
								+ item.getUnlocalizedName().substring(5),
								"inventory"));
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						item,
						0,
						new ModelResourceLocation(Reference.MODID + ":"
								+ item.getUnlocalizedName().substring(5),
								"inventory"));
	}

	public static void registerRenders() {
		registerRender(orichalque_block);
		registerRender(orichalque_ore);
		registerRender(reddiamond_ore);

	}
}

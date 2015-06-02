package com.ewenokx;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ewenokx.Init.blocks;
import com.ewenokx.Init.items;
import com.ewenokx.proxy.CommonProxy;
import com.ewenokx.world.TutorialWorldGenerator;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.MODVERSION)
public class ewenokx {

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVEUR_PROXY_CLASS)
	public static CommonProxy proxy;

	public static final EwenokxTap EwenokxTap = new EwenokxTap("EwenokxTap");

	public static void main(String[] args) {
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		GameRegistry.addRecipe(new ItemStack(items.iron_stick), "#", "#", '#',
				Items.iron_ingot);
		GameRegistry.addRecipe(new ItemStack(items.orichalque_ingot, 9), "#",
				'#', blocks.orichalque_block);
		GameRegistry
				.addRecipe(new ItemStack(blocks.orichalque_block),
						new Object[] { "###", "###", "###", '#',
								items.orichalque_ingot });
		GameRegistry.addSmelting(blocks.orichalque_ore, new ItemStack(
				items.orichalque_ingot), 1.0F);
		GameRegistry.registerWorldGenerator(new TutorialWorldGenerator(), 0);
		proxy.registerRenders();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		blocks.init();
		blocks.register();
		items.init();
		items.register();
	}
}

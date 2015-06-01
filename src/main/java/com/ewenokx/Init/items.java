package com.ewenokx.Init;

import com.ewenokx.Reference;
import com.ewenokx.ewenokx;
import com.ewenokx.items.OrichalqueArmor;
import com.ewenokx.items.OrichalqueAxe;
import com.ewenokx.items.OrichalqueHoe;
import com.ewenokx.items.OrichalquePickaxe;
import com.ewenokx.items.OrichalqueShovel;
import com.ewenokx.items.OrichalqueSword;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class items {
	
	public static ToolMaterial orichalquee = EnumHelper.addToolMaterial("orichalquee", 3, 2500, 16.0F, 4.0F, 10);
	public static ArmorMaterial orichalque = EnumHelper.addArmorMaterial("orichalque", "ewenokx:orichalque", 16, new int[]{3, 8, 6, 3}, 10);
	
	
	public static Item orichalque_ingot;
	public static Item iron_stick;
	public static Item red_diamond;
	
	public static Item orichalque_sword;
	public static Item orichalque_hoe;
	public static Item orichalque_pickaxe;
	public static Item orichalque_shovel;
	public static Item orichalque_axe;
	
	public static Item orichalque_helmet;
	public static Item orichalque_chestplate;
	public static Item orichalque_leggings;
	public static Item orichalque_boots;
	
	
	public static void init(){
		orichalque_helmet = new OrichalqueArmor(orichalque, 1, 0).setUnlocalizedName("orichalque_helmet").setCreativeTab(ewenokx.EwenokxTap);
		orichalque_chestplate = new OrichalqueArmor(orichalque, 1, 1).setUnlocalizedName("orichalque_chestplate").setCreativeTab(ewenokx.EwenokxTap);
		orichalque_leggings = new OrichalqueArmor(orichalque, 2, 2).setUnlocalizedName("orichalque_leggings").setCreativeTab(ewenokx.EwenokxTap);
		orichalque_boots = new OrichalqueArmor(orichalque, 1, 3).setUnlocalizedName("orichalque_boots").setCreativeTab(ewenokx.EwenokxTap);

		
		orichalque_ingot = new Item().setUnlocalizedName("orichalque_ingot").setCreativeTab(ewenokx.EwenokxTap);
		iron_stick = new Item().setUnlocalizedName("iron_stick").setCreativeTab(ewenokx.EwenokxTap);
		red_diamond = new Item().setUnlocalizedName("red_diamond").setCreativeTab(ewenokx.EwenokxTap); 
		
		orichalque_sword = new OrichalqueSword("orichalque_sword", orichalquee).setUnlocalizedName("orichalque_sword").setCreativeTab(ewenokx.EwenokxTap); 
		orichalque_hoe = new OrichalqueHoe("orichalque_hoe", orichalquee).setUnlocalizedName("orichalque_hoe").setCreativeTab(ewenokx.EwenokxTap);
		orichalque_pickaxe = new OrichalquePickaxe("orichalque_pickaxe", orichalquee).setUnlocalizedName("orichalque_pickaxe").setCreativeTab(ewenokx.EwenokxTap);
		orichalque_shovel = new OrichalqueShovel("orichalque_shovel", orichalquee).setUnlocalizedName("orichalque_shovel").setCreativeTab(ewenokx.EwenokxTap);
		orichalque_axe = new OrichalqueAxe("orichalque_axe", orichalquee).setUnlocalizedName("orichalque_axe").setCreativeTab(ewenokx.EwenokxTap);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(orichalque_boots, orichalque_boots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(orichalque_leggings, orichalque_leggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(orichalque_chestplate, orichalque_chestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(orichalque_helmet, orichalque_helmet.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(orichalque_ingot, orichalque_ingot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(iron_stick, iron_stick.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(red_diamond, red_diamond.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(orichalque_sword, orichalque_sword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(orichalque_hoe, orichalque_hoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(orichalque_pickaxe, orichalque_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(orichalque_shovel, orichalque_shovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(orichalque_axe, orichalque_axe.getUnlocalizedName().substring(5));
	}
	public static void registerRenders()
	{
		registerRender(orichalque_boots);
		registerRender(orichalque_leggings);
		registerRender(orichalque_chestplate);
		registerRender(orichalque_helmet);
		
		registerRender(orichalque_ingot);
		registerRender(iron_stick);
		registerRender(red_diamond);
		
		registerRender(orichalque_sword);
		registerRender(orichalque_hoe);
		registerRender(orichalque_pickaxe);
		registerRender(orichalque_shovel);
		registerRender(orichalque_axe);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
	}
}


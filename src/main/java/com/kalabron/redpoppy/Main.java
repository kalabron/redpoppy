package com.kalabron.redpoppy;

import com.kalabron.redpoppy.blocks.ModBlocks;
import com.kalabron.redpoppy.handlers.RecipeHandler;
import com.kalabron.redpoppy.items.BloodStoneIngot;
import com.kalabron.redpoppy.items.ModItems;
import com.kalabron.redpoppy.proxies.CommonProxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION, dependencies = "required-after:FML")
public class Main 
{
	@Instance(value = Reference.MODID)
	public static Main instance;
	
	@SidedProxy(modId=Reference.MODID, clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);		
		
		//Load Custom Blocks and Items
		ModBlocks.loadBlocks();
		ModItems.loadItems();
	}	
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{

		proxy.init(event);
				
		//Register Custom Textures
		ModItems.registerItems();
		
		
		//TODO:  Move custom item textures from main to moditem in new method
		//ModBlocks.registerBlocks();
		//TODO:  Move custom block textures from main to modblocks in new method
		//ModItems.registerItems();
		
		Item bloodStoneOreItem = GameRegistry.findItem("redpoppy",  "bloodStoneOre");
		ModelResourceLocation bloodStoneOreModel = 
				new ModelResourceLocation("redpoppy:bloodStoneOre", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(bloodStoneOreItem,  0, bloodStoneOreModel);
		
		Item bloodStoneIngotItem = GameRegistry.findItem("redpoppy",  "bloodStoneIngot");
		ModelResourceLocation bloodStoneIngotModel = 
				new ModelResourceLocation("redpoppy:bloodStoneIngot", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(bloodStoneIngotItem,  0, bloodStoneIngotModel);
		
		Item bloodStoneDustItem = GameRegistry.findItem("redpoppy",  "bloodStoneDust");
		ModelResourceLocation bloodStoneDustModel = 
				new ModelResourceLocation("redpoppy:bloodStoneDust", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(bloodStoneDustItem,  0, bloodStoneDustModel);
		
		Item redPoppyBookItem = GameRegistry.findItem("redpoppy",  "redPoppyBook");
		ModelResourceLocation redPoppyBookModel = 
				new ModelResourceLocation("redpoppy:redPoppyBook", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(redPoppyBookItem,  0, redPoppyBookModel);
		
		Item blackBloodKeyItem = GameRegistry.findItem("redpoppy",  "blackBloodKey");
		ModelResourceLocation blackBloodKeyModel = 
				new ModelResourceLocation("redpoppy:blackBloodKey", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(blackBloodKeyItem,  0, blackBloodKeyModel);
		
		Item greenBloodKeyItem = GameRegistry.findItem("redpoppy",  "greenBloodKey");
		ModelResourceLocation greenBloodKeyModel = 
				new ModelResourceLocation("redpoppy:greenBloodKey", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(greenBloodKeyItem,  0, greenBloodKeyModel);		
		
		Item bloodyScrapItem = GameRegistry.findItem("redpoppy",  "bloodyScrap");
		ModelResourceLocation bloodyScrapModel = 
				new ModelResourceLocation("redpoppy:bloodyScrap", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(bloodyScrapItem,  0, bloodyScrapModel);
		
		Item leatherScrapItem = GameRegistry.findItem("redpoppy",  "leatherScrap");
		ModelResourceLocation leatherScrapModel = 
				new ModelResourceLocation("redpoppy:leatherScrap", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(leatherScrapItem,  0, leatherScrapModel);		
		
		Item bloodBerryItem = GameRegistry.findItem("redPoppy",  "bloodBerry");
		ModelResourceLocation bloodBerryModel = 
				new ModelResourceLocation("redpoppy:bloodBerry", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(bloodBerryItem,  0, bloodBerryModel);
		
		Item bloodStonePickAxeItem = GameRegistry.findItem("redPoppy",  "bloodStonePickAxe");
		ModelResourceLocation bloodStonePickAxeModel = 
				new ModelResourceLocation("redpoppy:bloodStonePickAxe", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(bloodStonePickAxeItem,  0, bloodStonePickAxeModel);
		
		Item bloodStoneAxeItem = GameRegistry.findItem("redPoppy",  "bloodStoneAxe");
		ModelResourceLocation bloodStoneAxeModel = 
				new ModelResourceLocation("redpoppy:bloodStoneAxe", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(bloodStoneAxeItem,  0, bloodStoneAxeModel);		
		
		Item bloodStoneShovelItem = GameRegistry.findItem("redPoppy",  "bloodStoneShovel");
		ModelResourceLocation bloodStoneShovelModel = 
				new ModelResourceLocation("redpoppy:bloodStoneShovel", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(bloodStoneShovelItem,  0, bloodStoneShovelModel);
		
		Item bloodStoneShearItem = GameRegistry.findItem("redPoppy",  "bloodStoneShear");
		ModelResourceLocation bloodStoneShearModel = 
				new ModelResourceLocation("redpoppy:bloodStoneShear", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(bloodStoneShearItem,  0, bloodStoneShearModel);
		
		Item bloodStoneSwordItem = GameRegistry.findItem("redPoppy",  "bloodStoneSword");
		ModelResourceLocation bloodStoneSwordModel = 
				new ModelResourceLocation("redpoppy:bloodStoneSword", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(bloodStoneSwordItem,  0, bloodStoneSwordModel);
		
		
		// NEED TO ADD TEXTURE INSTRUCTIONS FOR Blood Berry Bush & Blood Berry!!!
		
		
		//Dungeon changes - adds Bloodstone Ingots, Green Bloodkey & Black Bloodkey to chests
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new
				WeightedRandomChestContent(new ItemStack(bloodStoneIngotItem), 1,5,7));
		
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new
				WeightedRandomChestContent(new ItemStack(blackBloodKeyItem), 1,5,7));
		
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new
				WeightedRandomChestContent(new ItemStack(greenBloodKeyItem), 1,5,7));
		
		
		//Recipes
		RecipeHandler.registerRecipes();
		
		//  Shapeless Crafting Recipes
		//  coal = unbreaking
		//  gunpowder = knockback
		
		ItemStack knockbackStoneSwordItemStack = new ItemStack(Items.stone_sword);
		knockbackStoneSwordItemStack.addEnchantment(Enchantment.knockback, 1);
		
		GameRegistry.addShapelessRecipe(knockbackStoneSwordItemStack,
				Items.gunpowder, Items.stone_sword, Blocks.red_flower );			
		
		ItemStack knockbackBloodStoneSwordItemStack = new ItemStack(bloodStoneSwordItem);
		knockbackBloodStoneSwordItemStack.addEnchantment(Enchantment.knockback, 1);
		
		GameRegistry.addShapelessRecipe(knockbackBloodStoneSwordItemStack,
				Items.gunpowder, bloodStoneSwordItem, Blocks.red_flower );				
		
		ItemStack unbreakingStoneSwordItemStack = new ItemStack(Items.stone_sword);
		unbreakingStoneSwordItemStack.addEnchantment(Enchantment.unbreaking, 1);
		
		GameRegistry.addShapelessRecipe(unbreakingStoneSwordItemStack,
				Items.coal, Items.stone_sword, Blocks.red_flower);			
		
		ItemStack unbreakingBloodStoneSwordItemStack = new ItemStack(bloodStoneSwordItem);
		unbreakingBloodStoneSwordItemStack.addEnchantment(Enchantment.unbreaking, 1);
		
		GameRegistry.addShapelessRecipe(unbreakingBloodStoneSwordItemStack,
				Items.coal, bloodStoneSwordItem, Blocks.red_flower);		
		
		ItemStack unbreakingStonePickAxeItemStack = new ItemStack(Items.stone_pickaxe);
		unbreakingStonePickAxeItemStack.addEnchantment(Enchantment.unbreaking, 1);
		
		GameRegistry.addShapelessRecipe(unbreakingStonePickAxeItemStack,
				Items.coal, Items.stone_pickaxe, Blocks.red_flower);		
		
		ItemStack unbreakingBloodStonePickAxeItemStack = new ItemStack(bloodStonePickAxeItem);
		unbreakingBloodStonePickAxeItemStack.addEnchantment(Enchantment.unbreaking, 1);
		
		GameRegistry.addShapelessRecipe(unbreakingBloodStonePickAxeItemStack,
				Items.coal, bloodStonePickAxeItem, Blocks.red_flower);		
		
		ItemStack unbreakingStoneShovelItemStack = new ItemStack(Items.stone_shovel);
		unbreakingStoneShovelItemStack.addEnchantment(Enchantment.unbreaking, 1);
				
		GameRegistry.addShapelessRecipe(unbreakingStoneShovelItemStack,
				Items.coal, Items.stone_shovel, Blocks.red_flower);		
		
		ItemStack unbreakingBloodStoneShovelItemStack = new ItemStack(bloodStoneShovelItem);
		unbreakingBloodStoneShovelItemStack.addEnchantment(Enchantment.unbreaking, 1);
				
		GameRegistry.addShapelessRecipe(unbreakingBloodStoneShovelItemStack,
				Items.coal, bloodStoneShovelItem, Blocks.red_flower);
		
		ItemStack unbreakingStoneAxeItemStack = new ItemStack(Items.stone_axe);
		unbreakingStoneAxeItemStack.addEnchantment(Enchantment.unbreaking, 1);
		
		GameRegistry.addShapelessRecipe(unbreakingStoneAxeItemStack,
				Items.coal, Items.stone_axe, Blocks.red_flower);
		
		ItemStack unbreakingBloodStoneAxeItemStack = new ItemStack(bloodStoneAxeItem);
		unbreakingBloodStoneAxeItemStack.addEnchantment(Enchantment.unbreaking, 1);
		
		GameRegistry.addShapelessRecipe(unbreakingBloodStoneAxeItemStack,
				Items.coal, bloodStoneAxeItem, Blocks.red_flower);	
		
		
		
		
		
		
		
		// Shaped Crafting Recipes
		
		GameRegistry.addRecipe(
				new ItemStack(redPoppyBookItem),
				"e  ",
				" e ",
				"   ",
				'd', Items.book,
				'e', Blocks.red_flower);
		
		
		GameRegistry.addRecipe(
				new ItemStack(bloodStonePickAxeItem),
				"eee",
				" d ",
				" d ",
				'd', Items.stick,
				'e', bloodStoneIngotItem);
		
		GameRegistry.addRecipe(
				new ItemStack(bloodStoneAxeItem),
				"ee ",
				"ed ",
				" d ",
				'd', Items.stick,
				'e', bloodStoneIngotItem);
		
		
		GameRegistry.addRecipe(
				new ItemStack(bloodStoneSwordItem),
				" e ",
				" e ",
				" d ",
				'd', Items.stick,
				'e', bloodStoneIngotItem);
		
		GameRegistry.addRecipe(
				new ItemStack(bloodStoneShovelItem),
				" e ",
				" d ",
				" d ",
				'd', Items.stick,
				'e', bloodStoneIngotItem);
		
		GameRegistry.addRecipe(
				new ItemStack(Items.leather),
				"dd ",
				"dd ",
				"   ",
				'd', leatherScrapItem);
		
		GameRegistry.addRecipe(
				new ItemStack(bloodStoneShearItem),
				"   ",
				" d ",
				"d  ",
				'd', bloodStoneIngotItem);
		
		
		GameRegistry.addRecipe(
				new ItemStack(bloodStoneOreItem),
				"ddd",
				"ddd",
				"ddd",
				'd', bloodStoneDustItem);
;
		

		
		
		// Smelting Recipes

		GameRegistry.addSmelting(
				bloodStoneDustItem,
				new ItemStack(bloodStoneIngotItem, 1),
				1.0F);
		
		GameRegistry.addSmelting(
				bloodyScrapItem,
				new ItemStack(leatherScrapItem, 1),
				1.0F);
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
		//To Do

	}
	
}
	
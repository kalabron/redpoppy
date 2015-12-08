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
	// public static final String MODID = "redpoppy";  <-- now moved to reference class
	// public static final String MODNAME = "Order of the Red Poppy";
	// public static final String VERSION = "1.8-0.0.1.0";
	
	@Instance(value = Reference.MODID)
	public static Main instance;
	
	@SidedProxy(modId=Reference.MODID, clientSide="com.kalabron.redpoppy.proxies.ClientProxy", serverSide="com.kalabron.redpoppy.proxies.ServerProxy")
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
		
		
		//Dungeon changes - add Bloodstone Ingots, Green Bloodkey & Black Bloodkey to chests
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new
				WeightedRandomChestContent(new ItemStack(bloodStoneIngotItem), 1,5,7));
		
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new
				WeightedRandomChestContent(new ItemStack(blackBloodKeyItem), 1,5,7));
		
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new
				WeightedRandomChestContent(new ItemStack(greenBloodKeyItem), 1,5,7));
		
		
		//Recipes
		RecipeHandler.registerRecipes();
		
		ItemStack knockbackItemStack = new ItemStack(Items.stone_sword);
		knockbackItemStack.addEnchantment(Enchantment.knockback, 1);
		
		GameRegistry.addShapelessRecipe(knockbackItemStack,
				Items.gunpowder, Items.stone_sword);
		
		ItemStack unbreakingItemStack = new ItemStack(Items.stone_sword);
		unbreakingItemStack.addEnchantment(Enchantment.unbreaking, 1);
		
		GameRegistry.addShapelessRecipe(unbreakingItemStack,
				Items.coal, Items.stone_sword);
		
		
		
		
		GameRegistry.addRecipe(
				new ItemStack(redPoppyBookItem),
				"d  ",
				"e  ",
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
	
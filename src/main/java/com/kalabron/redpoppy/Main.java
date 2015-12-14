package com.kalabron.redpoppy;

import com.kalabron.redpoppy.handlers.RecipeHandler;
import com.kalabron.redpoppy.handlers.RedpoppyEventHandler;
import com.kalabron.redpoppy.items.BloodStoneIngot;
import com.kalabron.redpoppy.items.ModItems;
import com.kalabron.redpoppy.proxies.CommonProxy;

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
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;



@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION, dependencies = "required-after:FML")


public class Main 
{
	@Instance(value = Reference.MODID)
	public static Main instance;
	
	@SidedProxy(modId=Reference.MODID, clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	RedpoppyEventHandler handler = new RedpoppyEventHandler();
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		this.proxy.preInit(event);		
		
		GameRegistry.registerWorldGenerator(handler,  0);
		//Load Custom Blocks and Items
		// ModBlocks.loadBlocks();   <-- moved to common proxie
		// ModItems.loadItems();    <-- moved to common proxie
	}	
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{

		this.proxy.init(event);
				
		//Register Custom Textures
		ModItems.registerItems();
		
		
		//TODO:  Move custom item textures from main to moditem in new method
		//ModBlocks.registerBlocks();
		//TODO:  Move custom block textures from main to modblocks in new method
		//ModItems.registerItems();
		
		Item bloodStoneOreItem = GameRegistry.findItem("redpoppy",  "bloodStoneOre");

		
		Item bloodStoneIngotItem = GameRegistry.findItem("redpoppy",  "bloodStoneIngot");

		
		Item bloodStoneDustItem = GameRegistry.findItem("redpoppy",  "bloodStoneDust");

		
		Item redPoppyBookItem = GameRegistry.findItem("redpoppy",  "redPoppyBook");

		
		Item blackBloodKeyItem = GameRegistry.findItem("redpoppy",  "blackBloodKey");

		
		Item greenBloodKeyItem = GameRegistry.findItem("redpoppy",  "greenBloodKey");
		
		
		Item bloodyScrapItem = GameRegistry.findItem("redpoppy",  "bloodyScrap");

		
		Item leatherScrapItem = GameRegistry.findItem("redpoppy",  "leatherScrap");
	
		
		Item bloodBerryItem = GameRegistry.findItem("redPoppy",  "bloodBerry");

		
		Item bloodStonePickAxeItem = GameRegistry.findItem("redPoppy",  "bloodStonePickAxe");

		
		Item bloodStoneAxeItem = GameRegistry.findItem("redPoppy",  "bloodStoneAxe");
	
		
		Item bloodStoneShovelItem = GameRegistry.findItem("redPoppy",  "bloodStoneShovel");

		
		Item bloodStoneHoeItem = GameRegistry.findItem("redPoppy",  "bloodStoneHoe");

		
		Item bloodStoneShearItem = GameRegistry.findItem("redPoppy",  "bloodStoneShear");

		
		Item bloodStoneSwordItem = GameRegistry.findItem("redPoppy",  "bloodStoneSword");
		
		
		
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
		
		ItemStack unbreakingStoneHoeItemStack = new ItemStack(Items.stone_hoe);
		unbreakingStoneHoeItemStack.addEnchantment(Enchantment.unbreaking, 1);
				
		GameRegistry.addShapelessRecipe(unbreakingStoneHoeItemStack,
				Items.coal, Items.stone_hoe, Blocks.red_flower);				
		
		ItemStack unbreakingBloodStoneShovelItemStack = new ItemStack(bloodStoneShovelItem);
		unbreakingBloodStoneShovelItemStack.addEnchantment(Enchantment.unbreaking, 1);
				
		GameRegistry.addShapelessRecipe(unbreakingBloodStoneShovelItemStack,
				Items.coal, bloodStoneShovelItem, Blocks.red_flower);		
		
		ItemStack unbreakingBloodStoneHoeItemStack = new ItemStack(bloodStoneHoeItem);
		unbreakingBloodStoneHoeItemStack.addEnchantment(Enchantment.unbreaking, 1);
				
		GameRegistry.addShapelessRecipe(unbreakingBloodStoneHoeItemStack,
				Items.coal, bloodStoneHoeItem, Blocks.red_flower);		
		
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
				" d ",
				"   ",
				'd', Items.book,
				'e', Blocks.red_flower);
		
		
//		GameRegistry.addRecipe(
//				new ItemStack(bloodStonePickAxeItem),
//				"eee",
//				" d ",
//				" d ",
//				'd', Items.stick,
//				'e', bloodStoneIngotItem);
		
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(bloodStonePickAxeItem,
				"eee",
				" d ",
				" d ",
				'd', Items.stick,
				'e', "ingotBloodstone"));

		GameRegistry.addRecipe(
				new ShapedOreRecipe(bloodStoneAxeItem,
				"ee ",
				"ed ",
				" d ",
				'd', Items.stick,
				'e', "ingotBloodstone"));
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(bloodStoneSwordItem,
				" e ",
				" e ",
				" d ",
				'd', Items.stick,
				'e', "ingotBloodstone"));
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(bloodStoneShovelItem,
				" e ",
				" d ",
				" d ",
				'd', Items.stick,
				'e', "ingotBloodstone"));
	
		GameRegistry.addRecipe(
				new ShapedOreRecipe(bloodStoneHoeItem,
				"ee ",
				" d ",
				" d ",
				'd', Items.stick,
				'e', "ingotBloodstone"));

		GameRegistry.addRecipe(
				new ShapedOreRecipe(bloodStoneShearItem,
				"   ",
				" d ",
				"d  ",
				'd', "ingotBloodstone"));
		
		GameRegistry.addRecipe(
				new ItemStack(Items.leather),
				"dd ",
				"dd ",
				"   ",
				'd', leatherScrapItem);
		
		
		GameRegistry.addRecipe(
				new ItemStack(bloodStoneOreItem),
				"ddd",
				"ddd",
				"ddd",
				'd', bloodStoneDustItem);
;
		

		
		
		// Smelting Recipes

//		GameRegistry.addSmelting(
//				bloodStoneDustItem,
//				new ItemStack(bloodStoneIngotItem, 1),
//				1.0F);
		
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
		this.proxy.postInit(event);
		//To Do

	}
	
}
	
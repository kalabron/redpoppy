package com.kalabron.redpoppy.handlers;


import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;


public class RecipeHandler 
{
	
	public static void registerRecipes()
	{
		// declaration of items
		Item bloodStoneSwordItem = GameRegistry.findItem("redPoppy",  "bloodStoneSword");
		Item bloodStonePickAxeItem = GameRegistry.findItem("redPoppy",  "bloodStonePickAxe");
		Item bloodStoneShovelItem = GameRegistry.findItem("redPoppy",  "bloodStoneShovel");
		Item bloodStoneHoeItem = GameRegistry.findItem("redPoppy",  "bloodStoneHoe");
		Item bloodStoneAxeItem = GameRegistry.findItem("redPoppy",  "bloodStoneAxe");
		Item redPoppyBookItem = GameRegistry.findItem("redpoppy",  "redPoppyBook");
		Item bloodStoneShearItem = GameRegistry.findItem("redPoppy",  "bloodStoneShear");
		Item leatherScrapItem = GameRegistry.findItem("redpoppy",  "leatherScrap");
		Item ruggedLeatherItem = GameRegistry.findItem("redpoppy",  "ruggedLeather");
		Item bloodStoneOreItem = GameRegistry.findItem("redpoppy",  "bloodStoneOre");
		Item bloodStoneBlockItem = GameRegistry.findItem("redpoppy",  "bloodStoneBlock");
		Item bloodStoneDustItem = GameRegistry.findItem("redpoppy",  "bloodStoneDust");
		Item bloodyScrapItem = GameRegistry.findItem("redpoppy",  "bloodyScrap");
		Item bloodStoneIngotItem = GameRegistry.findItem("redpoppy",  "bloodStoneIngot");
		Item blackBloodKeyItem = GameRegistry.findItem("redpoppy",  "blackBloodKey");		
		Item greenBloodKeyItem = GameRegistry.findItem("redpoppy",  "greenBloodKey");
		Item bloodStoneHelmetItem = GameRegistry.findItem("redpoppy",  "bloodStoneHelmet");
		Item bloodStoneChestplateItem = GameRegistry.findItem("redpoppy",  "bloodStoneChestplate");
		Item bloodStoneLeggingsItem = GameRegistry.findItem("redpoppy",  "bloodStoneLeggings");
		Item bloodStoneBootsItem = GameRegistry.findItem("redpoppy",  "bloodStoneBoots");
		Item ruggedLeatherHelmetItem = GameRegistry.findItem("redpoppy",  "ruggedLeatherHelmet");
		Item ruggedLeatherChestplateItem = GameRegistry.findItem("redpoppy",  "ruggedLeatherChestplate");
		Item ruggedLeatherLeggingsItem = GameRegistry.findItem("redpoppy",  "ruggedLeatherLeggings");
		Item ruggedLeatherBootsItem = GameRegistry.findItem("redpoppy",  "ruggedLeatherBoots");
		Item ruggedLeatherUpgradeKitItem = GameRegistry.findItem("redpoppy",  "ruggedLeatherUpgradeKit");
		Item ruggedLeatherRepairKitItem = GameRegistry.findItem("redpoppy",  "ruggedLeatherRepairKit");
		Item leatherRepairKitItem = GameRegistry.findItem("redpoppy",  "leatherRepairKit");
		
		// Drops on death - Calls Handlers
		MinecraftForge.EVENT_BUS.register(new PigDropsBloodyScraps());
		MinecraftForge.EVENT_BUS.register(new CowDropsBloodyScraps());
		MinecraftForge.EVENT_BUS.register(new SheepDropsBloodyScraps());
		MinecraftForge.EVENT_BUS.register(new ChickenDropsBloodyScraps());
		MinecraftForge.EVENT_BUS.register(new PigZombieDropsRuggedLeather());
		
		// Enchantment recipes for Tools & Weapons
		// 		coal = unbreaking (all tools and swords)
		// 		gunpowder = knockback (sword only)
		//		feather = respiration (head only), featherFalling (boots only)
		
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
		
		
		
		
		// Armor Enchanting Recipes -- Used in Bloodstone, Leather, and Rugged Leather Armor 
		// use red poppy in each recipe
		// feather - Respiration for helmet
		// feather - feather falling for books
		
		// Bloodstone Enchanting Recipes
		ItemStack respirationBloodStoneHelmetItemStack = new ItemStack(bloodStoneHelmetItem);
		respirationBloodStoneHelmetItemStack.addEnchantment(Enchantment.respiration, 1);
		
		GameRegistry.addShapelessRecipe(respirationBloodStoneHelmetItemStack,
				Items.feather, bloodStoneHelmetItem, Blocks.red_flower);	
		
		ItemStack featherFallingBloodStoneBootsItemStack = new ItemStack(bloodStoneBootsItem);
		featherFallingBloodStoneBootsItemStack.addEnchantment(Enchantment.featherFalling, 1);
		
		GameRegistry.addShapelessRecipe(featherFallingBloodStoneBootsItemStack,
				Items.feather, bloodStoneHelmetItem, Blocks.red_flower);	
		
		// Rugged Leather Enchanting Recipes
		ItemStack respirationRuggedLeatherHelmetItemStack = new ItemStack(ruggedLeatherHelmetItem);
		respirationRuggedLeatherHelmetItemStack.addEnchantment(Enchantment.respiration, 1);
		
		GameRegistry.addShapelessRecipe(respirationRuggedLeatherHelmetItemStack,
				Items.feather, ruggedLeatherHelmetItem, Blocks.red_flower);	
		
		ItemStack featherFallingRuggedLeatherBootsItemStack = new ItemStack(ruggedLeatherBootsItem);
		featherFallingRuggedLeatherBootsItemStack.addEnchantment(Enchantment.featherFalling, 1);
		
		GameRegistry.addShapelessRecipe(featherFallingRuggedLeatherBootsItemStack,
				Items.feather, ruggedLeatherBootsItem, Blocks.red_flower);	
		
		// Leather Enchanting Recipes
		ItemStack respirationLeatherHelmetItemStack = new ItemStack(Items.leather_helmet);
		respirationLeatherHelmetItemStack.addEnchantment(Enchantment.respiration, 1);
		
		GameRegistry.addShapelessRecipe(respirationLeatherHelmetItemStack,
				Items.feather, Items.leather_helmet, Blocks.red_flower);	
		
		ItemStack featherFallingLeatherBootsItemStack = new ItemStack(Items.leather_boots);
		featherFallingLeatherBootsItemStack.addEnchantment(Enchantment.featherFalling, 1);
		
		GameRegistry.addShapelessRecipe(featherFallingLeatherBootsItemStack,
				Items.feather, Items.leather_boots, Blocks.red_flower);	
		
		// Shaped Crafting Recipes
		GameRegistry.addRecipe(
				new ItemStack(redPoppyBookItem),
				"e  ",
				" d ",
				"   ",
				'd', Items.book,
				'e', Blocks.red_flower);
		
		GameRegistry.addRecipe(
				new ItemStack(leatherRepairKitItem),
				"e  ",
				" e ",
				"   ",
				'e', Items.leather);
		
		GameRegistry.addRecipe(
				new ItemStack(ruggedLeatherRepairKitItem),
				"e  ",
				" e ",
				"   ",
				'e', ruggedLeatherItem);
		
		GameRegistry.addRecipe(
				new ItemStack(ruggedLeatherUpgradeKitItem),
				"e  ",
				" e ",
				"  e",
				'e', ruggedLeatherItem);
		
		GameRegistry.addRecipe(
				new ItemStack(ruggedLeatherHelmetItem),
				"   ",
				"d  ",
				"e  ",
				'd', ruggedLeatherUpgradeKitItem,
				'e', Items.leather_helmet);
		
		GameRegistry.addRecipe(
				new ItemStack(ruggedLeatherChestplateItem),
				"   ",
				"d  ",
				"e  ",
				'd', ruggedLeatherUpgradeKitItem,
				'e', Items.leather_chestplate);
		
		GameRegistry.addRecipe(
				new ItemStack(ruggedLeatherLeggingsItem),
				"   ",
				"d  ",
				"e  ",
				'd', ruggedLeatherUpgradeKitItem,
				'e', Items.leather_leggings);
		
		GameRegistry.addRecipe(
				new ItemStack(ruggedLeatherBootsItem),
				"   ",
				"d  ",
				"e  ",
				'd', ruggedLeatherUpgradeKitItem,
				'e', Items.leather_boots);
		
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
				new ShapedOreRecipe(Items.leather,
				"dd ",
				"dd ",
				"   ",
				'd', "materialLeatherScrap"));		
		
		GameRegistry.addRecipe(
				new ItemStack(ruggedLeatherItem),
				"dd ",
				"dd ",
				"   ",
				'd', Items.leather);		
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(bloodStoneOreItem,
				"ddd",
				"ddd",
				"ddd",
				'd', "dustBloodStone"));
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(bloodStoneBlockItem,
				"ddd",
				"ddd",
				"ddd",
				'd', "ingotBloodstone"));
		
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(bloodStoneHelmetItem,
				"ddd",
				"d d",
				"   ",
				'd', "ingotBloodstone"));
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(bloodStoneChestplateItem,
				"d d",
				"ddd",
				"ddd",
				'd', "ingotBloodstone"));
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(bloodStoneLeggingsItem,
				"ddd",
				"d d",
				"d d",
				'd', "ingotBloodstone"));
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(bloodStoneBootsItem,
				"   ",
				"d d",
				"d d",
				'd', "ingotBloodstone"));		
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(ruggedLeatherHelmetItem,
				"ddd",
				"d d",
				"   ",
				'd', "materialRuggedLeather"));
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(ruggedLeatherChestplateItem,
				"d d",
				"ddd",
				"ddd",
				'd', "materialRuggedLeather"));
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(ruggedLeatherLeggingsItem,
				"ddd",
				"d d",
				"d d",
				'd', "materialRuggedLeather"));
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(ruggedLeatherBootsItem,
				"   ",
				"d d",
				"d d",
				'd', "materialRuggedLeather"));
		
	    GameRegistry.addRecipe(new ItemStack(Items.leather_helmet), new Object[]{
	            "   ",
	            "I  ",
	            "W  ",
	                  'W', new ItemStack(Items.leather_helmet, 1, OreDictionary.WILDCARD_VALUE),
	                  'I', leatherRepairKitItem
	    });
		
	    GameRegistry.addRecipe(new ItemStack(Items.leather_chestplate), new Object[]{
	            "   ",
	            "I  ",
	            "W  ",
	                  'W', new ItemStack(Items.leather_chestplate, 1, OreDictionary.WILDCARD_VALUE),
	                  'I', leatherRepairKitItem
	    });
	    
	    GameRegistry.addRecipe(new ItemStack(Items.leather_leggings), new Object[]{
	            "   ",
	            "I  ",
	            "W  ",
	                  'W', new ItemStack(Items.leather_leggings, 1, OreDictionary.WILDCARD_VALUE),
	                  'I', leatherRepairKitItem
	    });	    
		
	    GameRegistry.addRecipe(new ItemStack(Items.leather_boots), new Object[]{
	            "   ",
	            "I  ",
	            "W  ",
	                  'W', new ItemStack(Items.leather_boots, 1, OreDictionary.WILDCARD_VALUE),
	                  'I', leatherRepairKitItem
	    });	  		

	    GameRegistry.addRecipe(new ItemStack(ruggedLeatherHelmetItem), new Object[]{
	            "   ",
	            "I  ",
	            "W  ",
	                  'W', new ItemStack(ruggedLeatherHelmetItem, 1, OreDictionary.WILDCARD_VALUE),
	                  'I', ruggedLeatherRepairKitItem
	    });
		
	    GameRegistry.addRecipe(new ItemStack(ruggedLeatherChestplateItem), new Object[]{
	            "   ",
	            "I  ",
	            "W  ",
	                  'W', new ItemStack(ruggedLeatherChestplateItem, 1, OreDictionary.WILDCARD_VALUE),
	                  'I', ruggedLeatherRepairKitItem
	    });
	    
	    GameRegistry.addRecipe(new ItemStack(ruggedLeatherLeggingsItem), new Object[]{
	            "   ",
	            "I  ",
	            "W  ",
	                  'W', new ItemStack(ruggedLeatherLeggingsItem, 1, OreDictionary.WILDCARD_VALUE),
	                  'I', ruggedLeatherRepairKitItem
	    });
	    
	    GameRegistry.addRecipe(new ItemStack(ruggedLeatherBootsItem), new Object[]{
	            "   ",
	            "I  ",
	            "W  ",
	                  'W', new ItemStack(ruggedLeatherBootsItem, 1, OreDictionary.WILDCARD_VALUE),
	                  'I', ruggedLeatherRepairKitItem
	    });
	    
	    
		//shapeless recipes
		GameRegistry.addShapelessRecipe(new ItemStack(bloodStoneIngotItem,9), new  ItemStack(bloodStoneBlockItem));
		
		//Smelting Recipes
		
		GameRegistry.addSmelting(
				bloodStoneDustItem,
				new ItemStack(bloodStoneIngotItem, 1),
				1.0F);		
		
		GameRegistry.addSmelting(
				bloodyScrapItem,
				new ItemStack(leatherScrapItem, 1),
				1.0F);
		
		//Dungeon changes - adds Bloodstone Ingots, Green Bloodkey & Black Bloodkey to chests
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new
				WeightedRandomChestContent(new ItemStack(bloodStoneIngotItem), 1,5,7));
		
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new
				WeightedRandomChestContent(new ItemStack(blackBloodKeyItem), 1,5,7));
		
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new
				WeightedRandomChestContent(new ItemStack(greenBloodKeyItem), 1,5,7));
		
	}

}

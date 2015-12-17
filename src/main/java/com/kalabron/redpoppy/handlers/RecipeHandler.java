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
import net.minecraftforge.oredict.ShapedOreRecipe;


public class RecipeHandler 
{
	 //public static Item redPoppyBook;

	
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
		Item bloodStoneDustItem = GameRegistry.findItem("redpoppy",  "bloodStoneDust");
		Item bloodyScrapItem = GameRegistry.findItem("redpoppy",  "bloodyScrap");
		Item bloodStoneIngotItem = GameRegistry.findItem("redpoppy",  "bloodStoneIngot");
		Item blackBloodKeyItem = GameRegistry.findItem("redpoppy",  "blackBloodKey");		
		Item greenBloodKeyItem = GameRegistry.findItem("redpoppy",  "greenBloodKey");

		
		// Drops on death
		MinecraftForge.EVENT_BUS.register(new PigDropsBloodyScraps());
		MinecraftForge.EVENT_BUS.register(new CowDropsBloodyScraps());
		MinecraftForge.EVENT_BUS.register(new SheepDropsBloodyScraps());

		
		// Enchantment recipes
		// 		coal = unbreaking
		// 		gunpowder = knockback
		
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
				new ItemStack(ruggedLeatherItem),
				"dd ",
				"dd ",
				"   ",
				'd', Items.leather);		
		
		GameRegistry.addRecipe(
				new ItemStack(bloodStoneOreItem),
				"ddd",
				"ddd",
				"ddd",
				'd', bloodStoneDustItem);
		
		
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

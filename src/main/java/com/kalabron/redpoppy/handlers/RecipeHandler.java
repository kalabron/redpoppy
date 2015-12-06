package com.kalabron.redpoppy.handlers;


import net.minecraftforge.common.MinecraftForge;


public class RecipeHandler 
{
	 //public static Item redPoppyBook;
	
	public static void registerRecipes()
	{
		//MinecraftForge.EVENT_BUS.register(new MobDropsHandler());
		MinecraftForge.EVENT_BUS.register(new PigDropsBloodyScraps());
		
		//ItemStack knockbackItemStack = new ItemStack(Items.stone_sword);
		 //knockbackItemStack.addEnchantment(Enchantment.knockback, 1);
		
		 //GameRegistry.addShapelessRecipe(knockbackItemStack,
			 	//Items.gunpowder, Items.stone_sword);
		
		 //GameRegistry.addRecipe(
			 	//new ItemStack(redPoppyBook),
			 	//"d  ",
			 	//"e  ",
			 	//"   ",
				//'d', Items.book,
			 	//'e', Blocks.red_flower);
		
		// GameRegistry.addSmelting(
			//	bloodStoneOreItem,
			//	new ItemStack(bloodStoneIngotItem, 1),
			//	1.0F);
	}

}

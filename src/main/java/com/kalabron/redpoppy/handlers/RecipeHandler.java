package com.kalabron.redpoppy.handlers;


import net.minecraftforge.common.MinecraftForge;


public class RecipeHandler 
{
	 //public static Item redPoppyBook;
	
	public static void registerRecipes()
	{

		MinecraftForge.EVENT_BUS.register(new PigDropsBloodyScraps());
		MinecraftForge.EVENT_BUS.register(new CowDropsBloodyScraps());
		MinecraftForge.EVENT_BUS.register(new SheepDropsBloodyScraps());
		

	}

}

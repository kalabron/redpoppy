package com.kalabron.redpoppy.proxies;

import com.kalabron.redpoppy.blocks.ModBlocks;
import com.kalabron.redpoppy.items.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent event)
	{
		ModBlocks.loadBlocks();
		ModItems.loadItems();
	}	

	public void init(FMLInitializationEvent event)
	{


	}	

	public void postInit(FMLPostInitializationEvent event)
	{


	}
}

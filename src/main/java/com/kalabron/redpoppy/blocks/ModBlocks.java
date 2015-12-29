package com.kalabron.redpoppy.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;


public class ModBlocks 
{
		public static Block bloodStoneOre;
		public static Block bloodBerryBush;
		public static Block bloodStoneBlock;
			
		public static void loadBlocks()
		{
			bloodStoneOre = new BloodStoneOre();
			GameRegistry.registerBlock(bloodStoneOre, "bloodStoneOre");
			OreDictionary.registerOre("oreBloodstone", new ItemStack(bloodStoneOre));	
			
			bloodBerryBush = new BloodBerryBush();
			GameRegistry.registerBlock(bloodBerryBush, "bloodBerryBush");
			
			bloodStoneBlock = new BloodStoneBlock();
			GameRegistry.registerBlock(bloodStoneBlock,  "bloodStoneBlock");
		}

}

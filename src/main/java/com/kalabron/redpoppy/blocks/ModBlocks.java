package com.kalabron.redpoppy.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModBlocks 
{
		public static Block bloodStoneOre;
		public static Block bloodBerryBush;
			
		public static void loadBlocks()
		{
			bloodStoneOre = new BloodStoneOre();
			GameRegistry.registerBlock(bloodStoneOre, "bloodStoneOre");
			
			bloodBerryBush = new BloodBerryBush();
			GameRegistry.registerBlock(bloodBerryBush, "bloodBerryBush");
		}

}

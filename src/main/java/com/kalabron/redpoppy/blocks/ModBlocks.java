package com.kalabron.redpoppy.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModBlocks 
{
		public static Block bloodStoneBlock;
		public static Block bloodBerryBush;
			
		public static void loadBlocks()
		{
			bloodStoneBlock = new BloodStoneBlock();
			GameRegistry.registerBlock(bloodStoneBlock, "bloodStoneBlock");
			
			bloodBerryBush = new BloodBerryBush();
			GameRegistry.registerBlock(bloodBerryBush, "bloodBerry");
		}

}

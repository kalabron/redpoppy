package com.kalabron.redpoppy.worldgen;

import java.util.Random;

import com.kalabron.redpoppy.blocks.BloodBerryBush;
import com.kalabron.redpoppy.blocks.ModBlocks;
import com.kalabron.redpoppy.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenBloodBerryBush extends WorldGenerator
{

	@Override
	public boolean generate(World worldIn, Random rand, BlockPos pos)
	{
		for (int i = 0; i < 64; ++i)
		{
			BlockPos blockpos1 = pos.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

			if (ModBlocks.bloodBerryBush.canPlaceBlockAt(worldIn, blockpos1) && worldIn.getBlockState(blockpos1.down()).getBlock() == Blocks.grass)
			{
//p232			worldIn.setBlockState(blockpos1, ModBlocks.bloodBerryBush.getDefaultState().withProperty(BloodBerryBush.AGE, rand.nextInt(2)), 2);
				worldIn.setBlockState(blockpos1, ModBlocks.bloodBerryBush.getDefaultState(),2);
			}
		}

		return true;
	}
}

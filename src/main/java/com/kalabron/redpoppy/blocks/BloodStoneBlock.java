package com.kalabron.redpoppy.blocks;

import java.util.Random;

import com.kalabron.redpoppy.Main;
import com.kalabron.redpoppy.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BloodStoneBlock extends Block{
	
	public BloodStoneBlock()  {
		super(Material.iron);
		this.setUnlocalizedName("bloodStoneBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setResistance(5.0F);
		this.setHardness(2.0F);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 3);
		// this.setLightLevel(1.0F);
	}

	public Item getItemDropped(IBlockState state, Random random, int i2)
	{
		return ModItems.bloodStoneOre;
	}
	
	public int quantityDropped(Random random)
	{
		return random.nextInt(2) + 1;
	}
	
}



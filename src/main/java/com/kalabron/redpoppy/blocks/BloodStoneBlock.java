package com.kalabron.redpoppy.blocks;

import com.kalabron.redpoppy.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BloodStoneBlock extends Block{
	
	public BloodStoneBlock()  {
		super(Material.iron);
		this.setUnlocalizedName(Reference.MODID + "_" + "bloodStoneBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setResistance(5.0F);
		this.setHardness(2.0F);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 3);
		// this.setLightLevel(1.0F);
	}
	
}

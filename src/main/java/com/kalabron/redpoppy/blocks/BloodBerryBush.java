package com.kalabron.redpoppy.blocks;

import com.kalabron.redpoppy.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BloodBerryBush extends Block 
{
	public BloodBerryBush()
	{
		super(Material.plants);
		this.setUnlocalizedName(Reference.MODID + "_" + "bloodBerryBush");
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setHardness(0.0F);
		this.setBlockBounds(0F, 0.0F, 0F, 1F, 0.25F, 1F);
		this.setStepSound(soundTypeGrass);
	}

}
// need to add growth to code  page 152 of Minecraft Development in 24 Hours
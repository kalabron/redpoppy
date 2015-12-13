package com.kalabron.redpoppy.items;

import com.kalabron.redpoppy.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BloodStoneDust extends Item{
	
	public BloodStoneDust()  {
		super();
		this.setUnlocalizedName(Reference.MODID + "_" + "bloodStoneDust");
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}

}

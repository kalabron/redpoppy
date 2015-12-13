package com.kalabron.redpoppy.items;

import com.kalabron.redpoppy.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BloodStoneIngot extends Item{
	
	public BloodStoneIngot()  {
		super();
		this.setUnlocalizedName(Reference.MODID + "_" + "bloodStoneIngot");
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}

}

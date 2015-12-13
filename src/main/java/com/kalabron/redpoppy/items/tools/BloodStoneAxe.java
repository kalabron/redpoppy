package com.kalabron.redpoppy.items.tools;

import com.kalabron.redpoppy.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class BloodStoneAxe extends ItemAxe
{
	public BloodStoneAxe(ToolMaterial material, String name)
	{
		super(material);
		this.setUnlocalizedName(Reference.MODID + "_" + "bloodStoneAxe");
		this.setCreativeTab(CreativeTabs.tabTools);
	}

}

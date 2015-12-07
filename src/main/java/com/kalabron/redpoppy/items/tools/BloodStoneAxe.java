package com.kalabron.redpoppy.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class BloodStoneAxe extends ItemAxe
{
	public BloodStoneAxe(ToolMaterial material, String name)
	{
		super(material);
		this.setUnlocalizedName("bloodStoneAxe");
		this.setCreativeTab(CreativeTabs.tabTools);
	}

}

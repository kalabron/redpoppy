package com.kalabron.redpoppy.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemSpade;

public class BloodStoneShear extends ItemShears
{
	public BloodStoneShear(ToolMaterial material, String name)
	{
		super();
		this.setUnlocalizedName("bloodStoneShear");
		this.setCreativeTab(CreativeTabs.tabTools);
	}

}

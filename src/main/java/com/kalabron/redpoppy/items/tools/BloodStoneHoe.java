package com.kalabron.redpoppy.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;

public class BloodStoneHoe extends ItemHoe
{
	public BloodStoneHoe(ToolMaterial material, String name)
	{
		super(material);
		this.setUnlocalizedName("bloodStoneHoe");
		this.setCreativeTab(CreativeTabs.tabTools);
	}

}

package com.kalabron.redpoppy.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class BloodStoneShovel extends ItemSpade
{
	public BloodStoneShovel(ToolMaterial material, String name)
	{
		super(material);
		this.setUnlocalizedName("bloodStoneShovel");
		this.setCreativeTab(CreativeTabs.tabTools);
	}

}

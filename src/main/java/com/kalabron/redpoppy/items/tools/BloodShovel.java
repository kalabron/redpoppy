package com.kalabron.redpoppy.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class BloodShovel extends ItemPickaxe 
{
	public BloodShovel(ToolMaterial material, String name)
	{
		super(material);
		this.setUnlocalizedName("bloodShovel");
		this.setCreativeTab(CreativeTabs.tabTools);
	}

}

package com.kalabron.redpoppy.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class BloodStonePickAxe extends ItemPickaxe 
{
	public BloodStonePickAxe(ToolMaterial material, String name)
	{
		super(material);
		this.setUnlocalizedName("bloodStonePickAxe");
		this.setCreativeTab(CreativeTabs.tabTools);
	}

}

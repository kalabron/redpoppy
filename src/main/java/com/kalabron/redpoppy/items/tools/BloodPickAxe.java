package com.kalabron.redpoppy.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class BloodPickAxe extends ItemPickaxe 
{
	public BloodPickAxe(ToolMaterial material, String name)
	{
		super(material);
		this.setUnlocalizedName("bloodPickAxe");
		this.setCreativeTab(CreativeTabs.tabTools);
	}

}

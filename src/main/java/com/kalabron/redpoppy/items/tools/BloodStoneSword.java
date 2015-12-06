package com.kalabron.redpoppy.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class BloodStoneSword extends ItemSword
{
	public BloodStoneSword(ToolMaterial material, String name)
	{
		super(material);
		this.setUnlocalizedName("bloodStoneSword");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

}

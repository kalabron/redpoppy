package com.kalabron.redpoppy.items.tools;

import com.kalabron.redpoppy.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class BloodStoneShovel extends ItemSpade
{
	public BloodStoneShovel(ToolMaterial material, String name)
	{
		super(material);
		this.setUnlocalizedName(Reference.MODID + "_" + "bloodStoneShovel");
		this.setCreativeTab(CreativeTabs.tabTools);
	}

}

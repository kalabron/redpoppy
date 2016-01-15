package com.kalabron.redpoppy.items.tools;

import com.kalabron.redpoppy.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class BloodStoneHoe extends ItemHoe
{
	public BloodStoneHoe(ToolMaterial material, String name)
	{
		super(material);
		this.setUnlocalizedName(Reference.MODID + "_" + "bloodStoneHoe");
		this.setCreativeTab(CreativeTabs.tabTools);
	}

}

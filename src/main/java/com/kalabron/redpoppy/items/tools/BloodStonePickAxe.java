package com.kalabron.redpoppy.items.tools;

import com.kalabron.redpoppy.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class BloodStonePickAxe extends ItemPickaxe 
{
	public BloodStonePickAxe(ToolMaterial material, String name)
	{
		super(material);
		this.setUnlocalizedName(Reference.MODID + "_" + "bloodStonePickAxe");
		this.setCreativeTab(CreativeTabs.tabTools);
	}

}

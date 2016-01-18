package com.kalabron.redpoppy.items;

import com.kalabron.redpoppy.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LeatherRepairKit extends Item 
{
	public LeatherRepairKit()
		{
			super();
			this.setUnlocalizedName(Reference.MODID + "_" + "leatherRepairKit");
			this.setCreativeTab(CreativeTabs.tabTools);
		}

}




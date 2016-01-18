package com.kalabron.redpoppy.items;

import com.kalabron.redpoppy.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RuggedLeatherRepairKit extends Item 
{
	public RuggedLeatherRepairKit()
		{
			super();
			this.setUnlocalizedName(Reference.MODID + "_" + "ruggedLeatherRepairKit");
			this.setCreativeTab(CreativeTabs.tabTools);
		}

}



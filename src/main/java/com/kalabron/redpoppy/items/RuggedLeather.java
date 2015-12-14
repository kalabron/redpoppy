package com.kalabron.redpoppy.items;

import com.kalabron.redpoppy.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RuggedLeather extends Item 
{
	public RuggedLeather()
		{
			super();
			this.setUnlocalizedName(Reference.MODID + "_" + "ruggedLeather");
			this.setCreativeTab(CreativeTabs.tabMaterials);
		}

}



package com.kalabron.redpoppy.items;

import com.kalabron.redpoppy.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlackBloodKey extends Item {
	
	public BlackBloodKey()
	{
		super();
		this.setUnlocalizedName(Reference.MODID + "_" + "blackBloodKey");
		this.setCreativeTab(CreativeTabs.tabMisc);
	}

}

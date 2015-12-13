package com.kalabron.redpoppy.items;

import com.kalabron.redpoppy.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GreenBloodKey extends Item {
	
	public GreenBloodKey()
	{
		super();
		this.setUnlocalizedName(Reference.MODID + "_" + "greenBloodKey");
		this.setCreativeTab(CreativeTabs.tabMisc);
	}

}

package com.kalabron.redpoppy.items;

import com.kalabron.redpoppy.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BloodyScrap extends Item 
{
	public BloodyScrap()
		{
			super();
			this.setUnlocalizedName(Reference.MODID + "_" + "bloodyScrap");
			this.setCreativeTab(CreativeTabs.tabMisc);
		}

}



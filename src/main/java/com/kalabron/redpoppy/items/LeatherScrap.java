package com.kalabron.redpoppy.items;

import com.kalabron.redpoppy.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LeatherScrap extends Item 
{
	public LeatherScrap()
		{
			super();
			this.setUnlocalizedName(Reference.MODID + "_" + "leatherScrap");
			this.setCreativeTab(CreativeTabs.tabMaterials);
		}

}



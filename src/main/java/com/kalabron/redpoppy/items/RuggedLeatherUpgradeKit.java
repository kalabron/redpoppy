package com.kalabron.redpoppy.items;

import com.kalabron.redpoppy.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RuggedLeatherUpgradeKit extends Item 
{
	public RuggedLeatherUpgradeKit()
		{
			super();
			this.setUnlocalizedName(Reference.MODID + "_" + "ruggedLeatherUpgradeKit");
			this.setCreativeTab(CreativeTabs.tabTools);
		}

}




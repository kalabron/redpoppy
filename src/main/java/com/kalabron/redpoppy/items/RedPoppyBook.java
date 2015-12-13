package com.kalabron.redpoppy.items;

import com.kalabron.redpoppy.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RedPoppyBook extends Item {
	
	public RedPoppyBook()  {
		super();
		this.setUnlocalizedName(Reference.MODID + "_" + "redPoppyBook");
		this.setCreativeTab(CreativeTabs.tabMisc);
	}

}

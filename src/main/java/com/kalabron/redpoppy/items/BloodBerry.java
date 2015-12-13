package com.kalabron.redpoppy.items;

import com.kalabron.redpoppy.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class BloodBerry extends ItemFood 
{
	public BloodBerry(int amount, float saturation, boolean isWolfFood) 
	{
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName(Reference.MODID + "_" + "bloodBerry");
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setPotionEffect(Potion.moveSpeed.id, 15, 0, 1F);
		this.setAlwaysEdible();
	}


	

}

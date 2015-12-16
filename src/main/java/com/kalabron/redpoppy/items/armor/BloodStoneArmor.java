package com.kalabron.redpoppy.items.armor;

import com.kalabron.redpoppy.Reference;
import com.kalabron.redpoppy.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BloodStoneArmor extends ItemArmor
{
	private String name;

	public BloodStoneArmor(ArmorMaterial material, int armorType, String itemName) 
	{
		super(material, 0, armorType);
		name = itemName;
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(Reference.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == ModItems.bloodStoneHelmet || stack.getItem() == ModItems.bloodStoneChestplate || stack.getItem() == ModItems.bloodStoneBoots)
		{
			return Reference.MODID + ":models/armor/bloodStoneArmor1.png";
		}
		else if(stack.getItem() == ModItems.bloodStoneLeggings)
		{
			return Reference.MODID + ":models/armor/bloodStoneArmor2.png";
		}
		else
		{
			System.out.println("Invalid Item");
			return null;
		}
	  
	}
	
	public String getName()
	{
		return name;
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		
	}
	

}


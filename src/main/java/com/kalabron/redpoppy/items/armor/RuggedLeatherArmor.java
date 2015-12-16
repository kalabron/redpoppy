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

public class RuggedLeatherArmor extends ItemArmor
{
	private String name;

	public RuggedLeatherArmor(ArmorMaterial material, int armorType, String itemName) 
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
		if (stack.getItem() == ModItems.ruggedLeatherHelmet || stack.getItem() == ModItems.ruggedLeatherChestplate || stack.getItem() == ModItems.ruggedLeatherBoots)
		{
			return Reference.MODID + ":models/armor/ruggedLeatherArmor1.png";
		}
		else if(stack.getItem() == ModItems.ruggedLeatherLeggings)
		{
			return Reference.MODID + ":models/armor/ruggedLeatherArmor2.png";
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

package com.kalabron.redpoppy.handlers;

import java.util.Random;

import com.kalabron.redpoppy.items.ModItems;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MobDropsHandler
{	
	@SubscribeEvent
	public void onMobDrops(LivingDropsEvent event)
	{
		if (event.entity instanceof EntityPig)
			{			
			ItemStack stack = new ItemStack(ModItems.bloodyScrap);
			EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
			 
			event.drops.add(drop);
			}
		if (event.entity instanceof EntityCow)
			{
			ItemStack stack = new ItemStack(ModItems.bloodyScrap);
			EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
			 
			event.drops.add(drop);	
			}
		if (event.entity instanceof EntityChicken)
		{
		ItemStack stack = new ItemStack(ModItems.bloodyScrap);
		EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
		 
		event.drops.add(drop);	
		}
	}
}



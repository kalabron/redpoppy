package com.kalabron.redpoppy.handlers;

import java.util.Random;

import com.kalabron.redpoppy.items.ModItems;

import net.minecraft.entity.passive.EntitySheep;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SheepDropsBloodyScraps 
{
	@SubscribeEvent
	public void dropBloodyScraps(LivingDeathEvent event)
	{
		if (!(event.entity instanceof EntitySheep)) 
		{
			return;
		}
	
		Random random = new Random();
		
		if (!event.entity.worldObj.isRemote)  
		{
			event.entity.dropItem(ModItems.bloodyScrap, random.nextInt(3));
		}
	}
}

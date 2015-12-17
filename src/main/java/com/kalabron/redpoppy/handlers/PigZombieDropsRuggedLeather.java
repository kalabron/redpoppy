package com.kalabron.redpoppy.handlers;

import java.util.Random;

import com.kalabron.redpoppy.items.ModItems;

import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PigZombieDropsRuggedLeather 
{
	@SubscribeEvent
	public void dropBloodyScraps(LivingDeathEvent event)
	{
		if (!(event.entity instanceof EntityPigZombie)) 
		{
			return;
		}
	
		Random random = new Random();
		
		if (!event.entity.worldObj.isRemote)  
		{
			event.entity.dropItem(ModItems.ruggedLeather, random.nextInt(3));
		}
	}
}

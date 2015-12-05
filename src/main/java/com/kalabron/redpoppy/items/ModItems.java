package com.kalabron.redpoppy.items;

import com.kalabron.redpoppy.items.tools.BloodPickAxe;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems 
{
	static ToolMaterial poppium = EnumHelper.addToolMaterial("poppium", 3, 2000, 9.5F, 3.5F, 10);
	
	public static Item bloodPickAxe;
	public static Item bloodStoneOre;
	public static Item bloodStoneIngot;
	public static Item redPoppyBook;
	public static Item blackBloodKey;
	public static Item bloodBerry;
	public static Item bloodyScrap;
	
	
	public static void loadItems()
	{
		bloodStoneOre = new BloodStoneOre();
		GameRegistry.registerItem(bloodStoneOre, "bloodStoneOre");
		
		bloodStoneIngot = new BloodStoneIngot();
		GameRegistry.registerItem(bloodStoneIngot, "bloodStoneIngot");
		
		redPoppyBook = new RedPoppyBook();
		GameRegistry.registerItem(redPoppyBook, "redPoppyBook");
		
		bloodyScrap = new BloodyScrap();
		GameRegistry.registerItem(bloodyScrap, "bloodyScrap");
		
		blackBloodKey = new BlackBloodKey();
		GameRegistry.registerItem(blackBloodKey, "blackBloodKey");
		
		bloodBerry = new BloodBerry(3,0.3F, true);
		GameRegistry.registerItem(bloodBerry, "bloodBerry");
		
		bloodPickAxe = new BloodPickAxe(poppium, "bloodPickAxe");
		GameRegistry.registerItem(bloodPickAxe, "bloodPickAxe");
		
	}

}

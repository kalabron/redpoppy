package com.kalabron.redpoppy.items;

import com.kalabron.redpoppy.items.tools.BloodStoneAxe;
import com.kalabron.redpoppy.items.tools.BloodStonePickAxe;
import com.kalabron.redpoppy.items.tools.BloodStoneShear;
import com.kalabron.redpoppy.items.tools.BloodStoneShovel;
import com.kalabron.redpoppy.items.tools.BloodStoneSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems 
{
	static ToolMaterial poppium = EnumHelper.addToolMaterial("poppium", 3, 2000, 9.5F, 3.5F, 10);
	
	public static Item bloodStonePickAxe;
	public static Item bloodStoneShovel;
	public static Item bloodStoneShear;
	public static Item bloodStoneAxe;
	public static Item bloodStoneSword;
	public static Item bloodStoneDust;
	public static Item bloodStoneIngot;
	public static Item redPoppyBook;
	public static Item blackBloodKey;
	public static Item greenBloodKey;
	public static Item bloodBerry;
	public static Item bloodyScrap;
	public static Item leatherScrap;
	
	
	public static void loadItems()
	{
		bloodStoneDust = new BloodStoneDust();
		GameRegistry.registerItem(bloodStoneDust, "bloodStoneDust");
		
		bloodStoneIngot = new BloodStoneIngot();
		GameRegistry.registerItem(bloodStoneIngot, "bloodStoneIngot");
		
		redPoppyBook = new RedPoppyBook();
		GameRegistry.registerItem(redPoppyBook, "redPoppyBook");
		
		bloodyScrap = new BloodyScrap();
		GameRegistry.registerItem(bloodyScrap, "bloodyScrap");
		
		leatherScrap = new LeatherScrap();
		GameRegistry.registerItem(leatherScrap, "leatherScrap");
		
		blackBloodKey = new BlackBloodKey();
		GameRegistry.registerItem(blackBloodKey, "blackBloodKey");
		
		greenBloodKey = new GreenBloodKey();
		GameRegistry.registerItem(greenBloodKey, "greenBloodKey");
		
		bloodBerry = new BloodBerry(3,0.3F, true);
		GameRegistry.registerItem(bloodBerry, "bloodBerry");
		
		bloodStonePickAxe = new BloodStonePickAxe(poppium, "bloodStonePickAxe");
		GameRegistry.registerItem(bloodStonePickAxe, "bloodStonePickAxe");
		
		bloodStoneAxe = new BloodStoneAxe(poppium, "bloodStoneAxe");
		GameRegistry.registerItem(bloodStoneAxe, "bloodStoneAxe");		
		
		bloodStoneShovel = new BloodStoneShovel(poppium, "bloodStoneShovel");
		GameRegistry.registerItem(bloodStoneShovel, "bloodStoneShovel");
		
		bloodStoneShear = new BloodStoneShear(poppium, "bloodStoneShear");
		GameRegistry.registerItem(bloodStoneShear, "bloodStoneShear");
		
		
		bloodStoneSword = new BloodStoneSword(poppium, "bloodStoneSword");
		GameRegistry.registerItem(bloodStoneSword, "bloodStoneSword");
		
	}

}

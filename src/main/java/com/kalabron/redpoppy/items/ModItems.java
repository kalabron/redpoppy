package com.kalabron.redpoppy.items;

import com.kalabron.redpoppy.items.armor.BloodStoneArmor;
import com.kalabron.redpoppy.items.armor.RuggedLeatherArmor;
import com.kalabron.redpoppy.items.tools.BloodStoneAxe;
import com.kalabron.redpoppy.items.tools.BloodStoneHoe;
import com.kalabron.redpoppy.items.tools.BloodStonePickAxe;
import com.kalabron.redpoppy.items.tools.BloodStoneShear;
import com.kalabron.redpoppy.items.tools.BloodStoneShovel;
import com.kalabron.redpoppy.items.tools.BloodStoneSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems 
{
	//tool materials
	static ToolMaterial poppium = EnumHelper.addToolMaterial("poppium", 3, 2000, 9.5F, 3.5F, 10);
	
	//armor materials
	static ArmorMaterial ruggedleatherium = EnumHelper.addArmorMaterial("ruggedleatherium",  "ruggedleatherium",  20, new int[] { 3, 7, 6, 3 }, 10);
	static ArmorMaterial bloodstonerium = EnumHelper.addArmorMaterial("bloodstonerium",  "bloodstonerium",  20, new int[] { 3, 7, 6, 3 }, 10);
	
	// tools
	public static Item bloodStonePickAxe;
	public static Item bloodStoneShovel;
	public static Item bloodStoneHoe;
	public static Item bloodStoneShear;
	public static Item bloodStoneAxe;
	public static Item bloodStoneSword;
	
	// Items
	public static Item bloodStoneDust;
	public static Item bloodStoneIngot;
	public static Item redPoppyBook;
	public static Item blackBloodKey;
	public static Item greenBloodKey;
	public static Item bloodyScrap;
	public static Item leatherScrap;
	public static Item ruggedLeather;
	public static Item ruggedLeatherRepairKit;
	public static Item ruggedLeatherUpgradeKit;
	public static Item leatherRepairKit;
	
	// armor
	public static Item ruggedLeatherHelmet;
	public static Item ruggedLeatherChestplate;
	public static Item ruggedLeatherLeggings;
	public static Item ruggedLeatherBoots;
	public static Item bloodStoneHelmet;
	public static Item bloodStoneChestplate;
	public static Item bloodStoneLeggings;
	public static Item bloodStoneBoots;
	
	
	
	public static void loadItems()
	{
		// armor		
		ruggedLeatherHelmet = new RuggedLeatherArmor(ruggedleatherium, 0, "ruggedLeatherHelmet");
		ruggedLeatherChestplate = new RuggedLeatherArmor(ruggedleatherium, 1, "ruggedLeatherChestplate");
		ruggedLeatherLeggings = new RuggedLeatherArmor(ruggedleatherium, 2, "ruggedLeatherLeggings");
		ruggedLeatherBoots = new RuggedLeatherArmor(ruggedleatherium, 3, "ruggedLeatherBoots");
		bloodStoneHelmet = new BloodStoneArmor(bloodstonerium, 0, "bloodStoneHelmet");
		bloodStoneChestplate = new BloodStoneArmor(bloodstonerium, 1, "bloodStoneChestplate");
		bloodStoneLeggings = new BloodStoneArmor(bloodstonerium, 2, "bloodStoneLeggings");
		bloodStoneBoots = new BloodStoneArmor(bloodstonerium, 3, "bloodStoneBoots");
				
				
		// Items
		bloodStoneDust = new BloodStoneDust();
		GameRegistry.registerItem(bloodStoneDust, "bloodStoneDust");
		OreDictionary.registerOre("dustBloodstone", new ItemStack(bloodStoneDust));	
		
		bloodStoneIngot = new BloodStoneIngot();
		GameRegistry.registerItem(bloodStoneIngot, "bloodStoneIngot");		
		OreDictionary.registerOre("ingotBloodstone", new ItemStack(bloodStoneIngot));		
		
		redPoppyBook = new RedPoppyBook();
		GameRegistry.registerItem(redPoppyBook, "redPoppyBook");
		
		bloodyScrap = new BloodyScrap();
		GameRegistry.registerItem(bloodyScrap, "bloodyScrap");
		
		leatherScrap = new LeatherScrap();
		GameRegistry.registerItem(leatherScrap, "leatherScrap");
		OreDictionary.registerOre("materialLeatherScrap", new ItemStack(leatherScrap));	
		
		ruggedLeather = new RuggedLeather();
		GameRegistry.registerItem(ruggedLeather, "ruggedLeather");
		OreDictionary.registerOre("materialRuggedLeather", new ItemStack(ruggedLeather));	
		
		blackBloodKey = new BlackBloodKey();
		GameRegistry.registerItem(blackBloodKey, "blackBloodKey");
		
		ruggedLeatherRepairKit = new RuggedLeatherRepairKit();
		GameRegistry.registerItem(ruggedLeatherRepairKit, "ruggedLeatherRepairKit");
		
		leatherRepairKit = new LeatherRepairKit();
		GameRegistry.registerItem(leatherRepairKit, "leatherRepairKit");	
		
		ruggedLeatherUpgradeKit = new RuggedLeatherUpgradeKit();
		GameRegistry.registerItem(ruggedLeatherUpgradeKit, "ruggedLeatherUpgradeKit");	
		
		greenBloodKey = new GreenBloodKey();
		GameRegistry.registerItem(greenBloodKey, "greenBloodKey");		
		
		// tools
		bloodStonePickAxe = new BloodStonePickAxe(poppium, "bloodStonePickAxe");
		GameRegistry.registerItem(bloodStonePickAxe, "bloodStonePickAxe");
		
		bloodStoneAxe = new BloodStoneAxe(poppium, "bloodStoneAxe");
		GameRegistry.registerItem(bloodStoneAxe, "bloodStoneAxe");		
		
		bloodStoneShovel = new BloodStoneShovel(poppium, "bloodStoneShovel");
		GameRegistry.registerItem(bloodStoneShovel, "bloodStoneShovel");
		
		bloodStoneHoe = new BloodStoneHoe(poppium, "bloodStoneHoe");
		GameRegistry.registerItem(bloodStoneHoe, "bloodStoneHoe");
		
		bloodStoneShear = new BloodStoneShear(poppium, "bloodStoneShear");
		GameRegistry.registerItem(bloodStoneShear, "bloodStoneShear");		
		
		bloodStoneSword = new BloodStoneSword(poppium, "bloodStoneSword");
		GameRegistry.registerItem(bloodStoneSword, "bloodStoneSword");
		
	}
	

	
	public static void registerItems()
	{

	
	}
	


}

package com.kalabron.redpoppy.proxies;

import com.kalabron.redpoppy.items.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void preInit(FMLPreInitializationEvent e)
	{
		super.preInit(e);
	}	

	@Override
	public void init(FMLInitializationEvent e)
	{
		super.init(e);
		

		Item bloodStoneOreItem = GameRegistry.findItem("redpoppy",  "bloodStoneOre");
		ModelResourceLocation bloodStoneOreModel = 
				new ModelResourceLocation("redpoppy:bloodStoneOre", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(bloodStoneOreItem,  0, bloodStoneOreModel);
		
		Item bloodStoneIngotItem = GameRegistry.findItem("redpoppy",  "bloodStoneIngot");
		ModelResourceLocation bloodStoneIngotModel = 
				new ModelResourceLocation("redpoppy:bloodStoneIngot", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(bloodStoneIngotItem,  0, bloodStoneIngotModel);
		
		Item bloodStoneDustItem = GameRegistry.findItem("redpoppy",  "bloodStoneDust");
		ModelResourceLocation bloodStoneDustModel = 
				new ModelResourceLocation("redpoppy:bloodStoneDust", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(bloodStoneDustItem,  0, bloodStoneDustModel);
		
		Item redPoppyBookItem = GameRegistry.findItem("redpoppy",  "redPoppyBook");
		ModelResourceLocation redPoppyBookModel = 
				new ModelResourceLocation("redpoppy:redPoppyBook", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(redPoppyBookItem,  0, redPoppyBookModel);
		
		Item blackBloodKeyItem = GameRegistry.findItem("redpoppy",  "blackBloodKey");
		ModelResourceLocation blackBloodKeyModel = 
				new ModelResourceLocation("redpoppy:blackBloodKey", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(blackBloodKeyItem,  0, blackBloodKeyModel);
		
		Item greenBloodKeyItem = GameRegistry.findItem("redpoppy",  "greenBloodKey");
		ModelResourceLocation greenBloodKeyModel = 
				new ModelResourceLocation("redpoppy:greenBloodKey", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(greenBloodKeyItem,  0, greenBloodKeyModel);		
		
		Item bloodyScrapItem = GameRegistry.findItem("redpoppy",  "bloodyScrap");
		ModelResourceLocation bloodyScrapModel = 
				new ModelResourceLocation("redpoppy:bloodyScrap", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(bloodyScrapItem,  0, bloodyScrapModel);
		
		Item leatherScrapItem = GameRegistry.findItem("redpoppy",  "leatherScrap");
		ModelResourceLocation leatherScrapModel = 
				new ModelResourceLocation("redpoppy:leatherScrap", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(leatherScrapItem,  0, leatherScrapModel);		
		
		Item bloodBerryItem = GameRegistry.findItem("redPoppy",  "bloodBerry");
		ModelResourceLocation bloodBerryModel = 
				new ModelResourceLocation("redpoppy:bloodBerry", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(bloodBerryItem,  0, bloodBerryModel);
		
		Item bloodStonePickAxeItem = GameRegistry.findItem("redPoppy",  "bloodStonePickAxe");
		ModelResourceLocation bloodStonePickAxeModel = 
				new ModelResourceLocation("redpoppy:bloodStonePickAxe", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(bloodStonePickAxeItem,  0, bloodStonePickAxeModel);
		
		Item bloodStoneAxeItem = GameRegistry.findItem("redPoppy",  "bloodStoneAxe");
		ModelResourceLocation bloodStoneAxeModel = 
				new ModelResourceLocation("redpoppy:bloodStoneAxe", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(bloodStoneAxeItem,  0, bloodStoneAxeModel);		
		
		Item bloodStoneShovelItem = GameRegistry.findItem("redPoppy",  "bloodStoneShovel");
		ModelResourceLocation bloodStoneShovelModel = 
				new ModelResourceLocation("redpoppy:bloodStoneShovel", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(bloodStoneShovelItem,  0, bloodStoneShovelModel);
		
		Item bloodStoneHoeItem = GameRegistry.findItem("redPoppy",  "bloodStoneHoe");
		ModelResourceLocation bloodStoneHoeModel = 
				new ModelResourceLocation("redpoppy:bloodStoneHoe", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(bloodStoneHoeItem,  0, bloodStoneHoeModel);
		
		Item bloodStoneShearItem = GameRegistry.findItem("redPoppy",  "bloodStoneShear");
		ModelResourceLocation bloodStoneShearModel = 
				new ModelResourceLocation("redpoppy:bloodStoneShear", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(bloodStoneShearItem,  0, bloodStoneShearModel);
		
		Item bloodStoneSwordItem = GameRegistry.findItem("redPoppy",  "bloodStoneSword");
		ModelResourceLocation bloodStoneSwordModel = 
				new ModelResourceLocation("redpoppy:bloodStoneSword", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(bloodStoneSwordItem,  0, bloodStoneSwordModel);
		
	}	

	@Override
	public void postInit(FMLPostInitializationEvent e)
	{

		super.postInit(e);
	}
}
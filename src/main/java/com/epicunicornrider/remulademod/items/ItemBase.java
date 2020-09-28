package com.epicunicornrider.remulademod.items;

import com.epicunicornrider.remulademod.Main;
import com.epicunicornrider.remulademod.init.ModItems;
import com.epicunicornrider.remulademod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {
		//super(5, 0.5f, false);
		setUnlocalizedName("remulade." + name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}

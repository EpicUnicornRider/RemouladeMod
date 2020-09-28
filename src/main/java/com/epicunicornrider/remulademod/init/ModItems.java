package com.epicunicornrider.remulademod.init;

import java.util.ArrayList;
import java.util.List;

//import com.epicunicornrider.remulademod.items.ItemBase;
import com.epicunicornrider.remulademod.items.food.FoodBase;

import net.minecraft.item.Item;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//public static final Item Mayo = new ItemBase("mayo");
	//public static final Item Strand = new ItemBase("strand");
	
	public static final Item Mayo = new FoodBase("mayo", 4, 2.4f, false);
	public static final Item Cucumber = new FoodBase("cucumber", 4, 2.4f, true);
	public static final Item Remulade = new FoodBase("remulade", 8, 12.8f, true);
		
}

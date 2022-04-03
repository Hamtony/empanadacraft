
package net.mcreator.empanadacraftmods.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;

public class PeperoniItem extends Item {
	public PeperoniItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.2f)

						.meat().build()));
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 16;
	}
}

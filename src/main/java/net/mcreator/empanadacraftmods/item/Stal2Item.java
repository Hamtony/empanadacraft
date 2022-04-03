
package net.mcreator.empanadacraftmods.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.empanadacraftmods.init.EmpanadacraftModsModSounds;

public class Stal2Item extends RecordItem {
	public Stal2Item() {
		super(0, EmpanadacraftModsModSounds.REGISTRY.get(new ResourceLocation("empanadacraft_mods:stal2")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
	}
}

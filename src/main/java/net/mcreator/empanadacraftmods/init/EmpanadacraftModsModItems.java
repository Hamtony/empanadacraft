
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.empanadacraftmods.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.empanadacraftmods.item.YeastItem;
import net.mcreator.empanadacraftmods.item.TomateItem;
import net.mcreator.empanadacraftmods.item.Stal2Item;
import net.mcreator.empanadacraftmods.item.SemillatomateItem;
import net.mcreator.empanadacraftmods.item.PizzaconpinhaItem;
import net.mcreator.empanadacraftmods.item.PizzaDoughItem;
import net.mcreator.empanadacraftmods.item.PinaItem;
import net.mcreator.empanadacraftmods.item.PeperoniItem;
import net.mcreator.empanadacraftmods.item.PaltaItem;
import net.mcreator.empanadacraftmods.item.MANDARINAItem;
import net.mcreator.empanadacraftmods.EmpanadacraftModsMod;

public class EmpanadacraftModsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EmpanadacraftModsMod.MODID);
	public static final RegistryObject<Item> MANDARINA = REGISTRY.register("mandarina", () -> new MANDARINAItem());
	public static final RegistryObject<Item> STAL_2 = REGISTRY.register("stal_2", () -> new Stal2Item());
	public static final RegistryObject<Item> YEAST = REGISTRY.register("yeast", () -> new YeastItem());
	public static final RegistryObject<Item> PIZZA_DOUGH = REGISTRY.register("pizza_dough", () -> new PizzaDoughItem());
	public static final RegistryObject<Item> PALTA = REGISTRY.register("palta", () -> new PaltaItem());
	public static final RegistryObject<Item> TOMATE = REGISTRY.register("tomate", () -> new TomateItem());
	public static final RegistryObject<Item> PEPERONI = REGISTRY.register("peperoni", () -> new PeperoniItem());
	public static final RegistryObject<Item> PIZZACONPINHA = REGISTRY.register("pizzaconpinha", () -> new PizzaconpinhaItem());
	public static final RegistryObject<Item> PINA = REGISTRY.register("pina", () -> new PinaItem());
	public static final RegistryObject<Item> SEMILLATOMATE = REGISTRY.register("semillatomate", () -> new SemillatomateItem());
	public static final RegistryObject<Item> ESTADO_0_TOMATE = block(EmpanadacraftModsModBlocks.ESTADO_0_TOMATE, null);
	public static final RegistryObject<Item> ESTADO_1_TOMATE = block(EmpanadacraftModsModBlocks.ESTADO_1_TOMATE, null);
	public static final RegistryObject<Item> ESTADO_2_TOMATE = block(EmpanadacraftModsModBlocks.ESTADO_2_TOMATE, null);
	public static final RegistryObject<Item> ESTADO_3_TOMATE = block(EmpanadacraftModsModBlocks.ESTADO_3_TOMATE, null);
	public static final RegistryObject<Item> TEST = block(EmpanadacraftModsModBlocks.TEST, CreativeModeTab.TAB_FOOD);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}

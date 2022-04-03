
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.empanadacraftmods.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.empanadacraftmods.block.TestBlock;
import net.mcreator.empanadacraftmods.block.Estado3TomateBlock;
import net.mcreator.empanadacraftmods.block.Estado2TomateBlock;
import net.mcreator.empanadacraftmods.block.Estado1TomateBlock;
import net.mcreator.empanadacraftmods.block.Estado0TomateBlock;
import net.mcreator.empanadacraftmods.EmpanadacraftModsMod;

public class EmpanadacraftModsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EmpanadacraftModsMod.MODID);
	public static final RegistryObject<Block> ESTADO_0_TOMATE = REGISTRY.register("estado_0_tomate", () -> new Estado0TomateBlock());
	public static final RegistryObject<Block> ESTADO_1_TOMATE = REGISTRY.register("estado_1_tomate", () -> new Estado1TomateBlock());
	public static final RegistryObject<Block> ESTADO_2_TOMATE = REGISTRY.register("estado_2_tomate", () -> new Estado2TomateBlock());
	public static final RegistryObject<Block> ESTADO_3_TOMATE = REGISTRY.register("estado_3_tomate", () -> new Estado3TomateBlock());
	public static final RegistryObject<Block> TEST = REGISTRY.register("test", () -> new TestBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			Estado0TomateBlock.registerRenderLayer();
			Estado1TomateBlock.registerRenderLayer();
			Estado2TomateBlock.registerRenderLayer();
			Estado3TomateBlock.registerRenderLayer();
			TestBlock.registerRenderLayer();
		}
	}
}

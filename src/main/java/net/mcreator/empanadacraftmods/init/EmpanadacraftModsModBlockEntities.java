
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.empanadacraftmods.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.empanadacraftmods.block.entity.Estado3TomateBlockEntity;
import net.mcreator.empanadacraftmods.block.entity.Estado2TomateBlockEntity;
import net.mcreator.empanadacraftmods.block.entity.Estado1TomateBlockEntity;
import net.mcreator.empanadacraftmods.block.entity.Estado0TomateBlockEntity;
import net.mcreator.empanadacraftmods.EmpanadacraftModsMod;

public class EmpanadacraftModsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			EmpanadacraftModsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ESTADO_0_TOMATE = register("estado_0_tomate", EmpanadacraftModsModBlocks.ESTADO_0_TOMATE,
			Estado0TomateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ESTADO_1_TOMATE = register("estado_1_tomate", EmpanadacraftModsModBlocks.ESTADO_1_TOMATE,
			Estado1TomateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ESTADO_2_TOMATE = register("estado_2_tomate", EmpanadacraftModsModBlocks.ESTADO_2_TOMATE,
			Estado2TomateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ESTADO_3_TOMATE = register("estado_3_tomate", EmpanadacraftModsModBlocks.ESTADO_3_TOMATE,
			Estado3TomateBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}

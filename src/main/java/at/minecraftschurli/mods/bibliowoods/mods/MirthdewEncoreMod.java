/*
package at.minecraftschurli.mods.bibliowoods.mods;

import at.minecraftschurli.mods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import at.minecraftschurli.mods.bibliowoods.AbstractMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;

import java.util.function.Supplier;

public class MirthdewEncoreMod extends AbstractMod {
	public MirthdewEncoreMod(String modId, IEventBus bus) {
		super(modId, bus);
	}

	@Override
	protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
		Supplier<Block> clinkeraPlanks = () -> BuiltInRegistries.BLOCK.get(Identifier.fromNamespaceAndPath(modId, "clinkera_planks"));
		Supplier<Block> clinkeraSlab =   () -> BuiltInRegistries.BLOCK.get(Identifier.fromNamespaceAndPath(modId, "clinkera_slab"));
		Supplier<Block> clinkeraStairs = () -> BuiltInRegistries.BLOCK.get(Identifier.fromNamespaceAndPath(modId, "clinkera_stairs"));
		woodType(event, "clinkera", clinkeraPlanks, clinkeraSlab, clinkeraStairs);
		Supplier<Block> decidrheumPlanks = () -> BuiltInRegistries.BLOCK.get(Identifier.fromNamespaceAndPath(modId, "decidrheum_planks"));
		Supplier<Block> decidrheumSlab =   () -> BuiltInRegistries.BLOCK.get(Identifier.fromNamespaceAndPath(modId, "decidrheum_slab"));
		Supplier<Block> decidrheumStairs = () -> BuiltInRegistries.BLOCK.get(Identifier.fromNamespaceAndPath(modId, "decidrheum_stairs"));
		woodType(event, "decidrheum", decidrheumPlanks, decidrheumSlab, decidrheumStairs);
	}
}
*/

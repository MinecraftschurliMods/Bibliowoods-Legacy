/*
package at.minecraftschurli.mods.bibliowoods.mods;

import at.minecraftschurli.mods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import at.minecraftschurli.mods.bibliowoods.AbstractMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;

import java.util.function.Supplier;

public class IntegratedDynamicsMod extends AbstractMod {
    public IntegratedDynamicsMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        Supplier<Block> planks = () -> BuiltInRegistries.BLOCK.getValue(Identifier.fromNamespaceAndPath(modId, "menril_planks"));
        Supplier<Block> slab   = () -> BuiltInRegistries.BLOCK.getValue(Identifier.fromNamespaceAndPath(modId, "menril_slab"));
        Supplier<Block> stairs = () -> BuiltInRegistries.BLOCK.getValue(Identifier.fromNamespaceAndPath(modId, "menril_stairs"));
        woodType(event, "menril", planks, slab, stairs);
    }
}
*/

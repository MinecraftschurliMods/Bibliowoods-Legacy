/*
package at.minecraftschurli.mods.bibliowoods.mods;

import at.minecraftschurli.mods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import at.minecraftschurli.mods.bibliowoods.AbstractMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;

import java.util.function.Supplier;

public class GregTechMod extends AbstractMod {
    public GregTechMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        Supplier<Block> rubberPlanks = () -> BuiltInRegistries.BLOCK.get(Identifier.fromNamespaceAndPath(modId, "rubber_planks"));
        Supplier<Block> rubberSlab =   () -> BuiltInRegistries.BLOCK.get(Identifier.fromNamespaceAndPath(modId, "rubber_slab"));
        Supplier<Block> rubberStairs = () -> BuiltInRegistries.BLOCK.get(Identifier.fromNamespaceAndPath(modId, "rubber_stairs"));
        woodType(event, "rubber", rubberPlanks, rubberSlab, rubberStairs);
        Supplier<Block> treatedWoodPlanks = () -> BuiltInRegistries.BLOCK.get(Identifier.fromNamespaceAndPath(modId, "treated_wood_planks"));
        Supplier<Block> treatedWoodSlab =   () -> BuiltInRegistries.BLOCK.get(Identifier.fromNamespaceAndPath(modId, "treated_wood_slab"));
        Supplier<Block> treatedWoodStairs = () -> BuiltInRegistries.BLOCK.get(Identifier.fromNamespaceAndPath(modId, "treated_wood_stairs"));
        woodType(event, "treated_wood", treatedWoodPlanks, treatedWoodSlab, treatedWoodStairs);
    }
}
*/

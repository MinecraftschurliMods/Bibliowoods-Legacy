/*
package at.minecraftschurli.mods.bibliowoods.mods;

import at.minecraftschurli.mods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import at.minecraftschurli.mods.bibliowoods.AbstractMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;

import java.util.function.Supplier;

public class IntegratedDynamicsMod extends AbstractMod {
    public IntegratedDynamicsMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        Supplier<Block> menrilPlanks = () -> BuiltInRegistries.BLOCK.get(Identifier.fromNamespaceAndPath(modId, "menril_planks"));
        Supplier<Block> menrilSlab =   () -> BuiltInRegistries.BLOCK.get(Identifier.fromNamespaceAndPath(modId, "menril_slab"));
        Supplier<Block> menrilStairs = () -> BuiltInRegistries.BLOCK.get(Identifier.fromNamespaceAndPath(modId, "menril_stairs"));
        woodType(event, "menril", WoodType.OAK, menrilPlanks, menrilSlab, menrilStairs);
    }
}
*/

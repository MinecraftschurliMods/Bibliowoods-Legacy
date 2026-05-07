package at.minecraftschurli.mods.bibliowoods.mods;

import at.minecraftschurli.mods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import at.minecraftschurli.mods.bibliowoods.AbstractMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;

import java.util.function.Supplier;

public class EvilCraftMod extends AbstractMod {
    public EvilCraftMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        Supplier<Block> planks = () -> BuiltInRegistries.BLOCK.getValue(Identifier.fromNamespaceAndPath(modId, "undead_planks"));
        Supplier<Block> slab   = () -> BuiltInRegistries.BLOCK.getValue(Identifier.fromNamespaceAndPath(modId, "undead_slab"));
        Supplier<Block> stairs = () -> BuiltInRegistries.BLOCK.getValue(Identifier.fromNamespaceAndPath(modId, "undead_stairs"));
        woodType(event, "undead", planks, slab, stairs);
    }
}

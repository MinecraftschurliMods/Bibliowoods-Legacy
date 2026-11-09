package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;

import java.util.List;
import java.util.function.Supplier;

/**
 * ArborFirmaCraft's woods, a TerraFirmaCraft addon. As with TFC, the blocks are looked up by id, so any
 * AFC for 1.21.1 works: the ids and textures below are the same from 2.0.0 to 2.1.3.
 */
public class ArborFirmaCraftMod extends AbstractMod {
    private static final List<String> WOODS = List.of(
            "araucaria", "baobab", "beech", "cypress", "eucalyptus", "fig", "ginkgo", "hevea", "ipe", "ironwood",
            "mahoe", "mahogany", "teak", "tualang");

    public ArborFirmaCraftMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        for (String wood : WOODS) {
            woodType(event, wood, "block/wood/planks/" + wood, block("wood/planks/" + wood), block("wood/planks/" + wood + "_slab"), block("wood/planks/" + wood + "_stairs"));
        }
    }

    private Supplier<Block> block(String path) {
        return () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(modId, path));
    }
}

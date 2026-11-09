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
 * TerraFirmaCraft's woods. The blocks are looked up by id rather than through TFC's classes, so any
 * TFC for 1.21.1 works: the ids and textures below are the same from 4.0.0-beta to 4.2.15.
 */
public class TerraFirmaCraftMod extends AbstractMod {
    private static final List<String> WOODS = List.of(
            "acacia", "ash", "aspen", "birch", "blackwood", "chestnut", "douglas_fir", "hickory", "kapok", "mangrove",
            "maple", "oak", "palm", "pine", "rosewood", "sequoia", "spruce", "sycamore", "white_cedar", "willow");

    public TerraFirmaCraftMod(String modId, IEventBus bus) {
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

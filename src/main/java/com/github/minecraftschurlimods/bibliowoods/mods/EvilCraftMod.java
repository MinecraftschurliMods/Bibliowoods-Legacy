package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.BlockFamily;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.util.Lazy;
import org.cyclops.evilcraft.RegistryEntries;

public class EvilCraftMod extends AbstractMod {
    private static final Lazy<BlockFamily> UNDEAD_BLOCK_FAMILY = Lazy.of(() -> new BlockFamily.Builder(RegistryEntries.BLOCK_UNDEAD_PLANK.get())
        .slab(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("evilcraft", "undead_slab")))
        .stairs(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("evilcraft", "undead_stairs")))
        .getFamily());

    public EvilCraftMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "undead", RegistryEntries.BLOCK_UNDEAD_PLANK, UNDEAD_BLOCK_FAMILY);
    }
}

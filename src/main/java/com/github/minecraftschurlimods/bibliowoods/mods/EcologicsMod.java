package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import net.neoforged.bus.api.IEventBus;
import samebutdifferent.ecologics.block.properties.ModWoodType;
import samebutdifferent.ecologics.registry.ModBlocks;

public class EcologicsMod extends AbstractMod {
    public EcologicsMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "coconut", ModWoodType.COCONUT, () -> ModBlocks.COCONUT_PLANKS, () -> ModBlocks.COCONUT_SLAB, () -> ModBlocks.COCONUT_STAIRS);
        woodType(event, "walnut",  ModWoodType.WALNUT,  () -> ModBlocks.WALNUT_PLANKS,  () -> ModBlocks.WALNUT_SLAB,  () -> ModBlocks.WALNUT_STAIRS);
        woodType(event, "azalea",  ModWoodType.AZALEA,  () -> ModBlocks.AZALEA_PLANKS,  () -> ModBlocks.AZALEA_SLAB,  () -> ModBlocks.AZALEA_STAIRS);
    }
}

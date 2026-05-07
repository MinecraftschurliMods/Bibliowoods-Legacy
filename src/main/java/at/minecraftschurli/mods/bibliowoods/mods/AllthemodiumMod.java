package at.minecraftschurli.mods.bibliowoods.mods;

import at.minecraftschurli.mods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import at.minecraftschurli.mods.bibliowoods.AbstractMod;
import net.allthemods.allthemodium.core.registry.ATMBlocks;
import net.neoforged.bus.api.IEventBus;

public class AllthemodiumMod extends AbstractMod {
    public AllthemodiumMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "ancient", ATMBlocks.ANCIENT_PLANKS, ATMBlocks.ANCIENT_SLAB, ATMBlocks.ANCIENT_STAIRS);
        woodType(event, "soul",    ATMBlocks.SOUL_PLANKS,    ATMBlocks.SOUL_SLAB,    ATMBlocks.SOUL_STAIRS);
        woodType(event, "demonic", ATMBlocks.DEMONIC_PLANKS, ATMBlocks.DEMONIC_SLAB, ATMBlocks.DEMONIC_STAIRS);
    }
}

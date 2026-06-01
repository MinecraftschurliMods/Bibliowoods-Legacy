package at.minecraftschurli.mods.bibliowoods.mods;

import at.minecraftschurli.mods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import at.minecraftschurli.mods.bibliowoods.AbstractMod;
import net.neoforged.bus.api.IEventBus;
import net.tropicraft.core.common.block.TropicraftBlocks;
import net.tropicraft.core.common.block.TropicraftWoodTypes;

public class TropicraftMod extends AbstractMod {
	public TropicraftMod(String modId, IEventBus bus) {
		super(modId, bus);
	}

	@Override
	protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
		woodType(event, "mahogany", TropicraftWoodTypes.MAHOGANY, TropicraftBlocks.MAHOGANY_PLANKS, TropicraftBlocks.MAHOGANY_SLAB, TropicraftBlocks.MAHOGANY_STAIRS);
		woodType(event, "mangrove", TropicraftWoodTypes.MANGROVE, TropicraftBlocks.MANGROVE_PLANKS, TropicraftBlocks.MANGROVE_SLAB, TropicraftBlocks.MANGROVE_STAIRS);
		woodType(event, "palm", TropicraftWoodTypes.PALM, TropicraftBlocks.PALM_PLANKS, TropicraftBlocks.PALM_SLAB, TropicraftBlocks.PALM_STAIRS);
	}
}

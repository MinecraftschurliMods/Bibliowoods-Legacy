/*
package at.minecraftschurli.mods.bibliowoods.mods;

import at.minecraftschurli.mods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import at.minecraftschurli.mods.bibliowoods.AbstractMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.BlockFamily;
import net.minecraft.resources.Identifier;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.util.Lazy;
import org.cyclops.evilcraft.RegistryEntries;

public class EvilCraftMod extends AbstractMod {
    private static final Lazy<BlockFamily> UNDEAD_BLOCK_FAMILY = Lazy.of(() -> new BlockFamily.Builder(RegistryEntries.BLOCK_UNDEAD_PLANK.get())
        .slab(BuiltInRegistries.BLOCK.get(Identifier.fromNamespaceAndPath("evilcraft", "undead_slab")))
        .stairs(BuiltInRegistries.BLOCK.get(Identifier.fromNamespaceAndPath("evilcraft", "undead_stairs")))
        .getFamily());

    public EvilCraftMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "undead", RegistryEntries.BLOCK_UNDEAD_PLANK, UNDEAD_BLOCK_FAMILY);
    }
}
*/

package at.minecraftschurli.mods.bibliowoods;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;

import java.util.function.BiFunction;

@Mod(Bibliowoods.MOD_ID)
public final class Bibliowoods {
    public static final String MOD_ID = "bibliowoods";

    public Bibliowoods(IEventBus bus) {
        //addIfLoaded("aether",            bus, AetherMod::new);
        //addIfLoaded("allthemodium",      bus, AllthemodiumMod::new);
        //addIfLoaded("ars_nouveau",       bus, ArsNouveauMod::new);
        //addIfLoaded("butchercraft",      bus, ButchercraftMod::new);
        //addIfLoaded("cobblemon",         bus, CobblemonMod::new);
        //addIfLoaded("deep_aether",       bus, DeepAetherMod::new);
        //addIfLoaded("deeperdarker",      bus, DeeperAndDarkerMod::new);
        //addIfLoaded("eternal_starlight", bus, EternalStarlightMod::new);
        //addIfLoaded("evilcraft",         bus, ExpandedDelightMod::new);
        //addIfLoaded("expandeddelight",   bus, ExpandedDelightMod::new);
        //addIfLoaded("extradelight",      bus, ExtraDelightMod::new);
        //addIfLoaded("forbidden_arcanus", bus, ForbiddenArcanusMod::new);
        //addIfLoaded("garnished",         bus, GarnishedMod::new);
        //addIfLoaded("gtceu",             bus, GregTechMod::new);
        //addIfLoaded("hexerei",           bus, HexereiMod::new);
        //addIfLoaded("integrateddynamics",bus, IntegratedDynamicsMod::new);
        //addIfLoaded("mirthdew_encore",   bus, MirthdewEncoreMod::new);
        //addIfLoaded("mynethersdelight",  bus, MyNethersDelightMod::new);
        //addIfLoaded("occultism",         bus, OccultismMod::new);
        //addIfLoaded("roots",             bus, RootsMod::new);
        //addIfLoaded("silentgear",        bus, SilentGearMod::new);
        //addIfLoaded("thaumon",           bus, ThaumonMod::new);
        //addIfLoaded("tropicraft",        bus, TropicraftMod::new);
        //addIfLoaded("twilightforest",    bus, TwilightForestMod::new);
        //addIfLoaded("undergarden",       bus, UndergardenMod::new);
        //addIfLoaded("vampirism",         bus, VampirismMod::new);
        //addIfLoaded("werewolves",        bus, WerewolvesMod::new);
        //addIfLoaded("witchery",          bus, WitcheryMod::new);
        //addIfLoaded("wwizardry",         bus, WWizardryMod::new);
    }

    private void addIfLoaded(String modId, IEventBus bus, BiFunction<String, IEventBus, AbstractMod> modBuilder) {
        if (ModList.get().isLoaded(modId)) {
            modBuilder.apply(modId, bus);
        }
    }
}

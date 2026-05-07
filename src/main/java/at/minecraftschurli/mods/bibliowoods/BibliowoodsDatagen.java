package at.minecraftschurli.mods.bibliowoods;

import at.minecraftschurli.mods.bibliocraft.api.BibliocraftApi;
import at.minecraftschurli.mods.bibliocraft.api.datagen.BibliocraftDatagenHelper;
import at.minecraftschurli.mods.bibliocraft.api.datagen.NonClearingBlockTagsProvider;
import at.minecraftschurli.mods.bibliocraft.api.datagen.NonClearingItemTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Bibliowoods.MOD_ID)
public final class BibliowoodsDatagen {
    @SubscribeEvent
    private static void gatherData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        LanguageProvider language = generator.addProvider(true, new LanguageProvider(generator.getPackOutput(), Bibliowoods.MOD_ID, "en_us") {
            @Override
            protected void addTranslations() {}
        });
        NonClearingBlockTagsProvider blockTags = generator.addProvider(true, new NonClearingBlockTagsProvider(output, lookupProvider, Bibliowoods.MOD_ID) {
            @Override
            protected void addTags(HolderLookup.Provider provider) {}
        });
        NonClearingItemTagsProvider itemTags = generator.addProvider(true, new NonClearingItemTagsProvider(output, lookupProvider, Bibliowoods.MOD_ID) {
            @Override
            protected void addTags(HolderLookup.Provider provider) {}
        });
        BibliocraftDatagenHelper helper = BibliocraftApi.getDatagenHelper();
        //helper.addWoodTypesToGenerateByModid("aether");
        helper.addWoodTypesToGenerateByModid("allthemodium");
        helper.addWoodTypesToGenerateByModid("arsmagicalegacy");
        //helper.addWoodTypesToGenerateByModid("ars_nouveau");
        //helper.addWoodTypesToGenerateByModid("butchercraft");
        //helper.addWoodTypesToGenerateByModid("cobblemon");
        //helper.addWoodTypesToGenerateByModid("deep_aether");
        //helper.addWoodTypesToGenerateByModid("deeperdarker");
        //helper.addWoodTypesToGenerateByModid("eternal_starlight");
        helper.addWoodTypesToGenerateByModid("evilcraft");
        //helper.addWoodTypesToGenerateByModid("expandeddelight");
        //helper.addWoodTypesToGenerateByModid("extradelight");
        helper.addWoodTypesToGenerateByModid("forbidden_arcanus");
        //helper.addWoodTypesToGenerateByModid("garnished");
        //helper.addWoodTypesToGenerateByModid("gtceu");
        //helper.addWoodTypesToGenerateByModid("hexerei");
        helper.addWoodTypesToGenerateByModid("integrateddynamics");
        //helper.addWoodTypesToGenerateByModid("mirthdew_encore");
        //helper.addWoodTypesToGenerateByModid("mynethersdelight");
        helper.addWoodTypesToGenerateByModid("occultism");
        //helper.addWoodTypesToGenerateByModid("roots");
        //helper.addWoodTypesToGenerateByModid("silentgear");
        //helper.addWoodTypesToGenerateByModid("thaumon");
        //helper.addWoodTypesToGenerateByModid("tropicraft");
        //helper.addWoodTypesToGenerateByModid("twilightforest");
        //helper.addWoodTypesToGenerateByModid("undergarden");
        //helper.addWoodTypesToGenerateByModid("vampirism");
        //helper.addWoodTypesToGenerateByModid("werewolves");
        //helper.addWoodTypesToGenerateByModid("witchery");
        //helper.addWoodTypesToGenerateByModid("wwizardry");
        helper.generateAll(Bibliowoods.MOD_ID, lookupProvider, generator.getVanillaPack(true), generator.getVanillaPack(true), language, blockTags::tag, itemTags::tag);
    }
}

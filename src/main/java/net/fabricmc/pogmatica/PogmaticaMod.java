package net.fabricmc.pogmatica;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.pogmatica.block.ModBlocks;
import net.fabricmc.pogmatica.item.ModGroups;
import net.fabricmc.pogmatica.item.ModItems;
import net.fabricmc.pogmatica.world.feature.ModConfiguredFeatures;
import net.fabricmc.pogmatica.world.feature.ModPlacedFeatures;
import net.fabricmc.pogmatica.world.gen.ModBiomeFeatures;

public class PogmaticaMod implements ModInitializer {

    @Override
    public void onInitialize() {
        ModGroups.register();
        ModBlocks.register();
        ModItems.register();
        ModConfiguredFeatures.register();
        ModPlacedFeatures.register();
        ModBiomeFeatures.add();
    }
}
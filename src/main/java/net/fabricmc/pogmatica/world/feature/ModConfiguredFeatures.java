package net.fabricmc.pogmatica.world.feature;

import net.fabricmc.pogmatica.block.ModBlocks;
import net.fabricmc.pogmatica.common.Constants;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModConfiguredFeatures {

    public static ConfiguredFeature<?, ?> OVERWORLD_POGANITE_ORE_CONFIGURED_FEATURE;

    public static void register() {
        OVERWORLD_POGANITE_ORE_CONFIGURED_FEATURE = registerFeature(Feature.ORE.configure(
                new OreFeatureConfig(OreConfiguredFeatures.BASE_STONE_OVERWORLD, ModBlocks.POGANITE_ORE.getDefaultState(), 8)));
    }

    private static ConfiguredFeature<?, ?> registerFeature(ConfiguredFeature<?, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(Constants.MOD_ID, "overworld_poganite_ore"), configuredFeature);
    }
}

package net.fabricmc.pogmatica.world.feature;

import net.fabricmc.pogmatica.common.Constants;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ModPlacedFeatures {

    public static PlacedFeature OVERWORLD_POGANITE_ORE_FEATURE;

    public static void register() {
        System.out.println("Registering placed features...");

        OVERWORLD_POGANITE_ORE_FEATURE = register(ModConfiguredFeatures.OVERWORLD_POGANITE_ORE_CONFIGURED_FEATURE.withPlacement(
                CountPlacementModifier.of(20),
                SquarePlacementModifier.of(),
                HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))), "overworld_wool_ore");
    }

    private static PlacedFeature register(PlacedFeature placedFeature, String name) {
        return Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(Constants.MOD_ID, name), placedFeature);
    }
}

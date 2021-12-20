package net.fabricmc.pogmatica.fluid;

import net.fabricmc.pogmatica.common.Constants;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModFluids {
    public static FlowableFluid STILL_POGANOL;
    public static FlowableFluid FLOWING_POGANOL;

    public static void register() {
        STILL_POGANOL = registerFluid("poganol", new Poganol.Still());
        FLOWING_POGANOL = registerFluid("flowing_poganol", new Poganol.Flowing());
    }

    private static FlowableFluid registerFluid(String name, Fluid fluid) {
        return (FlowableFluid) Registry.register(Registry.FLUID, new Identifier(Constants.MOD_ID, name), fluid);
    }
}

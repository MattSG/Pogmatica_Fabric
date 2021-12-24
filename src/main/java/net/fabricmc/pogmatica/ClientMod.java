package net.fabricmc.pogmatica;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.fabricmc.pogmatica.block.ModBlocks;
import net.fabricmc.pogmatica.fluid.ModFluids;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;

public class ClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.ASPOGARUS_CROP_BLOCK);

        // Fluid Rendering

        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
            registry.register(new Identifier("pogmatica:block/poganol_still"));
            registry.register(new Identifier("pogmatica:block/poganol_flow"));
        });

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_POGANOL, ModFluids.FLOWING_POGANOL, new SimpleFluidRenderHandler(
                new Identifier("pogmatica:block/poganol_still"),
                new Identifier("pogmatica:block/poganol_flow"),
                0x9B00C9
        ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_POGANOL, ModFluids.FLOWING_POGANOL);
    }
}

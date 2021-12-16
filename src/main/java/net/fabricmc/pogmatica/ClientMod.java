package net.fabricmc.pogmatica;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.pogmatica.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class ClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.ASPOGARUS_BLOCK);
    }
}

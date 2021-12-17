package net.fabricmc.pogmatica;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.pogmatica.block.ModBlocks;
import net.fabricmc.pogmatica.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class PogmaticaMod implements ModInitializer {

    public static final String MOD_ID = "pogmatica";

    public static final ItemGroup DEFAULT_GROUP = FabricItemGroupBuilder.build(new Identifier("pogmatica", "items"), () -> new ItemStack(ModItems.POGANITE_INGOT));;

    @Override
    public void onInitialize() {
        ModBlocks.register();
        ModItems.register();
    }

    public static FabricItemSettings GetDefaultSettings() {
        return new FabricItemSettings().group(PogmaticaMod.DEFAULT_GROUP);
    }
}

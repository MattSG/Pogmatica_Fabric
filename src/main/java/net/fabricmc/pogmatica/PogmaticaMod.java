package net.fabricmc.pogmatica;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.pogmatica.tools.Pagger;
import net.fabricmc.pogmatica.tools.Patchet;
import net.fabricmc.pogmatica.tools.Povel;
import net.fabricmc.pogmatica.tools.materials.PogToolMaterial;
import net.fabricmc.pogmatica.tools.PogAxe;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PogmaticaMod implements ModInitializer {

    // Default Group
    public static final ItemGroup POGMATICA_TOOLS = FabricItemGroupBuilder.build(
            new Identifier("pogmatica", "items"),
            () -> new ItemStack(PogmaticaMod.PATCHET));

    // Tools
    public static final Patchet PATCHET = new Patchet(PogToolMaterial.INSTANCE, 3.0F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS).group(POGMATICA_TOOLS));
    public static final PogAxe POGAXE = new PogAxe(PogToolMaterial.INSTANCE, 3, -3, new FabricItemSettings().group(ItemGroup.TOOLS).group(POGMATICA_TOOLS));
    public static final Povel POVEL = new Povel(PogToolMaterial.INSTANCE, 3, -3, new FabricItemSettings().group(ItemGroup.TOOLS).group(POGMATICA_TOOLS));
    public static final Pagger PAGGER = new Pagger(PogToolMaterial.INSTANCE, 3, -3, new FabricItemSettings().group(ItemGroup.TOOLS).group(POGMATICA_TOOLS));

    @Override
    public void onInitialize() {
        // Register tools
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "patchet"), PATCHET);
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "pogaxe"), POGAXE);
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "povel"), POVEL);
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "pagger"), PAGGER);
    }
}

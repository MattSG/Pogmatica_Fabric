package net.fabricmc.pogmatica.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModGroups {
    public static ItemGroup DEFAULT;

    public static void register() {
        System.out.println("Registering groups...");

        DEFAULT = FabricItemGroupBuilder.build(new Identifier("pogmatica", "items"), () -> new ItemStack(ModItems.POGANITE_INGOT));
    }
}

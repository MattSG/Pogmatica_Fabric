package net.fabricmc.pogmatica;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class pogmaticaMod implements ModInitializer {

	public static final ItemGroup pogmatica_GROUP = FabricItemGroupBuilder.build(
			new Identifier("pogmatica", "items"),
			() -> new ItemStack(pogmaticaMod.POGAXE));

	public static final PogAxe POGAXE = new PogAxe(new FabricItemSettings().group(ItemGroup.TOOLS).group(pogmatica_GROUP));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("pogmatica", "pogaxe"), POGAXE);
	}
}

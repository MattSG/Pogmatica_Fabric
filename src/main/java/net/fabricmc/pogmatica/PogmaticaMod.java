package net.fabricmc.pogmatica;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.pogmatica.blocks.AspogarusBlock;
import net.fabricmc.pogmatica.items.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PogmaticaMod implements ModInitializer {

    public static final String MOD_ID = "pogmatica";

    public static final ItemGroup DEFAULT_GROUP = FabricItemGroupBuilder.build(new Identifier("pogmatica", "items"), () -> new ItemStack(ModItems.PATCHET));;

    // Blocks
    public static final Block ASPOGARUS_BLOCK = new AspogarusBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final Block POGANITE_ORE = new Block(FabricBlockSettings.of(Material.METAL).strength(10.0f).requiresTool());

    // BlockItems
    public static final BlockItem POGANITE_ORE_BLOCK_ITEM = new BlockItem(PogmaticaMod.POGANITE_ORE, new FabricItemSettings().group(DEFAULT_GROUP));

    @Override
    public void onInitialize() {
        ModItems.registerModItems();

        // Register blocks
        Registry.register(Registry.BLOCK, new Identifier("pogmatica", "aspogarus_block"), ASPOGARUS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("pogmatica", "poganite_ore"), POGANITE_ORE);

        // Register BlockItems
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "poganite_ore"), POGANITE_ORE_BLOCK_ITEM);
    }
}

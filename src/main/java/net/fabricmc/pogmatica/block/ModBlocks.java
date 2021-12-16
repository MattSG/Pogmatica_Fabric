package net.fabricmc.pogmatica.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.pogmatica.PogmaticaMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.fabricmc.pogmatica.PogmaticaMod.GetDefaultSettings;

public class ModBlocks {

    public static final Block ASPOGARUS_BLOCK;
    public static final Block POGANITE_ORE;
    public static final BlockItem POGANITE_ORE_BLOCK_ITEM;

    static {
        ASPOGARUS_BLOCK = registerBlock("aspogarus_block", new AspogarusBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP)));
        POGANITE_ORE = registerBlock("poganite_ore", new PoganiteOre(FabricBlockSettings.of(Material.METAL).strength(10.0f).requiresTool()));
        POGANITE_ORE_BLOCK_ITEM = registerBlockItem("poganite_ore", new BlockItem(POGANITE_ORE, GetDefaultSettings()));
    }

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(PogmaticaMod.MOD_ID, name), block);
    }

    private static BlockItem registerBlockItem(String name, BlockItem blockItem) {
        return Registry.register(Registry.ITEM, new Identifier(PogmaticaMod.MOD_ID, name), blockItem);
    }

    public static void register() {
        System.out.println("Registering Mod Items for " + PogmaticaMod.MOD_ID);
    }
}

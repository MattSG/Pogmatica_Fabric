package net.fabricmc.pogmatica.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.pogmatica.common.Constants;
import net.fabricmc.pogmatica.common.Utils;
import net.fabricmc.pogmatica.fluid.ModFluids;
import net.minecraft.block.*;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static Block ASPOGARUS_CROP_BLOCK;
    public static Block POGANITE_ORE;
    public static BlockItem POGANITE_ORE_BLOCK_ITEM;
    public static FluidBlock POGANOL;

    public static void register() {
        System.out.println("Registering blocks...");

        ASPOGARUS_CROP_BLOCK = registerBlock("aspogarus_crop_block", new AspogarusCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP)));
        POGANITE_ORE = registerBlock("poganite_ore", new PoganiteOre(FabricBlockSettings.of(Material.METAL).strength(10.0f).requiresTool()));
        POGANITE_ORE_BLOCK_ITEM = registerBlockItem("poganite_ore", new BlockItem(POGANITE_ORE, Utils.GetDefaultSettings()));
        POGANOL = registerFluidBlock("poganol", ModFluids.STILL_POGANOL, Blocks.WATER);
    }

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Constants.MOD_ID, name), block);
    }

    private static BlockItem registerBlockItem(String name, BlockItem blockItem) {
        return Registry.register(Registry.ITEM, new Identifier(Constants.MOD_ID, name), blockItem);
    }

    private static FluidBlock registerFluidBlock(String name, FlowableFluid fluid, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Constants.MOD_ID, name), new FluidBlock(fluid, FabricBlockSettings.copy(block)){});
    }
}

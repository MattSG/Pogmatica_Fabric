package net.fabricmc.pogmatica;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.pogmatica.armor.materials.PogMailArmorMaterial;
import net.fabricmc.pogmatica.blocks.AspogarusBlock;
import net.fabricmc.pogmatica.items.*;
import net.fabricmc.pogmatica.tools.Pagger;
import net.fabricmc.pogmatica.tools.Patchet;
import net.fabricmc.pogmatica.tools.PogAxe;
import net.fabricmc.pogmatica.tools.Povel;
import net.fabricmc.pogmatica.tools.materials.PogToolMaterial;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PogmaticaMod implements ModInitializer {

        // Groups
    public static final ItemGroup POGMATICA = FabricItemGroupBuilder.build(new Identifier("pogmatica", "items"), () -> new ItemStack(PogmaticaMod.PATCHET));;

    // Tools
    public static final Item PATCHET = new Patchet(PogToolMaterial.INSTANCE, 3.0F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS).group(POGMATICA));
    public static final Item POGAXE = new PogAxe(PogToolMaterial.INSTANCE, 3, -3, new FabricItemSettings().group(ItemGroup.TOOLS).group(POGMATICA));
    public static final Item POVEL = new Povel(PogToolMaterial.INSTANCE, 3, -3, new FabricItemSettings().group(ItemGroup.TOOLS).group(POGMATICA));
    public static final Item PAGGER = new Pagger(PogToolMaterial.INSTANCE, 3, -3, new FabricItemSettings().group(ItemGroup.TOOLS).group(POGMATICA));

    // Armor
    public static final Item POGMAIL_HELMET = new ArmorItem(PogMailArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new FabricItemSettings().group(POGMATICA));
    public static final Item POGMAIL_CHESTPLATE = new ArmorItem(PogMailArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new FabricItemSettings().group(POGMATICA));
    public static final Item POGMAIL_LEGGINGS = new ArmorItem(PogMailArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new FabricItemSettings().group(POGMATICA));
    public static final Item POGMAIL_BOOTS = new ArmorItem(PogMailArmorMaterial.INSTANCE, EquipmentSlot.FEET, new FabricItemSettings().group(POGMATICA));

    // Blocks
    public static final Block ASPOGARUS_BLOCK = new AspogarusBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final Block POGANITE_ORE = new Block(FabricBlockSettings.of(Material.METAL).strength(6.0f));

    // Items
    public static final Item ASPOGARUS_SEEDS = new AliasedBlockItem(PogmaticaMod.ASPOGARUS_BLOCK, new FabricItemSettings().group(POGMATICA));
    public static final Item ASPOGARUS = new Aspogarus(new FabricItemSettings().group(POGMATICA));

    // BlockItems
    public static final BlockItem POGANITE_ORE_BLOCK_ITEM = new BlockItem(PogmaticaMod.POGANITE_ORE, new FabricItemSettings().group(POGMATICA));

    // Base crafting items
    public static final Item HANDLE = new Handle(new FabricItemSettings().group(POGMATICA));
    public static final Item HARDENED_HANDLE = new HardenedHandle(new FabricItemSettings().group(POGMATICA));
    public static final Item IMBUED_HANDLE = new ImbuedHandle(new FabricItemSettings().group(POGMATICA));
    public static final Item POGANITE_INGOT = new PoganiteIngot(new FabricItemSettings().group(POGMATICA));
    public static final Item ROD = new Rod(new FabricItemSettings().group(POGMATICA));
    public static final Item POGANITE_ROD = new PoganiteRod(new FabricItemSettings().group(POGMATICA));
    public static final Item HARDENED_POGANITE_INGOT = new HardenedPoganiteIngot(new FabricItemSettings().group(POGMATICA));
    public static final Item POGANITE_PLATE = new PoganitePlate(new FabricItemSettings().group(POGMATICA));


    @Override
    public void onInitialize() {
        // Register tools
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "patchet"), PATCHET);
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "pogaxe"), POGAXE);
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "povel"), POVEL);
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "pagger"), PAGGER);

        // Register armor
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "pogmail_helmet"), POGMAIL_HELMET);
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "pogmail_chestplate"), POGMAIL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "pogmail_leggings"), POGMAIL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "pogmail_boots"), POGMAIL_BOOTS);

        // Register blocks
        Registry.register(Registry.BLOCK, new Identifier("pogmatica", "aspogarus_block"), ASPOGARUS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("pogmatica", "poganite_ore"), POGANITE_ORE);

        // Register BlockItems
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "poganite_ore"), POGANITE_ORE_BLOCK_ITEM);

        // Register crops
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "aspogarus_seeds"), ASPOGARUS_SEEDS);
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "aspogarus"), ASPOGARUS);

        // Register items
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "handle"), HANDLE);
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "hardened_handle"), HARDENED_HANDLE);
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "imbued_handle"), IMBUED_HANDLE);
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "poganite_ingot"), POGANITE_INGOT);
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "rod"), ROD);
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "poganite_rod"), POGANITE_ROD);
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "hardened_poganite_ingot"), HARDENED_POGANITE_INGOT);
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "poganite_plate"), POGANITE_PLATE);
    }
}

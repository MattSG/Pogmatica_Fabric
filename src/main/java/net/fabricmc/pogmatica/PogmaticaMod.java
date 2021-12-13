package net.fabricmc.pogmatica;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.pogmatica.armor.materials.PogMailArmorMaterial;
import net.fabricmc.pogmatica.blocks.Aspogarus;
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
    public static final ItemGroup POGMATICA = FabricItemGroupBuilder.build(
            new Identifier("pogmatica", "items"),
            () -> new ItemStack(PogmaticaMod.PATCHET));

    // Tools
    public static final Item PATCHET = new Patchet(PogToolMaterial.INSTANCE, 3.0F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS).group(POGMATICA));
    public static final Item POGAXE = new PogAxe(PogToolMaterial.INSTANCE, 3, -3, new FabricItemSettings().group(ItemGroup.TOOLS).group(POGMATICA));
    public static final Item POVEL = new Povel(PogToolMaterial.INSTANCE, 3, -3, new FabricItemSettings().group(ItemGroup.TOOLS).group(POGMATICA));
    public static final Item PAGGER = new Pagger(PogToolMaterial.INSTANCE, 3, -3, new FabricItemSettings().group(ItemGroup.TOOLS).group(POGMATICA));

    // Armor
    public static final Item POGMAIL_HELMET = new ArmorItem(PogMailArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(POGMATICA));
    public static final Item POGMAIL_CHESTPLATE = new ArmorItem(PogMailArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(POGMATICA));
    public static final Item POGMAIL_LEGGINGS = new ArmorItem(PogMailArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(POGMATICA));
    public static final Item POGMAIL_BOOTS = new ArmorItem(PogMailArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(POGMATICA));

    // Blocks
    public static final Block ASPOGARUS = new Aspogarus(AbstractBlock.Settings.of(Material.PLANT)
            .nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

    // Items
    public static final Item ASPOGARUS_SEEDS = new AliasedBlockItem(PogmaticaMod.ASPOGARUS, new Item.Settings().group(POGMATICA));

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

        // Register items
        Registry.register(Registry.ITEM, new Identifier("pogmatica", "aspogarus_seeds"), ASPOGARUS_SEEDS);

        // Register blocks
        Registry.register(Registry.BLOCK, new Identifier("pogmatica", "aspogarus"), ASPOGARUS);
    }
}

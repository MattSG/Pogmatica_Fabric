package net.fabricmc.pogmatica.item;

import net.fabricmc.pogmatica.block.ModBlocks;
import net.fabricmc.pogmatica.common.Constants;
import net.fabricmc.pogmatica.common.Utils;
import net.fabricmc.pogmatica.material.PogMailArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static Item ASPOGARUS;
    public static Item ASPOGARUS_SEEDS;
    public static Item BUCKET_POGANOL;
    public static Item HANDLE;
    public static Item HARDENED_HANDLE;
    public static Item HARDENED_POGANITE_INGOT;
    public static Item IMBUED_HANDLE;
    public static Item PAGGER;
    public static Item PATCHET;
    public static Item POGANITE_INGOT;
    public static Item POGANITE_PLATE;
    public static Item POGANITE_ROD;
    public static Item POGAXE;
    public static Item POVEL;
    public static Item ROD;
    public static Item POGMAIL_HELMET;
    public static Item POGMAIL_CHESTPLATE;
    public static Item POGMAIL_LEGGINGS;
    public static Item POGMAIL_BOOTS;
    public static Item POGHOE;

    public static void register() {
        System.out.println("Registering items...");

        ASPOGARUS = registerItem("aspogarus", new Aspogarus(Utils.GetDefaultSettings()));
        ASPOGARUS_SEEDS = registerItem("aspogarus_seeds", new AliasedBlockItem(ModBlocks.ASPOGARUS_CROP_BLOCK, Utils.GetDefaultSettings()));
        BUCKET_POGANOL = registerItem("bucket_poganol", new BucketPoganol(Utils.GetDefaultSettings()));
        HANDLE = registerItem("handle", new Handle(Utils.GetDefaultSettings()));
        HARDENED_HANDLE = registerItem("hardened_handle", new HardenedHandle(Utils.GetDefaultSettings()));
        HARDENED_POGANITE_INGOT = registerItem("hardened_poganite_ingot", new HardenedPoganiteIngot(Utils.GetDefaultSettings()));
        IMBUED_HANDLE = registerItem("imbued_handle", new ImbuedHandle(Utils.GetDefaultSettings()));
        PAGGER = registerItem("pagger", new Pagger(Utils.GetDefaultSettings()));
        PATCHET = registerItem("patchet", new Patchet(Utils.GetDefaultSettings()));
        POGANITE_INGOT = registerItem("poganite_ingot", new PoganiteIngot(Utils.GetDefaultSettings()));
        POGANITE_PLATE = registerItem("poganite_plate", new PoganitePlate(Utils.GetDefaultSettings()));
        POGANITE_ROD = registerItem("poganite_rod", new PoganiteRod(Utils.GetDefaultSettings()));
        POGAXE = registerItem("pogaxe", new PogAxe(Utils.GetDefaultSettings()));
        POVEL = registerItem("povel", new Povel(Utils.GetDefaultSettings()));
        POGMAIL_HELMET = registerArmor("pogmail_helmet", EquipmentSlot.HEAD);
        POGMAIL_CHESTPLATE = registerArmor("pogmail_chestplate", EquipmentSlot.CHEST);
        POGMAIL_LEGGINGS = registerArmor("pogmail_leggings", EquipmentSlot.LEGS);
        POGMAIL_BOOTS = registerArmor("pogmail_boots", EquipmentSlot.FEET);
        ROD = registerItem("rod", new Item(Utils.GetDefaultSettings()));
        POGHOE = registerItem("poghoe", new Poghoe(Utils.GetDefaultSettings()));
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Constants.MOD_ID, name), item);
    }

    private static Item registerArmor(String name, EquipmentSlot slot) {
        return Registry.register(Registry.ITEM, new Identifier(Constants.MOD_ID, name), new ArmorItem(PogMailArmorMaterial.INSTANCE, slot, Utils.GetDefaultSettings()));
    }
}

package net.fabricmc.pogmatica.item;

import net.fabricmc.pogmatica.PogmaticaMod;
import net.fabricmc.pogmatica.block.ModBlocks;
import net.fabricmc.pogmatica.material.PogMailArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.fabricmc.pogmatica.PogmaticaMod.GetDefaultSettings;

public class ModItems {
    public static Item ASPOGARUS;
    public static Item ASPOGARUS_SEEDS;
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

    public static void register() {
        System.out.println("Registering Mod Items for " + PogmaticaMod.MOD_ID);

        ASPOGARUS = registerItem("aspogarus", new Aspogarus(GetDefaultSettings()));
        ASPOGARUS_SEEDS = registerItem("aspogarus_seeds", new AliasedBlockItem(ModBlocks.ASPOGARUS_CROP_BLOCK, GetDefaultSettings()));
        HANDLE = registerItem("handle", new Handle(GetDefaultSettings()));
        HARDENED_HANDLE = registerItem("hardened_handle", new HardenedHandle(GetDefaultSettings()));
        HARDENED_POGANITE_INGOT = registerItem("hardened_poganite_ingot", new HardenedPoganiteIngot(GetDefaultSettings()));
        IMBUED_HANDLE = registerItem("imbued_handle", new ImbuedHandle(GetDefaultSettings()));
        PAGGER = registerItem("pagger", new Pagger(GetDefaultSettings()));
        PATCHET = registerItem("patchet", new Patchet(GetDefaultSettings()));
        POGANITE_INGOT = registerItem("poganite_ingot", new PoganiteIngot(GetDefaultSettings()));
        POGANITE_PLATE = registerItem("poganite_plate", new PoganitePlate(GetDefaultSettings()));
        POGANITE_ROD = registerItem("poganite_rod", new PoganiteRod(GetDefaultSettings()));
        POGAXE = registerItem("pogaxe", new PogAxe(GetDefaultSettings()));
        POVEL = registerItem("povel", new Povel(GetDefaultSettings()));
        POGMAIL_HELMET = registerArmor("pogmail_helmet", EquipmentSlot.HEAD);
        POGMAIL_CHESTPLATE = registerArmor("pogmail_chestplate", EquipmentSlot.CHEST);
        POGMAIL_LEGGINGS = registerArmor("pogmail_leggings", EquipmentSlot.LEGS);
        POGMAIL_BOOTS = registerArmor("pogmail_boots", EquipmentSlot.FEET);
        ROD = registerItem("rod", new Item(GetDefaultSettings()));
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PogmaticaMod.MOD_ID, name), item);
    }

    private static Item registerArmor(String name, EquipmentSlot slot) {
        return Registry.register(Registry.ITEM, new Identifier(PogmaticaMod.MOD_ID, name), new ArmorItem(PogMailArmorMaterial.INSTANCE, slot, GetDefaultSettings()));
    }
}

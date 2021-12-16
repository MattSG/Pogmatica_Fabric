package net.fabricmc.pogmatica.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.pogmatica.PogmaticaMod;
import net.fabricmc.pogmatica.material.PogMailArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ASPOGARUS;
    public static final Item ASPOGARUS_SEEDS;
    public static final Item HANDLE;
    public static final Item HARDENED_HANDLE;
    public static final Item HARDENED_POGANITE_INGOT;
    public static final Item IMBUED_HANDLE;
    public static final Item PAGGER;
    public static final Item PATCHET;
    public static final Item POGANITE_INGOT;
    public static final Item POGANITE_PLATE;
    public static final Item POGANITE_ROD;
    public static final Item POGAXE;
    public static final Item POVEL;
    public static final Item ROD;
    public static final Item POGMAIL_HELMET;
    public static final Item POGMAIL_CHESTPLATE;
    public static final Item POGMAIL_LEGGINGS;
    public static final Item POGMAIL_BOOTS;

    static {
        ASPOGARUS = registerItem("aspogarus", new Aspogarus(GetDefaultSettings()));
        ASPOGARUS_SEEDS = registerItem("aspogarus_seeds", new AspogarusSeeds(GetDefaultSettings()));
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

    private static FabricItemSettings GetDefaultSettings() {
        return new FabricItemSettings().group(PogmaticaMod.DEFAULT_GROUP);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + PogmaticaMod.MOD_ID);
    }
}
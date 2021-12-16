package net.fabricmc.pogmatica.util;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.fabricmc.pogmatica.PogmaticaMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final Tag<Block> POGANITE_ORE = createTag("poganite_ore");

        private static Tag<Block> createTag(String name) {
            return TagFactory.BLOCK.create(new Identifier(PogmaticaMod.MOD_ID, name));
        }

        private static Tag<Item> createCommonTag(String name) {
            return TagFactory.ITEM.create(new Identifier("c", name));
        }
    }
}

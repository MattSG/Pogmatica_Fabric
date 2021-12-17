package net.fabricmc.pogmatica.tag;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.fabricmc.pogmatica.common.Constants;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ModTags {
    public static final Tag<Block> POGANITE_ORE = createTag("poganite_ore");

    private static Tag<Block> createTag(String name) {
        return TagFactory.BLOCK.create(new Identifier(Constants.MOD_ID, name));
    }
}

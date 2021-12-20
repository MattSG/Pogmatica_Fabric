package net.fabricmc.pogmatica.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.pogmatica.fluid.ModFluids;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Items;

public class BucketPoganol extends BucketItem {
    public BucketPoganol(FabricItemSettings settings) {
        super(ModFluids.STILL_POGANOL, settings.recipeRemainder(Items.BUCKET).maxCount(1));
    }
}

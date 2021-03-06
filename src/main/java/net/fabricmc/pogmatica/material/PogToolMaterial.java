package net.fabricmc.pogmatica.material;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class PogToolMaterial implements ToolMaterial {

    public static final PogToolMaterial INSTANCE = new PogToolMaterial();

    @Override
    public int getDurability() {
        return 10000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 100.0F;
    }

    @Override
    public float getAttackDamage() {
        return 5.0F;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}

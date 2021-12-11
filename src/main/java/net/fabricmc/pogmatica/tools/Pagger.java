package net.fabricmc.pogmatica.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.pogmatica.tools.materials.PogToolMaterial;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class Pagger extends SwordItem {
    public Pagger(PogToolMaterial instance, int attackSpeed, int additionalAttackDamage, FabricItemSettings group) {
        super(instance, attackSpeed, additionalAttackDamage, group);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.pogmatica.pagger.tooltip").formatted(Formatting.LIGHT_PURPLE));
    }
}

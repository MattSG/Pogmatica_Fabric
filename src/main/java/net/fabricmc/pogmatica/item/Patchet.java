package net.fabricmc.pogmatica.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.pogmatica.material.PogToolMaterial;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class Patchet extends AxeItem {
    public Patchet(FabricItemSettings group) {
        super(PogToolMaterial.INSTANCE, 1.0f, 1.0f, group);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.pogmatica.patchet.tooltip").formatted(Formatting.LIGHT_PURPLE));
    }
}

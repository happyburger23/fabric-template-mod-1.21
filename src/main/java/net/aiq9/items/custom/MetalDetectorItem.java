package net.aiq9.items.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class MetalDetectorItem extends Item {
    public MetalDetectorItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        Text.literal("Detects every default Overworld ore!").formatted(Formatting.GRAY);
        Text.literal("64 Uses").formatted(Formatting.GRAY);
        super.appendTooltip(stack, context, tooltip, type);
    }
}

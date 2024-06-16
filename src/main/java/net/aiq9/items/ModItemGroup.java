package net.aiq9.items;

import net.aiq9.TemplateMod121;
import net.aiq9.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TEST_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TemplateMod121.MOD_ID, "test_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.template-mod-121"))
                    .icon(() -> new ItemStack(ModBlocks.TEST_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.TEST_BLOCK);
                        entries.add(ModBlocks.RED_MOSAIC_BLOCK);
                        entries.add(ModBlocks.BLUE_MOSAIC_BLOCK);

                        entries.add(ModItems.TEST_ITEM);

                    }).build());

    public static void registerItemGroup() {
        TemplateMod121.LOGGER.info("Registering Mod ItemGroup for " + TemplateMod121.MOD_ID);
    }
}
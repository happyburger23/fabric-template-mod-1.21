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
                        entries.add(ModBlocks.COBBLED_SANDSTONE);
                        entries.add(ModBlocks.CLOUD_STONE);
                        entries.add(ModBlocks.CLOUD_STONE_BRICKS);
                        entries.add(ModBlocks.WOODEN_CASEMENT);
                        entries.add(ModBlocks.WOODEN_CASEMENT_PANE);
                        entries.add(ModBlocks.TEST_FALLING_BLOCK);
                        entries.add(ModBlocks.ROTTEN_FLESH_BLOCK);

                        entries.add(ModBlocks.ADOBE_BRICK_BLOCK);
                        entries.add(ModBlocks.REFRACTORY_BRICK_BLOCK);
                        entries.add(ModBlocks.STURDY_BRICK_BLOCK);

                        entries.add(ModBlocks.CARDBOARD_BOX);

                        entries.add(ModBlocks.NOTE_BLOCK_RAIL);

                        entries.add(ModItems.TEST_ITEM);
                        entries.add(ModItems.TUMERIC);
                        entries.add(ModItems.TUMERIC_SEEDS);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.TOMATO_SEEDS);

                        entries.add(ModItems.ADOBE_BALL);
                        entries.add(ModItems.UNFIRED_ADOBE_BRICK);
                        entries.add(ModItems.FIRED_ADOBE_BRICK);

                        entries.add(ModItems.REFRACTORY_CLAY_BALL);
                        entries.add(ModItems.REFRACTORY_BRICK);

                        entries.add(ModItems.STURDY_CLAY_BALL);
                        entries.add(ModItems.STURDY_BRICK);

                    }).build());

    public static void registerItemGroup() {
        TemplateMod121.LOGGER.info("Registering Mod ItemGroup for " + TemplateMod121.MOD_ID);
    }
}

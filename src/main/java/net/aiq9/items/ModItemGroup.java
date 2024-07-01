package net.aiq9.items;

import net.aiq9.TemplateMod121;
import net.aiq9.blocks.ModBlocks;
import net.aiq9.blocks.ModPlantBlocks;
import net.aiq9.blocks.ModStairBlocks;
import net.aiq9.blocks.ModWallBlocks;
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

                        entries.add(ModBlocks.CARDBOARD_BOX);
                        entries.add(ModBlocks.ROTTEN_FLESH_BLOCK);
                        entries.add(ModBlocks.TEST_FALLING_BLOCK);
                        entries.add(ModBlocks.NOTE_BLOCK_RAIL);
                        entries.add(ModBlocks.SOUND_BLOCK);

                        entries.add(ModBlocks.COBBLED_SANDSTONE);
                        entries.add(ModWallBlocks.COBBLED_SANDSTONE_WALL);
                        entries.add(ModStairBlocks.COBBLED_SANDSTONE_STAIRS);

                        entries.add(ModBlocks.CLOUD_STONE);
                        entries.add(ModWallBlocks.CLOUD_STONE_WALL);
                        entries.add(ModStairBlocks.CLOUD_STONE_STAIRS);

                        entries.add(ModBlocks.CLOUD_STONE_BRICKS);
                        entries.add(ModWallBlocks.CLOUD_STONE_BRICKS_WALL);
                        entries.add(ModStairBlocks.CLOUD_STONE_BRICKS_STAIRS);

                        entries.add(ModBlocks.ADOBE_BRICK_BLOCK);
                        entries.add(ModWallBlocks.ADOBE_BRICKS_WALL);

                        entries.add(ModBlocks.REFRACTORY_BRICK_BLOCK);
                        entries.add(ModWallBlocks.REFRACTORY_BRICKS_WALL);

                        entries.add(ModBlocks.STURDY_BRICK_BLOCK);
                        entries.add(ModWallBlocks.STURDY_BRICKS_WALL);

                        entries.add(ModBlocks.LEAD_ORE);
                        entries.add(ModBlocks.DEEPSLATE_LEAD_ORE);
                        entries.add(ModBlocks.RAW_LEAD_BLOCK);
                        entries.add(ModBlocks.LEAD_BLOCK);

                        //add ruby block here
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.END_RUBY_ORE);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_BLOCK);

                        entries.add(ModBlocks.WOODEN_CASEMENT);
                        entries.add(ModBlocks.WOODEN_CASEMENT_PANE);

                        entries.add(ModBlocks.SLADE_BLOCK);
                        entries.add(ModBlocks.SLADE_BRICKS);
                        entries.add(ModBlocks.CHISELED_SLADE);

                        entries.add(ModBlocks.ALABASTER_BLOCK);
                        entries.add(ModBlocks.ALABASTER_BRICKS_BLOCK);
                        entries.add(ModBlocks.CHISELED_ALABASTER_BLOCK);

                        entries.add(ModPlantBlocks.THISTLE_BLOCK);
                        entries.add(ModPlantBlocks.MONKSHOOD_BLOCK);

                        //------items--------

                        entries.add(ModItems.RAW_LEAD);
                        entries.add(ModItems.LEAD_INGOT);

                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.RUBY);

                        entries.add(ModItems.TOMATO_SEEDS);
                        entries.add(ModItems.TOMATO);

                        entries.add(ModItems.TUMERIC_SEEDS);
                        entries.add(ModItems.TUMERIC);

                        entries.add(ModItems.COTTON_SEEDS);
                        entries.add(ModItems.COTTON);

                        entries.add(ModItems.RICE_SEEDS);
                        entries.add(ModItems.RICE);

                        entries.add(ModItems.ADOBE_BALL);
                        entries.add(ModItems.UNFIRED_ADOBE_BRICK);

                        entries.add(ModItems.REFRACTORY_CLAY_BALL);
                        entries.add(ModItems.REFRACTORY_BRICK);

                        entries.add(ModItems.STURDY_CLAY_BALL);
                        entries.add(ModItems.STURDY_BRICK);

                        entries.add(ModItems.OIL_BUCKET);
                        entries.add(ModItems.FIRE_STONE);
                        entries.add(ModItems.METAL_DETECTOR);
                        //entries.add(ModItems.TEST_BOOK);
                    }).build());

    public static void registerItemGroup() {
        TemplateMod121.LOGGER.info("Registering Mod ItemGroup for " + TemplateMod121.MOD_ID);
    }
}

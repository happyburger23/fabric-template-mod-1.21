package net.aiq9.blocks;

import net.aiq9.TemplateMod121;
import net.aiq9.blocks.custom.NoteBlockRailBlock;
import net.aiq9.blocks.custom.TomatoCropBlock;
import net.aiq9.blocks.custom.TumericCropBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block TEST_BLOCK = registerBlock("test_block",
            new Block(AbstractBlock.Settings.copy(Blocks.LADDER)));
    public static final Item TEST_BLOCK_ITEM = createBlockItem("test_block", TEST_BLOCK);

    public static final Block RED_MOSAIC_BLOCK = registerBlock("red_mosaic_block",
            new Block(AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS)));
    public static final Item MOSAIC_BLOCK_ITEM = createBlockItem("red_mosaic_block", RED_MOSAIC_BLOCK);

    public static final Block BLUE_MOSAIC_BLOCK = registerBlock("blue_mosaic_block",
            new Block(AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS)));
    public static final Item BLUE_MOSAIC_BLOCK_ITEM = createBlockItem("blue_mosaic_block", BLUE_MOSAIC_BLOCK);

    public static final Block COBBLED_SANDSTONE = registerBlock("cobbled_sandstone",
            new Block(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Item COBBLED_SANDSTONE_ITEM = createBlockItem("cobbled_sandstone", COBBLED_SANDSTONE);

    public static final Block CLOUD_STONE = registerBlock("cloud_stone",
            new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
    public static final Item CLOUD_STONE_ITEM = createBlockItem("cloud_stone", CLOUD_STONE);

    public static final Block CLOUD_STONE_BRICKS = registerBlock("cloud_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
    public static final Item CLOUD_STONE_BRICKS_ITEM = createBlockItem("cloud_stone_bricks", CLOUD_STONE_BRICKS);

    public static final Block TUMERIC_CROP = registerBlock("tumeric_crop",
            new TumericCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));
    public static final Item TUMERIC_CROP_ITEM = createBlockItem("tumeric_crop", TUMERIC_CROP);

    public static final Block TOMATO_CROP = registerBlock("tomato_crop",
            new TomatoCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));
    public static final Item TOMATO_CROP_ITEM = createBlockItem("tomato_crop", TOMATO_CROP);

    public static final Block NOTE_BLOCK_RAIL = registerBlock("note_block_rail",
            new NoteBlockRailBlock(AbstractBlock.Settings.copy(Blocks.RAIL)));
    public static final Item NOTE_BLOCK_RAIL_ITEM = createBlockItem("note_block_rail", NOTE_BLOCK_RAIL);

    ///---------------

    private static <T extends Block> T registerBlock(String name, T block) {
        return Registry.register(Registries.BLOCK, Identifier.of(TemplateMod121.MOD_ID, name), block);
    }

    private static Item createBlockItem(String name, Block block, Item.Settings properties) {
        return Registry.register(Registries.ITEM, Identifier.of(TemplateMod121.MOD_ID, name),
                new BlockItem(block, properties));
    }

    private static Item createBlockItem(String name, Block block) {
        return createBlockItem(name, block, new Item.Settings());
    }

    //registers blocks
    public static void registerModBlocks() {
        TemplateMod121.LOGGER.info("Registering Mod Blocks for " + TemplateMod121.MOD_ID);
    }
}

package net.aiq9.blocks;

import net.aiq9.TemplateMod121;
import net.aiq9.blocks.custom.*;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

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

    public static final Block NOTE_BLOCK_RAIL = registerBlock("note_block_rail",
            new NoteBlockRailBlock(AbstractBlock.Settings.copy(Blocks.RAIL)));
    public static final Item NOTE_BLOCK_RAIL_ITEM = createBlockItem("note_block_rail", NOTE_BLOCK_RAIL);

    public static final Block WOODEN_CASEMENT = registerBlock("wooden_casement",
            new TransparentBlock(AbstractBlock.Settings.copy(Blocks.LADDER)));
    public static final Item WOODEN_CASEMENT_ITEM = createBlockItem("wooden_casement", WOODEN_CASEMENT);

    public static final Block WOODEN_CASEMENT_PANE = registerBlock("wooden_casement_pane",
            new PaneBlock(AbstractBlock.Settings.copy(Blocks.LADDER)));
    public static final Item WOODEN_CASEMENT_PANE_ITEM = createBlockItem("wooden_casement_pane", WOODEN_CASEMENT_PANE);

    public static final Block TEST_FALLING_BLOCK = registerBlock("test_falling_block",
            new TestFallingBlock(AbstractBlock.Settings.copy(Blocks.GRAVEL)));
    public static final Item TEST_FALLING_BLOCK_ITEM = createBlockItem("test_falling_block", TEST_FALLING_BLOCK);

    public static final Block ROTTEN_FLESH_BLOCK = registerBlock("rotten_flesh_block",
            new Block(AbstractBlock.Settings.copy(Blocks.SCULK)));
    public static final Item ROTTEN_FLESH_BLOCK_ITEM = createBlockItem("rotten_flesh_block", ROTTEN_FLESH_BLOCK);

    //Brick Blocks
    public static final Block ADOBE_BRICK_BLOCK = registerBlock("adobe_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Item ADOBE_BRICK_BLOCK_ITEM = createBlockItem("adobe_bricks", ADOBE_BRICK_BLOCK);

    public static final Block REFRACTORY_BRICK_BLOCK = registerBlock("refractory_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Item REFRACTORY_BRICK_BLOCK_ITEM = createBlockItem("refractory_bricks", REFRACTORY_BRICK_BLOCK);

    public static final Block STURDY_BRICK_BLOCK = registerBlock("sturdy_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Item STURDY_BRICK_BLOCK_ITEM = createBlockItem("sturdy_bricks", STURDY_BRICK_BLOCK);

    public static final Block CARDBOARD_BOX = registerBlock("cardboard_box",
            new BarrelBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).sounds(BlockSoundGroup.LADDER)));
    public static final Item CARDBOARD_BOX_ITEM = createBlockItem("cardboard_box", CARDBOARD_BOX);

    public static final Block LEAD_ORE_BLOCK = registerBlock("lead_ore_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.GOLD_ORE)));
    public static final Item LEAD_ORE_BLOCK_ITEM = createBlockItem("lead_ore", LEAD_ORE_BLOCK);

    public static final Block LEAD_BLOCK = registerBlock("lead_block",
            new Block(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Item LEAD_BLOCK_ITEM = createBlockItem("lead_block", LEAD_BLOCK);


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

package net.aiq9.blocks;

import net.aiq9.TemplateMod121;
import net.aiq9.blocks.custom.*;
import net.aiq9.sounds.ModSounds;
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

    public static final Block CARDBOARD_BOX = registerBlock("cardboard_box",
            new BarrelBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).sounds(BlockSoundGroup.LADDER)));
    public static final Item CARDBOARD_BOX_ITEM = createBlockItem("cardboard_box", CARDBOARD_BOX);

    public static final Block SOUND_BLOCK = registerBlock("sound_block",
            new SoundBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).sounds(ModSounds.SOUND_BLOCK_SOUNDS)));
    public static final Item SOUND_BLOCK_ITEM = createBlockItem("sound_block", SOUND_BLOCK);

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

    //Lead Ore
    public static final Block LEAD_ORE = registerBlock("lead_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.GOLD_ORE)));
    public static final Item LEAD_ORE_ITEM = createBlockItem("lead_ore", LEAD_ORE);

    public static final Block DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE)));
    public static final Item DEEPSLATE_LEAD_ORE_ITEM = createBlockItem("deepslate_lead_ore", DEEPSLATE_LEAD_ORE);

    public static final Block LEAD_BLOCK = registerBlock("lead_block",
            new Block(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Item LEAD_BLOCK_ITEM = createBlockItem("lead_block", LEAD_BLOCK);

    public static final Block RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
            new Block(AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK)));
    public static final Item RAW_LEAD_BLOCK_ITEM = createBlockItem("raw_lead_block", RAW_LEAD_BLOCK);

    //Ruby Ore
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.COAL_ORE)));
    public static final Item RUBY_ORE_ITEM = createBlockItem("ruby_ore", RUBY_ORE);

    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE)));
    public static final Item DEEPSLATE_RUBY_ORE_ITEM = createBlockItem("deepslate_ruby_ore", DEEPSLATE_RUBY_ORE);

    public static final Block NETHER_RUBY_ORE = registerBlock("nether_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE)));
    public static final Item NETHER_RUBY_ORE_ITEM = createBlockItem("nether_ruby_ore", NETHER_RUBY_ORE);

    public static final Block END_RUBY_ORE = registerBlock("end_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE)));
    public static final Item END_RUBY_ORE_ITEM = createBlockItem("end_ruby_ore", END_RUBY_ORE);

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Item RUBY_BLOCK_ITEM = createBlockItem("ruby_block", RUBY_BLOCK);

    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
            new Block(AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK)));
    public static final Item RAW_RUBY_BLOCK_ITEM = createBlockItem("raw_ruby_block", RAW_RUBY_BLOCK);

    //Slade stone
    public static final Block SLADE_BLOCK = registerBlock("slade",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Item SLADE_BLOCK_ITEM = createBlockItem("slade", SLADE_BLOCK);

    public static final Block SLADE_BRICKS = registerBlock("slade_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Item SLADE_BRICKS_ITEM = createBlockItem("slade_bricks", SLADE_BRICKS);

    public static final Block CHISELED_SLADE = registerBlock("chiseled_slade",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Item CHISELED_SLADE_ITEM = createBlockItem("chiseled_slade", CHISELED_SLADE);

    //Alabaster stone
    public static final Block ALABASTER_BLOCK = registerBlock("alabaster",
            new Block(AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Item ALABASTER_BLOCK_ITEM = createBlockItem("alabaster", ALABASTER_BLOCK);

    public static final Block ALABASTER_BRICKS_BLOCK = registerBlock("alabaster_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Item ALABASTER_BRICKS_BLOCK_ITEM = createBlockItem("alabaster_bricks", ALABASTER_BRICKS_BLOCK);

    public static final Block CHISELED_ALABASTER_BLOCK = registerBlock("chiseled_alabaster",
            new Block(AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Item CHISELED_ALABASTER_BLOCK_ITEM = createBlockItem("chiseled_alabaster", CHISELED_ALABASTER_BLOCK);

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

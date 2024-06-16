package net.aiq9.blocks;

import net.aiq9.TemplateMod121;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block TEST_BLOCK = registerBlock("test_block",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool().strength(0.5f, 0.6f).sounds(BlockSoundGroup.LADDER)));
    public static final Item TEST_BLOCK_ITEM = createBlockItem("test_block", TEST_BLOCK);

    public static final Block RED_MOSAIC_BLOCK = registerBlock("red_mosaic_block",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool().strength(0.5f, 0.5f).sounds(BlockSoundGroup.ANCIENT_DEBRIS)));
    public static final Item MOSAIC_BLOCK_ITEM = createBlockItem("red_mosaic_block", RED_MOSAIC_BLOCK);

    public static final Block BLUE_MOSAIC_BLOCK = registerBlock("blue_mosaic_block",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool().strength(0.5f, 0.5f).sounds(BlockSoundGroup.ANCIENT_DEBRIS)));
    public static final Item BLUE_MOSAIC_BLOCK_ITEM = createBlockItem("blue_mosaic_block", BLUE_MOSAIC_BLOCK);

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

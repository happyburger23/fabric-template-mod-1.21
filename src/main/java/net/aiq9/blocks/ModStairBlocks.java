package net.aiq9.blocks;

import net.aiq9.TemplateMod121;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModStairBlocks {
    public static final Block COBBLED_SANDSTONE_STAIRS = registerBlock("cobbled_sandstone_stairs",
            new StairsBlock(ModBlocks.COBBLED_SANDSTONE.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.COBBLED_SANDSTONE)));
    public static final Item COBBLED_SANDSTONE_STAIRS_ITEM = createBlockItem("cobbled_sandstone_stairs", COBBLED_SANDSTONE_STAIRS);

    public static final Block CLOUD_STONE_STAIRS = registerBlock("cloud_stone_stairs",
            new StairsBlock(ModBlocks.CLOUD_STONE.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.CLOUD_STONE)));
    public static final Item CLOUD_STONE_STAIRS_ITEM = createBlockItem("cloud_stone_stairs", CLOUD_STONE_STAIRS);

    public static final Block CLOUD_STONE_BRICKS_STAIRS = registerBlock("cloud_stone_bricks_stairs",
            new StairsBlock(ModBlocks.CLOUD_STONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.CLOUD_STONE_BRICKS)));
    public static final Item CLOUD_STONE_BRICKS_STAIRS_ITEM = createBlockItem("cloud_stone_bricks_stairs", CLOUD_STONE_BRICKS_STAIRS);

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
    public static void registerModStairBlocks() {
        TemplateMod121.LOGGER.info("Registering Mod Stair Blocks for " + TemplateMod121.MOD_ID);
    }
}

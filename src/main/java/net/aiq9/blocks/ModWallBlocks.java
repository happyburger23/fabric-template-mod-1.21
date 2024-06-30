package net.aiq9.blocks;

import net.aiq9.TemplateMod121;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModWallBlocks {
    public static final Block COBBLED_SANDSTONE_WALL = registerBlock("cobbled_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Item COBBLED_SANDSTONE_WALL_ITEM = createBlockItem("cobbled_sandstone_wall", COBBLED_SANDSTONE_WALL);

    public static final Block CLOUD_STONE_BRICKS_WALL = registerBlock("cloud_stone_bricks_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
    public static final Item CLOUD_STONE_BRICKS_WALL_ITEM = createBlockItem("cloud_stone_bricks_wall", CLOUD_STONE_BRICKS_WALL);

    public static final Block ADOBE_BRICKS_WALL = registerBlock("adobe_bricks_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Item ADOBE_BRICKS_WALL_ITEM = createBlockItem("adobe_bricks_wall", ADOBE_BRICKS_WALL);

    public static final Block REFRACTORY_BRICKS_WALL = registerBlock("refractory_bricks_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Item REFRACTORY_BRICKS_WALL_ITEM = createBlockItem("refractory_bricks_wall", REFRACTORY_BRICKS_WALL);

    public static final Block STURDY_BRICKS_WALL = registerBlock("sturdy_bricks_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Item STURDY_BRICKS_WALL_ITEM = createBlockItem("sturdy_bricks_wall", STURDY_BRICKS_WALL);

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
    public static void registerModWallBlocks() {
        TemplateMod121.LOGGER.info("Registering Mod Wall Blocks for " + TemplateMod121.MOD_ID);
    }
}

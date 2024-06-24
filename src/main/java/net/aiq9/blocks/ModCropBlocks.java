package net.aiq9.blocks;

import net.aiq9.TemplateMod121;
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

public class ModCropBlocks {
    public static final Block TUMERIC_CROP = registerBlock("tumeric_crop",
            new TumericCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));
    public static final Item TUMERIC_CROP_ITEM = createBlockItem("tumeric_crop", TUMERIC_CROP);

    public static final Block TOMATO_CROP = registerBlock("tomato_crop",
            new TomatoCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));
    public static final Item TOMATO_CROP_ITEM = createBlockItem("tomato_crop", TOMATO_CROP);

    public static final Block COTTON_CROP = registerBlock("cotton_crop",
            new TomatoCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));
    public static final Item COTTON_CROP_ITEM = createBlockItem("cotton_crop", COTTON_CROP);

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
    public static void registerModCropBlocks() {
        TemplateMod121.LOGGER.info("Registering Mod Crop Blocks for " + TemplateMod121.MOD_ID);
    }
}

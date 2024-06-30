package net.aiq9.blocks;

import net.aiq9.TemplateMod121;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPlantBlocks {
    //Thistle
    public static final Block THISTLE_BLOCK = registerBlock("thistle",
            new FlowerBlock(StatusEffects.ABSORPTION, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque()));
    public static final Item THISTLE_BLOCK_ITEM = createBlockItem("thistle", THISTLE_BLOCK);

    public static final Block POTTED_THISTLE_BLOCK = registerBlock("potted_thistle",
            new FlowerPotBlock(THISTLE_BLOCK, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY).nonOpaque()));

    //Monkshood
    public static final Block MONKSHOOD_BLOCK = registerBlock("monkshood",
            new FlowerBlock(StatusEffects.ABSORPTION, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque()));
    public static final Item MONKSHOOD_BLOCK_ITEM = createBlockItem("monkshood", MONKSHOOD_BLOCK);

    public static final Block POTTED_MONKSHOOD_BLOCK = registerBlock("potted_monkshood",
            new FlowerPotBlock(MONKSHOOD_BLOCK, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));
    public static final Item POTTED_MONKSHOOD_BLOCK_ITEM = createBlockItem("potted_monkshood", POTTED_MONKSHOOD_BLOCK);


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
    public static void registerModPlantBlocks() {
        TemplateMod121.LOGGER.info("Registering Mod Plants for " + TemplateMod121.MOD_ID);
    }
}

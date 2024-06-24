package net.aiq9.items;

import net.aiq9.TemplateMod121;
import net.aiq9.blocks.ModBlocks;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TEST_ITEM = new Item(new Item.Settings());
    public static final Item TUMERIC = new Item(new Item.Settings());
    public static final Item TUMERIC_SEEDS = new AliasedBlockItem(ModBlocks.TUMERIC_CROP, new Item.Settings());

    public static final Item TOMATO = new Item(new Item.Settings());
    public static final Item TOMATO_SEEDS = new AliasedBlockItem(ModBlocks.TOMATO_CROP, new Item.Settings());

    public static final Item ADOBE_BALL = new Item(new Item.Settings());
    public static final Item UNFIRED_ADOBE_BRICK = new Item(new Item.Settings());
    public static final Item FIRED_ADOBE_BRICK = new Item(new Item.Settings());

    public static final Item REFRACTORY_BRICK = new Item(new Item.Settings());
    public static final Item REFRACTORY_CLAY_BALL = new Item(new Item.Settings());

    public static final Item STURDY_BRICK = new Item(new Item.Settings());
    public static final Item STURDY_CLAY_BALL = new Item(new Item.Settings());


    public static void registerModItems() {
        TemplateMod121.LOGGER.info("Registering Mod Items for " + TemplateMod121.MOD_ID);

        Registry.register(Registries.ITEM, Identifier.of(TemplateMod121.MOD_ID, "test_item"), TEST_ITEM);
        Registry.register(Registries.ITEM, Identifier.of(TemplateMod121.MOD_ID, "tumeric"), TUMERIC);
        Registry.register(Registries.ITEM, Identifier.of(TemplateMod121.MOD_ID, "tumeric_seeds"), TUMERIC_SEEDS);

        Registry.register(Registries.ITEM, Identifier.of(TemplateMod121.MOD_ID, "tomato"), TOMATO);
        Registry.register(Registries.ITEM, Identifier.of(TemplateMod121.MOD_ID, "tomato_seeds"), TOMATO_SEEDS);

        Registry.register(Registries.ITEM, Identifier.of(TemplateMod121.MOD_ID, "adobe_ball"), ADOBE_BALL);
        Registry.register(Registries.ITEM, Identifier.of(TemplateMod121.MOD_ID, "unfired_adobe_brick"), UNFIRED_ADOBE_BRICK);
        Registry.register(Registries.ITEM, Identifier.of(TemplateMod121.MOD_ID, "fired_adobe_brick"), FIRED_ADOBE_BRICK);

        Registry.register(Registries.ITEM, Identifier.of(TemplateMod121.MOD_ID, "refractory_brick"), REFRACTORY_BRICK);
        Registry.register(Registries.ITEM, Identifier.of(TemplateMod121.MOD_ID, "refractory_clay_ball"), REFRACTORY_CLAY_BALL);

        Registry.register(Registries.ITEM, Identifier.of(TemplateMod121.MOD_ID, "sturdy_brick"), STURDY_BRICK);
        Registry.register(Registries.ITEM, Identifier.of(TemplateMod121.MOD_ID, "sturdy_clay_ball"), STURDY_CLAY_BALL);
    }
}

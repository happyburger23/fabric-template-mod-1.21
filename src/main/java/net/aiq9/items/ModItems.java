package net.aiq9.items;

import net.aiq9.TemplateMod121;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    private static Item TEST_ITEM;

    public static void registerItems() {
        TEST_ITEM = register("test_item", new Item(new Item.Settings()));
    }

    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TemplateMod121.MOD_ID, name), item);
    }
}

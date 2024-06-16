package net.aiq9.items;

import net.aiq9.TemplateMod121;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TEST_ITEM = new Item(new Item.Settings());

    public static void registerModItems() {
        TemplateMod121.LOGGER.info("Registering Mod Items for " + TemplateMod121.MOD_ID);

        Registry.register(Registries.ITEM, Identifier.of(TemplateMod121.MOD_ID, "test_item"), TEST_ITEM);
    }
}

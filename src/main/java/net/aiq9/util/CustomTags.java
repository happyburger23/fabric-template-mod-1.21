package net.aiq9.util;

import net.aiq9.TemplateMod121;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class CustomTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_DETECTABLE_BLOCK =
                createTag("metal_detector_detectable_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TemplateMod121.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(TemplateMod121.MOD_ID, name));
        }
    }
}

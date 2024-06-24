package net.aiq9;

import net.aiq9.blocks.ModCropBlocks;
import net.aiq9.blocks.ModBlocks;
import net.aiq9.items.ModItemGroup;
import net.aiq9.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemplateMod121 implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("template-mod-121");
	public static final String MOD_ID = "template-mod-121";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Template Mod");

		ModItemGroup.registerItemGroup();

		ModBlocks.registerModBlocks();
		ModCropBlocks.registerModCropBlocks();

		ModItems.registerModItems();
	}
}
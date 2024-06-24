package net.aiq9;

import net.aiq9.datagen.BlockTagDatagen;
import net.aiq9.datagen.LoottableDatagen;
import net.aiq9.datagen.BlockItemModelDatagen;
import net.aiq9.datagen.RecipeDatagen;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class TemplateMod121DataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(BlockItemModelDatagen::new);
		pack.addProvider(LoottableDatagen::new);
		pack.addProvider(BlockTagDatagen::new);
		pack.addProvider(RecipeDatagen::new);
	}
}

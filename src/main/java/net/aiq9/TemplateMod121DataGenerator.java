package net.aiq9;

import net.aiq9.datagen.ModBlockTagProvider;
import net.aiq9.datagen.ModLoottableProvider;
import net.aiq9.datagen.ModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class TemplateMod121DataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModLoottableProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
	}
}

package net.aiq9.datagen;

import net.aiq9.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLoottableProvider extends FabricBlockLootTableProvider {
    public ModLoottableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TEST_BLOCK);
        addDrop(ModBlocks.RED_MOSAIC_BLOCK);
        addDrop(ModBlocks.BLUE_MOSAIC_BLOCK);
        addDrop(ModBlocks.COBBLED_SANDSTONE);
        addDrop(ModBlocks.CLOUD_STONE);
        addDrop(ModBlocks.CLOUD_STONE_BRICKS);
    }
}

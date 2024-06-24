package net.aiq9.datagen;

import net.aiq9.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.TEST_BLOCK)
                .add(ModBlocks.WOODEN_CASEMENT)
                .add(ModBlocks.WOODEN_CASEMENT_PANE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RED_MOSAIC_BLOCK)
                .add(ModBlocks.BLUE_MOSAIC_BLOCK)
                .add(ModBlocks.COBBLED_SANDSTONE)
                .add(ModBlocks.CLOUD_STONE)
                .add(ModBlocks.CLOUD_STONE_BRICKS)
                .add(ModBlocks.NOTE_BLOCK_RAIL)
                .add(ModBlocks.ADOBE_BRICK_BLOCK)
                .add(ModBlocks.REFRACTORY_BRICK_BLOCK)
                .add(ModBlocks.STURDY_BRICK_BLOCK);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.ROTTEN_FLESH_BLOCK);

        getOrCreateTagBuilder(BlockTags.CROPS)
                .add(ModBlocks.TUMERIC_CROP)
                .add(ModBlocks.TOMATO_CROP);

        getOrCreateTagBuilder(BlockTags.BEE_GROWABLES)
                .add(ModBlocks.TUMERIC_CROP)
                .add(ModBlocks.TOMATO_CROP);

        getOrCreateTagBuilder(BlockTags.RAILS)
                .add(ModBlocks.NOTE_BLOCK_RAIL);
    }
}

package net.aiq9.datagen;

import net.aiq9.blocks.ModBlocks;
import net.aiq9.blocks.ModPlantBlocks;
import net.aiq9.blocks.ModCropBlocks;
import net.aiq9.blocks.ModWallBlocks;
import net.aiq9.util.CustomTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagDatagen extends FabricTagProvider.BlockTagProvider {
    public BlockTagDatagen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
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
                .add(ModBlocks.STURDY_BRICK_BLOCK)
                .add(ModBlocks.LEAD_ORE)
                .add(ModBlocks.DEEPSLATE_LEAD_ORE)
                .add(ModBlocks.LEAD_BLOCK)
                .add(ModBlocks.RAW_LEAD_BLOCK)
                .add(ModWallBlocks.COBBLED_SANDSTONE_WALL)
                .add(ModWallBlocks.CLOUD_STONE_BRICKS_WALL)
                .add(ModWallBlocks.ADOBE_BRICKS_WALL)
                .add(ModWallBlocks.REFRACTORY_BRICKS_WALL)
                .add(ModWallBlocks.STURDY_BRICKS_WALL)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.NETHER_RUBY_ORE)
                .add(ModBlocks.END_RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RAW_RUBY_BLOCK)

                .add(ModBlocks.SLADE_BLOCK)
                .add(ModBlocks.SLADE_BRICKS)
                .add(ModBlocks.CHISELED_SLADE)

                .add(ModBlocks.ALABASTER_BLOCK)
                .add(ModBlocks.ALABASTER_BRICKS_BLOCK)
                .add(ModBlocks.CHISELED_ALABASTER_BLOCK);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.ROTTEN_FLESH_BLOCK);

        getOrCreateTagBuilder(BlockTags.CROPS)
                .add(ModCropBlocks.TUMERIC_CROP)
                .add(ModCropBlocks.TOMATO_CROP)
                .add(ModCropBlocks.COTTON_CROP);

        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(ModPlantBlocks.THISTLE_BLOCK)
                .add(ModPlantBlocks.MONKSHOOD_BLOCK);

        getOrCreateTagBuilder(BlockTags.BEE_GROWABLES)
                .add(ModCropBlocks.TUMERIC_CROP)
                .add(ModCropBlocks.TOMATO_CROP)
                .add(ModCropBlocks.COTTON_CROP);

        getOrCreateTagBuilder(BlockTags.RAILS)
                .add(ModBlocks.NOTE_BLOCK_RAIL);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModWallBlocks.COBBLED_SANDSTONE_WALL)
                .add(ModWallBlocks.CLOUD_STONE_BRICKS_WALL)
                .add(ModWallBlocks.ADOBE_BRICKS_WALL)
                .add(ModWallBlocks.REFRACTORY_BRICKS_WALL)
                .add(ModWallBlocks.STURDY_BRICKS_WALL);

        getOrCreateTagBuilder(CustomTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCK)
                .add(Blocks.COAL_ORE)
                .add(Blocks.DEEPSLATE_COAL_ORE)
                .add(Blocks.IRON_ORE)
                .add(Blocks.DEEPSLATE_IRON_ORE);
    }
}

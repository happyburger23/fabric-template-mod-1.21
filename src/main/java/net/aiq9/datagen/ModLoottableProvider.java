package net.aiq9.datagen;

import net.aiq9.blocks.ModBlocks;
import net.aiq9.blocks.custom.TomatoCropBlock;
import net.aiq9.blocks.custom.TumericCropBlock;
import net.aiq9.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
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

        addDrop(ModBlocks.NOTE_BLOCK_RAIL);

        addDrop(ModBlocks.WOODEN_CASEMENT);
        addDrop(ModBlocks.WOODEN_CASEMENT_PANE);
        addDrop(ModBlocks.TEST_FALLING_BLOCK);
        addDrop(ModBlocks.ROTTEN_FLESH_BLOCK);

        addDrop(ModBlocks.ADOBE_BRICK_BLOCK);
        addDrop(ModBlocks.REFRACTORY_BRICK_BLOCK);
        addDrop(ModBlocks.STURDY_BRICK_BLOCK);

        addDrop(ModBlocks.CARDBOARD_BOX);

        BlockStatePropertyLootCondition.Builder tomatoBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.TOMATO_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(TomatoCropBlock.AGE, 5));
        addDrop(ModBlocks.TOMATO_CROP, cropDrops(ModBlocks.TOMATO_CROP, ModItems.TOMATO, ModItems.TOMATO_SEEDS, tomatoBuilder));

        BlockStatePropertyLootCondition.Builder tumericBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.TUMERIC_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(TumericCropBlock.AGE, 1));
        addDrop(ModBlocks.TUMERIC_CROP, cropDrops(ModBlocks.TUMERIC_CROP, ModItems.TUMERIC, ModItems.TUMERIC_SEEDS, tumericBuilder));
    }
}

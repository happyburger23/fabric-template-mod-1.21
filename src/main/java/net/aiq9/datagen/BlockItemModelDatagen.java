package net.aiq9.datagen;

import net.aiq9.blocks.ModBlocks;
import net.aiq9.blocks.ModCropBlocks;
import net.aiq9.blocks.custom.TomatoCropBlock;
import net.aiq9.blocks.custom.TumericCropBlock;
import net.aiq9.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;

public class BlockItemModelDatagen extends FabricModelProvider {
    public BlockItemModelDatagen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TEST_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_MOSAIC_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_MOSAIC_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLED_SANDSTONE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLOUD_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLOUD_STONE_BRICKS);

        blockStateModelGenerator.registerGlassPane(ModBlocks.WOODEN_CASEMENT, ModBlocks.WOODEN_CASEMENT_PANE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TEST_FALLING_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROTTEN_FLESH_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ADOBE_BRICK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REFRACTORY_BRICK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STURDY_BRICK_BLOCK);
        blockStateModelGenerator.registerStraightRail(ModBlocks.NOTE_BLOCK_RAIL);

        blockStateModelGenerator.registerSingleton(ModBlocks.CARDBOARD_BOX, TexturedModel.CUBE_BOTTOM_TOP);
        //blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.CARDBOARD_BOX, , TextureMap::frontSideWithCustomBottom);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_ORE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_BLOCK);

        blockStateModelGenerator.registerCrop(ModCropBlocks.TUMERIC_CROP, TumericCropBlock.AGE, 0, 1);
        blockStateModelGenerator.registerCrop(ModCropBlocks.TOMATO_CROP, TomatoCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModCropBlocks.COTTON_CROP, TomatoCropBlock.AGE, 0, 1, 2, 3, 4, 5);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TEST_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUMERIC, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);

        itemModelGenerator.register(ModItems.ADOBE_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNFIRED_ADOBE_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRED_ADOBE_BRICK, Models.GENERATED);

        itemModelGenerator.register(ModItems.REFRACTORY_CLAY_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFRACTORY_BRICK, Models.GENERATED);

        itemModelGenerator.register(ModItems.STURDY_CLAY_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STURDY_BRICK, Models.GENERATED);

        itemModelGenerator.register(ModItems.COTTON, Models.GENERATED);

        itemModelGenerator.register(ModItems.LEAD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_LEAD, Models.GENERATED);
    }
}
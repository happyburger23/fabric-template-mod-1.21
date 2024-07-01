package net.aiq9.datagen;

import net.aiq9.blocks.*;
import net.aiq9.blocks.custom.crop.RiceCropBlock;
import net.aiq9.blocks.custom.crop.TomatoCropBlock;
import net.aiq9.blocks.custom.crop.TumericCropBlock;
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

        blockStateModelGenerator.registerGlassPane(ModBlocks.WOODEN_CASEMENT, ModBlocks.WOODEN_CASEMENT_PANE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TEST_FALLING_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROTTEN_FLESH_BLOCK);
        blockStateModelGenerator.registerStraightRail(ModBlocks.NOTE_BLOCK_RAIL);
        blockStateModelGenerator.registerSingleton(ModBlocks.CARDBOARD_BOX, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);

        //slade
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SLADE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SLADE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_SLADE);

        //alabaster
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALABASTER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALABASTER_BRICKS_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_ALABASTER_BLOCK);

        //lead ore
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_LEAD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_LEAD_BLOCK);

        //ruby ores
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_RUBY_BLOCK);

        //crops
        blockStateModelGenerator.registerCrop(ModCropBlocks.TUMERIC_CROP, TumericCropBlock.AGE, 0, 1);
        blockStateModelGenerator.registerCrop(ModCropBlocks.TOMATO_CROP, TomatoCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModCropBlocks.COTTON_CROP, TomatoCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModCropBlocks.RICE_CROP, RiceCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);

        blockStateModelGenerator.registerFlowerPotPlant(ModPlantBlocks.THISTLE_BLOCK, ModPlantBlocks.POTTED_THISTLE_BLOCK, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModPlantBlocks.MONKSHOOD_BLOCK, ModPlantBlocks.POTTED_MONKSHOOD_BLOCK, BlockStateModelGenerator.TintType.NOT_TINTED);

        //cobbled sandstone - Walls, stairs, slabs
        BlockStateModelGenerator.BlockTexturePool cobbledSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COBBLED_SANDSTONE);
        cobbledSandstonePool.wall(ModWallBlocks.COBBLED_SANDSTONE_WALL);
        cobbledSandstonePool.stairs(ModStairBlocks.COBBLED_SANDSTONE_STAIRS);

        //cloud stone - walls, stairs, slabs
        BlockStateModelGenerator.BlockTexturePool cloudStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CLOUD_STONE);
        cloudStonePool.wall(ModWallBlocks.CLOUD_STONE_WALL);
        cloudStonePool.stairs(ModStairBlocks.CLOUD_STONE_STAIRS);

        //cloud stone bricks - Walls, stairs, slabs
        BlockStateModelGenerator.BlockTexturePool cloudStoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CLOUD_STONE_BRICKS);
        cloudStoneBricksPool.wall(ModWallBlocks.CLOUD_STONE_BRICKS_WALL);
        cloudStoneBricksPool.stairs(ModStairBlocks.CLOUD_STONE_BRICKS_STAIRS);

        //adobe bricks - Walls, stairs, slabs
        BlockStateModelGenerator.BlockTexturePool adobePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ADOBE_BRICK_BLOCK);
        adobePool.wall(ModWallBlocks.ADOBE_BRICKS_WALL);

        //refractory bricks - Walls, stairs, slabs
        BlockStateModelGenerator.BlockTexturePool refractoryBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REFRACTORY_BRICK_BLOCK);
        refractoryBricksPool.wall(ModWallBlocks.REFRACTORY_BRICKS_WALL);

        //sturdy bricks - Walls, stairs, slabs
        BlockStateModelGenerator.BlockTexturePool sturdyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STURDY_BRICK_BLOCK);
        sturdyBricksPool.wall(ModWallBlocks.STURDY_BRICKS_WALL);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
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
        itemModelGenerator.register(ModItems.RICE, Models.GENERATED);

        itemModelGenerator.register(ModItems.LEAD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_LEAD, Models.GENERATED);

        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUBY, Models.GENERATED);

        itemModelGenerator.register(ModItems.FIRE_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.OIL_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.HANDHELD);
        //itemModelGenerator.register(ModItems.TEST_BOOK, Models.HANDHELD);
    }
}

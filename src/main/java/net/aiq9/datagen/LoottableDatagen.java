package net.aiq9.datagen;

import net.aiq9.blocks.ModBlocks;
import net.aiq9.blocks.ModPlantBlocks;
import net.aiq9.blocks.ModWallBlocks;
import net.aiq9.blocks.ModCropBlocks;
import net.aiq9.blocks.custom.crop.TomatoCropBlock;
import net.aiq9.blocks.custom.crop.TumericCropBlock;
import net.aiq9.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class LoottableDatagen extends FabricBlockLootTableProvider {
    public LoottableDatagen(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
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
        addDrop(ModBlocks.SOUND_BLOCK);

        addDrop(ModBlocks.SLADE_BLOCK);
        addDrop(ModBlocks.SLADE_BRICKS);
        addDrop(ModBlocks.CHISELED_SLADE);

        addDrop(ModBlocks.ALABASTER_BLOCK);
        addDrop(ModBlocks.ALABASTER_BRICKS_BLOCK);
        addDrop(ModBlocks.CHISELED_ALABASTER_BLOCK);

        //plants
        addDrop(ModPlantBlocks.THISTLE_BLOCK);
        addPottedPlantDrops(ModPlantBlocks.POTTED_THISTLE_BLOCK);

        addDrop(ModPlantBlocks.MONKSHOOD_BLOCK);
        addPottedPlantDrops(ModPlantBlocks.POTTED_MONKSHOOD_BLOCK);

        //walls
        addDrop(ModWallBlocks.COBBLED_SANDSTONE_WALL);
        addDrop(ModWallBlocks.CLOUD_STONE_BRICKS_WALL);
        addDrop(ModWallBlocks.ADOBE_BRICKS_WALL);
        addDrop(ModWallBlocks.REFRACTORY_BRICKS_WALL);
        addDrop(ModWallBlocks.STURDY_BRICKS_WALL);

        //lead
        addDrop(ModBlocks.LEAD_BLOCK);
        addDrop(ModBlocks.RAW_LEAD_BLOCK);
        addDrop(ModBlocks.LEAD_ORE, (copperLikeOreDrops(ModBlocks.LEAD_ORE, ModItems.RAW_LEAD)));
        addDrop(ModBlocks.DEEPSLATE_LEAD_ORE, (copperLikeOreDrops(ModBlocks.DEEPSLATE_LEAD_ORE, ModItems.RAW_LEAD)));

        //ruby
        addDrop(ModBlocks.RUBY_ORE, (copperLikeOreDrops(ModBlocks.RUBY_ORE, ModItems.RAW_RUBY)));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, (copperLikeOreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RAW_RUBY)));
        addDrop(ModBlocks.NETHER_RUBY_ORE, (copperLikeOreDrops(ModBlocks.NETHER_RUBY_ORE, ModItems.RAW_RUBY)));
        addDrop(ModBlocks.END_RUBY_ORE, (copperLikeOreDrops(ModBlocks.END_RUBY_ORE, ModItems.RAW_RUBY)));
        addDrop(ModBlocks.RAW_RUBY_BLOCK);
        addDrop(ModBlocks.RUBY_BLOCK);

        //tomato crop
        BlockStatePropertyLootCondition.Builder tomatoBuilder = BlockStatePropertyLootCondition.builder(ModCropBlocks.TOMATO_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(TomatoCropBlock.AGE, 5));
        addDrop(ModCropBlocks.TOMATO_CROP, cropDrops(ModCropBlocks.TOMATO_CROP, ModItems.TOMATO, ModItems.TOMATO_SEEDS, tomatoBuilder));

        //tumeric crop
        BlockStatePropertyLootCondition.Builder tumericBuilder = BlockStatePropertyLootCondition.builder(ModCropBlocks.TUMERIC_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(TumericCropBlock.AGE, 1));
        addDrop(ModCropBlocks.TUMERIC_CROP, cropDrops(ModCropBlocks.TUMERIC_CROP, ModItems.TUMERIC, ModItems.TUMERIC_SEEDS, tumericBuilder));

        //cotton crop
        BlockStatePropertyLootCondition.Builder cottonBuilder = BlockStatePropertyLootCondition.builder(ModCropBlocks.COTTON_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(TomatoCropBlock.AGE, 5));
        addDrop(ModCropBlocks.COTTON_CROP, cropDrops(ModCropBlocks.COTTON_CROP, ModItems.COTTON, ModItems.COTTON_SEEDS, cottonBuilder));
    }


    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return this.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ItemEntry.builder(item)
                        .apply(SetCountLootFunction
                                .builder(UniformLootNumberProvider
                                        .create(2.0F, 5.0F)))
                        .apply(ApplyBonusLootFunction.oreDrops(
                                this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE)))));
        //this.registryLookup.createRegistryLookup().getOptionalEntry(RegistryKeys.ENCHANTMENT, Enchantments.FORTUNE).orElseThrow();
    }
}

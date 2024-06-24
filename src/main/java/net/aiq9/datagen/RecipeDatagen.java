package net.aiq9.datagen;

import net.aiq9.blocks.ModBlocks;
import net.aiq9.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class RecipeDatagen extends FabricRecipeProvider {
    public RecipeDatagen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ROTTEN_FLESH, RecipeCategory.DECORATIONS,
                ModBlocks.ROTTEN_FLESH_BLOCK);

        //Cloud Stone Bricks
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModBlocks.CLOUD_STONE_BRICKS, 4)
                .pattern("   ")
                .pattern("CC ")
                .pattern("CC ")
                .input('C', ModBlocks.CLOUD_STONE)
                .criterion(hasItem(ModBlocks.CLOUD_STONE), conditionsFromItem(ModBlocks.CLOUD_STONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.CLOUD_STONE_BRICKS)));

        //Wooden Casement
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WOODEN_CASEMENT)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(ModBlocks.WOODEN_CASEMENT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.WOODEN_CASEMENT)));

        //Wooden Casement Pane
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WOODEN_CASEMENT_PANE, 16)
                .pattern("   ")
                .pattern("WWW")
                .pattern("WWW")
                .input('W', ModBlocks.WOODEN_CASEMENT)
                .criterion(hasItem(ModBlocks.WOODEN_CASEMENT), conditionsFromItem(ModBlocks.WOODEN_CASEMENT_PANE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.WOODEN_CASEMENT_PANE)));

        //Note Block Rail
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.NOTE_BLOCK_RAIL, 8)
                .pattern("ini")
                .pattern("isi")
                .pattern("i i")
                .input('n', Items.NOTE_BLOCK)
                .input('s', Items.STICK)
                .input('i', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.NOTE_BLOCK), conditionsFromItem(Items.NOTE_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.NOTE_BLOCK_RAIL)));

        //Unfired Adobe Brick Item
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.UNFIRED_ADOBE_BRICK, 4)
                .pattern("   ")
                .pattern("uu ")
                .pattern("uu ")
                .input('u', ModItems.ADOBE_BALL)
                .criterion(hasItem(ModItems.ADOBE_BALL), conditionsFromItem(ModItems.ADOBE_BALL))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.UNFIRED_ADOBE_BRICK)));

        //Adobe Bricks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ADOBE_BRICK_BLOCK, 4)
                .pattern("   ")
                .pattern("aa ")
                .pattern("aa ")
                .input('a', ModItems.FIRED_ADOBE_BRICK)
                .criterion(hasItem(ModItems.FIRED_ADOBE_BRICK), conditionsFromItem(ModItems.FIRED_ADOBE_BRICK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.ADOBE_BRICK_BLOCK)));

        //Refractory Bricks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REFRACTORY_BRICK_BLOCK, 4)
                .pattern("   ")
                .pattern("rr ")
                .pattern("rr ")
                .input('r', ModItems.REFRACTORY_BRICK)
                .criterion(hasItem(ModItems.REFRACTORY_BRICK), conditionsFromItem(ModItems.REFRACTORY_BRICK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.REFRACTORY_BRICK_BLOCK)));

        //Sturdy Bricks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STURDY_BRICK_BLOCK, 4)
                .pattern("   ")
                .pattern("ss ")
                .pattern("ss ")
                .input('s', ModItems.STURDY_BRICK)
                .criterion(hasItem(ModItems.STURDY_BRICK), conditionsFromItem(ModItems.STURDY_BRICK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.STURDY_BRICK_BLOCK)));
    }
}

package net.aiq9.datagen;

import net.aiq9.blocks.ModBlocks;
import net.aiq9.blocks.ModPlantBlocks;
import net.aiq9.blocks.ModWallBlocks;
import net.aiq9.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class RecipeDatagen extends FabricRecipeProvider {
    private static final List<ItemConvertible> LEAD_SMELTABLES = List.of(ModItems.RAW_LEAD,
            ModBlocks.LEAD_ORE, ModBlocks.DEEPSLATE_LEAD_ORE);

    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(ModItems.RAW_RUBY,
            ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE, ModBlocks.NETHER_RUBY_ORE, ModBlocks.END_RUBY_ORE);

    public RecipeDatagen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.LEAD_INGOT,
                0.7f, 200, "lead");
        offerBlasting(exporter, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.LEAD_INGOT,
                0.7f, 100, "lead");

        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.7f, 200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.7f, 100, "ruby");

        //unfired adobe brick to fired adobe brick item
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(ModItems.UNFIRED_ADOBE_BRICK), RecipeCategory.MISC, ModItems.FIRED_ADOBE_BRICK,
                0.7f, 200)
                .criterion(hasItem(ModItems.UNFIRED_ADOBE_BRICK), conditionsFromItem(ModItems.FIRED_ADOBE_BRICK))
                .offerTo(exporter);

        //refractory clay ball to refractory brick item
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(ModItems.REFRACTORY_CLAY_BALL), RecipeCategory.MISC, ModItems.REFRACTORY_BRICK,
                        0.7f, 200)
                .criterion(hasItem(ModItems.REFRACTORY_CLAY_BALL), conditionsFromItem(ModItems.REFRACTORY_BRICK))
                .offerTo(exporter);

        //sturdy clay ball to sturdy brick item
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(ModItems.STURDY_CLAY_BALL), RecipeCategory.MISC, ModItems.STURDY_BRICK,
                        0.7f, 200)
                .criterion(hasItem(ModItems.STURDY_CLAY_BALL), conditionsFromItem(ModItems.STURDY_BRICK))
                .offerTo(exporter);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ROTTEN_FLESH, RecipeCategory.DECORATIONS,
                ModBlocks.ROTTEN_FLESH_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_LEAD, RecipeCategory.DECORATIONS,
                ModBlocks.RAW_LEAD_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.LEAD_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.LEAD_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_RUBY, RecipeCategory.DECORATIONS,
                ModBlocks.RAW_RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS,
                ModBlocks.RUBY_BLOCK);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModWallBlocks.ADOBE_BRICKS_WALL, ModBlocks.ADOBE_BRICK_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModWallBlocks.REFRACTORY_BRICKS_WALL, ModBlocks.REFRACTORY_BRICK_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModWallBlocks.STURDY_BRICKS_WALL, ModBlocks.STURDY_BRICK_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModWallBlocks.COBBLED_SANDSTONE_WALL, ModBlocks.COBBLED_SANDSTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModWallBlocks.CLOUD_STONE_BRICKS_WALL, ModBlocks.CLOUD_STONE_BRICKS);

        //magenta dye from thistle block
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.MAGENTA_DYE, 1)
                .input(ModPlantBlocks.THISTLE_BLOCK)
                .criterion(hasItem(ModPlantBlocks.THISTLE_BLOCK), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(Items.MAGENTA_DYE)));

        //purple dye from monkshood block
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PURPLE_DYE, 1)
                .input(ModPlantBlocks.MONKSHOOD_BLOCK)
                .criterion(hasItem(ModPlantBlocks.MONKSHOOD_BLOCK), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(Items.PURPLE_DYE)));

        //Cloud Stone Bricks
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModBlocks.CLOUD_STONE_BRICKS, 4)
                .pattern("   ")
                .pattern("CC ")
                .pattern("CC ")
                .input('C', ModBlocks.CLOUD_STONE)
                .criterion(hasItem(ModBlocks.CLOUD_STONE), conditionsFromItem(ModBlocks.CLOUD_STONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.CLOUD_STONE_BRICKS)));

        //Wooden Casement
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WOODEN_CASEMENT, 8)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(ModBlocks.WOODEN_CASEMENT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.WOODEN_CASEMENT)));

        //Wooden Casement Pane
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WOODEN_CASEMENT_PANE, 8)
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

package net.aiq9.datagen;

import net.aiq9.TemplateMod121;
import net.aiq9.blocks.ModBlocks;
import net.aiq9.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.ConsumeItemCriterion;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class AdvancementDatagen extends FabricAdvancementProvider {
    public AdvancementDatagen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generateAdvancement(RegistryWrapper.WrapperLookup registryLookup, Consumer<AdvancementEntry> consumer) {
        AdvancementEntry main = Advancement.Builder.create()
                .display(ModBlocks.TEST_BLOCK,
                        Text.literal("Advancing Through The Years"), //title
                        Text.literal("ADVANCEMENT TREE BEGUN"), //descr.
                        Identifier.of(TemplateMod121.MOD_ID, "textures/block/test_block.png"), //background for advancement tab
                        AdvancementFrame.TASK,
                        true, //show toast
                        true, //announce in chat
                        false //hide advancement?
                )
                .criterion("got_test_block", InventoryChangedCriterion.Conditions.items(ModBlocks.TEST_BLOCK))
                .build(consumer, TemplateMod121.MOD_ID + "/root");

        AdvancementEntry beginMosaic = Advancement.Builder.create().parent(main)
                .display(ModBlocks.RED_MOSAIC_BLOCK,
                        Text.literal("Mosaic Journey"),
                        Text.literal("Obtain Red Mosaic"),
                        null, //no background. Only applies to root advancement
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("got_red_mosaic", InventoryChangedCriterion.Conditions.items(ModBlocks.RED_MOSAIC_BLOCK))
                .build(consumer, TemplateMod121.MOD_ID + "/begin_mosaic");

        AdvancementEntry endMosaic = Advancement.Builder.create().parent(beginMosaic)
                .display(ModBlocks.BLUE_MOSAIC_BLOCK,
                        Text.literal("Feeling Blue"),
                        Text.literal("Obtain Blue Mosaic"),
                        null, //no background. Only applies to root advancement
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("got_blue_mosaic", InventoryChangedCriterion.Conditions.items(ModBlocks.BLUE_MOSAIC_BLOCK))
                .build(consumer, TemplateMod121.MOD_ID + "/end_mosaic");

        AdvancementEntry eatAppleAndBeefAdvancement = Advancement.Builder.create().parent(main)
                .display(
                        Items.APPLE,
                        Text.literal("Apple and Beef"),
                        Text.literal("Ate an apple and beef"),
                        null,
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        false
                )
                .criterion("ate_apple", ConsumeItemCriterion.Conditions.item(Items.APPLE))
                .criterion("ate_cooked_beef", ConsumeItemCriterion.Conditions.item(Items.COOKED_BEEF))
                .build(consumer, TemplateMod121.MOD_ID + "/ate_apple_and_beef");

        AdvancementEntry getWoodCasements = Advancement.Builder.create().parent(main)
                .display(
                        ModBlocks.WOODEN_CASEMENT,
                        Text.literal("Fancier Windows"),
                        Text.literal("Obtain a Wooden Casement"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("has_wood_casement", InventoryChangedCriterion.Conditions.items(ModBlocks.WOODEN_CASEMENT))
                .build(consumer, TemplateMod121.MOD_ID + "/got_wooden_casement");

        AdvancementEntry getWoodCasementPane = Advancement.Builder.create().parent(getWoodCasements)
                .display(
                        ModBlocks.WOODEN_CASEMENT_PANE,
                        Text.literal("Fancier Window Panes"),
                        Text.literal("Obtain a Wooden Casement Pane"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                ).criterion("has_wood_casement_pane", InventoryChangedCriterion.Conditions.items(ModBlocks.WOODEN_CASEMENT_PANE))
                .build(consumer, TemplateMod121.MOD_ID + "/got_wooden_casement_pane");

        AdvancementEntry brokeStorage = Advancement.Builder.create().parent(main)
                .display(
                        ModBlocks.CARDBOARD_BOX,
                        Text.literal("Broke College Student"),
                        Text.literal("Obtain a Cardboard Box"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("has_cardboard_box", InventoryChangedCriterion.Conditions.items(ModBlocks.CARDBOARD_BOX))
                .build(consumer, TemplateMod121.MOD_ID + "/got_cardboard_box");

        AdvancementEntry makeNoise = Advancement.Builder.create().parent(main)
                .display(
                        Items.NOTE_BLOCK,
                        Text.literal("Make Some Noise!"),
                        Text.literal("Obtain a Note Block"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("has_note_block", InventoryChangedCriterion.Conditions.items(Items.NOTE_BLOCK))
                .build(consumer, TemplateMod121.MOD_ID + "/got_note_block");

        AdvancementEntry makeMoreNoise = Advancement.Builder.create().parent(makeNoise)
                .display(
                        Items.JUKEBOX,
                        Text.literal("Juke it out!"),
                        Text.literal("Obtain a Juke Box"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("has_jukebox", InventoryChangedCriterion.Conditions.items(Items.JUKEBOX))
                .build(consumer, TemplateMod121.MOD_ID + "/got_jukebox");

        AdvancementEntry makeEvenMoreNoise = Advancement.Builder.create().parent(makeMoreNoise)
                .display(
                        ModBlocks.SOUND_BLOCK,
                        Text.literal("Fancy Noise Maker"),
                        Text.literal("Obtain a Sound Block"),
                        null,
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        false
                )
                .criterion("has_sound_block", InventoryChangedCriterion.Conditions.items(ModBlocks.SOUND_BLOCK))
                .build(consumer, TemplateMod121.MOD_ID + "/got_sound_block");

        //rotten flesh advancement tree
        AdvancementEntry rottenFlesh1 = Advancement.Builder.create().parent(main)
                .display(
                        Items.ROTTEN_FLESH,
                        Text.literal("Why?"),
                        Text.literal("Obtain Rotten Flesh"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("has_rotten_flesh", InventoryChangedCriterion.Conditions.items(Items.ROTTEN_FLESH))
                .build(consumer, TemplateMod121.MOD_ID + "/got_rotten_flesh");

        AdvancementEntry rottenFlesh2 = Advancement.Builder.create().parent(rottenFlesh1)
                .display(
                        ModBlocks.ROTTEN_FLESH_BLOCK,
                        Text.literal("I sense a growing problem..."),
                        Text.literal("Obtain Rotten Flesh Block"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("has_rotten_flesh_block", InventoryChangedCriterion.Conditions.items(ModBlocks.ROTTEN_FLESH_BLOCK))
                .build(consumer, TemplateMod121.MOD_ID + "/got_rotten_flesh_block");
    }
}

package net.aiq9.items;

import net.aiq9.TemplateMod121;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent TOMATO = new FoodComponent.Builder().saturationModifier(0.25f) //200 = 10 seconds
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 200), 0.25f).build();

    public static final FoodComponent TUMERIC = new FoodComponent.Builder().saturationModifier(0.25f) //200 = 10 seconds
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 200), 0.25f).build();

    public static void registerModFoodComponents() {
        TemplateMod121.LOGGER.info("Registering Mod Food Components for " + TemplateMod121.MOD_ID);
    }
}

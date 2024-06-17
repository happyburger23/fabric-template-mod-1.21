package net.aiq9.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.entity.vehicle.MinecartEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(MinecartEntity.class)
public abstract class AbstractMinecartEntityMixin extends AbstractMinecartEntity {
    protected AbstractMinecartEntityMixin(EntityType<?> entityType, World world) {
        super(entityType, world);
    }

    public double getMaxSpeed() {
        return (this.isTouchingWater() ? 4.0 : 8.0) / 20.0; //default 20 max ground speed; Larger # means slower
    }
}

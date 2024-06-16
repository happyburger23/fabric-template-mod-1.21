package net.aiq9.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Leashable;
import net.minecraft.entity.vehicle.MinecartEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;

public abstract class MinecartEntityMixin extends MinecartEntity implements Leashable {
    private Leashable.LeashData leashData;

    public MinecartEntityMixin(EntityType<?> entityType, World world) {
        super(entityType, world);
    }

    public MinecartEntityMixin(World world, double x, double y, double z) {
        super(world, x, y, z);
    }

    @Nullable
    public Leashable.LeashData getLeashData() {
        return this.leashData;
    }

    public void setLeashData(@Nullable Leashable.LeashData leashData) {
        this.leashData = leashData;
    }

    public Vec3d getLeashOffset() {
        return new Vec3d(0.0, 0.88f * this.getStandingEyeHeight(), this.getWidth() * 0.64f);
    }

    public void applyLeashElasticity(Entity leashHolder, float distance) {
        Vec3d vec3d = leashHolder.getPos().subtract(this.getPos()).normalize().multiply((double)distance - 6.0);
        Vec3d vec3d2 = this.getVelocity();
        boolean bl = vec3d2.dotProduct(vec3d) > 0.0;
        this.setVelocity(vec3d2.add(vec3d.multiply(bl ? (double)0.15f : (double)0.2f)));
    }

    protected void writeCustomDataToNbt(NbtCompound nbt) {
        this.writeLeashDataToNbt(nbt, this.leashData);
    }

    protected void readCustomDataFromNbt(NbtCompound nbt) {
        this.leashData = this.readLeashDataFromNbt(nbt);
    }

    public void remove(Entity.RemovalReason reason) {
        if (!this.getWorld().isClient && reason.shouldDestroy() && this.isLeashed()) {
            this.detachLeash(true, true);
        }
        super.remove(reason);
    }
}

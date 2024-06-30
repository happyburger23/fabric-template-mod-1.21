package net.aiq9.items.custom;

import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class FireStoneItem extends Item {
    private static final Random RANDOM = new Random();
    private static final int RADIUS = 4; // Radius around the player to place fire
    private static final int EXTINGUISH_RADIUS = 10; //Radius around player to extinguish fire

    public FireStoneItem(Settings settings) {
        super(settings);
    }

    private boolean hasFirePlacingItem(PlayerEntity player) {
        for (ItemStack itemStack : player.getInventory().main) {
            if (itemStack.getItem() instanceof FireStoneItem) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;

            if (player.age % 40 ==0) { //check every second (20 ticks to 1 sec) 40 ticks = 2 sec
                if (hasFirePlacingItem(player)) {
                    if (!world.isRaining()) {
                        placeFireAroundPlayer(player);
                    }
                    if (world.isRaining()) {
                        extinguishFireAroundPlayer(player);
                    }
                }
            }
        }
    }

    private void placeFireAroundPlayer(PlayerEntity player) { //places fire around the player when right-clicked
        World world = player.getEntityWorld();
        BlockPos playerBlockPos = player.getBlockPos();

        for (int i = 0; i < 5; i++) { //try placing fire 5 times each tick
            int distX = RANDOM.nextInt(2 * RADIUS + 1) - RADIUS;
            int distZ = RANDOM.nextInt(2 * RADIUS + 1) - RADIUS;

            if (distX == 0 && distZ == 0) { continue; } //skip block player is on

            BlockPos firePos = playerBlockPos.add(distX, 0, distZ);
            BlockPos belowFirePos = firePos.down();
            if (world.isAir(firePos) && world.getBlockState(belowFirePos).isSolidBlock(world, belowFirePos)) {
                world.setBlockState(firePos, Blocks.FIRE.getDefaultState());
            }

            /*
            BlockPos firePos = playerBlockPos.add(distX, 0, distZ);
            if (world.isAir(firePos)) {
                world.setBlockState(firePos, Blocks.FIRE.getDefaultState());
            }
            */
        }
    }

    private void extinguishFireAroundPlayer(PlayerEntity player) {
        World world = player.getEntityWorld();
        BlockPos playerPos = player.getBlockPos();

        for (int distX = -EXTINGUISH_RADIUS; distX <= EXTINGUISH_RADIUS; distX++) {
            for (int distZ = -EXTINGUISH_RADIUS; distZ <= EXTINGUISH_RADIUS; distZ++) {
                BlockPos firePos = playerPos.add(distX, 0, distZ);

                if (world.getBlockState(firePos).getBlock() == Blocks.FIRE) {
                    world.setBlockState(firePos, Blocks.AIR.getDefaultState());
                }
            }
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.literal("Creates a lovely fire around the player wherever they go!").formatted(Formatting.GRAY));
        tooltip.add(Text.literal("Be careful with it...").formatted(Formatting.DARK_RED));

        super.appendTooltip(stack, context, tooltip, type);
    }
}

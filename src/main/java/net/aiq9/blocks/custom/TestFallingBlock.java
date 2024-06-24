package net.aiq9.blocks.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.FallingBlock;

public class TestFallingBlock extends FallingBlock {
    public TestFallingBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends FallingBlock> getCodec() {
        return null;
    }
}

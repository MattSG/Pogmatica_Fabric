package net.fabricmc.pogmatica.fluid;

import net.fabricmc.pogmatica.block.ModBlocks;
import net.fabricmc.pogmatica.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;

public class Poganol extends PogmaticaFluid {
    @Override
    public Fluid getStill() {
        return ModFluids.STILL_POGANOL;
    }

    @Override
    public int getLevel(FluidState state) {
        return 0;
    }

    @Override
    public Fluid getFlowing() {
        return ModFluids.FLOWING_POGANOL;
    }

    @Override
    public Item getBucketItem() {
        return ModItems.BUCKET_POGANOL;
    }

    @Override
    protected BlockState toBlockState(FluidState fluidState) {
        return ModBlocks.POGANOL.getDefaultState().with(Properties.LEVEL_15, getBlockStateLevel(fluidState));
    }

    @Override
    public boolean isStill(FluidState state) {
        return false;
    }

    public static class Flowing extends Poganol {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getLevel(FluidState fluidState) {
            return fluidState.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return false;
        }
    }

    public static class Still extends Poganol {
        @Override
        public int getLevel(FluidState fluidState) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return true;
        }
    }
}

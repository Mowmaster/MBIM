package com.mowmaster.mbim.blocks.GeneratedBlocks;

import com.mowmaster.mbim.MBIMConfigs.MBIMConfig;
import com.mowmaster.mbim.blocks.BaseMetalCrystalBlock;
import com.mowmaster.mbim.registeries.DeferredRegisterBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.PushReaction;

public class BaseMetalCrystalNodeBlock extends BaseMetalCrystalBlock
{
    private static final Direction[] DIRECTIONS = Direction.values();
    private static Block getBlockToGrow;

    public BaseMetalCrystalNodeBlock(Properties p_152726_,Block blockToGrowOnCrystal) {
        super(p_152726_);
        this.getBlockToGrow = blockToGrowOnCrystal;
    }

    public PushReaction getPistonPushReaction(BlockState p_152733_) {
        return PushReaction.NORMAL;
    }

    @Override
    public boolean isRandomlyTicking(BlockState p_49921_) {
        return true;
    }

    public void randomTick(BlockState p_222954_, ServerLevel p_222955_, BlockPos p_222956_, RandomSource p_222957_) {
        if (p_222957_.nextInt(MBIMConfig.COMMON.nodeGrowthChance.get()) == 0) {
            Direction direction = DIRECTIONS[p_222957_.nextInt(DIRECTIONS.length)];
            BlockState blockstateOrigin = p_222955_.getBlockState(p_222956_);
            BlockPos blockpos = p_222956_.relative(direction);
            BlockState blockstate = p_222955_.getBlockState(blockpos);
            Block block = null;

            if (canClusterGrowAtState(blockstate)) {
                p_222955_.setBlock(blockpos, this.getBlockToGrow.defaultBlockState(),2);
            } else{
                if(blockstate.getBlock() instanceof BaseMetalCrystalClusterBlock cluster)
                {
                    int i = cluster.getAge(blockstate);
                    if (i < cluster.getMaxAge()) {
                        p_222955_.setBlock(blockpos, cluster.getStateForAge(i + 1), 2);
                    }
                }
            }
        }
    }

    public static boolean canClusterGrowAtState(BlockState p_152735_) {
        return p_152735_.isAir() || p_152735_.is(Blocks.WATER) && p_152735_.getFluidState().getAmount() == 8;
    }
}

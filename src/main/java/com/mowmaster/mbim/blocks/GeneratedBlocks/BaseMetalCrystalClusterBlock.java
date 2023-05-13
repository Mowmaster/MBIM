package com.mowmaster.mbim.blocks.GeneratedBlocks;

import com.mowmaster.mbim.blocks.BaseMetalCrystalBlock;
import com.mowmaster.mbim.registeries.DeferredRegisterItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class BaseMetalCrystalClusterBlock extends BaseMetalCrystalBlock implements SimpleWaterloggedBlock
{
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    public static final int MAX_AGE = 3;
    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;

    protected final VoxelShape northAabb;
    protected final VoxelShape southAabb;
    protected final VoxelShape eastAabb;
    protected final VoxelShape westAabb;
    protected final VoxelShape upAabb;
    protected final VoxelShape downAabb;

    public BaseMetalCrystalClusterBlock(int p_152015_, int p_152016_, Properties p_152726_) {

        super(p_152726_);
        this.registerDefaultState(this.defaultBlockState().setValue(WATERLOGGED, Boolean.valueOf(false)).setValue(FACING, Direction.UP).setValue(AGE,0));
        this.upAabb = Block.box((double)p_152016_, 0.0D, (double)p_152016_, (double)(16 - p_152016_), (double)p_152015_, (double)(16 - p_152016_));
        this.downAabb = Block.box((double)p_152016_, (double)(16 - p_152015_), (double)p_152016_, (double)(16 - p_152016_), 16.0D, (double)(16 - p_152016_));
        this.northAabb = Block.box((double)p_152016_, (double)p_152016_, (double)(16 - p_152015_), (double)(16 - p_152016_), (double)(16 - p_152016_), 16.0D);
        this.southAabb = Block.box((double)p_152016_, (double)p_152016_, 0.0D, (double)(16 - p_152016_), (double)(16 - p_152016_), (double)p_152015_);
        this.eastAabb = Block.box(0.0D, (double)p_152016_, (double)p_152016_, (double)p_152015_, (double)(16 - p_152016_), (double)(16 - p_152016_));
        this.westAabb = Block.box((double)(16 - p_152015_), (double)p_152016_, (double)p_152016_, 16.0D, (double)(16 - p_152016_), (double)(16 - p_152016_));
    }

    public VoxelShape getShape(BlockState p_152021_, BlockGetter p_152022_, BlockPos p_152023_, CollisionContext p_152024_) {
        Direction direction = p_152021_.getValue(FACING);
        switch(direction) {
            case NORTH:
                return this.northAabb;
            case SOUTH:
                return this.southAabb;
            case EAST:
                return this.eastAabb;
            case WEST:
                return this.westAabb;
            case DOWN:
                return this.downAabb;
            case UP:
            default:
                return this.upAabb;
        }
    }

    public boolean canSurvive(BlockState p_152026_, LevelReader p_152027_, BlockPos p_152028_) {
        Direction direction = p_152026_.getValue(FACING);
        BlockPos blockpos = p_152028_.relative(direction.getOpposite());
        return p_152027_.getBlockState(blockpos).isFaceSturdy(p_152027_, blockpos, direction);
    }

    public BlockState updateShape(BlockState p_152036_, Direction p_152037_, BlockState p_152038_, LevelAccessor p_152039_, BlockPos p_152040_, BlockPos p_152041_) {
        if (p_152036_.getValue(WATERLOGGED)) {
            p_152039_.getFluidTicks();
            //.scheduleTick(p_152040_, Fluids.WATER, Fluids.WATER.getTickDelay(p_152039_))
        }

        return p_152037_ == p_152036_.getValue(FACING).getOpposite() && !p_152036_.canSurvive(p_152039_, p_152040_) ? Blocks.AIR.defaultBlockState() : super.updateShape(p_152036_, p_152037_, p_152038_, p_152039_, p_152040_, p_152041_);
    }

    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    public int getMaxAge() {
        return 3;
    }

    protected int getAge(BlockState p_52306_) {
        return p_52306_.getValue(this.getAgeProperty());
    }

    public BlockState getStateForAge(int p_52290_) {
        return this.defaultBlockState().setValue(this.getAgeProperty(), Integer.valueOf(p_52290_));
    }

    public boolean isMaxAge(BlockState p_52308_) {
        return p_52308_.getValue(this.getAgeProperty()) >= this.getMaxAge();
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext p_152019_) {
        LevelAccessor levelaccessor = p_152019_.getLevel();
        BlockPos blockpos = p_152019_.getClickedPos();
        Direction direction = p_152019_.getClickedFace();
        BlockState blockstate = p_152019_.getLevel().getBlockState(p_152019_.getClickedPos());
        return blockstate.is(this) && blockstate.getValue(FACING) == direction
                ?
                this.defaultBlockState().setValue(FACING, direction.getOpposite()).setValue(AGE, 0).setValue(WATERLOGGED, Boolean.valueOf(levelaccessor.getFluidState(blockpos).getType() == Fluids.WATER))
                :
                this.defaultBlockState().setValue(FACING, direction).setValue(AGE, 0).setValue(WATERLOGGED, Boolean.valueOf(levelaccessor.getFluidState(blockpos).getType() == Fluids.WATER));
    }

    public BlockState rotate(BlockState p_152033_, Rotation p_152034_) {
        return p_152033_.setValue(FACING, p_152034_.rotate(p_152033_.getValue(FACING)));
    }

    public BlockState mirror(BlockState p_152030_, Mirror p_152031_) {
        return p_152030_.rotate(p_152031_.getRotation(p_152030_.getValue(FACING)));
    }

    public FluidState getFluidState(BlockState p_152045_) {
        return p_152045_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(p_152045_);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_152043_) {
        p_152043_.add(WATERLOGGED, FACING, AGE);
    }

    public PushReaction getPistonPushReaction(BlockState p_152733_) {
        return PushReaction.DESTROY;
    }


    public VoxelShape getOcclusionShape(BlockState p_154272_, BlockGetter p_154273_, BlockPos p_154274_) {
        return Shapes.empty();
    }

    public VoxelShape getCollisionShape(BlockState p_154285_, BlockGetter p_154286_, BlockPos p_154287_, CollisionContext p_154288_) {
        return Shapes.empty();
    }

    //Should Fix Building Gadgets dropps issues
    //https://github.com/Direwolf20-MC/MiningGadgets/blob/1.19/src/main/java/com/direwolf20/mininggadgets/common/tiles/RenderBlockTileEntity.java#L444
    /*
    @Override
    public List<ItemStack> getDrops(BlockState p_60537_, LootContext.Builder p_60538_) {
        Random rand = new Random();
        if (p_60537_.getBlock() instanceof BaseMetalCrystalClusterBlock) {

            List<ItemStack> stacks = new ArrayList<>();
            ItemStack itemstack = new ItemStack(DeferredRegisterItems.IRON_CRYSTAL.get());
            if(getAge(p_60537_)==0)itemstack.setCount(rand.nextInt(0, 1));
            if(getAge(p_60537_)==1)itemstack.setCount(rand.nextInt(0, 2));
            if(getAge(p_60537_)==2)itemstack.setCount(rand.nextInt(1, 3)+ 1);
            if(getAge(p_60537_)==3)itemstack.setCount(rand.nextInt(2, 5)+ 1);

            stacks.add(itemstack);
            return stacks;
        }
        return super.getDrops(p_60537_, p_60538_);
    }
     */

    @Override
    public boolean canDropFromExplosion(BlockState state, BlockGetter level, BlockPos pos, Explosion explosion) {
        return true;
    }
}

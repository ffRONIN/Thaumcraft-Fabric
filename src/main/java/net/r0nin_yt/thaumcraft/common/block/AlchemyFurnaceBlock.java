package net.r0nin_yt.thaumcraft.common.block;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;

import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.*;

import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;

import net.minecraft.world.World;
import net.r0nin_yt.thaumcraft.common.block.entity.AlchemyFurnaceBlockEntity;
import net.r0nin_yt.thaumcraft.common.block.entity.TCBlockEntities;
import org.jetbrains.annotations.Nullable;



public class AlchemyFurnaceBlock extends BlockWithEntity implements BlockEntityProvider {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public AlchemyFurnaceBlock(Settings settings) {
        @@ -113,4 +119,49 @@ public BlockState mirror(BlockState state, BlockMirror mirror) {
            protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
                builder.add(FACING);
            }

            /* BLOCK ENTITY */

            @Override
            public BlockRenderType getRenderType(BlockState state) {
                return BlockRenderType.MODEL;
            }

            @Override
            public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
                if (state.getBlock() != newState.getBlock()) {
                    BlockEntity blockEntity = world.getBlockEntity(pos);
                    if (blockEntity instanceof AlchemyFurnaceBlockEntity) {
                        ItemScatterer.spawn(world, pos, (AlchemyFurnaceBlockEntity)blockEntity);
                        world.updateComparators(pos,this);
                    }
                    super.onStateReplaced(state, world, pos, newState, moved);
                }
            }

            @Override
            public ActionResult onUse(BlockState state, World world, BlockPos pos,
                    PlayerEntity player, Hand hand, BlockHitResult hit) {
                if (!world.isClient) {
                    NamedScreenHandlerFactory screenHandlerFactory = state.createScreenHandlerFactory(world, pos);

                    if (screenHandlerFactory != null) {
                        player.openHandledScreen(screenHandlerFactory);
                    }
                }

                return ActionResult.SUCCESS;
            }

            @Nullable
            @Override
            public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
                return new AlchemyFurnaceBlockEntity(pos, state);
            }

            @Nullable
            @Override
            public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
                return checkType(type, TCBlockEntities.ALCHEMY_FURNACE, AlchemyFurnaceBlockEntity::tick);
            }
        }
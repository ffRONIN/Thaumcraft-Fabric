package net.r0nin_yt.thaumcraft.common.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.r0nin_yt.thaumcraft.common.block.entity.TCBlockEntities;
import net.r0nin_yt.thaumcraft.common.item.TCItems;
import net.r0nin_yt.thaumcraft.common.item.inventory.ImplementedInventory;
import net.r0nin_yt.thaumcraft.common.screen.AlchemyFurnaceScreenHandler;
import org.jetbrains.annotations.Nullable;

public class AlchemyFurnaceBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(4, ItemStack.EMPTY);

    public AlchemyFurnaceBlockEntity(BlockPos pos, BlockState state) {
        super(TCBlockEntities.ALCHEMY_FURNACE, pos, state);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    public Text getDisplayName() {
        return new LiteralText("Mythril Blaster");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new AlchemyFurnaceScreenHandler(syncId, inv, this);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
    }



    private static boolean hasRecipe(AlchemyFurnaceBlockEntity entity) {
        boolean hasItemInFirstSlot = entity.getStack(0).getItem() == Items.IRON_INGOT;



        return hasItemInFirstSlot;
    }

    private static boolean hasNotReachedStackLimit(AlchemyFurnaceBlockEntity entity) {
        return entity.getStack(3).getCount() < entity.getStack(3).getMaxCount();
    }
}

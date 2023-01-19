package net.r0nin_yt.thaumcraft.common.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.r0nin_yt.thaumcraft.common.item.TCItems;

import net.r0nin_yt.thaumcraft.common.item.inventory.ImplementedInventory;
import net.r0nin_yt.thaumcraft.common.screen.AlchemyFurnaceScreenHandler;
import org.jetbrains.annotations.Nullable;

public class AlchemyFurnaceBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventrory =
            DefaultedList.ofSize(1, ItemStack.EMPTY);

    public AlchemyFurnaceBlockEntity(BlockPos pos, BlockState state) {
        super(TCBlockEntities.ALCHEMY_FURNACE, pos, state);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return null;
    }
    @Override
    public Text getDisplayName() {
        return new TranslatableText("Alchemy Furnace");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new AlchemyFurnaceScreenHandler(syncId, inv, this);
    }
    @Override
    public void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventrory);
    }
    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventrory);
        super.readNbt(nbt);
    }


    public static void tick(World world, BlockPos pos, BlockState state, AlchemyFurnaceBlockEntity entity) {
        if(hasRecipe(entity) && hasNotReachedStackLimit(entity)) {
            craftItem(entity);
        }
    }

    private static void craftItem(AlchemyFurnaceBlockEntity entity) {
        entity.removeStack(0, 1);

    }

    private static boolean hasRecipe(AlchemyFurnaceBlockEntity entity) {
        boolean hasItemInFirstSlot = entity.getStack(0).getItem() == Items.IRON_INGOT;


        return hasItemInFirstSlot;
    }

    private static boolean hasNotReachedStackLimit(AlchemyFurnaceBlockEntity entity) {
        return entity.getStack(3).getCount() < entity.getStack(3).getMaxCount();
    }
}




package net.r0nin_yt.thaumcraft.common.screen.slot;

import me.shedaniel.rei.api.client.gui.widgets.Slot;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;



    public class TCFuelSlot extends Slot {
        public TCFuelSlot(Inventory inventory, int index, int x, int y) {
            super(inventory, index, x, y);
        }

        @Override
        public boolean canInsert(ItemStack stack) {
            return AbstractFurnaceBlockEntity.canUseAsFuel(stack) || TCFuelSlot.isBucket(stack);
        }

        @Override
        public int getMaxItemCount(ItemStack stack) {
            return TCFuelSlot.isBucket(stack) ? 1 : super.getMaxItemCount(stack);
        }

        public static boolean isBucket(ItemStack stack) {
            return stack.isOf(Items.BUCKET);
        }
    }


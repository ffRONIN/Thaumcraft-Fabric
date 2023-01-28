package net.r0nin_yt.thaumcraft.common.init.tools;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;

public class TCAxe extends AxeItem {
    public TCAxe(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
        if (entity instanceof PlayerEntity player){
            ItemStack slotItemStack = player.getInventory().getStack(slot);
            Repairable.repairTick(slotItemStack, player.getWorld().getTime());
        }
    }
}

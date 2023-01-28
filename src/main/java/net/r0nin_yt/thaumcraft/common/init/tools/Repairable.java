package net.r0nin_yt.thaumcraft.common.init.tools;

import net.r0nin_yt.thaumcraft.common.init.libs.TCMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.nbt.NbtCompound;

public class Repairable {

    private static void repair(ItemStack thisItem, long currentTime) {
        NbtCompound nbt = thisItem.getNbt();
        if (nbt != null){
            if (nbt.getInt("Damage") > 0){
                long time_elapsed = currentTime - nbt.getLong("ThaumcraftRepairCounter");
                if (time_elapsed <= 0) {
                    nbt.putLong("ThaumcraftRepairCounter", currentTime);
                    nbt.putInt("Damage", nbt.getInt("Damage") - 1);
                }
                if (time_elapsed >= 20) {
                    nbt.putLong("ThaumcraftRepairCounter", currentTime);
                    nbt.putInt("Damage", nbt.getInt("Damage") - 1);
                }
                thisItem.setNbt(nbt);
            }
        }
    }

    public static void repairTick(ItemStack thisItem, long currentTime) {
        if (thisItem.getItem() instanceof ToolItem item){
            if (item.getMaterial() instanceof TCMaterial material){
                if (material.getSelfRepairable()) {
                    repair(thisItem, currentTime);
                }
            }
        }
    }

}

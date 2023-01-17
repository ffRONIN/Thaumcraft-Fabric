package net.r0nin_yt.thaumcraft.common.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.r0nin_yt.thaumcraft.Thaumcraft;


public class ModItemGroup {
    public static final ItemGroup THAUMCRAFT = FabricItemGroupBuilder.build(new Identifier(Thaumcraft.MOD_ID,
            "thaumcraft"), () -> new ItemStack(TCItems.DRIED_OUT_THAUMIUM_INGOT));

}

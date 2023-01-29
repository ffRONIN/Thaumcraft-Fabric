package net.r0nin_yt.thaumcraft.common.init.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.r0nin_yt.thaumcraft.Thaumcraft;
import net.r0nin_yt.thaumcraft.common.block.DeconstructionTable;
import net.r0nin_yt.thaumcraft.common.init.item.TCItem;
import net.r0nin_yt.thaumcraft.common.init.item.items.SimpleItem;
import net.r0nin_yt.thaumcraft.common.lib.register.Rotatable;

public class TCBlockRegistry {

//for rotatable blocks
   // public static final Block DECONSTRUCTION_TABLE = Rotatable.register("deconstruction_table", new DeconstructionTable(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).nonOpaque())
//for basic blocks(i don't have an example)
    public static final Block SILVERWOOD = Rotatable.register("silver_wood", new DeconstructionTable(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).nonOpaque()));


    public static void register() {
        Thaumcraft.LOGGER.info("Blocks Registry to Thaumcraft");
    }

}

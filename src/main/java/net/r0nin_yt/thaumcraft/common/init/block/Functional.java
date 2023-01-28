package net.r0nin_yt.thaumcraft.common.init.block;

import net.r0nin_yt.thaumcraft.Thaumcraft;
import net.r0nin_yt.thaumcraft.common.block.ArcaneWorkbench;
import net.r0nin_yt.thaumcraft.common.block.DeconstructionTable;
import net.r0nin_yt.thaumcraft.common.block.Table;
import net.r0nin_yt.thaumcraft.common.lib.register.Rotatable;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class Functional {

    public static final Block TABLE = Rotatable.register(
            "table",
            new Table(
                    FabricBlockSettings
                    .copyOf(Blocks.CRAFTING_TABLE)
                    .nonOpaque()
            )
    );

    public static final Block ARCANE_WORKBENCH = Rotatable.register(
            "arcane_workbench",
            new ArcaneWorkbench(
                    FabricBlockSettings
                    .copyOf(Blocks.CRAFTING_TABLE)
                    .nonOpaque()
            )
    );

    public static final Block DECONSTRUCTION_TABLE = Rotatable.register(
            "deconstruction_table",
            new DeconstructionTable(
                    FabricBlockSettings
                    .copyOf(Blocks.CRAFTING_TABLE)
                    .nonOpaque()
            )
    );
















    public static void register() {
        Thaumcraft.LOGGER.info("Loading functional blocks");
    }

}

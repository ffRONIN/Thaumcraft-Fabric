package net.r0nin_yt.thaumcraft.common.lib.register;

import net.r0nin_yt.thaumcraft.common.init.Register;
import net.r0nin_yt.thaumcraft.common.lib.BlockDataGen;
import net.r0nin_yt.thaumcraft.common.lib.ItemDataGen;
import net.minecraft.block.Block;

public class Rotatable {

    // TODO
    // Delete in future commits
    public static Block register(String name, Block block) {
        ItemDataGen.simpleItemBlockModel(name);
        BlockDataGen.simpleBlockLootTable(name);
        BlockDataGen.simpleRotatableBlockState(name);
        return Register.registerBlock(name, block);
    }

}

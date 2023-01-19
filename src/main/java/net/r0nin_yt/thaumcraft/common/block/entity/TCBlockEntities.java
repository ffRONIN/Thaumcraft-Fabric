package net.r0nin_yt.thaumcraft.common.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.r0nin_yt.thaumcraft.Thaumcraft;
import net.r0nin_yt.thaumcraft.common.block.TCBlocks;

public class TCBlockEntities {
    public static BlockEntityType<AlchemyFurnaceBlockEntity> ALCHEMY_FURNACE;
    public static void registerAllBlockEntities(){
        ALCHEMY_FURNACE = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(Thaumcraft.MOD_ID, "alchemy_furnace"),
                FabricBlockEntityTypeBuilder.create(AlchemyFurnaceBlockEntity::new,
                        TCBlocks.ALCHEMY_FURNACE).build(null));
    }

}

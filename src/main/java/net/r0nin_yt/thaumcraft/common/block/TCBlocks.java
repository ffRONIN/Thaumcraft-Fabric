package net.r0nin_yt.thaumcraft.common.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.r0nin_yt.thaumcraft.Thaumcraft;
import net.r0nin_yt.thaumcraft.common.item.ModItemGroup;


public class TCBlocks {



    public static final Block ALCHEMY_FURNACE = create("alchemy_furnace",
            new AlchemyFurnaceBlock(FabricBlockSettings.of(Material.STONE).strength(7.0f).requiresTool()), ModItemGroup.THAUMCRAFT);




    private static Block create(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Thaumcraft.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Thaumcraft.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }




    public static void registerModBlocks() {
        Thaumcraft.LOGGER.info("Registring ModBlocks for" + Thaumcraft.MOD_ID);
    }
}

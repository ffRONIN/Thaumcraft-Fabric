package net.r0nin_yt.thaumcraft.common.init;

import net.r0nin_yt.thaumcraft.Thaumcraft;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Register {

    // Registering pure item (with coloring)
    public static Item registerItem(String name, Item item) {
        return Registry.register(
                Registry.ITEM,
                new Identifier(Thaumcraft.MODID, name),
                item
        );
    }

    public static Item registerItem(String name, Item item, int color) {
        Item result = Registry.register(
                Registry.ITEM,
                new Identifier(Thaumcraft.MODID, name),
                item
        );
        ColorProviderRegistry.ITEM.register(
                (stack, tintIndex) -> color, result
        );

        return result;
    }


    // Registering pure block (with coloring)
    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);

        return Registry.register(
                Registry.BLOCK,
                new Identifier(Thaumcraft.MODID, name),
                block
        );
    }

    public static Block registerBlock(String name, Block block, int color) {
        registerBlockItem(name, block, color);
        Block result = Registry.register(
                Registry.BLOCK,
                new Identifier(Thaumcraft.MODID, name),
                block
        );
        ColorProviderRegistry.BLOCK.register(
                (state, view, pos, tintIndex) -> color, block
        );

        return result;
    }


    // Registering item related on block (with coloring)
    public static void registerBlockItem(String name, Block block) {
        Registry.register(
                Registry.ITEM,
                new Identifier(Thaumcraft.MODID, "block/" + name),
                new BlockItem(block, new FabricItemSettings().group(Thaumcraft.MOD_GROUP))
        );
    }

    public static void registerBlockItem(String name, Block block, int color) {
        Item result = Registry.register(
                Registry.ITEM,
                new Identifier(Thaumcraft.MODID, "block/" + name),
                new BlockItem(block, new FabricItemSettings().group(Thaumcraft.MOD_GROUP))
        );
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> color, result);
    }

}

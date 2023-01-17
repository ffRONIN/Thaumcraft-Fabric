package net.r0nin_yt.thaumcraft.common.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;

import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.r0nin_yt.thaumcraft.Thaumcraft;

public class TCScreenHandlers {
    public static ScreenHandlerType<AlchemyFurnaceScreenHandler> ALCHEMY_FURNACE_SCREEN_HANDLER;

    public static void registerAllScreenHandlers() {
        ALCHEMY_FURNACE_SCREEN_HANDLER =
                ScreenHandlerRegistry.registerSimple(new Identifier(Thaumcraft.MOD_ID, "alchemy_furnace"),
                        AlchemyFurnaceScreenHandler::new);
    }
}
package net.r0nin_yt.thaumcraft;

import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.r0nin_yt.thaumcraft.common.screen.AlchemyFurnaceScreenHandler;
import net.r0nin_yt.thaumcraft.common.screen.TCScreenHandlers;

public class ThaumcraftClient {

      ScreenRegistry.register(TCScreenHandlers.ALCHEMY_FURNACE_SCREEN_HANDLER, AlchemyFurnaceScreenHandler::new);
}

package net.r0nin_yt.thaumcraft;


import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.r0nin_yt.thaumcraft.common.screen.AlchemyFurnaceScreen;
import net.r0nin_yt.thaumcraft.common.screen.TCScreenHandlers;

public class ThaumcraftClient implements ClientModInitializer {
      @Override
      public void onInitializeClient() {
            ScreenRegistry.register(TCScreenHandlers.ALCHEMY_FURNACE_SCREEN_HANDLER, AlchemyFurnaceScreen::new);
      }
}
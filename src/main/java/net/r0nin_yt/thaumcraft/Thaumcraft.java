package net.r0nin_yt.thaumcraft;

import net.fabricmc.api.ModInitializer;


import net.r0nin_yt.thaumcraft.common.block.TCBlocks;
import net.r0nin_yt.thaumcraft.common.block.entity.TCBlockEntities;
import net.r0nin_yt.thaumcraft.common.item.TCItems;
import net.r0nin_yt.thaumcraft.common.screen.TCScreenHandlers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Thaumcraft implements ModInitializer {
    public static final String MOD_ID = "thaumcraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {




        TCItems.registerModItems();
        TCBlocks.registerModBlocks();
        TCBlockEntities.registerAllBlockEntities();
        TCScreenHandlers.registerAllScreenHandlers();

    }
}



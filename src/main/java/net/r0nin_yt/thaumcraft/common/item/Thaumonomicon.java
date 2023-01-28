package net.r0nin_yt.thaumcraft.common.item;

import io.github.cottonmc.cotton.gui.client.CottonClientScreen;
import net.r0nin_yt.thaumcraft.common.gui.thaumonomicon.ThaumonomiconGui;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class Thaumonomicon extends Item {


    public Thaumonomicon(Settings settings) {
        super(settings);
    }

    @Environment(EnvType.CLIENT)
    private void drawScreen(PlayerEntity user, Hand hand) {

        if (user.getWorld().isClient()) {
            MinecraftClient.getInstance().setScreenAndRender(new CottonClientScreen(new ThaumonomiconGui()));
            // testing sound
            MinecraftClient.getInstance()
            .getSoundManager().play(PositionedSoundInstance
            .master(SoundEvents.ENTITY_LIGHTNING_BOLT_IMPACT, 1.0F));
        }

    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        drawScreen(user, hand);
        return super.use(world, user, hand);
    }


}

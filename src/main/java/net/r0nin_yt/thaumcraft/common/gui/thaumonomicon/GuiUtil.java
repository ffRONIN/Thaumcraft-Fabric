package net.r0nin_yt.thaumcraft.common.gui.thaumonomicon;

import io.github.cottonmc.cotton.gui.widget.data.Texture;
import net.r0nin_yt.thaumcraft.Thaumcraft;
import net.minecraft.util.Identifier;

public class GuiUtil {

    public static final Texture contents =
            new Texture(new Identifier(Thaumcraft.MODID, "textures/gui/thaumonomicon/research.png"));
    public static final Texture normal_back =
            new Texture(new Identifier(Thaumcraft.MODID, "textures/gui/thaumonomicon/researchback.png"));
    public static final Texture eldritch_back =
            new Texture(new Identifier(Thaumcraft.MODID, "textures/gui/thaumonomicon/researchback_eldritch.png"));

    public static final Texture research_border =
            cutTexture(contents, 0, 0, 256, 230, 256, 256);

    // tabs
    public static final Texture research_tab_active =
            cutTexture(contents, 152, 232, 24, 24, 256, 256);
    public static final Texture research_tab_inactive =
            cutTexture(contents, 176, 232, 24, 24, 256, 256);
    public static final Texture research_tab_shadow =
            cutTexture(contents, 200, 232, 24, 24, 256, 256);

    // researches
    public static final Texture research_square =
            cutTexture(contents, 0, 230, 26, 26, 256, 256);
    public static final Texture research_circle =
            cutTexture(contents, 54, 230, 26, 26, 256, 256);
    public static final Texture research_hex =
            cutTexture(contents, 110, 230, 26, 26, 256, 256);
    public static final Texture research_flower =
            cutTexture(contents, 26, 230, 26, 26, 256, 256);

    // idk
    public static final Texture research_yellow_square =
            cutTexture(contents, 86, 230, 26, 26, 256, 256);
    public static final Texture research_yellow_hex =
            cutTexture(contents, 230, 230, 26, 26, 256, 256);

    public static Texture cutTexture(Texture texture, int x, int y, int dx, int dy, int sizeX, int sizeY) {
        return texture.withUv(
                (float)x/(float)sizeX,
                (float)y/(float)sizeY,
                (float)(x+dx)/(float)sizeX,
                (float)(y+dy)/(float)sizeY
        );
    }

}

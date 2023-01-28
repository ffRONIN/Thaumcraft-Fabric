package net.r0nin_yt.thaumcraft.common.gui.thaumonomicon;

import io.github.cottonmc.cotton.gui.client.ScreenDrawing;
import io.github.cottonmc.cotton.gui.widget.WWidget;
import io.github.cottonmc.cotton.gui.widget.data.InputResult;
import io.github.cottonmc.cotton.gui.widget.data.Texture;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.util.math.MatrixStack;

import static net.r0nin_yt.thaumcraft.common.gui.thaumonomicon.GuiUtil.*;

public class ResearchPanel extends WWidget {

    private final Integer sizeX, sizeY;
    private float textureX = 0, textureY = 0;




    public ResearchPanel(Integer sizeX, Integer sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }



    @Environment(EnvType.CLIENT)
    @Override
    public void paint(MatrixStack matrices, int x, int y, int mouseX, int mouseY) {
        ScreenDrawing.texturedRect(matrices, x, y, sizeX, sizeY, cutBackground(eldritch_back), 0xFFFFFFFF);
        ScreenDrawing.texturedRect(matrices, x, y, sizeX, sizeY, research_border, 0xFFFFFFFF);
        super.paint(matrices, x, y, mouseX, mouseY);
    }

    @Environment(EnvType.CLIENT)
    @Override
    public InputResult onMouseDrag(int x, int y, int button, double deltaX, double deltaY) {
        if (button == 0) update(-deltaX, -deltaY);
        return InputResult.PROCESSED;
    }



    private void update(double deltaX, double deltaY) {
        textureX += deltaX;
        if (textureX < 0) textureX = 0;
        if (textureX > sizeX) textureX = sizeX;

        textureY += deltaY;
        if (textureY < 0) textureY = 0;
        if (textureY > sizeY) textureY = sizeY;
    }

    private Texture cutBackground(Texture texture) {
        return texture.withUv(
                (textureX)/sizeX/2,
                (textureY)/sizeY/2,
                (textureX)/sizeX/2 + 0.5f,
                (textureY)/sizeY/2 + 0.5f
        );
    }

    public Integer getSizeX() {
        return sizeX;
    }

    public Integer getSizeY() {
        return sizeY;
    }


}

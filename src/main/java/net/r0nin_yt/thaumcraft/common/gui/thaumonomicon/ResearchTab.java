package net.r0nin_yt.thaumcraft.common.gui.thaumonomicon;

import io.github.cottonmc.cotton.gui.client.ScreenDrawing;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.data.InputResult;
import io.github.cottonmc.cotton.gui.widget.data.Texture;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.TranslatableText;

import static net.r0nin_yt.thaumcraft.common.gui.thaumonomicon.GuiUtil.*;

public class ResearchTab extends WButton {

    private boolean active = false;
    private final Integer size;
    private final Texture icon;
    private final TranslatableText name;







    public ResearchTab(Integer size, Texture icon, String name) {
        this.size = size;
        this.icon = icon;
        this.name = new TranslatableText(name);
    }



    @Override
    public void paint(MatrixStack matrices, int x, int y, int mouseX, int mouseY) {
        int size_temp = size*3/4;
        if (active) {
            ScreenDrawing.texturedRect(matrices, x, y, size, size, research_tab_active, 0xFFFFFFFF);
            ScreenDrawing.texturedRect(matrices, x + size/4, y + size/8, size_temp, size_temp, icon, 0xFFFFFFFF);
        }
        else {
            ScreenDrawing.texturedRect(matrices, x, y, size, size, research_tab_inactive, 0xFFFFFFFF);
            ScreenDrawing.texturedRect(matrices, x + size/2, y + size/8, size_temp, size_temp, icon, 0xFFFFFFFF);
            ScreenDrawing.texturedRect(matrices, x, y, size, size, research_tab_shadow, 0xFFFFFFFF);
        }
    }

    @Override
    public void renderTooltip(MatrixStack matrices, int x, int y, int tX, int tY) {
        ScreenDrawing.drawString(matrices, name.asOrderedText(), x+tX+8, y+tY, 0xFFFFFFFF);
    }

    @Override
    public InputResult onClick(int x, int y, int button) {
        return InputResult.IGNORED;
    }

    @Override
    public boolean canResize() {
        return true;
    }

    @Override
    public boolean canFocus() {
        return true;
    }



    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Integer getSize() {
        return size;
    }

}

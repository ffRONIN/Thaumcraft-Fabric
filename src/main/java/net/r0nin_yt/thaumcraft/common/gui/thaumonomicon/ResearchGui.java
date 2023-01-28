package net.r0nin_yt.thaumcraft.common.gui.thaumonomicon;

import io.github.cottonmc.cotton.gui.client.BackgroundPainter;
import io.github.cottonmc.cotton.gui.widget.WPanel;
import io.github.cottonmc.cotton.gui.widget.WPlainPanel;
import io.github.cottonmc.cotton.gui.widget.data.InputResult;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.sound.SoundEvents;

import java.util.ArrayList;
import java.util.List;



public class ResearchGui extends WPlainPanel {

    private final Integer sizeX, sizeY;

    private ResearchPanel panel;
    private Integer panelX, panelY;

    private final List<ResearchTab> tabs = new ArrayList<>();





    public ResearchGui(Integer sizeX, Integer sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.setSize(sizeX, sizeY);
    }



    @Override
    public void paint(MatrixStack matrices, int x, int y, int mouseX, int mouseY) {
        int ypos = 0;
        for (ResearchTab tab : tabs) {
            tab.paint(matrices, x, y + ypos, mouseX, mouseY);
            ypos += tab.getSize();
        }
        panel.paint(matrices, x + panelX, y + panelY, panel.getSizeX(), panel.getSizeY());
    }

    @Override
    public InputResult onClick(int x, int y, int button) {
        if (button == 0) {
            if (x >= 0 && x <= panelX)
                for (int i = 0 ; i < tabs.size() ; i++) {
                    if (y >= i * tabs.get(i).getSize() && y <= (i + 1) * tabs.get(i).getSize()){
                        if (!tabs.get(i).isActive()){
                            for (ResearchTab tab: tabs) tab.setActive(false);
                            tabs.get(i).setActive(true);

                            // testing sound
                            MinecraftClient.getInstance()
                            .getSoundManager().play(PositionedSoundInstance
                            .master(SoundEvents.ENTITY_LIGHTNING_BOLT_IMPACT, 1.0F));
                        }
                    }
                }
        }
        return InputResult.IGNORED;
    }

    @Override
    public WPanel setBackgroundPainter(BackgroundPainter painter) {
        return null;
    }



    public void addTab(ResearchTab w) {
        tabs.add(w);
        this.children.clear();
        addTabsToScreen();
    }

    public void setTabs(List<ResearchTab> wList) {
        tabs.clear();
        tabs.addAll(wList);
        this.children.clear();
        addTabsToScreen();
    }

    private void addTabsToScreen() {
        int ypos = 0;
        for (ResearchTab tab : tabs) {
            this.add(tab, 0, ypos, tab.getSize(), tab.getSize());
            ypos += tab.getSize();
        }
    }

    public List<ResearchTab> getTabs() {
        return tabs;
    }

    public void setResearchPanel(ResearchPanel w, int x, int y) {
        panel = w;
        panelX = x;
        panelY = y;
        this.add(w, x, y, sizeX, sizeY);
    }
}

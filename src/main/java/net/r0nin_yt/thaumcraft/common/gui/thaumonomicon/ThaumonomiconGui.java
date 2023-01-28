package net.r0nin_yt.thaumcraft.common.gui.thaumonomicon;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;

import java.util.Arrays;
import java.util.List;

import static net.r0nin_yt.thaumcraft.common.gui.thaumonomicon.Icons.*;
import static net.r0nin_yt.thaumcraft.common.gui.thaumonomicon.Icons.rt_basics;

public class ThaumonomiconGui extends LightweightGuiDescription {

    private static final String translatePath = "gui.thaumcraft.";
    private static final Integer tabSize = 26;
    private static final Integer researchX = 256, researchY = researchX-tabSize;
    private static final Integer sizeX = tabSize + researchX, sizeY = researchY;

    public static final ResearchGui root = new ResearchGui(sizeX, sizeY);

    private final ResearchPanel research = new ResearchPanel(researchX, researchY);
    private static List<ResearchTab> tabs = Arrays.asList(
            new ResearchTab(tabSize, rt_basics, translatePath + "basics_tab"),
            new ResearchTab(tabSize, rt_thaumaturgy, translatePath + "thaumaturgy_tab"),
            new ResearchTab(tabSize, rt_alchemy, translatePath + "alchemy_tab"),
            new ResearchTab(tabSize, rt_artifice, translatePath + "artifice_tab"),
            new ResearchTab(tabSize, rt_golemancy, translatePath + "golemancy_tab"),
            new ResearchTab(tabSize, rt_eldritch, translatePath + "eldritch_tab")
    );





    public ThaumonomiconGui() {
        root.setSize(sizeX, sizeY);
        research.setSize(researchX, researchY);
        setRootPanel(root);

        for (ResearchTab tab: tabs)
            tab.setActive(false);
        tabs.get(0).setActive(true);
        root.setTabs(tabs);
        root.setResearchPanel(research, tabSize, 0);
    }



    public static List<ResearchTab> getTabs() {
        return tabs;
    }

    public static void setTabs(List<ResearchTab> origTabs) {
        ThaumonomiconGui.tabs = origTabs;
    }

    public static void addTab(ResearchTab tab) {
        ThaumonomiconGui.tabs.add(tab);
    }

}

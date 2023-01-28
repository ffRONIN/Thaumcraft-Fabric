package net.r0nin_yt.thaumcraft.common.item.wandcraft;

import net.r0nin_yt.thaumcraft.common.item.wandcraft.ingredients.Cap;
import net.r0nin_yt.thaumcraft.common.item.wandcraft.ingredients.Rod;
import net.r0nin_yt.thaumcraft.common.item.wandcraft.variants.FociWear;
import net.r0nin_yt.thaumcraft.common.item.wandcraft.variants.VisCraft;
import net.r0nin_yt.thaumcraft.common.item.wandcraft.variants.Weapon;

public class Scepter extends WandAbstract implements VisCraft, Weapon, FociWear {

    public Scepter(Settings settings, Cap caps, Rod rod) {
        super(settings, rod, caps, 0.10f, 1.5f);
    }



    @Override
    public boolean canVisCraft() {
        return true;
    }

    @Override
    public boolean canWearFoci() {
        return false;
    }

    @Override
    public boolean isWeapon() {
        return false;
    }
}

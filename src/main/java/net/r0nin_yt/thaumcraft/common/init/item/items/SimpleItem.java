package net.r0nin_yt.thaumcraft.common.init.item.items;

import net.r0nin_yt.thaumcraft.common.init.Register;
import net.r0nin_yt.thaumcraft.common.init.item.TCItem;
import net.minecraft.item.Item;
import static net.r0nin_yt.thaumcraft.common.lib.ItemDataGen.simpleItemModel;



public class SimpleItem extends TCItem {



    public SimpleItem(Item item, String name) {
        super(item, name);
    }
    public SimpleItem(Item item, String name, int color) {
        super(item, name, color);
    }



    @Override
    public void model() {
        simpleItemModel("generated", name(), name());
    }

    @Override
    public void register() {

        if (color() == 0x000000)
            setItem(Register.registerItem(name(), item()));
        else
            setItem(Register.registerItem(name(), item(), color()));

        setRegistered(true);
    }

    @Override
    public void load() {
        model();
        register();
    }

}

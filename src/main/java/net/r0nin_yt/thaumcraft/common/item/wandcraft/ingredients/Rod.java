package net.r0nin_yt.thaumcraft.common.item.wandcraft.ingredients;

import net.minecraft.block.Material;

public class Rod {

    private Material material;
    private int capacity;



    public Rod(Material material, int capacity) {
        this.material = material;
        this.capacity = capacity;
    }



    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

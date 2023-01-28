package net.r0nin_yt.thaumcraft.common.item.wandcraft.ingredients;

import net.minecraft.block.Material;

public class Cap {

    /*
            Set 'discount' always as:
            10% aspect margin     ->   -0.10f to 'discount' constructor/setter,
             5% aspect margin     ->   -0.05f ...,
             0%                   ->    0.00f ...,
            10% aspect discount   ->    0.10f ...,
            25% aspect discount   ->    0.25f ...;

            Getter will give same discount/margin in float you put into setter.

            Program changes discount/margin to [1 - multiplier] which means:
            -0.10f to constructor/setter   ->   1.10 multiplier for cap,
            -0.05f to constructor/setter   ->   1.05 ...,
             0.00f to constructor/setter   ->   1.00 ...,
             0.10f to constructor/setter   ->   0.90 ...,
             0.25f to constructor/setter   ->   0.75 ...;
    */



    private Material material;
    private float discount;



    public Cap(Material material, float discount) {
        this.material = material;
        this.discount = 1 - discount;
    }



    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = 1 - discount;
    }
}

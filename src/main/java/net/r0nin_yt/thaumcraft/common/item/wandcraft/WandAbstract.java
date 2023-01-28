package net.r0nin_yt.thaumcraft.common.item.wandcraft;

import net.r0nin_yt.thaumcraft.common.item.wandcraft.ingredients.Cap;
import net.r0nin_yt.thaumcraft.common.item.wandcraft.ingredients.Rod;
import net.minecraft.item.Item;

public abstract class WandAbstract extends Item {
    /*
            Set multiplier always as:
            10% aspect margin     ->   -0.10f to multiplier constructor/setter,
             5% aspect margin     ->   -0.05f ...,
             0%                   ->    0.00f ...,
            10% aspect discount   ->    0.10f ...,
            25% aspect discount   ->    0.25f ...;

            Getter will give same discount/margin in float you put into setter.

            Program changes discount/margin to [1 - multiplier] which means:
            -0.10f to constructor/setter   ->   1.10 multiplier for wand,
            -0.05f to constructor/setter   ->   1.05 ...,
             0.00f to constructor/setter   ->   1.00 ...,
             0.10f to constructor/setter   ->   0.90 ...,
             0.25f to constructor/setter   ->   0.75 ...;
    */



    private Cap caps;
    private Rod rod;

    private float discountMultiplier;
    private float capacityMultiplier;
    private float discount;
    private int capacity;



    public WandAbstract(Settings settings, Rod rod, Cap caps, float rawDiscountMultiplier, float capacityMultiplier) {
        super(settings);

        // basic info for capacity and discount
        this.setRod(rod);
        this.setCaps(caps);

        // info for capacity and info final values
        this.setCapacityMultiplier(capacityMultiplier);
        this.setDiscountMultiplier(1.00f - rawDiscountMultiplier);
    }



    public Cap getCaps() {
        return caps;
    }

    public void setCaps(Cap caps) {
        this.caps = caps;
    }

    public Rod getRod() {
        return rod;
    }

    public void setRod(Rod rod) {
        this.rod = rod;
    }

    public float getDiscountMultiplier() {
        return 1 - discountMultiplier;
    }

    public void setDiscountMultiplier(float discountMultiplier) {
        this.discountMultiplier = discountMultiplier;
        this.discount = 1.00f - this.caps.getDiscount() - this.discountMultiplier;
    }

    public float getCapacityMultiplier() {
        return capacityMultiplier;
    }

    public void setCapacityMultiplier(float capacityMultiplier) {
        this.capacityMultiplier = capacityMultiplier;
        this.capacity = (int) (this.rod.getCapacity() * this.capacityMultiplier);
    }

    public float getDiscount() {
        return discount;
    }

    public int getCapacity() {
        return capacity;
    }

}

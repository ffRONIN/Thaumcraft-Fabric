package net.r0nin_yt.thaumcraft.common.init.libs;


import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import static net.r0nin_yt.thaumcraft.common.init.item.TCItemsRegistry.INFUSED_STABILISED_THAUMIUM_INGOT;
import static net.r0nin_yt.thaumcraft.common.init.item.TCItemsRegistry.VOID_METAL_INGOT;


public enum TCMaterial implements ToolMaterial {
    // 0 - wood/gold, 1 - stone, 2 - iron, 3 - diamond, 4 - netherite

    THAUMIUMIUM(3, 400, 7.0F, 3.0F, 18,
            Ingredient.ofItems( INFUSED_STABILISED_THAUMIUM_INGOT.getItem()), false
    ),
    ELEMENTAL(3, 1561, 8.0F, 4.0F, 18,
            Ingredient.ofItems(Items.DIAMOND), false
    ),
    VOID(3, 150, 7.0F, 4.0F, 18,
            Ingredient.ofItems(VOID_METAL_INGOT.getItem()), true
    );

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairIngredient;
    private final boolean selfRepairable;

    TCMaterial(int miningLevel, int itemDurability,
               float miningSpeed, float attackDamage,
               int enchantability, Ingredient repairIngredient,
               boolean selfRepairable) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
        this.selfRepairable = selfRepairable;
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }

    public boolean getSelfRepairable() {
        return this.selfRepairable;
    }
}

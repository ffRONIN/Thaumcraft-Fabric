package net.r0nin_yt.thaumcraft.common.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;
import net.r0nin_yt.thaumcraft.Thaumcraft;
import net.r0nin_yt.thaumcraft.common.custom.TCArmorMaterials;


public class TCItems {
        public static final Item DRIED_OUT_THAUMIUM_INGOT = create("dried_out_thaumium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item INFUSED_DESTABILISED_THAUMIUM_INGOT = create("infused_destabilised_thaumium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item THAUMIUM_INGOT_NORMAL = create("thaumium_ingot_normal",
            new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item INFUSED_STABILISED_THAUMIUM_INGOT = create("infused_stabilised_thaumium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item  INFUSED_THAUMIUM_HELMET = create("infused_thaumium_helmet",
            new ArmorItem(TCArmorMaterials.THAUMIUM, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item INFUSED_THAUMIUM_CHESTPLATE = create("infused_thaumium_chestplate",
            new ArmorItem(TCArmorMaterials.THAUMIUM, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item INFUSED_THAUMIUM_LEGGINS = create("infused_thaumium_leggings",
            new ArmorItem(TCArmorMaterials.THAUMIUM, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item INFUSED_THAUMIUM_BOOTS = create("infused_thaumium_boots",
            new ArmorItem(TCArmorMaterials.THAUMIUM, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item  CRIMSON_ROBE_HELM = create("crimson_robe_helm",
            new ArmorItem(TCArmorMaterials.CRIMSON_ROBE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item CRIMSON_ROBE_CHEST = create("crimson_robe_chest",
            new ArmorItem(TCArmorMaterials.CRIMSON_ROBE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item CRIMSON_ROBE_LEGS = create("crimson_robe_legs",
            new ArmorItem(TCArmorMaterials.CRIMSON_ROBE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item  CRIMSON_PLATE_HELM = create("crimson_plate_helm",
            new ArmorItem(TCArmorMaterials.CRIMSON_PLATE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item CRIMSON_PLATE_CHEST = create("crimson_plate_chest",
            new ArmorItem(TCArmorMaterials.CRIMSON_PLATE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item CRIMSON_PLATE_LEGS = create("crimson_plate_legs",
            new ArmorItem(TCArmorMaterials.CRIMSON_PLATE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item CRIMSON_PRAETOR_HELM = create("crimson_praetor_helm",
            new ArmorItem(TCArmorMaterials.CRIMSON_PRAETOR, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item CRIMSON_PRAETOR_CHEST = create("crimson_praetor_chest",
            new ArmorItem(TCArmorMaterials.CRIMSON_PRAETOR, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item CRIMSON_PRAETOR_LEGS = create("crimson_praetor_legs",
            new ArmorItem(TCArmorMaterials.CRIMSON_PRAETOR, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));











    private static Item create(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Thaumcraft.MOD_ID,name), item);
    }
    public static void registerModItems() {
        Thaumcraft.LOGGER.info("Items for mod for " + Thaumcraft.MOD_ID);

    }
}

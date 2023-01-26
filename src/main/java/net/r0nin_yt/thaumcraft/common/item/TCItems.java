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
    public static final Item CRIMSON_PRAETOR_LEGS = create("crimson_praetor_legs", new ArmorItem(TCArmorMaterials.CRIMSON_PRAETOR, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));

    public static final Item VOID_INGOT = create("void_ingot", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item ICHORIUM_INGOT = create("ichor_ingot", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item MYTHRIL_INGOT = create("mythril_ingot", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item ADAMANTITE_INGOT = create("adamantite_ingot", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item WRATH_SHARD = create("wrath_shard", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item AIR_SHARD = create("air_shard", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item FIRE_SHARD = create("fire_shard", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item WATER_SHARD = create("water_shard", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item EARTH_SHARD = create("earth_shard", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item ORDER_SHARD = create("order_shard", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item ENTROPY_SHARD = create("entropy_shard", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item BALANCED_SHARD = create("balanced_shard", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item ENVY_SHARD = create("envy_shard", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item TAINT_SHARD = create("taint_shard", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item PRIDE_SHARD = create("pride_shard", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item LUST_SHARD = create("lust_shard", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item SLOTH_SHARD = create("sloth_shard", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item GLUTTONY_SHARD = create("gluttony_shard", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item SHARD_OF_CREATION = create("shard_of_creation", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item TAINTED_UNBALANCED_SHARD = create("tainted_unbalanced_shard", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item WARPED_UNBALANCED_SHARD = create("warped_unbalanced_shard", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item NATIVE_CINNABAR_CLUSTER = create("native_cinobar_cluster", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item NATIVE_IRON_CLUSTER = create("native_iron_cluster", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item NATIVE_GOLD_CLUSTER = create("native_gold_cluster", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item RAW_AIR_CRYSTAL_CLUSTER = create("raw_air_crystal_cluster", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item RAW_FIRE_CRYSTAL_CLUSTER = create("raw_fire_crystal_cluster", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item RAW_WATER_CRYSTAL_CLUSTER = create("raw_water_crystal_cluster", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item RAW_EARTH_CRYSTAL_CLUSTER = create("raw_earth_crystal_cluster", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item RAW_ORDER_CRYSTAL_CLUSTER = create("raw_earth_order_cluster", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item RAW_ENTROPY_CRYSTAL_CLUSTER = create("raw_earth_entropy_cluster", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item EXUBITURA_PETAL = create("exubitura_petal", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item ICHOR = create("ichor", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item ICHORCLOTH_COWL = create("ichorcloth_helm", new ArmorItem(TCArmorMaterials.ICHORCLOTH, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item ICHORCLOTH_ROBE = create("ichorcloth_chest", new ArmorItem(TCArmorMaterials.ICHORCLOTH, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item ICHORCLOTH_LEGS = create("ichorcloth_legs", new ArmorItem(TCArmorMaterials.ICHORCLOTH, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item ICHORCLOTH_BOOTS = create("ichorcloth_boots", new ArmorItem(TCArmorMaterials.ICHORCLOTH, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item ICHORCLOTH = create("ichorcloth", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item SALIS_MUNDUS = create("salis_mundus", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item SALIS_TEMPESTAS = create("salis_tempestas", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item SALIS_AEVUM = create("salis_aevum", new Item(new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));
    public static final Item GOGGLES_OF_REVEALING = create("goggles_of_revealing", new ArmorItem(TCArmorMaterials.GOGGLES, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.THAUMCRAFT)));













    private static Item create(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Thaumcraft.MOD_ID,name), item);
    }
    public static void registerModItems() {
        Thaumcraft.LOGGER.info("Items for mod for " + Thaumcraft.MOD_ID);

    }
}

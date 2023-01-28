package net.r0nin_yt.thaumcraft.common.init.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;
import net.r0nin_yt.thaumcraft.Thaumcraft;
import net.r0nin_yt.thaumcraft.common.custom.TCArmorMaterials;
import net.r0nin_yt.thaumcraft.common.init.item.items.ShardItem;
import net.r0nin_yt.thaumcraft.common.init.item.items.SimpleItem;
import net.r0nin_yt.thaumcraft.common.init.item.items.TCToolItem;
import net.r0nin_yt.thaumcraft.common.init.item.items.WandItem;
import net.r0nin_yt.thaumcraft.common.init.libs.TCMaterial;
import net.r0nin_yt.thaumcraft.common.init.tools.*;
import net.r0nin_yt.thaumcraft.common.item.Thaumonomicon;


public class TCItemsRegistry {
//misc
    public static final Item  INFUSED_THAUMIUM_HELMET = create("infused_thaumium_helmet", new ArmorItem(TCArmorMaterials.THAUMIUM, EquipmentSlot.HEAD, new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item INFUSED_THAUMIUM_CHESTPLATE = create("infused_thaumium_chestplate", new ArmorItem(TCArmorMaterials.THAUMIUM, EquipmentSlot.CHEST, new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item INFUSED_THAUMIUM_LEGGINS = create("infused_thaumium_leggings", new ArmorItem(TCArmorMaterials.THAUMIUM, EquipmentSlot.LEGS, new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item INFUSED_THAUMIUM_BOOTS = create("infused_thaumium_boots", new ArmorItem(TCArmorMaterials.THAUMIUM, EquipmentSlot.FEET, new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item  CRIMSON_ROBE_HELM = create("crimson_robe_helm", new ArmorItem(TCArmorMaterials.CRIMSON_ROBE, EquipmentSlot.HEAD, new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item CRIMSON_ROBE_CHEST = create("crimson_robe_chest", new ArmorItem(TCArmorMaterials.CRIMSON_ROBE, EquipmentSlot.CHEST, new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item CRIMSON_ROBE_LEGS = create("crimson_robe_legs", new ArmorItem(TCArmorMaterials.CRIMSON_ROBE, EquipmentSlot.LEGS, new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item  CRIMSON_PLATE_HELM = create("crimson_plate_helm", new ArmorItem(TCArmorMaterials.CRIMSON_PLATE, EquipmentSlot.HEAD, new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item CRIMSON_PLATE_CHEST = create("crimson_plate_chest", new ArmorItem(TCArmorMaterials.CRIMSON_PLATE, EquipmentSlot.CHEST, new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item CRIMSON_PLATE_LEGS = create("crimson_plate_legs", new ArmorItem(TCArmorMaterials.CRIMSON_PLATE, EquipmentSlot.LEGS, new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item CRIMSON_PRAETOR_HELM = create("crimson_praetor_helm", new ArmorItem(TCArmorMaterials.CRIMSON_PRAETOR, EquipmentSlot.HEAD, new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item CRIMSON_PRAETOR_CHEST = create("crimson_praetor_chest", new ArmorItem(TCArmorMaterials.CRIMSON_PRAETOR, EquipmentSlot.CHEST, new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item CRIMSON_PRAETOR_LEGS = create("crimson_praetor_legs", new ArmorItem(TCArmorMaterials.CRIMSON_PRAETOR, EquipmentSlot.LEGS, new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item NATIVE_CINNABAR_CLUSTER = create("native_cinobar_cluster", new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item NATIVE_IRON_CLUSTER = create("native_iron_cluster", new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item NATIVE_GOLD_CLUSTER = create("native_gold_cluster", new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item RAW_AIR_CRYSTAL_CLUSTER = create("raw_air_crystal_cluster", new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item RAW_FIRE_CRYSTAL_CLUSTER = create("raw_fire_crystal_cluster", new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item RAW_WATER_CRYSTAL_CLUSTER = create("raw_water_crystal_cluster", new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item RAW_EARTH_CRYSTAL_CLUSTER = create("raw_earth_crystal_cluster", new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item RAW_ORDER_CRYSTAL_CLUSTER = create("raw_earth_order_cluster", new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item RAW_ENTROPY_CRYSTAL_CLUSTER = create("raw_earth_entropy_cluster", new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item EXUBITURA_PETAL = create("exubitura_petal", new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item ICHOR = create("ichor", new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item ICHORCLOTH_COWL = create("ichorcloth_helm", new ArmorItem(TCArmorMaterials.ICHORCLOTH, EquipmentSlot.HEAD, new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item ICHORCLOTH_ROBE = create("ichorcloth_chest", new ArmorItem(TCArmorMaterials.ICHORCLOTH, EquipmentSlot.CHEST, new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item ICHORCLOTH_LEGS = create("ichorcloth_legs", new ArmorItem(TCArmorMaterials.ICHORCLOTH, EquipmentSlot.LEGS, new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item ICHORCLOTH_BOOTS = create("ichorcloth_boots", new ArmorItem(TCArmorMaterials.ICHORCLOTH, EquipmentSlot.FEET, new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item ICHORCLOTH = create("ichorcloth", new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    public static final Item GOGGLES_OF_REVEALING = create("goggles_of_revealing", new ArmorItem(TCArmorMaterials.GOGGLES, EquipmentSlot.HEAD, new FabricItemSettings().group(Thaumcraft.MOD_GROUP)));
    //caps
    public static final TCItem CAP_COPPER = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "cap_copper");
    public static final TCItem CAP_SILVER_INERT = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "cap_silver_inert");
    public static final TCItem CAP_SILVER = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "cap_silver");
    public static final TCItem CAP_IRON = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "cap_iron");
    public static final TCItem CAP_GOLD = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "cap_gold");
    public static final TCItem CAP_THAUMIUM_INERT = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "cap_thaumium_inert");
    public static final TCItem CAP_THAUMIUM = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "cap_thaumium");
    public static final TCItem CAP_VOID_INERT = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "cap_void_inert");
    public static final TCItem CAP_VOID = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "cap_void");
    public static final TCItem THAUMONOMICON = new SimpleItem(new Thaumonomicon(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)), "thaumonomicon");
    public static final TCItem NITOR = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "nitor");
    public static final TCItem ALUMENTUM = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "alumentum");
    public static final TCItem TALLOW = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "tallow");
    public static final TCItem FILTER = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "filter");
    public static final TCItem PRIMAL_CHARM = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)), "primal_charm");
    public static final TCItem CRIMSON_RITES = new SimpleItem(new Thaumonomicon(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)), "crimson_rites");
    public static final TCItem CLOTH = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "cloth");
    public static final TCItem KNOWLEDGE_FRAGMENT = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "knowledge_fragment");
    public static final TCItem MIRROR_GLASS = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "mirror_glass");
    public static final TCItem TAINT_SLIME = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "taint_slime");
    public static final TCItem TAINT_TENDRIL = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "taint_tendril");
    //shards
    public static final TCItem AIR_SHARD = new ShardItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "shard_air");
    public static final TCItem FIRE_SHARD = new ShardItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "shard_fire");;
    public static final TCItem WATER_SHARD = new ShardItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "shard_water");
    public static final TCItem EARTH_SHARD = new ShardItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "shard_earth");
    public static final TCItem ORDER_SHARD = new ShardItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "shard_order");
    public static final TCItem ENTROPY_SHARD = new ShardItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "shard_entropy");
    public static final TCItem BALANCED_SHARD = new ShardItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "shard_balanced");
    public static final TCItem WRATH_SHARD = new ShardItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "shard_wrath");
    public static final TCItem ENVY_SHARD = new ShardItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "shard_envy");
    public static final TCItem TAINT_SHARD = new ShardItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "shard_taint");
    public static final TCItem TAINTED_UNBALANCED_SHARD = new ShardItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "shard_tainted_unbalanced");
    public static final TCItem PRIDE_SHARD = new ShardItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "shard_pride");
    public static final TCItem LUST_SHARD = new ShardItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "shard_lust");
    public static final TCItem SLOTH_SHARD = new ShardItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "shard_sloth");
    public static final TCItem GLUTTONY_SHARD = new ShardItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "shard_gluttony");
    public static final TCItem WARPED_SHARD = new ShardItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "shard_warped");
    public static final TCItem WARPED_UNBALANCED_SHARD = new ShardItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "shard_warped_unbalanced");
    public static final TCItem SHARD_OF_CREATION = new ShardItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "shard_of_creation");
    //world materials
    public static final TCItem QUICKSILVER = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "ingot_quicksilver");
    public static final TCItem AMBER = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "amber");
    public static final TCItem VOID_SEED = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "void_seed");
    public static final TCItem VOID_METAL_NUGGET = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "nugget_void_metal");
    public static final TCItem QUICKSILVER_DROP = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "nugget_quicksilver");
    //ingots
    public static final TCItem VOID_METAL_INGOT = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "void_metal_ingot");
    public static final TCItem ICHORIUM_INGOT = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "ichorium_ingot");
    public static final TCItem MYTHRIL_INGOT = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "mythril_ingot");
    public static final TCItem DRIED_OUT_THAUMIUM_INGOT = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "dried_out_thaumium_ingot");
    public static final TCItem INFUSED_DESTABILISED_THAUMIUM_INGOT = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "adamantite_ingot");
    public static final TCItem INFUSED_STABILISED_THAUMIUM_INGOT = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "infused_stabilised_thaumium_ingot");
    public static final TCItem SALIS_MUNDUS = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "salis_mundus");
    public static final TCItem SALIS_TEMPESTAS = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "salis_tempestas");
    public static final TCItem SALIS_AEVUM = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "salis_aevum");
    // miscellaneous
    public static final TCItem INKWELL = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)), "inkwell");
    public static final TCItem LABEL = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "label");
    public static final TCItem BOTTLE_TAINT = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "bottle_taint");
    public static final TCItem COIN = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP)), "coin");
    //staff componets etc
    public static final TCItem STAFF_ROD_BLAZE = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)), "staff_rod_blaze");
    public static final TCItem STAFF_ROD_BONE = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)), "staff_rod_bone");
    public static final TCItem STAFF_ROD_GREATWOOD = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)), "staff_rod_greatwood");
    public static final TCItem STAFF_ROD_ICE = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)), "staff_rod_ice");
    public static final TCItem STAFF_ROD_OBSIDIAN = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)), "staff_rod_obsidian");
    public static final TCItem STAFF_ROD_QUARTZ = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)), "staff_rod_quartz");
    public static final TCItem STAFF_ROD_REED = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)), "staff_rod_reed");
    public static final TCItem STAFF_ROD_SILVERWOOD = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)), "staff_rod_silverwood");
    public static final TCItem STAFF_ROD_PRIMAL = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)), "staff_rod_primal");
    // rod componets etc
    public static final TCItem WAND_ROD_BLAZE = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)), "wand_rod_blaze");
    public static final TCItem WAND_ROD_BONE = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)), "wand_rod_bone");
    public static final TCItem WAND_ROD_GREATWOOD = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)), "wand_rod_greatwood");
    public static final TCItem WAND_ROD_ICE = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)), "wand_rod_ice");
    public static final TCItem WAND_ROD_OBSIDIAN = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)), "wand_rod_obsidian");
    public static final TCItem WAND_ROD_QUARTZ = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)), "wand_rod_quartz");
    public static final TCItem WAND_ROD_REED = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)), "wand_rod_reed");
    public static final TCItem WAND_ROD_SILVERWOOD = new SimpleItem(new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)), "wand_rod_silverwood");
    //instruments
    public static ToolItem THAUMIUM_SWORD_TOOL = new TCSword(TCMaterial.THAUMIUMIUM, 3, -2.4F, new FabricItemSettings().group(Thaumcraft.MOD_GROUP));
    public static ToolItem THAUMIUM_PICKAXE_TOOL = new TCPickaxe(TCMaterial.THAUMIUMIUM, 1, -2.8F, new FabricItemSettings().group(Thaumcraft.MOD_GROUP));
    public static ToolItem THAUMIUM_AXE_TOOL = new TCAxe(TCMaterial.THAUMIUMIUM, 5.0F, -3.0F, new FabricItemSettings().group(Thaumcraft.MOD_GROUP));
    public static ToolItem THAUMIUM_SHOVEL_TOOL = new TCShovel(TCMaterial.THAUMIUMIUM, 1.5F, -3.0F, new FabricItemSettings().group(Thaumcraft.MOD_GROUP));
    public static ToolItem THAUMIUM_HOE_TOOL = new TCHoe(TCMaterial.THAUMIUMIUM, -3, 0.0F, new FabricItemSettings().group(Thaumcraft.MOD_GROUP));
    public static ToolItem VOIDMETAL_SWORD_TOOL = new TCSword(TCMaterial.VOID, 3, -2.4F, new FabricItemSettings().group(Thaumcraft.MOD_GROUP));
    public static ToolItem VOIDMETAL_PICKAXE_TOOL = new TCPickaxe(TCMaterial.VOID, 1, -2.8F, new FabricItemSettings().group(Thaumcraft.MOD_GROUP));
    public static ToolItem VOIDMETAL_AXE_TOOL = new TCAxe(TCMaterial.VOID, 5.0F, -3.0F, new FabricItemSettings().group(Thaumcraft.MOD_GROUP));
    public static ToolItem VOIDMETAL_SHOVEL_TOOL = new TCShovel(TCMaterial.VOID, 1.5F, -3.0F, new FabricItemSettings().group(Thaumcraft.MOD_GROUP));
    public static ToolItem VOIDMETAL_HOE_TOOL = new TCHoe(TCMaterial.VOID, -3, 0.0F, new FabricItemSettings().group(Thaumcraft.MOD_GROUP));
    public static final TCItem THAUMIUM_SWORD = new TCToolItem(THAUMIUM_SWORD_TOOL, "thaumium_sword");
    public static final TCItem THAUMIUM_PICKAXE = new TCToolItem(THAUMIUM_PICKAXE_TOOL, "thaumium_pickaxe");
    public static final TCItem THAUMIUM_AXE = new TCToolItem(THAUMIUM_AXE_TOOL, "thaumium_axe");
    public static final TCItem THAUMIUM_SHOVEL = new TCToolItem(THAUMIUM_SHOVEL_TOOL, "thaumium_shovel");
    public static final TCItem THAUMIUM_HOE = new TCToolItem(THAUMIUM_HOE_TOOL, "thaumium_hoe");
    public static final TCItem VOIDMETAL_SWORD = new TCToolItem(VOIDMETAL_SWORD_TOOL, "voidmetal_sword");
    public static final TCItem VOIDMETAL_PICKAXE = new TCToolItem(VOIDMETAL_PICKAXE_TOOL, "voidmetal_pickaxe");
    public static final TCItem VOIDMETAL_AXE = new TCToolItem(VOIDMETAL_AXE_TOOL, "voidmetal_axe");
    public static final TCItem VOIDMETAL_SHOVEL = new TCToolItem(VOIDMETAL_SHOVEL_TOOL, "voidmetal_shovel");
    public static final TCItem VOIDMETAL_HOE = new TCToolItem(VOIDMETAL_HOE_TOOL, "voidmetal_hoe");


    public static final TCItem WAND_ITEM = new WandItem(
            new Item(new FabricItemSettings().group(Thaumcraft.MOD_GROUP).maxCount(1)),
            "wand",
            "wand_rod_greatwood", "wand_cap_thaumium", "wand"
    );


    public static void register() {
        loadBooks();
        loadMaterials();
        loadMiscellaneous();

        loadTools();
        loadFullWands();

        loadCaps();
        loadRods();
    }


    public static void loadBooks() {

        THAUMONOMICON.load();
        CRIMSON_RITES.load();

        Thaumcraft.LOGGER.info("Loaded books");
    }

    public static void loadMaterials() {

        NITOR.load();
        ALUMENTUM.load();
        TALLOW.load();
        FILTER.load();

        PRIMAL_CHARM.load();
        SALIS_MUNDUS.load();
        SALIS_TEMPESTAS.load();
        SALIS_AEVUM.load();
        CLOTH.load();
        KNOWLEDGE_FRAGMENT.load();
        MIRROR_GLASS.load();

        TAINT_SLIME.load();
        TAINT_TENDRIL.load();

        AIR_SHARD.load();
        FIRE_SHARD.load();
        WATER_SHARD.load();
        EARTH_SHARD.load();
        ORDER_SHARD.load();
        ENTROPY_SHARD.load();
        BALANCED_SHARD.load();
        WRATH_SHARD.load();
        ENVY_SHARD.load();
        TAINT_SHARD.load();
        TAINTED_UNBALANCED_SHARD.load();
        PRIDE_SHARD.load();
        LUST_SHARD.load();
        SLOTH_SHARD.load();
        GLUTTONY_SHARD.load();
        WARPED_SHARD.load();
        WARPED_UNBALANCED_SHARD.load();
        SHARD_OF_CREATION.load();

        ICHORIUM_INGOT.load();
        MYTHRIL_INGOT.load();
        AMBER.load();
        INFUSED_DESTABILISED_THAUMIUM_INGOT.load();
        INFUSED_STABILISED_THAUMIUM_INGOT.load();
        DRIED_OUT_THAUMIUM_INGOT.load();
        VOID_METAL_INGOT.load();
        QUICKSILVER.load();
        VOID_SEED.load();
        VOID_METAL_NUGGET.load();
        QUICKSILVER_DROP.load();

        Thaumcraft.LOGGER.info("Loaded materials");
    }
    public static void loadMiscellaneous() {

        INKWELL.load();
        LABEL.load();
        BOTTLE_TAINT.load();
        COIN.load();

        Thaumcraft.LOGGER.info("Loaded miscellaneous");
    }

    public static void loadCaps() {

        CAP_COPPER.load();
        CAP_SILVER_INERT.load();
        CAP_SILVER.load();
        CAP_IRON.load();
        CAP_GOLD.load();
        CAP_THAUMIUM_INERT.load();
        CAP_THAUMIUM.load();
        CAP_VOID_INERT.load();
        CAP_VOID.load();

        Thaumcraft.LOGGER.info("Loaded caps");
    }

    public static void loadRods() {

        STAFF_ROD_BLAZE.load();
        STAFF_ROD_BONE.load();
        STAFF_ROD_GREATWOOD.load();
        STAFF_ROD_ICE.load();
        STAFF_ROD_OBSIDIAN.load();
        STAFF_ROD_QUARTZ.load();
        STAFF_ROD_REED.load();
        STAFF_ROD_SILVERWOOD.load();
        STAFF_ROD_PRIMAL.load();

        WAND_ROD_BLAZE.load();
        WAND_ROD_BONE.load();
        WAND_ROD_GREATWOOD.load();
        WAND_ROD_ICE.load();
        WAND_ROD_OBSIDIAN.load();
        WAND_ROD_QUARTZ.load();
        WAND_ROD_REED.load();
        WAND_ROD_SILVERWOOD.load();

        Thaumcraft.LOGGER.info("Loaded rods");
    }

    public static void loadTools() {

        THAUMIUM_SWORD.load();
        THAUMIUM_PICKAXE.load();
        THAUMIUM_AXE.load();
        THAUMIUM_SHOVEL.load();
        THAUMIUM_HOE.load();

        VOIDMETAL_SWORD.load();
        VOIDMETAL_PICKAXE.load();
        VOIDMETAL_AXE.load();
        VOIDMETAL_SHOVEL.load();
        VOIDMETAL_HOE.load();

        Thaumcraft.LOGGER.info("Loaded tools");
    }

    public static void loadFullWands() {

        WAND_ITEM.load();

        Thaumcraft.LOGGER.info("Loaded full wands");
    }












    private static Item create(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Thaumcraft.MODID,name), item);
    }
    public static void registerModItems() {
        Thaumcraft.LOGGER.info("Items for mod for " + Thaumcraft.MODID);

    }
}

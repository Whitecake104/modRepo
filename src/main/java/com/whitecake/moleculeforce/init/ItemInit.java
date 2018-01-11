package com.whitecake.moleculeforce.init;

import com.whitecake.moleculeforce.objects.items.ModItem;
import com.whitecake.moleculeforce.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<>();

    //Mod items
    public static final ModItem HYDROGEN_TANK = new ModItem("hydrogen_tank",
            Reference.description("hydrogen_tank", 3));
    public static final ModItem HELIUM_TANK = new ModItem("helium_tank",
            Reference.description("helium_tank", 3));
    public static final ModItem LITHIUM_PIECE = new ModItem("lithium_piece",
            Reference.description("lithium_piece", 2));
    public static final ModItem BERYLLIUM_PIECE = new ModItem("beryllium_piece",
            Reference.description("beryllium_piece", 3));
    public static final ModItem BORON_PIECE = new ModItem("boron_piece",
            Reference.description("boron_piece", 4));
    public static final ModItem CARBON = new ModItem("carbon",
            Reference.description("carbon", 3));
    public static final ModItem NITROGEN_TANK = new ModItem("nitrogen_tank",
            Reference.description("nitrogen_tank", 3));
    public static final ModItem OXYGEN_TANK = new ModItem("oxygen_tank",
            Reference.description("oxygen_tank", 3));
    public static final ModItem FLUORINE_TANK = new ModItem("fluorine_tank",
            Reference.description("fluorine_tank", 3));
    public static final ModItem NEON_TANK = new ModItem("neon_tank",
            Reference.description("neon_tank", 3));
    public static final ModItem SODIUM_PIECE = new ModItem("sodium_piece",
            Reference.description("sodium_piece", 3));
    public static final ModItem MAGNESIUM_PIECE = new ModItem("magnesium_piece",
            Reference.description("magnesium_piece", 3));
    public static final ModItem ALUMINIUM_INGOT = new ModItem("aluminium_ingot",
            Reference.description("aluminium_ingot", 3));
    public static final ModItem SILICON_PIECE = new ModItem("silicon_piece",
            Reference.description("silicon_piece", 3));
    public static final ModItem PHOSPHORUS = new ModItem("phosphorus",
            Reference.description("phosphorus", 3));
    public static final ModItem SULPHUR = new ModItem("sulphur",
            Reference.description("sulphur", 3));
    public static final ModItem CHLORINE_TANK = new ModItem("chlorine_tank",
            Reference.description("chlorine_tank", 3));
    public static final ModItem ARGON_TANK = new ModItem("argon_tank",
            Reference.description("argon_tank", 3));
    public static final ModItem COPPER_INGOT = new ModItem("copper_ingot",
            Reference.description("copper_ingot", 3));
    public static final ModItem KRYPTON_TANK = new ModItem("krypton_tank",
            Reference.description("krypton_tank", 3));
    public static final ModItem XENON_TANK = new ModItem("xenon_tank",
            Reference.description("xenon_tank", 3));
    public static final ModItem RADON_TANK = new ModItem("radon_tank",
            Reference.description("radon_tank", 3));

    //Vanilla items
    public static final ModItem CHARCOAL = new ModItem("minecraft:charcoal",
            Reference.description("charcoal", 1));
    public static final ModItem COAL = new ModItem("minecraft:coal",
            Reference.description("coal", 1));
    public static final ModItem DIAMOND = new ModItem("minecraft:diamond",
            Reference.description("diamond", 1));
    public static final ModItem EMERALD = new ModItem("minecraft:emerald",
            Reference.description("emerald", 1));
    public static final ModItem FLINT = new ModItem("minecraft:flint",
            Reference.description("flint", 3));
    public static final ModItem GOLD_INGOT = new ModItem("minecraft:gold_ingot",
            Reference.description("gold_ingot", 3));
    public static final ModItem GUNPOWDER = new ModItem("minecraft:gunpowder",
            Reference.description("gunpowder", 2));
    public static final ModItem IRON_INGOT = new ModItem("minecraft:iron_ingot",
            Reference.description("iron_ingot", 3));
    public static final ModItem REDSTONE = new ModItem("minecraft:redstone",
            CreativeTabs.REDSTONE, Reference.description("redstone", 2));
}

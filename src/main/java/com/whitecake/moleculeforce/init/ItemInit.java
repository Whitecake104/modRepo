package com.whitecake.moleculeforce.init;

import com.whitecake.moleculeforce.objects.items.ModItem;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<>();

    public static final ModItem HYDROGEN_TANK = new ModItem("hydrogen_tank",
            new String[] {"H\u00A7l\u2082","Transparent gas.","Highly explosive."});
    public static final ModItem HELIUM_TANK = new ModItem("helium_tank",
            new String[] {"He","Transparent noble gas.","Glows pink when electrified."});
    public static final ModItem COPPER_INGOT = new ModItem("copper_ingot",
            new String[] {"Cu", "Brown noble metal.", "Good electric conductor used in electronics."});
}

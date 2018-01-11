package com.whitecake.moleculeforce.util;

public class Translate {

    public static String toVanillaNaming(String name) {
        String mcName;

        switch(name) {
            case "gold_ingot": mcName = "ingotGold"; break;
            case "granite": mcName = "stone.granite"; break;
            case "iron_ingot": mcName = "ingotIron"; break;
            case "gunpowder": mcName = "sulphur"; break;
            default: mcName = name;
        }

        return mcName;
    }
}

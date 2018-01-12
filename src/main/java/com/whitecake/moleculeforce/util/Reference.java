package com.whitecake.moleculeforce.util;

import net.minecraft.client.resources.I18n;+

public class Reference {
    public static final String MODID = "moleculeforce";
    public static final String NAME = "Molecule Force Mod";
    public static final String DESCRIPTION = "Bring the world of chemistry to Minecraft!";
    public static final String VERSION = "alpha 1.0";
    public static final String CLIENT = "com.whitecake.moleculeforce.proxy.ClientProxy";
    public static final String COMMON = "com.whitecake.moleculeforce.proxy.CommonProxy";

    public static String[] description(String item, int lines) {
        String[] desc = new String[lines];
        {for (int i = 0; i < lines; i++) {
            desc[i] = I18n.format("desc." + item + ".line" + (i + 1))
                    .replaceAll("<sub0>", "\u00A7l\u2080\u00A77")
                    .replaceAll("<sub1>", "\u00A7l\u2081\u00A77")
                    .replaceAll("<sub2>", "\u00A7l\u2082\u00A77")
                    .replaceAll("<sub3>", "\u00A7l\u2083\u00A77")
                    .replaceAll("<sub4>", "\u00A7l\u2084\u00A77")
                    .replaceAll("<sub5>", "\u00A7l\u2085\u00A77")
                    .replaceAll("<sub6>", "\u00A7l\u2086\u00A77")
                    .replaceAll("<sub7>", "\u00A7l\u2087\u00A77")
                    .replaceAll("<sub8>", "\u00A7l\u2088\u00A77")
                    .replaceAll("\"", "");
        }}
        return desc;
    }
}

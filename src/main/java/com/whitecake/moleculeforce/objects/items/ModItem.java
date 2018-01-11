package com.whitecake.moleculeforce.objects.items;

import com.whitecake.moleculeforce.Main;
import com.whitecake.moleculeforce.init.ItemInit;
import com.whitecake.moleculeforce.util.IHasModel;
import com.whitecake.moleculeforce.util.Translate;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class ModItem extends Item implements IHasModel {

    private String[] itemDescription;

    public ModItem(String name) {
        setMaxDamage(0);
        maxStackSize = 64;
        if (name.startsWith("minecraft:")) {
            setUnlocalizedName(Translate.toVanillaNaming(name.substring(10)));
        } else {
            setUnlocalizedName(name);
        }
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);

        ItemInit.ITEMS.add(this);
    }

    public ModItem(String name, String[] description) {
        itemDescription = description;
        setMaxDamage(0);
        maxStackSize = 64;
        if (name.startsWith("minecraft:")) {
            setUnlocalizedName(Translate.toVanillaNaming(name.substring(10)));
        } else {
            setUnlocalizedName(name);
        }
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);

        ItemInit.ITEMS.add(this);
    }

    public ModItem(String name, CreativeTabs tab, String[] description) {
        itemDescription = description;
        setMaxDamage(0);
        maxStackSize = 64;
        if (name.startsWith("minecraft:")) {
            setUnlocalizedName(Translate.toVanillaNaming(name.substring(10)));
        } else {
            setUnlocalizedName(name);
        }
        setRegistryName(name);
        setCreativeTab(tab);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
        if (itemDescription != null) {
            for (String line : itemDescription) {
                list.add(line);
            }
        }
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
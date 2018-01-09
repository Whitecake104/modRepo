package com.whitecake.moleculeforce.objects.blocks;

import com.whitecake.moleculeforce.Main;
import com.whitecake.moleculeforce.init.BlockInit;
import com.whitecake.moleculeforce.init.ItemInit;
import com.whitecake.moleculeforce.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class ModBlock extends Block implements IHasModel{

    private String[] itemDescription;

    public ModBlock(String name, Material material, SoundType sound,
                    float hardness, float resistance, float lightLevel, int opacity,
                    String tool, int toolLevel) {
        super(material);
        setSoundType(sound);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);

        setHardness(hardness);
        setResistance(resistance);
        setLightLevel(lightLevel);
        setLightOpacity(opacity);
        setHarvestLevel(tool, toolLevel);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public ModBlock(String name, Material material, SoundType sound,
                    float hardness, float resistance, float lightLevel, int opacity,
                    String tool, int toolLevel, String[] description) {
        super(material);
        setSoundType(sound);
        itemDescription = description;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);

        setHardness(hardness);
        setResistance(resistance);
        setLightLevel(lightLevel);
        setLightOpacity(opacity);
        setHarvestLevel(tool, toolLevel);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
        if(itemDescription != null) {
            for(String line : itemDescription) {
                list.add(line);
            }
        }
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}

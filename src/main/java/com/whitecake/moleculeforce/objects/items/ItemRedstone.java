package com.whitecake.moleculeforce.objects.items;

import com.whitecake.moleculeforce.Main;
import com.whitecake.moleculeforce.init.ItemInit;
import com.whitecake.moleculeforce.util.IHasModel;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class ItemRedstone extends Item implements IHasModel {

    private String[] itemDescription;

    public ItemRedstone(String[] description) {
        itemDescription = description;
        setMaxDamage(0);
        maxStackSize = 64;
        setUnlocalizedName("redstone");
        setRegistryName("minecraft:redstone");
        setCreativeTab(CreativeTabs.REDSTONE);

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

    //Begin of the original Minecraft code.
    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        boolean flag = worldIn.getBlockState(pos).getBlock().isReplaceable(worldIn, pos);
        BlockPos blockpos = flag ? pos : pos.offset(facing);
        ItemStack itemstack = player.getHeldItem(hand);

        if (player.canPlayerEdit(blockpos, facing, itemstack) && worldIn.mayPlace(worldIn.getBlockState(blockpos).getBlock(), blockpos, false, facing, (Entity)null) && Blocks.REDSTONE_WIRE.canPlaceBlockAt(worldIn, blockpos))
        {
            worldIn.setBlockState(blockpos, Blocks.REDSTONE_WIRE.getDefaultState());

            if (player instanceof EntityPlayerMP)
            {
                CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP)player, blockpos, itemstack);
            }

            itemstack.shrink(1);
            return EnumActionResult.SUCCESS;
        }
        else
        {
            return EnumActionResult.FAIL;
        }
    }
    //End of the original Minecraft code.
}

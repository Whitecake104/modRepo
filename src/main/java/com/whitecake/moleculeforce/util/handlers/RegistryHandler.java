package com.whitecake.moleculeforce.util.handlers;

import com.whitecake.moleculeforce.init.BlockInit;
import com.whitecake.moleculeforce.init.ItemInit;
import com.whitecake.moleculeforce.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void onIBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }

    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for(Item item : ItemInit.ITEMS) {
            if(item instanceof IHasModel) {
                ((IHasModel)item).registerModels();
            }
        }

        for(Block block : BlockInit.BLOCKS) {
            if(block instanceof IHasModel) {
                ((IHasModel)block).registerModels();
            }
        }
    }
}

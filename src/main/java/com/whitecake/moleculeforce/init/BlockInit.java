package com.whitecake.moleculeforce.init;

        import com.whitecake.moleculeforce.objects.blocks.ModBlock;
        import net.minecraft.block.Block;
        import net.minecraft.block.SoundType;
        import net.minecraft.block.material.Material;

        import java.util.ArrayList;
        import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //Mod blocks
    public static final ModBlock COPPER_BLOCK = new ModBlock("copper_block",
            Material.IRON, SoundType.METAL, 3.5f, 15.0f, 0.0f, 0,
            "pickaxe", 1);

    /*
    //Vanilla blocks
    public static final ModBlock GRANITE = new ModBlock("minecraft:granite", Material.ROCK,
            Reference.description("granite", 8));
    */
}

package github.PixelRupi.WDaLUR.init;

import github.PixelRupi.WDaLUR.WDaLUR;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WDaLUR.MODID);

    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANVIL)
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .strength(20.0f) // zamiast destroyTime
                    .lightLevel(state -> 15)
                    .requiresCorrectToolForDrops()
            ));
    // // // // // // // //
    // Bloki             //
    // // // // // // // //
    public static final RegistryObject<Block> GIERKONIUM_ORE = BLOCKS.register("gierkonium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .strength(20.0f) // zamiast destroyTime
                    .lightLevel(state -> 15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> URANIUM_ORE = BLOCKS.register("uranium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .strength(15.0f) // zamiast destroyTime
                    .lightLevel(state -> 15)
                    .requiresCorrectToolForDrops()
            ));
}

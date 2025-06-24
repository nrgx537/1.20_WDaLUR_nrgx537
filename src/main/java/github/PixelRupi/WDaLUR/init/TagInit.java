package github.PixelRupi.WDaLUR.init;

import github.PixelRupi.WDaLUR.WDaLUR;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagInit {
    public static final TagKey<Block> NEEDS_GIERKONIUM_TOOL = tag("needs_gierkonium_tool");

    public static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(WDaLUR.MODID, name));
    }
}

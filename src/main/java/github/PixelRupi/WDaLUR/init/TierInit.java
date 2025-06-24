package github.PixelRupi.WDaLUR.init;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TierInit {
    public static final ForgeTier GIERKONIUM = new ForgeTier(
            3, //harvest level jak diamentowe rzeczy
            1024, // uses
            1.5f, // attack speed
            1.2f, // attack bonus
            14, //enchantowalnosc
            TagInit.NEEDS_GIERKONIUM_TOOL,
            () -> Ingredient.of(ItemInit.EXAMPLE_ITEM::get) // przedmiot do naprawiania w kowadle
    );
    public static final ForgeTier URANIUM = new ForgeTier(
            3, //harvest level jak diamentowe rzeczy
            420, // uses
            2f, // attack speed
            1.2f, // attack bonus
            14, //enchantowalnosc
            TagInit.NEEDS_GIERKONIUM_TOOL,
            () -> Ingredient.of(ItemInit.EXAMPLE_ITEM::get) // przedmiot do naprawiania w kowadle
    );
}

package github.PixelRupi.WDaLUR.init;

import github.PixelRupi.WDaLUR.init.Tiers.ModArmorMaterial;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterialInit {
    public static final ModArmorMaterial GIERKONIUM = new ModArmorMaterial(
            new int[] { 600, 1200, 600, 450 },
            new int[] { 11, 16, 15, 13},
            14,
            SoundEvents.ANVIL_LAND,
            () -> Ingredient.of(ItemInit.EXAMPLE_ITEM::get),
            "gierkonium",
            0.25f,
            0.34f
    );
    public static final ModArmorMaterial URANIUM = new ModArmorMaterial(
            new int[] { 600, 1200, 600, 450 },
            new int[] { 11, 16, 15, 13},
            14,
            SoundEvents.ANVIL_LAND,
            () -> Ingredient.of(ItemInit.EXAMPLE_ITEM::get),
            "uranium",
            0.25f,
            0.34f
    );
}
//gierkonium_layer_1.png
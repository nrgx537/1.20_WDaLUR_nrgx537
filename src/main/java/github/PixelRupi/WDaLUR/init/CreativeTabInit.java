package github.PixelRupi.WDaLUR.init;

import github.PixelRupi.WDaLUR.WDaLUR;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WDaLUR.MODID);

    public static final List<Supplier<? extends ItemLike>> WDaLUR_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> WDaLUR_TAB = TABS.register("wdalur_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.WDaLUR_tab"))
                    //.icon(() -> new ItemStack(ItemInit.FUEL_ROD_TEST.get()))
                    .icon((ItemInit.FUEL_ROD_TEST.get()::getDefaultInstance))
                    .displayItems((displayParams, output) -> {
                        WDaLUR_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get()));
                    })
                    .build()
    );

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike){
        WDaLUR_TAB_ITEMS.add(itemLike);
        return(itemLike);
    }
}

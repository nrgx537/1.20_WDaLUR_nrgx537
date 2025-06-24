package github.PixelRupi.WDaLUR;

import github.PixelRupi.WDaLUR.init.BlockInit;
import github.PixelRupi.WDaLUR.init.CreativeTabInit;
import github.PixelRupi.WDaLUR.init.EntityInit;
import github.PixelRupi.WDaLUR.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(WDaLUR.MODID)
// We Do a Little Uranium Refining :3
public class WDaLUR {
    public static final String MODID = "wdalur"; // DO NOT EDIT THIS LINE

    public WDaLUR() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.TABS.register(bus);
        EntityInit.ENTITIES.register(bus);
    }
}

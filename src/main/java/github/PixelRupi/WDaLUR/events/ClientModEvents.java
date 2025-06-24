package github.PixelRupi.WDaLUR.events;


import github.PixelRupi.WDaLUR.WDaLUR;
import github.PixelRupi.WDaLUR.client.model.JuriModel;
import github.PixelRupi.WDaLUR.client.renderer.JuriRenderer;
import github.PixelRupi.WDaLUR.init.EntityInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WDaLUR.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event){
        event.registerEntityRenderer(EntityInit.JURI.get(), JuriRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(JuriModel.LAYER_LOCATION, JuriModel::createBodyLayer);
    }

}

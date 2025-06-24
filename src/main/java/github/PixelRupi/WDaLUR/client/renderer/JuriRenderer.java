package github.PixelRupi.WDaLUR.client.renderer;

import github.PixelRupi.WDaLUR.WDaLUR;
import github.PixelRupi.WDaLUR.client.model.JuriModel;
import github.PixelRupi.WDaLUR.entity.Juri;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;

public class JuriRenderer extends MobRenderer<Juri, JuriModel<Juri>> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(WDaLUR.MODID, "textures/entity/gierek.png");
    public JuriRenderer(EntityRendererProvider.Context ctx){
        super(ctx, new JuriModel<>(ctx.bakeLayer(JuriModel.LAYER_LOCATION)), 1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(Juri entity){
        return TEXTURE;
    }
}

package github.PixelRupi.WDaLUR.init;

import github.PixelRupi.WDaLUR.WDaLUR;
import github.PixelRupi.WDaLUR.entity.Juri;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, WDaLUR.MODID);

    public static final RegistryObject<EntityType<Juri>> JURI = ENTITIES.register( "juri", () -> EntityType.Builder.<Juri>of(Juri::new, MobCategory.CREATURE)
            .sized(1.0f,1.0f)
            .build(new ResourceLocation(WDaLUR.MODID, "juri").toString())
    );
}

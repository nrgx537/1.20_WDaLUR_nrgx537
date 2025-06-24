package github.PixelRupi.WDaLUR.events;

import github.PixelRupi.WDaLUR.WDaLUR;
import github.PixelRupi.WDaLUR.entity.Juri;
import github.PixelRupi.WDaLUR.init.EntityInit;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WDaLUR.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonModEvents {

    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event){
        event.put(EntityInit.JURI.get(), Juri.createAttributes().build());
    }

    @SubscribeEvent
    public static void registerSpawnPlacement(SpawnPlacementRegisterEvent event){
        event.register(EntityInit.JURI.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, Juri::canSpawn, SpawnPlacementRegisterEvent.Operation.OR);
    }
}

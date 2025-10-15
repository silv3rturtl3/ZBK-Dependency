package com.zbk.dependency.registry;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.zbk.dependency.client.renderer.AnimatedTotemRenderer;
import com.zbk.dependency.items.AnimatedTotemItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModItemRenderers {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        GeoItemRenderer.registerItemRenderer(AnimatedTotemItem.class, new AnimatedTotemRenderer());
    }
}

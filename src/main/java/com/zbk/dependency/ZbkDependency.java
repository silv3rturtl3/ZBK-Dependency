package com.zbk.dependency;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.common.MinecraftForge;
import com.zbk.dependency.systems.LockingSystem;
import com.zbk.dependency.systems.SoundSystem;
import com.zbk.dependency.registry.ModItems;

@Mod(ZbkDependency.MOD_ID)
public class ZbkDependency {
    public static final String MOD_ID = "zbk_dependency";

    public ZbkDependency() {
        // Register systems
        MinecraftForge.EVENT_BUS.register(new SoundSystem());
        MinecraftForge.EVENT_BUS.register(new LockingSystem());
        // Register mod event bus objects like items
        ModItems.ITEMS.register(net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext.get().getModEventBus());
        // Client renderers will be registered on client side via ModItemRenderers (MOD bus)
    }
}

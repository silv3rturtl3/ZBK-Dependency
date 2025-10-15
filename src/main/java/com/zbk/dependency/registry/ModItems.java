package com.zbk.dependency.registry;

import net.minecraft.world.item.Item;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import com.zbk.dependency.items.AnimatedTotemItem;
import com.zbk.dependency.ZbkDependency;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ZbkDependency.MOD_ID);

    public static final RegistryObject<Item> ANIMATED_TOTEM = ITEMS.register("animated_totem",
            () -> new AnimatedTotemItem(new Item.Properties().stacksTo(1)));

    @SubscribeEvent
    public static void addCreativeTab(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == net.minecraft.world.item.CreativeModeTabs.COMBAT)
            event.accept(ANIMATED_TOTEM);
    }
}

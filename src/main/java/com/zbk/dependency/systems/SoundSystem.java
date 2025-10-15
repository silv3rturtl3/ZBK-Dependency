package com.zbk.dependency.systems;

import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;

public class SoundSystem {

    @SubscribeEvent
    public void onBlockBreak(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        if (player.level().isClientSide) return;

        player.level().getEntitiesOfClass(Mob.class, player.getBoundingBox().inflate(20))
            .forEach(mob -> mob.getNavigation().moveTo(player, 1.2D));
    }
}

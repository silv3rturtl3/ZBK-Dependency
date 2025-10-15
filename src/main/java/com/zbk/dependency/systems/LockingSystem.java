package com.zbk.dependency.systems;

import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.item.Items;
import net.minecraft.world.entity.player.Player;
import net.minecraft.nbt.CompoundTag;

public class LockingSystem {

    @SubscribeEvent
    public void onBlockBreak(BlockEvent.BreakEvent event) {
        if (event.getState().getBlock() instanceof net.minecraft.world.level.block.ChestBlock) {
            Player player = event.getPlayer();
            ChestBlockEntity chest = (ChestBlockEntity) event.getLevel().getBlockEntity(event.getPos());

            if (chest != null) {
                CompoundTag tag = chest.getTileData();
                boolean locked = tag.getBoolean("Locked");

                if (locked && !player.getMainHandItem().is(Items.IRON_PICKAXE)) {
                    event.setCanceled(true);
                    player.displayClientMessage(
                        net.minecraft.network.chat.Component.literal("This chest is locked! Use a tool to open it."),
                        true
                    );
                }
            }
        }
    }
}

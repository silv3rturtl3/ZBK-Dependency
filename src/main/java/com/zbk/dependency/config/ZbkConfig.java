package com.zbk.dependency.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ZbkConfig {
    public static ForgeConfigSpec.BooleanValue enableLockingSystem;
    public static ForgeConfigSpec.BooleanValue enableSoundSystem;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
        builder.push("ZBK Dependency Settings");

        enableLockingSystem = builder.comment("Enable chest locking system")
            .define("enableLockingSystem", true);
        enableSoundSystem = builder.comment("Enable mob sound attraction system")
            .define("enableSoundSystem", true);

        builder.pop();
    }
}

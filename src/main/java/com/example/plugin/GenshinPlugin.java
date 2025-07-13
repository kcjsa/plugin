package com.example.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class GenshinPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("GenshinCore Plugin Enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("GenshinCore Plugin Disabled");
    }
}

package org.kalkrijk.test;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Test extends JavaPlugin {
    //reference to the main plugin class
    public static Test plugin_main;

    @Override
    public void onEnable() {
        //set main plugin class reference
        plugin_main = this;
        ItemManager.init();
        Objects.requireNonNull(getCommand("gtb")).setExecutor(new IGCommands());
        getServer().getPluginManager().registerEvents(new ItemEvents(), this);
        Cooldown.setupCooldown();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

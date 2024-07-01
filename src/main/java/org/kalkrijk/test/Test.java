package org.kalkrijk.test;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Test extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
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

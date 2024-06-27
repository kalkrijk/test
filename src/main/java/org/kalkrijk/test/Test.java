package org.kalkrijk.test;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        ItemManager.init();
        getCommand("gtb").setExecutor(new IGCommands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

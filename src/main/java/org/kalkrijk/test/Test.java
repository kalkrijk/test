package org.kalkrijk.test;

import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Yo");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
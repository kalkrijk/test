package org.kalkrijk.test;

import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Yooooooooooo000000000000 888888888!!78§!é§è!7");
        ItemManager.init();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

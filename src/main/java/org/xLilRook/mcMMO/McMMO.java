package org.xLilRook.mcMMO;
// test push

import org.bukkit.plugin.java.JavaPlugin;

public final class McMMO extends JavaPlugin {

    private static McMMO instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        getLogger().info("McMMO Plugin wurde gestartet ✅");

        // Initialisierung
        registerCommands();
        registerEvents();
        loadConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("McMMO Plugin wurde gestoppt ❌");
    }

    private void registerCommands() {
        // Meine Commands
    }

    private void registerEvents() {
        // Meine Events
    }

    private void loadConfig() {
        saveDefaultConfig();
        getLogger().info("Config geladen.");
    }

    public static McMMO getInstance() {
        return instance;
    }
}

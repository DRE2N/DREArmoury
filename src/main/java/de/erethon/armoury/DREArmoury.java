package de.erethon.armoury;
import de.erethon.armoury.commands.Reload;
import de.erethon.armoury.config.Config;
import org.bukkit.plugin.java.JavaPlugin;

public class DREArmoury extends JavaPlugin {
    public static DREArmoury plugin;
    Config cfg;
    @Override
    public void onEnable() {
        plugin = this;
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
        loadDREConfig();
        getLogger().info("Debug-Mode: " + cfg.isDebugMode());
        plugin.getCommand("axs").setExecutor(new Reload());
    }
    public void onDisable() {
        getDREConfig().save(plugin);
    }
    public void loadDREConfig() {
        cfg = new Config();
        cfg.loadConfig(this);
    }
    public static DREArmoury getInstance() {
        return plugin;
    }
    public Config getDREConfig() {
        return cfg;
    }

    public Boolean isDebug() { return cfg.isDebugMode(); }
}

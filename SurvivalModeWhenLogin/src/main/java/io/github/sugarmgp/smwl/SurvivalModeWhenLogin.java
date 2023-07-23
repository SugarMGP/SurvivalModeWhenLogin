package io.github.sugarmgp.smwl;

import io.github.sugarmgp.smwl.Listener.PlayerJoinEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SurvivalModeWhenLogin extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PlayerJoinEvent(), this);
    }
}

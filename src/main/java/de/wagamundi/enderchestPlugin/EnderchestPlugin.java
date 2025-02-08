package de.wagamundi.enderchestPlugin;

import de.wagamundi.enderchestPlugin.commands.EnderchestCommand;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnderchestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("enderchest").setExecutor(new EnderchestCommand());
        getLogger().info("Enderchest Plugin is running");
    }

    @Override
    public void onDisable() {
        getLogger().info("Enderchest Plugin is shutdown");
    }
}

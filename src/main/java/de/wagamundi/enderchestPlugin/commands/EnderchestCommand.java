package de.wagamundi.enderchestPlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class EnderchestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String s, @NotNull String[] arg) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("§cYou have to be a Player to use this");
            return true;
        }

        final Player player = (Player) sender;

        player.openInventory(player.getEnderChest());

        return true;
    }
}

package de.erethon.armoury.commands;

import de.erethon.armoury.DREArmoury;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Reload implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args ) {
        if (sender instanceof Player) {
            if (!(sender.hasPermission("dre.armoury.reload"))) {
                sender.sendMessage(ChatColor.RED + "Du hast keine Permission für diesen Befehl.");
                return false;
            }
        }
        DREArmoury main = DREArmoury.getInstance();
        main.reloadConfig();
        main.loadDREConfig();
        sender.sendMessage("Config reloaded!");
        return true;
    }
}

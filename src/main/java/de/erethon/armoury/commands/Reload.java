package de.erethon.armoury.commands;

import de.erethon.armoury.DREArmoury;
import org.apache.commons.lang.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Reload implements CommandExecutor {

    DREArmoury main = DREArmoury.getInstance();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args ) {
        if (sender instanceof Player) {
            if (!(sender.hasPermission("dre.armoury.reload"))) {
                sender.sendMessage(ChatColor.RED + "Du hast keine Permission für diesen Befehl.");
                return false;
            }
        }
        if (args.length < 1) {
            sender.sendMessage(ChatColor.RED + "/axs reload - /axs set <Armor> <Weapon> <Float>");
            return true;
        }
        if (args[0].equals("reload")) {
            main.reloadConfig();
            main.loadDREConfig();
            sender.sendMessage("Config reloaded!");
            return true;
        }
        if (args[0].equals("set")) {
            String armor = args[1];
            String weapon = args[2];
            float value = Float.parseFloat(args[3]);
            weapon = StringUtils.capitalize(weapon);
            try {
                main.getDREConfig().setValue(armor + weapon, value);
                sender.sendMessage("Rüstung: " + armor + " Waffe: " + weapon + " Koeffizient: " + value);
            } catch (NoSuchFieldException e) {
                sender.sendMessage("Invalid argument!");
            } catch (IllegalAccessException e) {
                sender.sendMessage("Invalid argument!");
            }
            return true;
        }
        if (args[0].equals("get")) {
            String armor = args[1];
            String weapon = args[2];
            weapon = StringUtils.capitalize(weapon);
            try {
                sender.sendMessage("Rüstung: " + armor + " Waffe: " + weapon + " Koeffizient: " + main.getDREConfig().getValue(armor + weapon));
            } catch (NoSuchFieldException e) {
                sender.sendMessage("Invalid argument!");
            } catch (IllegalAccessException e) {
                sender.sendMessage("Invalid argument!");
            }
            return true;
        }
        return false;
    }
}

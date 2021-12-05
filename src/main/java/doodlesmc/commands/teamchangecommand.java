package doodlesmc.commands;

import doodlesmc.utils.CooldownManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeamChangeCommand implements CommandExecutor {
    private final CooldownManager cooldownManager;

    public TeamChangeCommand() {
        cooldownManager = new CooldownManager(30 * 1000);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player) || args.length == 0) {
            return false;
        }

        Player p = (Player) sender;

        long cooldownTime = cooldownManager.getCooldownTime(p.getUniqueId());
        if (cooldownTime > 0) {
            p.sendMessage(ChatColor.RED + "You can change your color again in " + ChatColor.YELLOW + (cooldownTime / 1000) + " seconds" + ChatColor.RED + "!");
            return true;
        }

        cooldownManager.start(p.getUniqueId());

        if (args[0].contains("darkgreen")) {
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "team join darkgreen " + p.getName());
            p.sendMessage("Succesfully changed your color to " + ChatColor.DARK_GREEN + "Dark Green" + ChatColor.WHITE + "!");
            return true;
        }
        if (args[0].contains("lightpurple")) {
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "team join lightpurple " + p.getName());
            p.sendMessage("Succesfully changed your color to " + ChatColor.LIGHT_PURPLE + "Light Purple" + ChatColor.WHITE + "!");
            return true;
        }
        if (args[0].contains("yellow")) {
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "team join yellow " + p.getName());
            p.sendMessage("Succesfully changed your color to " + ChatColor.YELLOW + "Yellow" + ChatColor.WHITE + "!");
            return true;
        }
        if (args[0].contains("gold")) {
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "team join gold " + p.getName());
            p.sendMessage("Succesfully changed your color to " + ChatColor.GOLD + "Gold" + ChatColor.WHITE + "!");
            return true;
        }
        if (args[0].contains("darkaqua")) {
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "team join darkaqua " + p.getName());
            p.sendMessage("Succesfully changed your color to " + ChatColor.DARK_AQUA + "Cyan" + ChatColor.WHITE + "!");
            return true;
        }
        if (args[0].contains("aqua")) {
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "team join aqua " + p.getName());
            p.sendMessage("Succesfully changed your color to " + ChatColor.AQUA + "Aqua" + ChatColor.WHITE + "!");
            return true;
        }
        if (args[0].contains("limegreen")) {
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "team join limegreen " + p.getName());
            p.sendMessage("Succesfully changed your color to " + ChatColor.GREEN + "Lime Green" + ChatColor.WHITE + "!");
            return true;
        }
        if (args[0].contains("darkred")) {
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "team join darkred " + p.getName());
            p.sendMessage("Succesfully changed your color to " + ChatColor.DARK_RED + "Dark Red" + ChatColor.WHITE + "!");
            return true;
        }
        if (args[0].contains("darkpurple")) {
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "team join purple " + p.getName());
            p.sendMessage("Succesfully changed your color to " + ChatColor.DARK_PURPLE + "Dark Purple" + ChatColor.WHITE + "!");
            return true;
        }
        if (args[0].contains("lightred")) {
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "team join lightred " + p.getName());
            p.sendMessage("Succesfully changed your color to " + ChatColor.RED + "Light Red" + ChatColor.WHITE + "!");
            return true;
        }
        if (args[0].contains("darkblue")) {
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "team join darkblue " + p.getName());
            p.sendMessage("Succesfully changed your color to " + ChatColor.DARK_BLUE + "Dark Blue" + ChatColor.WHITE + "!");
            return true;
        }
        if (args[0].contains("blue")) {
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "team join blue " + p.getName());
            p.sendMessage("Succesfully changed your color to " + ChatColor.BLUE + "Blue" + ChatColor.WHITE + "!");
            return true;
        }
        return false;
    }

}
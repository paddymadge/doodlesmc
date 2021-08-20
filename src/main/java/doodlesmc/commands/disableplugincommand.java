package doodlesmc.commands;

import doodlesmc.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class disableplugincommand implements CommandExecutor {

    private Main plugin;

    public disableplugincommand(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;

        if (!(p.hasPermission("doodlesmc.others"))) {
            p.sendMessage(ChatColor.RED + "You dont have the permissions to run this command!");
            return false;
        }
        if (args.length <= 0) {
            p.sendMessage(ChatColor.RED + "Are you sure you want to disable the whole plugin? " +
                    "If you are sure type: " + ChatColor.YELLOW + "/disableplugin confirm" + ChatColor.RED + " this will disable the WHOLE plugin.");
            return true;
        }
        if (args[0].contains("confirm")) {
            p.sendMessage(ChatColor.RED + "Plugin disabled succesfully!");
            this.plugin.getServer().getPluginManager().disablePlugin(this.plugin);
            return true;
        }

        return true;
    }
}
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
            } else {
                p.sendMessage(ChatColor.RED + "Plugin disabled succesfully!");
                this.plugin.getServer().getPluginManager().disablePlugin(this.plugin);
                return true;
            }
        }
}
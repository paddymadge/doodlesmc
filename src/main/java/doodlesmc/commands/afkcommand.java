package doodlesmc.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.logging.Logger;

public class afkcommand implements CommandExecutor {
    private static Logger logger;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (args.length > 0) {
            player.sendMessage(ChatColor.RED + "Wrong usage: /afk");
        } else {
            player.setAfk(true);
            return true;
        }
        return false;
    }
}

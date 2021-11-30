package doodlesmc.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SdCommand implements CommandExecutor {
    //227 128 -183
    //1913 -1433

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.GREEN+"[Shopping District Coordinates]",
                ChatColor.BLUE+"[Overworld] ", ChatColor.AQUA+"X = 1913 Z =-1433",
                ChatColor.DARK_RED+"[Nether] ", ChatColor.RED+"X = 227 Z = -183");
        return true;
    }
}

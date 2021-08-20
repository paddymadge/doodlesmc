package doodlesmc.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.logging.Logger;

public class afkcommand implements CommandExecutor {
    private static Logger logger;
    private HashMap<String, Long> cooldown = new HashMap<String, Long>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;

        if (cooldown.containsKey(p.getName())) {
            if (cooldown.get(p.getName()) > System.currentTimeMillis()) {
            long timeleft = (cooldown.get(p.getName()) - System.currentTimeMillis()) / 1000;
                p.sendMessage(ChatColor.RED + "You can use this command again in " + ChatColor.YELLOW + timeleft + " seconds" + ChatColor.RED + "!");
                return false;
            }
        }

        cooldown.put(p.getName(), System.currentTimeMillis() + (15 * 1000));

        if (args.length > 0) {
            p.sendMessage(ChatColor.RED + "Wrong usage: /afk");
            return false;
        } else {
            p.setAfk(true);
            return true;
        }
    }
}

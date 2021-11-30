package doodlesmc.commands;

import doodlesmc.utils.CooldownManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class AfkCommand implements CommandExecutor {
    private final CooldownManager cooldownManager;

    public AfkCommand() {
        cooldownManager = new CooldownManager(15 * 1000);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;

        long cooldownTime = this.cooldownManager.getCooldownTime(p.getUniqueId());
        if (cooldownTime > 0) {
            p.sendMessage(ChatColor.RED + "You can use this command again in " + ChatColor.YELLOW + (cooldownTime / 1000) + " seconds" + ChatColor.RED + "!");
            return true;
        }

        this.cooldownManager.start(p.getUniqueId());

        if (args.length > 0) {
            p.sendMessage(ChatColor.RED + "Wrong usage: /afk");
            return false;
        } else {
            p.setAfk(true);
            return true;
        }
    }
}

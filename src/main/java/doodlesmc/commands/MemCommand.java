package doodlesmc.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class MemCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (!commandSender.hasPermission("bukkit.command.tps")) {
            commandSender.sendMessage(ChatColor.DARK_RED + "No perimissions");
            return true;
        }

        StringBuilder sb = new StringBuilder(ChatColor.GOLD + "TPS from last 1m, 5m, 15m: ");
        for (double tps : Bukkit.getServer().getTPS()) {
            sb.append(format(tps));
            sb.append(", ");
        }
        commandSender.sendMessage(sb.substring(0, sb.length() - 2));
        commandSender.sendMessage(ChatColor.GOLD + "Current memory usage: " + ChatColor.GREEN + ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024)) + "/" + (Runtime.getRuntime().totalMemory() / (1024 * 1024)) + " mb (Max: "
                + (Runtime.getRuntime().maxMemory() / (1024 * 1024)) + " mb)");

        return true;
    }

    private String format(double tps) {
        return ((tps > 18.0) ? ChatColor.GREEN : (tps > 16.0) ? ChatColor.YELLOW : ChatColor.RED)
                + ((tps > 20.0) ? "*" : "") + Math.min(Math.round(tps * 100.0) / 100.0, 20.0);
    }
}

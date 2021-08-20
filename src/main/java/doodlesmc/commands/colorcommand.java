package doodlesmc.commands;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class colorcommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        TextComponent darkgreen = new TextComponent(TextComponent.fromLegacyText(ChatColor.translateAlternateColorCodes('&', ChatColor.DARK_GREEN + "[Dark Green]")));
        TextComponent lightpurple = new TextComponent(TextComponent.fromLegacyText(ChatColor.translateAlternateColorCodes('&', ChatColor.LIGHT_PURPLE + "[Light Purple]")));
        TextComponent yellow = new TextComponent(TextComponent.fromLegacyText(ChatColor.translateAlternateColorCodes('&', ChatColor.YELLOW + "[Yellow]")));
        TextComponent gold = new TextComponent(TextComponent.fromLegacyText(ChatColor.translateAlternateColorCodes('&', ChatColor.GOLD + "[Gold]")));
        TextComponent aqua = new TextComponent(TextComponent.fromLegacyText(ChatColor.translateAlternateColorCodes('&', ChatColor.AQUA + "[Aqua]")));
        TextComponent limegreen = new TextComponent(TextComponent.fromLegacyText(ChatColor.translateAlternateColorCodes('&', ChatColor.GREEN + "[Lime Green]")));
        TextComponent darkred = new TextComponent(TextComponent.fromLegacyText(ChatColor.translateAlternateColorCodes('&', ChatColor.DARK_RED + "[Dark Red]")));
        TextComponent darkpurple = new TextComponent(TextComponent.fromLegacyText(ChatColor.translateAlternateColorCodes('&', ChatColor.DARK_PURPLE + "[Dark Purple]")));
        TextComponent lightred = new TextComponent(TextComponent.fromLegacyText(ChatColor.translateAlternateColorCodes('&', ChatColor.RED + "[Light Red]")));
        TextComponent darkblue = new TextComponent(TextComponent.fromLegacyText(ChatColor.translateAlternateColorCodes('&', ChatColor.DARK_BLUE + "[Dark Blue]")));
        TextComponent darkaqua = new TextComponent(TextComponent.fromLegacyText(ChatColor.translateAlternateColorCodes('&', ChatColor.DARK_AQUA + "[Cyan]")));
        TextComponent blue = new TextComponent(TextComponent.fromLegacyText(ChatColor.translateAlternateColorCodes('&', ChatColor.BLUE + "[Blue]")));

        darkgreen.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/" + "teamchangecommand darkgreen"));
        lightpurple.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/" + "teamchangecommand lightpurple"));
        yellow.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/" + "teamchangecommand yellow"));
        gold.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/" + "teamchangecommand gold"));
        aqua.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/" + "teamchangecommand aqua"));
        limegreen.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/" + "teamchangecommand limegreen"));
        darkred.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/" + "teamchangecommand darkred"));
        darkpurple.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/" + "teamchangecommand darkpurple"));
        lightred.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/" + "teamchangecommand lightred"));
        darkblue.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/" + "teamchangecommand darkblue"));
        darkaqua.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/" + "teamchangecommand darkaqua"));
        blue.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/" + "teamchangecommand blue"));

        p.sendMessage(ChatColor.BOLD + "[Choose a Color by clicking on it below!]");
        p.sendMessage(darkgreen);
        p.sendMessage(lightpurple);
        p.sendMessage(yellow);
        p.sendMessage(gold);
        p.sendMessage(aqua);
        p.sendMessage(limegreen);
        p.sendMessage(darkred);
        p.sendMessage(darkpurple);
        p.sendMessage(lightred);
        p.sendMessage(darkblue);
        p.sendMessage(darkaqua);
        p.sendMessage(blue);
        p.sendMessage(ChatColor.BOLD + "[Choose a Color by clicking on it above!]");

        return false;
    }
}

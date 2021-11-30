package doodlesmc.commands;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class EnderChestSeeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players may execute this command!!");
            return true;
        }
        Player p = (Player) sender;
        if (!(args.length == 1)){
            p.sendMessage(ChatColor.RED+"Wrong usage: /echestsee [player]");
            return false;
        } else if (!(p.hasPermission("doodlesmc.others"))) {
            p.sendMessage(ChatColor.RED+"You dont have the permissions to run this command!");
            return false;
        }
        Player target = Bukkit.getPlayer(args[0]);
        if (target == null){
            p.sendMessage(ChatColor.RED+"The player is not online or is not spelled correctly!");
            return false;
        }

        Inventory gui = Bukkit.createInventory(p, 27, Component.text("Enderchest contents of: "+target.getName()));
        ItemStack[] targetinv = target.getEnderChest().getContents();

        gui.setContents(targetinv);
        p.openInventory(gui);
        return true;
    }
}

package doodlesmc.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class echestseecommand implements CommandExecutor {
    public static Inventory gui;
    public static Player p;
    public static Player target;
    private static int counter = 0;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        p = (Player) sender;
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players may execute this command!!");
            return true;
        }
        if (!(args.length == 1)){
            p.sendMessage(ChatColor.RED+"Wrong usage: /echestsee [player]");
            return false;
        } else if (!(p.hasPermission("doodlesmc.others"))) {
            p.sendMessage(ChatColor.RED+"You dont have the permissions to run this command!");
            return false;
        }
        target = (Player) Bukkit.getPlayer(args[0]);
        if (target == null){
            p.sendMessage(ChatColor.RED+"The player is not online or is not spelled correctly!");
            return false;
        }

        gui = Bukkit.createInventory(p, 27,"Enderchest contents of: "+target.getName());
        ItemStack[] targetinv = target.getEnderChest().getContents();

        gui.setContents(targetinv);
        p.openInventory(gui);
        return true;
    }
}

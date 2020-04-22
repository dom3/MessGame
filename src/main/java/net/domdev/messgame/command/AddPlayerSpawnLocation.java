package net.domdev.messgame.command;

import net.domdev.messgame.MessFunctionality;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AddPlayerSpawnLocation implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player))
        {
            sender.sendMessage(ChatColor.RED + "You must be a player to perform this command.");
            return false;
        }

        Player player = (Player) sender;

        if (!player.hasPermission("mess.command.addplayerspawnlocation"))
        {
            player.sendMessage(ChatColor.RED + "You do not have permission to execute this command!");
            return false;
        }

        MessFunctionality.getSpawnLocations().add(player.getLocation());
        player.sendMessage(ChatColor.GREEN + "Successfully added an player spawn location. (" + MessFunctionality.getSpawnLocations().size() + ")");
        return true;
    }
}

package net.domdev.messgame.command;

import net.domdev.messgame.MessFunctionality;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ToggleGameEnabled implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("mess.command.togglegameenabled"))
        {
            sender.sendMessage(ChatColor.RED + "You do not have permission to execute this command!");
            return false;
        }

        if (MessFunctionality.isRunning())
        {
            MessFunctionality.setGameRunning(false);
        }
        return true;
    }
}

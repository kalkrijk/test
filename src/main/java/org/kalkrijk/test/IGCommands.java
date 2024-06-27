package org.kalkrijk.test;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class IGCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if( !(commandSender instanceof Player)){
            commandSender.sendMessage("Only players can use that command!");
            return true;
        }

        Player player = (Player) commandSender;
        if (player.hasPermission("op")){
            if (command.getName().equalsIgnoreCase("gtb")){
                player.getInventory().addItem(ItemManager.TestBucket);
            }
        }
        else {
            commandSender.sendMessage("You don't have permissions to do that!");
        }
        return true;
    }
}

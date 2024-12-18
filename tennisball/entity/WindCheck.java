package com.slendplugin.tennisball.entity;

import com.slendplugin.tennisball.Tennisball;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WindCheck implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player player = (Player) sender;

        sender.sendMessage("Текущее значение: " + Double.toString(Tennisball.winduser) + " м/c.");
        return true;
    }
}

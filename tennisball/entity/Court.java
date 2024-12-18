package com.slendplugin.tennisball.entity;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Court implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args){
        Player player = (Player) sender;

        String type = String.valueOf(args[0]);

        if (type.equalsIgnoreCase("Clay")){
            player.getPlayer().setWalkSpeed((float) 0.27);
            Bukkit.getServer().broadcastMessage(player.getName() +" has changed the court to Clay");
        }else if (type.equalsIgnoreCase("Hard")){
            player.getPlayer().setWalkSpeed((float) 0.30);
            Bukkit.getServer().broadcastMessage(player.getName() +" has changed the court to Hard");
        }else if (type.equalsIgnoreCase("Grass")){
            player.getPlayer().setWalkSpeed((float) 0.33);
            Bukkit.getServer().broadcastMessage(player.getName() +" has changed the court to Grass");
        }else{
            return false;
        }
        return true;
    }
}

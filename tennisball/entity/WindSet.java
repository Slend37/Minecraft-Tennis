package com.slendplugin.tennisball.entity;

import com.slendplugin.tennisball.Tennisball;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WindSet implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args){
        Player player = (Player) sender;

        int a;
        try {
            a = Integer.parseInt(args[0]);
        }
        catch(NumberFormatException e){
            return false;
        }

        Tennisball.wind = 0.45 + a*0.05;
        Tennisball.winduser = a;
        Bukkit.getServer().broadcastMessage("Ветер был успешно изменен! Текущее значение: "+Double.toString(Tennisball.winduser)+ " м/с.");
        return true;
    }
}

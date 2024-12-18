package com.slendplugin.tennisball.commands;

import com.slendplugin.tennisball.Tennisball;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.time.Duration;
import java.time.Instant;

public class GameEnd implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player player = (Player) sender;

        String p1;

        p1 = String.valueOf(args[0]);

        Instant end = Instant.now();

        if (p1.equals(Tennisball.player1) || p1.equals(Tennisball.player2)){
            Tennisball.game1 = false;
            Duration duration = Duration.between(Tennisball.gtime1, end);
            Bukkit.getServer().broadcastMessage("Game Finished!");
            Bukkit.getServer().broadcastMessage(Tennisball.player1 + " " + Tennisball.score1 + " vs. "+ Tennisball.score2 + " " +Tennisball.player2);
            Bukkit.getServer().broadcastMessage(String.valueOf(duration));
            Tennisball.player1 = "no";
            Tennisball.player2 = "no";
        }else if (p1.equals(Tennisball.player3) || p1.equals(Tennisball.player4)){
            Tennisball.game2 = false;
            Duration duration = Duration.between(Tennisball.gtime2, end);
            Bukkit.getServer().broadcastMessage("Game Finished!");
            Bukkit.getServer().broadcastMessage(Tennisball.player3 + " " + Tennisball.score3 + " vs. "+ Tennisball.score4 + " " +Tennisball.player4);
            Bukkit.getServer().broadcastMessage(String.valueOf(duration));
            Tennisball.player3 = "no";
            Tennisball.player4 = "no";
        }else if (p1.equals(Tennisball.player5) || p1.equals(Tennisball.player6)) {
            Tennisball.game3 = false;
            Duration duration = Duration.between(Tennisball.gtime3, end);
            Bukkit.getServer().broadcastMessage("Game Finished!");
            Bukkit.getServer().broadcastMessage(Tennisball.player5 + " " + Tennisball.score5 + " vs. " + Tennisball.score6 + " " + Tennisball.player6);
            Bukkit.getServer().broadcastMessage(String.valueOf(duration));
            Tennisball.player5 = "no";
            Tennisball.player6 = "no";
        }else{
            Bukkit.getServer().broadcastMessage("Player is not playing now.");
            return false;
        }
        return true;
    }
}

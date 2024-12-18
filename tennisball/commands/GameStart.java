package com.slendplugin.tennisball.commands;

import com.slendplugin.tennisball.Tennisball;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import java.time.Duration;
import java.time.Instant;

public class GameStart implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player player = (Player) sender;

        String p1, p2;

        p1 = String.valueOf(args[0]);
        p2 = String.valueOf(args[1]);
        Instant start = Instant.now();

        if (Tennisball.game1 == false){
            Tennisball.player1 = p1;
            Tennisball.player2 = p2;
            Tennisball.gtime1 = start;
            Tennisball.game1 = true;
        }else if (Tennisball.game2 == false) {
            Tennisball.player3 = p1;
            Tennisball.player4 = p2;
            Tennisball.gtime2 = start;
            Tennisball.game2 = true;
        }else if (Tennisball.game3 == false) {
            Tennisball.player5 = p1;
            Tennisball.player6 = p2;
            Tennisball.gtime3 = start;
            Tennisball.game3 = true;
        }else{
            Bukkit.getServer().broadcastMessage("No free slots for gamescore.");
            return true;
        }

        Bukkit.getServer().broadcastMessage(String.valueOf(start) + " " + Tennisball.player1 + " vs. "+Tennisball.player2);
        return true;
    }
}

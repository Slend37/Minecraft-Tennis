package com.slendplugin.tennisball.entity;

import java.util.Arrays;
import com.slendplugin.tennisball.Tennisball;
import org.apache.commons.lang.ArrayUtils;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Slime;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class SpawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        Slime slime = (Slime) player.getWorld().spawnEntity(player.getLocation(), EntityType.SLIME);
        slime.setCustomName("Ball");
        slime.setCustomNameVisible(true);
        slime.setSize(1);
        slime.setMaxHealth(60);
        slime.setHealth(60);

        String ground;

        float player_speed = player.getPlayer().getWalkSpeed();
        Bukkit.getServer().broadcastMessage(String.valueOf(player_speed));
        if (player_speed == 0.27f){
            ground = "clay";
        }else if (player_speed == 0.30f){
            ground = "hard";
        }else if (player_speed == 0.33f){
            ground = "grass";
        }else{
            ground = "INVALID GROUND!";
        }

        Bukkit.getServer().broadcastMessage(player.getName() + " spawned the ball. " + "Текущий ветер: " + Tennisball.winduser + ". Скорость игрока: " + player_speed * 5 + " (" + ground + ").");
        Tennisball.array = ArrayUtils.add(Tennisball.array,slime.getLocation().getY());

        return true;
    }
}

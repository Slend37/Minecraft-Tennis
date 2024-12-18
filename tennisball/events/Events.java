package com.slendplugin.tennisball.events;

import com.slendplugin.tennisball.Tennisball;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.entity.Slime;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.util.Vector;

// game start timer
// game finished timer
// score counter
// statistics counter


public class Events implements Listener {

    @EventHandler
    public void onSpawn(EntityDamageByEntityEvent event){
        if (event.getEntity() instanceof Slime) {

            Player player = (Player) event.getDamager();
            Slime slime = (Slime) event.getEntity();
            slime.setGliding(false);
            if (slime.isOnGround() == true){
                Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() +": Shot from the ground!");
            }else {
                player.sendMessage(player.getName() +": "+Double.toString(Double.valueOf(slime.getLocation().getY())));
            }
            slime.setVelocity(slime.getVelocity().add(new Vector(0.0, Tennisball.wind, 0.0)));

        }
    }
}

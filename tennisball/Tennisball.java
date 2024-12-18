package com.slendplugin.tennisball;

import com.slendplugin.tennisball.commands.Calculator;
import com.slendplugin.tennisball.commands.GameEnd;
import com.slendplugin.tennisball.commands.GameStart;
import com.slendplugin.tennisball.entity.*;
import com.slendplugin.tennisball.events.Events;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.time.Instant;

public final class Tennisball extends JavaPlugin {
    public static double[] array;
    public static double wind = 0.6;
    public static double winduser = 3;

    public static boolean game1 = false;
    public static boolean game2 = false;
    public static boolean game3 = false;
    public static String player1 = "no";
    public static String player2 = "no";
    public static String player3 = "no";
    public static String player4 = "no";
    public static String player5 = "no";
    public static String player6 = "no";
    public static Instant gtime1;
    public static Instant gtime2;
    public static Instant gtime3;

    public static int sets1 = 0;
    public static int sets2 = 0;
    public static int sets3 = 0;
    public static int sets4 = 0;
    public static int sets5 = 0;
    public static int sets6 = 0;

    public static int score1 = 0;
    public static int score2 = 0;
    public static int score3 = 0;
    public static int score4 = 0;
    public static int score5 = 0;
    public static int score6 = 0;
    public static String inscore1 = "0";
    public static String inscore2 = "0";
    public static String inscore3 = "0";
    public static String inscore4 = "0";
    public static String inscore5 = "0";
    public static String inscore6 = "0";


    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getLogger().info("The plugin works!");

        getCommand("calculator").setExecutor(new Calculator());
        getCommand("spawnEntity").setExecutor(new SpawnCommand());
        getCommand("windset").setExecutor(new WindSet());
        getCommand("windcheck").setExecutor(new WindCheck());
        getCommand("gamestart").setExecutor(new GameStart());
        getCommand("gameend").setExecutor(new GameEnd());
        getCommand("court").setExecutor(new Court());
        getCommand("court").setTabCompleter(new CourtCompleter());
        Bukkit.getPluginManager().registerEvents(new Events(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        this.getLogger().info("Disabled");
    }
}




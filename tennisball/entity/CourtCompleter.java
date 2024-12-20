package com.slendplugin.tennisball.entity;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CourtCompleter implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (args.length == 1){
            return Arrays.asList(
                    "clay",
                    "grass",
                    "hard"
            );
        }
        return null;
    }
}

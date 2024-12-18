package com.slendplugin.tennisball.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Calculator implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // /calc 10 + 12
        int a, b;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[2]);
        }
        catch(NumberFormatException e){
            return false;
        }
        if (args[1].equals("+")){
            sender.sendMessage("Result = " + (a + b));
            return true;
        }else if(args[1].equals("-")){
            sender.sendMessage("Result = " + (a - b));
            return true;
        }else if(args[1].equals("*")) {
            sender.sendMessage("Result = " + (a * b));
            return true;
        }else if(args[1].equals("/")) {
            sender.sendMessage("Result = " + (a / b));
            return true;
        }
        return false;
    }
}

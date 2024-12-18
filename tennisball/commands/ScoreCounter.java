//package com.slendplugin.tennisball.commands;
//
//import com.slendplugin.tennisball.Tennisball;
//import org.bukkit.Bukkit;
//import org.bukkit.command.Command;
//import org.bukkit.command.CommandExecutor;
//import org.bukkit.command.CommandSender;
//import org.bukkit.entity.Player;
//import sun.util.resources.en.TimeZoneNames_en_IE;
//
//public class ScoreCounter implements CommandExecutor {
//    @Override
//    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
//        Player player = (Player) sender;
//
//        String p = String.valueOf(args[0]);
//
//        if (p.equals(Tennisball.player1)){
//            String p2 = Tennisball.player2;
//            int sc = Tennisball.score1;
//            int sc2 = Tennisball.score2;
//            String insc = Tennisball.inscore1;
//            String insc2 = Tennisball.inscore2;
//            int set = Tennisball.sets1;
//            int set2 = Tennisball.sets2;
//
//
//            if (set == 3 && set2 == 3){
//                int tie1 = Integer.parseInt(insc);
//                int tie2 = Integer.parseInt(insc2);
//
//                tie1 = tie1 + 1;
//                insc = Integer.toString(tie1);
//
//
//            }else{
//                if (insc.equals("0")){
//                    Tennisball.inscore1 = "15";
//                }else if(insc.equals("15")){
//                    Tennisball.inscore1 = "30";
//                }else if(insc.equals("30")){
//                    Tennisball.inscore1 = "40";
//                }else if(insc.equals("40") && insc2.equals("40")){
//                    Tennisball.inscore1 = "Ad";
//                }else if(insc.equals("40") && insc2.equals("Ad")) {
//                    Tennisball.inscore1 = "40";
//                }else{
//                    Tennisball.inscore1 = "0";
//                    Tennisball.score1 = sc + 1;
//                    if (Tennisball.score1 == 4){
//                        Tennisball.sets1 = set + 1;
//                        Tennisball.score1 = 0;
//                    }
//                }
//            }
//
//
//
//
//        }else if (p.equals(Tennisball.player2)) {
//            String p2 = Tennisball.player1;
//            int sc = Tennisball.score2;
//            int sc2 = Tennisball.score1;
//            String insc = Tennisball.inscore2;
//            String insc2 = Tennisball.inscore1;
//        }else if (p.equals(Tennisball.player3)) {
//            String p2 = Tennisball.player3;
//            int sc = Tennisball.score3;
//            int sc2 = Tennisball.score4;
//            String insc = Tennisball.inscore3;
//            String insc2 = Tennisball.inscore4;
//        }else if (p.equals(Tennisball.player4)) {
//            String p2 = Tennisball.player4;
//            int sc = Tennisball.score4;
//            int sc2 = Tennisball.score3;
//            String insc = Tennisball.inscore4;
//            String insc2 = Tennisball.inscore3;
//        }else if (p.equals(Tennisball.player5)) {
//            String p2 = Tennisball.player5;
//            int sc = Tennisball.score5;
//            int sc2 = Tennisball.score6;
//            String insc = Tennisball.inscore5;
//            String insc2 = Tennisball.inscore6;
//        }else if (p.equals(Tennisball.player6)) {
//            String p2 = Tennisball.player6;
//            int sc = Tennisball.score6;
//            int sc2 = Tennisball.score5;
//            String insc = Tennisball.inscore6;
//            String insc2 = Tennisball.inscore5;
//        }else{
//            Bukkit.getServer().broadcastMessage("There are no such players in game.");
//            return false;
//        }
//
//    }
//}

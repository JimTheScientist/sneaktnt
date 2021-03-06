package net.jimthescientist.sneaktnt.command;

import net.jimthescientist.sneaktnt.SneakTNT;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Reset implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        SneakTNT.playing = false;
        for (Player player : Bukkit.getOnlinePlayers()){
            player.setHealth(20);
            player.setFoodLevel(20);
        }
        return true;
    }
}

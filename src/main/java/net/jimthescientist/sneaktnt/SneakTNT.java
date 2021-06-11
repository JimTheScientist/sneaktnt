package net.jimthescientist.sneaktnt;

import net.jimthescientist.sneaktnt.command.Reset;
import net.jimthescientist.sneaktnt.command.Start;
import net.jimthescientist.sneaktnt.event.SneakEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class SneakTNT extends JavaPlugin {
    public static boolean playing = false;
    public void onEnable() {
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[SneakTNT]: Enabled");
        getServer().getPluginManager().registerEvents(new SneakEvent(), this);
        this.getCommand("start").setExecutor(new Start());
        this.getCommand("reset").setExecutor(new Reset());
    }
    public void onDisable(){
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.BLUE + "[SneakTNT]: Disabled");
    }
    public static void pluginDebugInfo(String debugInfo, CommandSender sender) {
        if (sender == null) {
            Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + " " + ChatColor.BOLD + "SneakTNT: " + ChatColor.RESET + " " + ChatColor.YELLOW + debugInfo);
        } else {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.DARK_RED + " " + ChatColor.BOLD + "SneakTNT: " + ChatColor.RESET + " " + ChatColor.YELLOW + debugInfo);
        }
    }
}

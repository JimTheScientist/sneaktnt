package net.jimthescientist.sneaktnt.command;

import net.jimthescientist.sneaktnt.SneakTNT;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Start implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        SneakTNT.playing = true;
        return true;
    }
}

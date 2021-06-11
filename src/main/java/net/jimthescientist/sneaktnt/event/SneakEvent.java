package net.jimthescientist.sneaktnt.event;

import net.jimthescientist.sneaktnt.SneakTNT;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class SneakEvent implements Listener {
    @EventHandler
    public static void onSneak(PlayerToggleSneakEvent event){
        if (SneakTNT.playing == true){
            Location playerLocation = event.getPlayer().getLocation();
            World world = event.getPlayer().getWorld();
            world.createExplosion(playerLocation, 3);
        }
    }
}

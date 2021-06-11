package net.jimthescientist.sneaktnt.event;

import net.jimthescientist.sneaktnt.SneakTNT;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.jetbrains.annotations.NotNull;

import javax.swing.text.html.parser.Entity;

public class SneakEvent implements Listener {
    @EventHandler
    public static void onSneak(PlayerToggleSneakEvent event){
        if (SneakTNT.playing == true){
            Location playerLocation = event.getPlayer().getLocation();
            World world = event.getPlayer().getWorld();
            //world.createExplosion(playerLocation, 5);
            @NotNull TNTPrimed tnt = event.getPlayer().getWorld().spawn(event.getPlayer().getTargetBlock(null, 50).getLocation().add(0, 1, 0), TNTPrimed.class);
            ((TNTPrimed)tnt).setFuseTicks(40);
        }
    }
}

package com.talesdev.talesz.listener;

import com.talesdev.talesz.bleeding.Bleeding;
import com.talesdev.talesz.exp.ExpBarUtil;
import com.talesdev.talesz.thirst.Thirst;
import com.talesdev.talesz.thirst.ThirstDamage;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

/**
 * Respawn listener
 * Created by MoKunz on 2/14/2015.
 */
public class PlayerRespawnListener implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onRespawn(PlayerRespawnEvent event){
        Thirst.setThirst(event.getPlayer().getName(), Thirst.FULL_THIRST);
        Thirst.updateExpBar(event.getPlayer());
    }
}

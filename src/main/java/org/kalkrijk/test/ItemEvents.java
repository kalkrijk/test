package org.kalkrijk.test;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.Vector;

public class ItemEvents implements Listener {

    @EventHandler
    public void onTestBucketInteract(PlayerInteractEvent event){
        Player player = event.getPlayer();
        ItemStack item = player.getInventory().getItemInMainHand();
        ItemMeta meta = item.getItemMeta();
        if (meta != null){
            String name = meta.getDisplayName();
            if(name.equals("§9Test Bucket")){
                if (Cooldown.checkCooldown(event.getPlayer())){
                    player.playEffect(player.getLocation(), Effect.BAT_TAKEOFF, null);
                    player.setVelocity(new Vector(player.getLocation().getDirection().normalize().getX(), 1, player.getLocation().getDirection().normalize().getZ()));
                    Cooldown.setCooldown(event.getPlayer(), 5);
                }
                else{
                    player.sendMessage(ChatColor.RED + "ur gay, its on cooldown, " + Math.round(Cooldown.cooldowns.get(player.getUniqueId()) - System.currentTimeMillis())/1000 + " seconds left");
                }

            }
        }

    }

    @EventHandler
    public void onTestBucketFill(PlayerBucketFillEvent event){
        Player player = event.getPlayer();
        ItemStack item = player.getInventory().getItemInMainHand();
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        String name = meta.getDisplayName();
        if(name.equals("§9Test Bucket")){
            player.sendMessage("This isn't made for water...");
            event.setCancelled(true);
        }
    }
}

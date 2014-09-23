package com.hikaru0721.armorlock.listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType.SlotType;

/**
 * Armor Lock Listener
 * @author HIKARU0721
 */
public class ArmorLockListener implements Listener {
    
    /**
     * Inventory Click Event
     * @param event
     */
    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onInventoryClickEvent(InventoryClickEvent event) {
        HumanEntity entity = event.getView().getPlayer();
        
        if (entity instanceof Player) {
            Player player = (Player) entity;
            
            if (event.getSlotType() == SlotType.ARMOR) {
                if (!player.isOp()) {
                    event.setCancelled(true);
                    player.sendMessage(ChatColor.RED + "Your armor has been lock" + ChatColor.RESET);
                }
            }
        }
    }
}
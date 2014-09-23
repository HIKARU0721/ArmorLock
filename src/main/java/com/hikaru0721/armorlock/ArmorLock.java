package com.hikaru0721.armorlock;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.hikaru0721.armorlock.listener.ArmorLockListener;

/**
 * Armor Lock plugin for Bukkit.
 * @author HIKARU0721
 */
public class ArmorLock extends JavaPlugin {
    private static ArmorLock instance;
    
    /**
     * Called when enable the plugin.
     */
    @Override
    public void onEnable() {
        // Initialization of variables
        instance = this;
        
        // Register the listener
        this.setupListener();
    }
    
    /**
     * Setup the listener.
     */
    private void setupListener() {
        PluginManager pm = Bukkit.getServer().getPluginManager();
        
        pm.registerEvents(new ArmorLockListener(), this);
    }
    
    /**
     * Get the current instance of this class.
     * @return instance
     */
    public static ArmorLock getInstance() {
        return instance;
    }
}
package me.tehtafara0.vipslots;
 
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerLoginEvent.Result;
import org.bukkit.plugin.java.JavaPlugin;
 
public class Main extends JavaPlugin implements Listener {
       
        public void onEnable() {
                Bukkit.getServer().getPluginManager().registerEvents(this, this);
        		getLogger().info("VipSlots > Enabled.");
        }
       
        @EventHandler
        public void onPlayerLogin(PlayerLoginEvent e) {
                if (e.getResult() == Result.KICK_FULL && e.getPlayer().hasPermission("vipslots.join")) {
                        e.allow();}
                }
                
                public void onDisable() {
                    Bukkit.getServer().getPluginManager().registerEvents(this, this);
            		getLogger().info("VipSlots > Enabled.");
        }
}
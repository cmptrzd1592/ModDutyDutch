package com.github.cmptrzd1592.ModDutyDutch;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;

@SuppressWarnings("unused")
public class ModDutyDutch extends JavaPlugin {

	@Override
	public void onEnable(){
		getLogger().info("onEnable has been invoked!");
	}
	
	@Override
	public void onDisable(){
		getLogger().info("onDisable has been invoked!");
	}
	
    public boolean isOnDuty = false;
	 
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            if(cmd.getName().equalsIgnoreCase("modduty")){
             if (sender instanceof Player) {
            	 Player player = (Player) sender;
            	 return true;
             }
                if(!isOnDuty){
                	isOnDuty = true;
                    Bukkit.broadcastMessage(ChatColor.GREEN + sender.getName() + " is nu bezig met tickets.");
                    return true;
                }else if(isOnDuty){
                	isOnDuty = false;
                        Bukkit.broadcastMessage(ChatColor.GREEN + sender.getName() + " is voor nu gestopt met het beantwoorden van tickets.");
                        return true;
                }
            } return true;
    }
}
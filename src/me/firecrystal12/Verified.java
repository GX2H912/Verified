package me.firecrystal12;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Verified extends JavaPlugin{
	
	
	@Override
	public void onEnable() {
		getLogger().info("FireCrystal12's Verifyer has been enabled, and is similar to TotalFreedom's");
	}
	
	@Override
	public void onDisable() {

		}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("verify") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			player.sendMessage(ChatColor.DARK_AQUA + "YOU HAVE BEEN FOUND TO BE AN IMPOSTER!" + ChatColor.DARK_RED + player.getName() + "," + ChatColor.RED + "Verify at " + ChatColor.RED + "chicken-craft.boards.net");
			
			return true;
		}
		return false;
	}

}

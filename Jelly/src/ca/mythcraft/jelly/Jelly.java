package ca.mythcraft.jelly;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import commands.JellyCommand;

public class Jelly extends JavaPlugin {

	public static final Logger logger = Bukkit.getLogger();
	public final PluginDescriptionFile pdfFile = getDescription();

	@Override
	public void onEnable() {
		
		if (registerCommands()) {
				
			logger.info("Jelly was enabled");
		}
		
		else logger.info("Jelly could not be enabled");
	}
	
	@Override
	public void onDisable() {
		
		logger.info("Jelly was disabled");
		
	}

	private boolean registerCommands() {
		try {
			getCommand("jelly").setExecutor(new JellyCommand());
			} catch (Exception e) {
				return false;
	}
		return true; 
	}
	
}


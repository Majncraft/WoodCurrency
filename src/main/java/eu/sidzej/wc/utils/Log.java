package eu.sidzej.wc.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.ChatColor;

import eu.sidzej.wc.config.Config;

public class Log {

	static final Logger log = Logger.getLogger("Minecraft");
	private static String log_prefix = "[WoodCurrency]";

	public static void info(String message) {
		log.log(Level.INFO,
				ChatColor.translateAlternateColorCodes('&',
						String.format("%s %s", log_prefix, message)));
	}

	public static void error(String message) {
		log.log(Level.SEVERE,
				ChatColor.translateAlternateColorCodes('&',
						String.format("%s %s", log_prefix, message)));
	}

	public static void debug(String message) {
		if (Config.debugEnabled) {
			log.log(Level.INFO, String.format("%s [DEBUG] %s", log_prefix, message));
		}
	}

}

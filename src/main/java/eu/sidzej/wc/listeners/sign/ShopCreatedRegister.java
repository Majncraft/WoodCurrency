package eu.sidzej.wc.listeners.sign;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import eu.sidzej.wc.events.ShopCreatedEvent;
import eu.sidzej.wc.utils.Log;

public class ShopCreatedRegister implements Listener {

	@EventHandler(priority = EventPriority.MONITOR)
	public void RegisterSign(ShopCreatedEvent e) {
		String loginfo = "";
		for (String s : e.getLines())
			loginfo += s + " ";

		Log.info("WoodCurrency shop created: "
				+ loginfo + " on " + e.getPositionString() + " by " + e.getPlayer().getName() + ".");
	}
}

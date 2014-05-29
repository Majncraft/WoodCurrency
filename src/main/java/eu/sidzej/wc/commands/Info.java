package eu.sidzej.wc.commands;

import org.bukkit.command.CommandSender;

import eu.sidzej.wc.WoodCurrency;
import eu.sidzej.wc.config.Lang;

public class Info implements CommandInterface {
	private final WoodCurrency plugin;
    private final String usage 	= "";
    private final String desc 	= Lang.CMD_INFO;
    private final String name	= "info";
	
	public Info(WoodCurrency plugin){
		this.plugin = plugin;
	}
	
	@Override
    public void dispatch(CommandSender sender, String[] args) {
        
    }
	
	@Override
    public String name() {
        return name;
    }

    @Override
    public String desc() {
        return desc;
    }

    @Override
    public String usage() {
        return usage;
    }

}
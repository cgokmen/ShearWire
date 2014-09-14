package com.cemgokmen.ShearWire;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

public class ShearWire extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("ShearWire v" + this.getDescription().getVersion() + " by Funstein successfully activated!");
		getServer().getPluginManager().registerEvents(new ShearWireListener(), this);
	}
	
	@Override
	public void onDisable() {
		HandlerList.unregisterAll(this);
		getLogger().info("ShearWire v" + this.getDescription().getVersion() + " by Funstein successfully deactivated!");
	}
	


}

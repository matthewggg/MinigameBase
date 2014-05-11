package com.lightniinja.minigame;

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
	@Override
	public void onEnable() {
		this.saveDefaultConfig();
		new ArenaManager(this);
		ArenaManager.getManager().loadArenas();
		this.getServer().getPluginManager().registerEvents(new EventHandlers(), this);
	}
}

package me.Baconsizzle1738.FiteClass;

import org.bukkit.plugin.java.JavaPlugin;

import me.Baconsizzle1738.FiteClass.Commands.CommandManager;

public final class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		getCommand("fighter").setExecutor(new CommandManager());
	}
	public void onDisable() {
		
	}
}

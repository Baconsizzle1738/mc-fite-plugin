package me.Baconsizzle1738.FiteClass;

import org.bukkit.plugin.java.JavaPlugin;

import me.Baconsizzle1738.FiteClass.Commands.CommandManager;
import me.Baconsizzle1738.FiteClass.Commands.PvPToggle;

public final class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		getCommand("fighter").setExecutor(new CommandManager());
		getCommand("pvp").setExecutor(new PvPToggle());
	}
	public void onDisable() {
		
	}
}

package me.Baconsizzle1738.FiteClass.Commands;

import org.bukkit.entity.Player;

public abstract class SubCommand {
	public abstract String getName();
	public abstract String getDescription();
	public abstract String getSyntax();
	public abstract void preform(Player player, String[] args);
}

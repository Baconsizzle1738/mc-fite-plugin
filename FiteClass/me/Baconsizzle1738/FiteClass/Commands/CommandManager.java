package me.Baconsizzle1738.FiteClass.Commands;

import java.util.ArrayList;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandManager implements CommandExecutor{
	private ArrayList<SubCommand> subcommand = new ArrayList<SubCommand>();
	public CommandManager() {
		subcommand.add(new Pyro());
	}
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (args.length>0) {
				for (int i = 0; i<getSubcommand().size(); i++) {
					if (args[0].equalsIgnoreCase(getSubcommand().get(i).getName())) {
						getSubcommand().get(i).preform(p,args);
					}
				}
			}
		}
		return false;
	}
	public ArrayList<SubCommand> getSubcommand() {
		return subcommand;
	}
	
}
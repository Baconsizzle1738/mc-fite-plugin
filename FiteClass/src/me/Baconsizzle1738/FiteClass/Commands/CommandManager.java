package me.Baconsizzle1738.FiteClass.Commands;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Baconsizzle1738.FiteClass.Commands.SubCommands.Angel;
import me.Baconsizzle1738.FiteClass.Commands.SubCommands.Greifer;
import me.Baconsizzle1738.FiteClass.Commands.SubCommands.Maniac;
import me.Baconsizzle1738.FiteClass.Commands.SubCommands.Pyro;
import me.Baconsizzle1738.FiteClass.Commands.SubCommands.Spy;
import me.Baconsizzle1738.FiteClass.Commands.SubCommands.Tank;

public class CommandManager implements CommandExecutor{
	private ArrayList<SubCommand> subcommand = new ArrayList<SubCommand>();
	public CommandManager() {
		subcommand.add(new Pyro());
		subcommand.add(new Tank());
		subcommand.add(new Angel());
		subcommand.add(new Maniac());
		subcommand.add(new Spy());
		subcommand.add(new Greifer());
	}
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (args.length == 1) {
				boolean b = false;
				for (int i = 0; i<getSubcommand().size(); i++) {
					if (args[0].equalsIgnoreCase(getSubcommand().get(i).getName())) {
						getSubcommand().get(i).preform(p,args);
						p.sendMessage(ChatColor.DARK_GREEN+"You have been given "+ChatColor.GOLD +subcommand.get(i).getName());
						b = !b;
					}
				}
				if (b == false) {
					p.sendMessage(ChatColor.RED+args[0]+" is not an avaliable kit.");
				}
			}
			else if (args.length == 0) {
				p.sendMessage(ChatColor.RED+"=============================");
				p.sendMessage(ChatColor.BOLD+"Choose a fighter kit by typing /fighter <kit> or /class <kit>");
				p.sendMessage(ChatColor.BOLD+"Fighter kits are listed below:");
				for (int i = 0; i<getSubcommand().size(); i++) {
					p.sendMessage(ChatColor.GREEN+"-----------------------------");
					p.sendMessage(getSubcommand().get(i).getName());
					p.sendMessage(getSubcommand().get(i).getDescription());
				}
				p.sendMessage(ChatColor.RED+"=============================");
			}
			else {
				p.sendMessage("Too many Arguments!");
			}
		}
		return false;
	}
	public ArrayList<SubCommand> getSubcommand() {
		return subcommand;
	}
}
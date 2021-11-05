package me.Baconsizzle1738.FiteClass.Commands;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class Pyro extends SubCommand{

	@Override
	public String getName() {
		return "pyro";
	}

	@Override
	public String getDescription() {
		return "Use this command to use the Pyro class.";
	}

	@Override
	public String getSyntax() {
		return "/class pyro";
	}

	@Override
	public void preform(Player player, String[] args) {
		if (args.length == 1) {
			ItemStack bow = new ItemStack(Material.BOW);
			ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
			PlayerInventory inventory = player.getInventory();
			inventory.clear();
			bow.addEnchantment(Enchantment.ARROW_FIRE, 1);
			sword.addEnchantment(Enchantment.FIRE_ASPECT, 2);
			inventory.addItem(bow);
			inventory.addItem(sword);
			//finish later reeee
		}
		else if (args.length>1) {
			player.sendMessage("Too many arguments!");
		}
		
		
	}
	
}

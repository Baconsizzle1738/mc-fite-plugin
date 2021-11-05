package me.Baconsizzle1738.FiteClass.Commands.SubCommands;

//import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import me.Baconsizzle1738.FiteClass.Commands.SubCommand;

public class Pyro extends SubCommand{

	@Override
	public String getName() {
		return "Pyro";
	}

	@Override
	public String getDescription() {
		return "Pyro loves to set people on fire.";
	}

	@Override
	public String getSyntax() {
		return "/fighter pyro";
	}

	@Override
	public void preform(Player player, String[] args) {
		if (args.length == 1) {
			ItemStack bow = new ItemStack(Material.BOW);
			ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
			ItemStack helm = new ItemStack(Material.IRON_HELMET);
			ItemStack chest = new ItemStack(Material.IRON_CHESTPLATE);
			ItemStack leg = new ItemStack(Material.IRON_LEGGINGS);
			ItemStack boot = new ItemStack(Material.IRON_BOOTS);
			ItemStack[] armor = new ItemStack[] {helm, chest, leg, boot};
			//enchantables^^^^^^	
			PlayerInventory inventory = player.getInventory();
			inventory.clear();
			bow.addEnchantment(Enchantment.ARROW_FIRE, 1);
			bow.addEnchantment(Enchantment.ARROW_DAMAGE, 1);
			sword.addEnchantment(Enchantment.FIRE_ASPECT, 2);
			inventory.addItem(sword);
			inventory.addItem(bow);
			for (int i = 0; i<128; i++) {
				inventory.addItem(new ItemStack(Material.ARROW));
			}
			for (int i = 0; i<armor.length; i++) {
				armor[i].addEnchantment(Enchantment.PROTECTION_FIRE, 4);
				armor[i].addEnchantment(Enchantment.DURABILITY, 2);
				inventory.addItem(armor[i]);
			}
		}
		else if (args.length>1) {
			player.sendMessage("Too many arguments!");
		}
		
		
	}
	
}

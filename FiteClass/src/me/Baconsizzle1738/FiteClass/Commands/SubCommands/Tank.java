package me.Baconsizzle1738.FiteClass.Commands.SubCommands;

//import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import me.Baconsizzle1738.FiteClass.Commands.SubCommand;

public class Tank extends SubCommand {
	@Override
	public String getName() {
		return "Tank";
	}
	@Override
	public String getDescription() {
		return "This big boi has has really heavy armor.";
	}
	@Override
	public String getSyntax() {
		return "/fighter tank";
	}
	@Override
	public void preform(Player player, String[] args) {
		if (args.length == 1) {
			PlayerInventory inv = player.getInventory();
			inv.clear();
			ItemStack sword = new ItemStack(Material.IRON_SWORD);
			ItemStack helm = new ItemStack(Material.DIAMOND_HELMET);
			ItemStack chest = new ItemStack(Material.DIAMOND_CHESTPLATE);
			ItemStack leg = new ItemStack(Material.DIAMOND_LEGGINGS);
			ItemStack boot = new ItemStack(Material.DIAMOND_BOOTS);
			ItemStack[] armor = new ItemStack[] {helm, chest, leg, boot};
			sword.addEnchantment(Enchantment.DURABILITY, 1);
			inv.addItem(sword);
			for (int i = 0; i<armor.length; i++) {
				armor[i].addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL , 4);
				armor[i].addEnchantment(Enchantment.PROTECTION_EXPLOSIONS , 4);
				armor[i].addEnchantment(Enchantment.PROTECTION_FIRE , 4);
				armor[i].addEnchantment(Enchantment.PROTECTION_PROJECTILE , 4);
				inv.addItem(armor[i]);
			}
		}
		else {
			player.sendMessage("Too many arguments!");
		}
	}
}

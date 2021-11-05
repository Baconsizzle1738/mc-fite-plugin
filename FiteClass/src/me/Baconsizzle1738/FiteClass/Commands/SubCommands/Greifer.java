package me.Baconsizzle1738.FiteClass.Commands.SubCommands;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.Baconsizzle1738.FiteClass.Commands.SubCommand;

public class Greifer extends SubCommand{

	@Override
	public String getName() {
		return "Griefer";
	}

	@Override
	public String getDescription() {
		return "This kid seems to get banned often.";
	}

	@Override
	public String getSyntax() {
		return "/fighter greifer";
	}

	@Override
	public void preform(Player player, String[] args) {
		Inventory inv = player.getInventory();
		ItemStack sword = new ItemStack(Material.IRON_SWORD);
		ItemStack pick = new ItemStack(Material.STONE_PICKAXE);
		ItemStack shovel = new ItemStack(Material.STONE_SHOVEL);
		ItemStack axe = new ItemStack(Material.WOODEN_AXE);
		ItemStack helm = new ItemStack(Material.IRON_HELMET);
		ItemStack chest = new ItemStack(Material.IRON_CHESTPLATE);
		ItemStack leg = new ItemStack(Material.IRON_LEGGINGS);
		ItemStack boot = new ItemStack(Material.IRON_BOOTS);
		ItemStack[] tool = {pick, shovel, axe};
		ItemStack[] armor = {helm, chest, leg, boot};
		inv.clear();
		
		sword.addEnchantment(Enchantment.DAMAGE_ALL,3);
		
		inv.addItem(sword);
		for (int i = 0; i<tool.length; i++) {
			tool[i].addEnchantment(Enchantment.DIG_SPEED, 3);
			inv.addItem(tool[i]);
		}
		for (int i = 0; i<armor.length; i++) {
			armor[i].addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
			armor[i].addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 3);
			armor[i].addEnchantment(Enchantment.DURABILITY, 1);
			inv.addItem(armor[i]);
		}
		for (int i = 0; i<8; i++) {
			inv.addItem(new ItemStack(Material.TNT));
		}
		inv.addItem(new ItemStack(Material.FLINT_AND_STEEL));
	}

}
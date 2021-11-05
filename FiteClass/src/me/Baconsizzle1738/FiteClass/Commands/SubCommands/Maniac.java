package me.Baconsizzle1738.FiteClass.Commands.SubCommands;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

import me.Baconsizzle1738.FiteClass.Commands.SubCommand;

public class Maniac extends SubCommand{

	@Override
	public String getName() {
		return "Maniac";
	}

	@Override
	public String getDescription() {
		return "Safety is last for this guy.";
	}

	@Override
	public String getSyntax() {
		return "/fighter maniac";
	}

	@Override
	public void preform(Player player, String[] args) {
		if (args.length == 1) {
			ItemStack axe = new ItemStack(Material.DIAMOND_AXE);
			ItemStack strength = new ItemStack(Material.POTION);
			ItemStack speed = new ItemStack(Material.POTION);
			ItemStack leg = new ItemStack(Material.IRON_LEGGINGS);
			ItemStack boot = new ItemStack(Material.IRON_BOOTS);
			PotionMeta strengthm = (PotionMeta)strength.getItemMeta();
			PotionMeta speedm = (PotionMeta)speed.getItemMeta();
			Inventory inv = player.getInventory();
			inv.clear();
			
			axe.addEnchantment(Enchantment.DAMAGE_ALL, 5);
			axe.addEnchantment(Enchantment.DURABILITY, 1);
			strengthm.setBasePotionData(new PotionData(PotionType.STRENGTH, false, true));
			strength.setItemMeta(strengthm);
			speedm.setBasePotionData(new PotionData(PotionType.SPEED, false, true));
			speed.setItemMeta(speedm);
			leg.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
			leg.addEnchantment(Enchantment.DURABILITY, 3);
			leg.addEnchantment(Enchantment.PROTECTION_FIRE, 3);
			boot.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
			boot.addEnchantment(Enchantment.DURABILITY, 3);
			boot.addEnchantment(Enchantment.PROTECTION_FIRE, 3);
			
			inv.addItem(axe);
			inv.addItem(leg);
			inv.addItem(boot);
			inv.addItem(strength);
			inv.addItem(strength);
			inv.addItem(strength);
			inv.addItem(speed);
			inv.addItem(speed);
			inv.addItem(speed);
			inv.addItem(new ItemStack(Material.MILK_BUCKET));
			inv.addItem(new ItemStack(Material.MILK_BUCKET));
		}
		else if (args.length>1) {
			player.sendMessage("Too many arguments!");
		}
	}

}

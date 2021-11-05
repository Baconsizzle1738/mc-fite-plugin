package me.Baconsizzle1738.FiteClass.Commands.SubCommands;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
//import org.bukkit.potion.PotionEffect;
//import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

import me.Baconsizzle1738.FiteClass.Commands.SubCommand;

public class Spy extends SubCommand{

	@Override
	public String getName() {
		return "Spy";
	}

	@Override
	public String getDescription() {
		return "The spy is great at revealing enemy locations.";
	}

	@Override
	public String getSyntax() {
		return "/fighter spy";
	}

	@Override
	public void preform(Player player, String[] args) {
		Inventory inv = player.getInventory();
		ItemStack sword = new ItemStack(Material.IRON_SWORD);
		ItemStack cross = new ItemStack(Material.CROSSBOW);
		ItemStack helm = new ItemStack(Material.DIAMOND_HELMET);
		ItemStack chest = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemStack leg = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemStack boot = new ItemStack(Material.DIAMOND_BOOTS);
		ItemStack invis = new ItemStack(Material.POTION);
		PotionMeta invism = (PotionMeta)invis.getItemMeta();
		ItemStack[] armor = {helm, chest, leg, boot};
		inv.clear();
		
		sword.addEnchantment(Enchantment.DAMAGE_ALL, 1);
		cross.addEnchantment(Enchantment.QUICK_CHARGE, 3);
		invism.setBasePotionData(new PotionData(PotionType.INVISIBILITY, true, false));
		invis.setItemMeta(invism);
		
		inv.addItem(sword);
		inv.addItem(cross);
		for (int i = 0; i<armor.length; i++) {
			armor[i].addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL,2);
			armor[i].addEnchantment(Enchantment.THORNS, 2);
			armor[i].addEnchantment(Enchantment.DURABILITY, 1);
			inv.addItem(armor[i]);
		}
		inv.addItem(invis);
		for (int i = 0; i<20; i++) {
			inv.addItem(new ItemStack(Material.SPECTRAL_ARROW));
		}
	}
}

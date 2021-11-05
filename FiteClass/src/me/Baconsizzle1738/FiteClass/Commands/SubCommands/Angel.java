package me.Baconsizzle1738.FiteClass.Commands.SubCommands;

//import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
//import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionData;
//import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

import me.Baconsizzle1738.FiteClass.Commands.SubCommand;

/**
 * The angel has the ability to heal herself and her teammates. 
 * @author Baconsizzle1738
 *
 */
public class Angel extends SubCommand{

	@Override
	public String getName() {
		return "Angel";
	}

	@Override
	public String getDescription() {
		return "The angel has the ability to heal herself and her teammates.";
	}

	@Override
	public String getSyntax() {
		return "/fighter angel";
	}

	@Override
	public void preform(Player player, String[] args) {
		if (args.length == 1) {
			Inventory inv = player.getInventory();
			inv.clear();
			ItemStack sword = new ItemStack(Material.IRON_SWORD);
			ItemStack bow = new ItemStack(Material.BOW);
			ItemStack helm = new ItemStack(Material.IRON_HELMET);
			ItemStack chest = new ItemStack(Material.IRON_CHESTPLATE);
			ItemStack leg = new ItemStack(Material.IRON_LEGGINGS);
			ItemStack boot = new ItemStack(Material.IRON_BOOTS);
			ItemStack splash = new ItemStack(Material.SPLASH_POTION);
			ItemStack linger = new ItemStack(Material.LINGERING_POTION);
			PotionMeta splashm = (PotionMeta) splash.getItemMeta();
			PotionMeta lingerm = (PotionMeta) linger.getItemMeta();
			ItemStack[] armor = new ItemStack[] {helm, chest, leg, boot};
			
			sword.addEnchantment(Enchantment.DAMAGE_ALL, 1);
			sword.addEnchantment(Enchantment.DURABILITY, 1);
			bow.addEnchantment(Enchantment.ARROW_DAMAGE,3);
			splashm.setBasePotionData(new PotionData(PotionType.INSTANT_HEAL,false,true));
			splash.setItemMeta(splashm);
			lingerm.setBasePotionData(new PotionData(PotionType.REGEN,false,true));
			linger.setItemMeta(lingerm);
			
			inv.addItem(sword);
			inv.addItem(bow);
			for (int i = 0; i<armor.length; i++) {
				armor[i].addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL,2);
				armor[i].addEnchantment(Enchantment.PROTECTION_FIRE, 1);
				armor[i].addEnchantment(Enchantment.DURABILITY, 1);
				inv.addItem(armor[i]);
			}
			inv.addItem(splash);
			inv.addItem(splash);
			inv.addItem(linger);
			inv.addItem(linger);
			inv.addItem(linger);
			for (int i = 0; i<128; i++) {
				inv.addItem(new ItemStack(Material.ARROW));
			}
		}
		else {
			player.sendMessage("Too many arguments!");
		}
		
	}
	
}

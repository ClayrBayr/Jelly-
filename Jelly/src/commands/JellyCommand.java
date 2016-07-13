package commands;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class JellyCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (sender instanceof Player) {

			Player player = (Player) sender;

			Player brando = Bukkit.getPlayer("Brandonino");

			Player cj = Bukkit.getPlayer("CaligulaWolf");

			if (cmd.getName().equalsIgnoreCase("jelly")) {

				if (Bukkit.getOnlinePlayers().contains(brando)) {

					brando.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD
							+ "JellyBoy XXX, you have been summoned by " + player.getName());
					brando.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 360, 3));
					brando.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 360, 4));
					brando.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 360, 4));
					brando.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 360, 2));

					player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "You have summoned JellyBoy XXX");

					if (Bukkit.getOnlinePlayers().contains(cj)) {

						cj.sendMessage(
								ChatColor.GREEN + "" + ChatColor.BOLD + "JellyBoy XXX's power maakes your head spin");
						cj.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 5, 3));
					}
				}
			}
		}

		return false;
	}
}

package net.Indyuce.bountyhunters.compat.interaction;

import de.simonsator.partyandfriends.spigot.api.pafplayers.PAFPlayerManager;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public class PartyAndFriendsSupport implements InteractionRestriction {
	private final PAFPlayerManager manager = PAFPlayerManager.getInstance();

	@Override
	public boolean canInteractWith(InteractionType interaction, Player claimer, OfflinePlayer target) {
		return !manager.getPlayer(claimer.getUniqueId()).isAFriendOf(manager.getPlayer(target.getUniqueId()));
	}
}

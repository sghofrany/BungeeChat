package events;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.PlayerDisconnectEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class PlayerDisconnect implements Listener {

	@EventHandler
	public void onLeave(PlayerDisconnectEvent event) {
		
		ProxiedPlayer player = event.getPlayer();
		
		if(player.hasPermission("bungeechat.staff")) {
			for(ProxiedPlayer p : ProxyServer.getInstance().getPlayers()) {
				if(p.hasPermission("bungeechat.staff")) {
					p.sendMessage(new TextComponent("§c" + player.getName() + " §7[§4§l-§7]"));
				}
			}
		}
	}
}

package me.iran.bungeechat;

import commands.ChatCommand;
import commands.StaffOnlineCommand;
import events.PlayerDisconnect;
import events.PlayerLogin;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class BungeeChat extends Plugin {

	public void onEnable() {
		ProxyServer.getInstance().getPluginManager().registerCommand(this, new ChatCommand());
		ProxyServer.getInstance().getPluginManager().registerCommand(this, new StaffOnlineCommand());
		ProxyServer.getInstance().getPluginManager().registerListener(this, new PlayerLogin());
		ProxyServer.getInstance().getPluginManager().registerListener(this, new PlayerDisconnect());
	}
}

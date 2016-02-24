package commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class ChatCommand extends Command {

	public ChatCommand() {
		super("sc", "bungeechat.use");
	}

	@Override
	public void execute(CommandSender sender, String[] args) {
		if(args.length < 1) {
			sender.sendMessage(new TextComponent(ChatColor.RED + "/sc <msg>"));
			return;
		}

		StringBuilder msgBuilder = new StringBuilder();
		for(int i = 0; i < args.length; i++) {
			msgBuilder.append(args[i]).append(" ");
		}
		
		String msg = ChatColor.GOLD + msgBuilder.toString().trim();
		
		for(ProxiedPlayer p : ProxyServer.getInstance().getPlayers()) {
			if(p.hasPermission("bungeechat.see")) {
				ProxiedPlayer player = ProxyServer.getInstance().getPlayer(sender.getName());
				p.sendMessage(new TextComponent(ChatColor.BLUE + "[" + player.getServer().getInfo().getName() + "] " + sender.getName() + " " + msg));
			}
		}
	}
	
}

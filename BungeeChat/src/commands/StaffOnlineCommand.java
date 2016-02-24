package commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class StaffOnlineCommand extends Command {

	public StaffOnlineCommand() {
		super("staff", "bungeechat.staff");
	}
	
	public void execute(CommandSender sender, String[] args) {
		sender.sendMessage(new TextComponent(ChatColor.RED + "Coming soon..."));
	}
}

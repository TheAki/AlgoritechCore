package me.algoritechcommunity.algcore.commands.commands;

import me.algoritechcommunity.algcore.AlgCore;
import me.algoritechcommunity.algcore.commands.CommandAbstract;
import me.algoritechcommunity.algcore.config.ValueType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal extends CommandAbstract {
    public Heal(AlgCore plugin, String label, String... aliases) {
        super(plugin, label, aliases);
    }

    @Override
    protected boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;

            switch (args.length) {
                case 0:
                    if(player.hasPermission("algcore.heal.self")) {
                        String prefix = super.getPlugin().getCManager().getValue(ValueType.String.PREFIX);
                        String message = super.getPlugin().getCManager().getValue(ValueType.String.HEAL_SUCCESSFUL_SELF);

                        player.setHealth(player.getMaxHealth());
                        player.setFoodLevel(20);
                        player.sendMessage(prefix + message);
                    }
                    else {
                        String prefix = super.getPlugin().getCManager().getValue(ValueType.String.PREFIX);
                        String message = super.getPlugin().getCManager().getValue(ValueType.String.HEAL_FAILED_SELF_PERMISSION);

                        player.sendMessage(prefix + message);
                    }
                    break;
                case 1:

                    if(player.hasPermission("algcore.heal.other")) {
                        String prefix = super.getPlugin().getCManager().getValue(ValueType.String.PREFIX);

                        Player otherPlayer = super.getPlugin().getServer().getPlayer(args[0]);

                        if(otherPlayer == null) {

                            String message = super.getPlugin().getCManager().getValue(ValueType.String.HEAL_FAILED_OTHER_NOTFOUND);
                            player.sendMessage(prefix + message);

                            return true;
                        } else {
                            String message = super.getPlugin().getCManager().getValue(ValueType.String.HEAL_SUCCESSFUL_OTHER_SELF).replace("%player%", otherPlayer.getName());
                            String otherMessage = super.getPlugin().getCManager().getValue(ValueType.String.HEAL_SUCCESSFUL_OTHER_OTHER).replace("%player%", player.getName());

                            otherPlayer.setHealth(otherPlayer.getMaxHealth());
                            otherPlayer.setFoodLevel(20);

                            player.sendMessage(prefix + message);
                            otherPlayer.sendMessage(prefix + otherMessage);
                        }
                    }
                    else {
                        String prefix = super.getPlugin().getCManager().getValue(ValueType.String.PREFIX);
                        String message = super.getPlugin().getCManager().getValue(ValueType.String.HEAL_FAILED_OTHER_PERMISSION);

                        player.sendMessage(prefix + message);
                    }
                    break;
                default:
                    String prefix = super.getPlugin().getCManager().getValue(ValueType.String.PREFIX);
                    String message = super.getPlugin().getCManager().getValue(ValueType.String.HEAL_WRONG_USAGE);

                    player.sendMessage(prefix + message);
            }
        }
        return false;
    }
}

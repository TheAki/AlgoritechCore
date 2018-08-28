package me.algoritechcommunity.algcore.commands.commands;

import me.algoritechcommunity.algcore.AlgCore;
import me.algoritechcommunity.algcore.commands.CommandAbstract;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.HashMap;

public class Heal extends CommandAbstract {
    public Heal(AlgCore plugin, String label, String... aliases) {
        super(plugin, label, aliases);
    }

    @Override
    protected boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }
}

package me.algoritechcommunity.algcore.commands.factory;

import me.algoritechcommunity.algcore.AlgCore;
import me.algoritechcommunity.algcore.commands.CommandAbstract;
import me.algoritechcommunity.algcore.commands.commands.Heal;

public class CommandFactory {
    private final AlgCore PLUGIN;

    public CommandFactory(AlgCore plugin) {
        this.PLUGIN = plugin;
    }

    public CommandAbstract getInstance(CommandType type) {
        switch (type) {

            case HEAL:
                return new Heal(this.PLUGIN, type.getLabel(), type.getAliases());
            default:
                return null;
        }
    }
}

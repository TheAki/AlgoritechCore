package me.algoritechcommunity.algcore.commands.factory;

import me.algoritechcommunity.algcore.commands.CommandsAbstract;

public class CommandFactory {

    public CommandsAbstract getInstance(CommandType type) {
        switch (type) {
            default:
                return null;
        }
    }
}

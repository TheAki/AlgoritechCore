package me.algoritechcommunity.algcore.commands.factory;

import me.algoritechcommunity.algcore.AlgCore;
import me.algoritechcommunity.algcore.commands.CommandAbstract;
import me.algoritechcommunity.algcore.commands.CommandManager;

import java.util.HashMap;

public class CommandBuilder {

    private final HashMap<String, CommandAbstract> ENABLED_COMMANDS = new HashMap<>();
    private final AlgCore PLUGIN;
    private final CommandFactory FACTORY;

    public CommandBuilder(AlgCore plugin) {
     this.PLUGIN = plugin;
     this.FACTORY = new CommandFactory(this.PLUGIN);
    }

    public CommandBuilder registerCommand(CommandType type) {
        this.ENABLED_COMMANDS.put(type.getLabel(), this.FACTORY.getInstance(type));
        return this;
    }

    public CommandManager build() {
        CommandManager manager = new CommandManager(this.PLUGIN,ENABLED_COMMANDS);
        for(CommandAbstract subclass : this.ENABLED_COMMANDS.values()) {
            this.PLUGIN.getCommand(subclass.getLabel()).setExecutor(manager);
        }
        return manager;
    }
}

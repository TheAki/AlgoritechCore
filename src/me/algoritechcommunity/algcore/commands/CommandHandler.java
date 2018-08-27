package me.algoritechcommunity.algcore.commands;

import me.algoritechcommunity.algcore.AlgCore;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.HashMap;

public class CommandHandler implements CommandExecutor {

    private final AlgCore PLUGIN;

    private final HashMap<String,CommandsAbstract>  COMMAND_OBJECTS = new HashMap<>();

    public CommandHandler(AlgCore plugin) {
        this.PLUGIN = plugin;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(this.COMMAND_OBJECTS.containsKey(command.getName())) {
            return this.COMMAND_OBJECTS.get(command.getName()).onCommand(sender,command,label,args);
        }
        return false;
    }

    public CommandHandler enableCommand(CommandType type) {

        switch(type) {
        }
        return this;
    }

    public void registerExecutor() {

        for(CommandsAbstract subclass : this.COMMAND_OBJECTS.values()) {
            this.PLUGIN.getCommand(subclass.getLabel()).setExecutor(this);
        }
    }
}

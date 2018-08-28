package me.algoritechcommunity.algcore.commands;

import me.algoritechcommunity.algcore.AlgCore;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.HashMap;

public class CommandManager implements CommandExecutor {

    private final AlgCore PLUGIN;

    private final HashMap<String, CommandAbstract>  COMMAND_OBJECTS;

    public CommandManager(AlgCore plugin, HashMap<String, CommandAbstract> objects) {
        this.PLUGIN = plugin;
        this.COMMAND_OBJECTS = objects;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(this.COMMAND_OBJECTS.containsKey(command.getName())) {
            return this.COMMAND_OBJECTS.get(command.getName()).onCommand(sender,command,label,args);
        }
        return false;
    }
}

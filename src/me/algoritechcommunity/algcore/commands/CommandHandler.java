package me.algoritechcommunity.algcore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.HashMap;

public class CommandHandler implements CommandExecutor {


    private final HashMap<String,CommandsAbstract>  COMMAND_OBJECTS = new HashMap<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(this.COMMAND_OBJECTS.containsKey(label)) {
            return this.COMMAND_OBJECTS.get(label).onCommand(sender,command,label,args);
        }
        return false;
    }
}

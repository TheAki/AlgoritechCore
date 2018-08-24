package me.algoritechcommunity.algcore.commands;

import me.algoritechcommunity.algcore.AlgCore;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.HashMap;

public abstract class CommandsAbstract {

    /*
    * Komut oluşturmak için oluşturduğun
    * classın bu classı extends etmesi ve
    * CommandType a eklenmiş olması gerekiyor
    * */

    private final AlgCore PLUGIN;
    private final String LABEL;
    private final String[] ALIASES;
    private final HashMap<String, CommandsAbstract> COMMAND_OBJECTS;

    public AlgCore getPlugin() {
        return this.PLUGIN;
    }

    public String getLabel() {
        return this.LABEL;
    }

    public String[] getAliases() {
        return this.ALIASES;
    }

    public CommandsAbstract(AlgCore plugin, HashMap<String, CommandsAbstract> commandObjects, String label, String... aliases) {
        this.PLUGIN = plugin;
        this.LABEL = label;
        this.ALIASES = aliases;
        this.COMMAND_OBJECTS = commandObjects;

        this.registerCommand();
    }

    private void registerCommand() {
        this.COMMAND_OBJECTS.put(this.LABEL, this);
    }

    abstract boolean onCommand(CommandSender sender, Command command, String label, String[] args);
}

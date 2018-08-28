package me.algoritechcommunity.algcore.commands;

import me.algoritechcommunity.algcore.AlgCore;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public abstract class CommandAbstract {

    /*
    * Komut oluşturmak için oluşturduğun
    * classın bu classı extends etmesi ve
    * CommandType a eklenmiş olması gerekiyor
    * */

    private final AlgCore PLUGIN;
    private final String LABEL;
    private final String[] ALIASES;

    public AlgCore getPlugin() {
        return this.PLUGIN;
    }

    public String getLabel() {
        return this.LABEL;
    }

    public String[] getAliases() {
        return this.ALIASES;
    }

    public CommandAbstract(AlgCore plugin, String label, String... aliases) {
        this.PLUGIN = plugin;
        this.LABEL = label;
        this.ALIASES = aliases;
    }

    protected abstract boolean onCommand(CommandSender sender, Command command, String label, String[] args);
}

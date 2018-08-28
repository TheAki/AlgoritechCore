package me.algoritechcommunity.algcore;

import me.algoritechcommunity.algcore.commands.CommandManager;
import me.algoritechcommunity.algcore.commands.factory.CommandBuilder;
import me.algoritechcommunity.algcore.commands.factory.CommandType;
import me.algoritechcommunity.algcore.config.ConfigManager;
import org.bukkit.plugin.java.JavaPlugin;

public class AlgCore extends JavaPlugin {

    private ConfigManager configManager;
    private CommandManager commandManager;

    @Override
    public void onEnable() {
        this.configManager = new ConfigManager(this);
    }

    @Override
    public void onDisable() {

    }

    public ConfigManager getCManager() {
        return this.configManager;
    }

    private void enableCommands() {

        this.commandManager = new CommandBuilder(this)
                .registerCommand(CommandType.HEAL)
                .build();
    }
}

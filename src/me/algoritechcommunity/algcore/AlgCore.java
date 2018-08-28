package me.algoritechcommunity.algcore;

import me.algoritechcommunity.algcore.commands.CommandHandler;
import me.algoritechcommunity.algcore.commands.factory.CommandType;
import me.algoritechcommunity.algcore.config.ConfigManager;
import org.bukkit.plugin.java.JavaPlugin;

public class AlgCore extends JavaPlugin {

    private ConfigManager configManager;
    @Override
    public void onEnable() {
        this.configManager = new ConfigManager(this);
    }

    @Override
    public void onDisable() {

    }

    public ConfigManager getConfigManager() {
        return this.configManager;
    }

    private void enableCommands() {
        new CommandHandler(this)
                .enableCommand(CommandType.HEAL)
                .registerExecutor();
    }
}

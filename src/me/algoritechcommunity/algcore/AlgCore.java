package me.algoritechcommunity.algcore;

import me.algoritechcommunity.algcore.commands.CommandHandler;
import me.algoritechcommunity.algcore.commands.CommandType;
import org.bukkit.plugin.java.JavaPlugin;

public class AlgCore extends JavaPlugin {

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    private void enableCommands() {
        new CommandHandler(this)
                .enableCommand(CommandType.HEAL)
                .registerExecutor();

    }
}

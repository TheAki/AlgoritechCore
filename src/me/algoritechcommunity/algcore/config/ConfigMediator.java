package me.algoritechcommunity.algcore.config;

import me.algoritechcommunity.algcore.AlgCore;
import me.algoritechcommunity.algcore.config.configs.ConfigLocale;
import me.algoritechcommunity.algcore.config.configs.ConfigMain;

public class ConfigMediator {

    private final AlgCore PLUGIN;

    private final ConfigMain CONFIG_MAIN;
    private final ConfigLocale CONFIG_LOCALE;

    public ConfigMediator (AlgCore plugin) {
        this.PLUGIN = plugin;
        this.CONFIG_MAIN = new ConfigMain(this.PLUGIN);
        this.CONFIG_LOCALE = new ConfigLocale(this.PLUGIN);
    }

    public ConfigMain getConfigMain() {
        return this.CONFIG_MAIN;
    }

    public ConfigLocale getConfigLocale() {
        return this.CONFIG_LOCALE;
    }

    public void reloadAll() {
        this.CONFIG_MAIN.reload();
        this.CONFIG_LOCALE.reload();
    }

    public void saveAll() {
        this.CONFIG_MAIN.save();
        this.CONFIG_LOCALE.save();
    }
}

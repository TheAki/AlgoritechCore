package me.algoritechcommunity.algcore.config;

import me.algoritechcommunity.algcore.AlgCore;
import me.algoritechcommunity.algcore.config.configs.ConfigLocale;
import me.algoritechcommunity.algcore.config.configs.ConfigMain;

import java.util.List;

public class ConfigManager {

    private final AlgCore PLUGIN;

    private final ConfigMain CONFIG_MAIN;
    private final ConfigLocale CONFIG_LOCALE;

    public ConfigManager(AlgCore plugin) {
        this.PLUGIN = plugin;
        this.CONFIG_MAIN = new ConfigMain(this.PLUGIN);
        this.CONFIG_LOCALE = new ConfigLocale(this.PLUGIN);

        this.PLUGIN.getLogger().info("Config ve Locale dosyalari loadlandi!");
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

    //TODO Returnleri kaldır


    public String getValue(ValueType.String type){
        switch (type) {

        }

        return null;
    }

    public List<String> getValue(ValueType.StringList type) {
        switch (type) {

        }

        return null;
    }

    public int getValue(ValueType.Integer type){

        switch (type) {

        }

        return 0;
    }

    public double getValue(ValueType.Double type) {

        switch (type) {

        }

        return 0;
    }

    public boolean getValue(ValueType.Boolean type) {

        switch (type) {


        }

        return false;
    }
}
